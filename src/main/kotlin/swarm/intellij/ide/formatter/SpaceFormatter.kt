package swarm.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import swarm.intellij.language.psi.SwarmTypes

private val prefix = TokenSet.create(SwarmTypes.AT, SwarmTypes.HASH)

private val infix = TokenSet.create(SwarmTypes.EQ)

private val suffix = TokenSet.create(SwarmTypes.OPTIONAL, SwarmTypes.MANY, SwarmTypes.MANY1)

private val declare = TokenSet.create(SwarmTypes.KW_TASK, SwarmTypes.KW_DEFINE)


fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
    return SpacingBuilder(commonSettings)
        // ,
//        .after(SwarmTypes.COMMA).spacing(1, 1, 0, true, 0)
//        .before(SwarmTypes.COMMA).spaceIf(false)
        .after(declare).spacing(1, 1, 0, true, 0)
//        .aroundInside(SwarmTypes.IDENTIFIER, SwarmTypes.MODIFIERS).spacing(1, 1, 0, true, 0)
        // {1,2}
        .aroundInside(SwarmTypes.COMMA, SwarmTypes.RANGE).spaceIf(false)
//        .beforeInside(SwarmTypes.COMMA, SwarmTypes.DEFINE_PARAMETERS).spaceIf(false)
//        .afterInside(SwarmTypes.COMMA, SwarmTypes.DEFINE_PARAMETERS).spacing(1, 1, 0, true, 0)
        // [ ]
        .after(SwarmTypes.BRACKET_L).spaceIf(false)
        .before(SwarmTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(SwarmTypes.BRACE_L).spaceIf(false)

        .before(SwarmTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(SwarmTypes.PARENTHESIS_L).spaceIf(false)
        .before(SwarmTypes.PARENTHESIS_R).spaceIf(false)
        // a:b
        .aroundInside(SwarmTypes.COLON, SwarmTypes.FIELD_MARK).spaceIf(false)
//        .afterInside(SwarmTypes.COLON, SwarmTypes.RULE_TYPE).spaceIf(true)
//        .beforeInside(SwarmTypes.ARROW, SwarmTypes.RULE_TYPE).spaceIf(true)
        .around(infix).spaceIf(true)
//        .before(SwarmTypes.RULE_TYPE).spaceIf(false)
        //
        .after(SwarmTypes.PREFIX).spaceIf(false)
        .around(SwarmTypes.INFIX).spaceIf(true)
        .before(SwarmTypes.SUFFIX).spaceIf(false)
}

