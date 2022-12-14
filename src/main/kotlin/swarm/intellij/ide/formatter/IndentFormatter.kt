package swarm.intellij.ide.formatter

import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import swarm.intellij.language.psi.SwarmTypes

fun computeIndent(formatBlock: FormatBlock, child: ASTNode): Indent? {
    val isCornerChild = formatBlock.node.firstChildNode == child || formatBlock.node.lastChildNode == child
    return when (formatBlock.node.elementType) {
        SwarmTypes.TABLE -> when {
            isCornerChild || child.elementType == SwarmTypes.COMMA -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        SwarmTypes.OBJECT -> when {
            isCornerChild -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        SwarmTypes.RULE_BODY -> when {
            isCornerChild -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        else -> Indent.getNoneIndent()
    }
}