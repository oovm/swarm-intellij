package swarm.intellij.ide.todo

import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import swarm.intellij.language.SwarmLexerAdapter
import swarm.intellij.language.SwarmParserDefinition
import swarm.intellij.language.file.SwarmFileNode

class TodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? =
        if (file is SwarmFileNode) SwarmLexerAdapter() else null

    override fun getCommentTokenSet(file: PsiFile): TokenSet? =
        if (file is SwarmFileNode) SwarmParserDefinition.COMMENTS else null

    override fun getCommentStartDelta(tokenType: IElementType?): Int =
        if (tokenType in SwarmParserDefinition.COMMENTS) 2 else 0

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
