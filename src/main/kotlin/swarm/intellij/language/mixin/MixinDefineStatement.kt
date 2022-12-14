package swarm.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import swarm.intellij.language.file.SwarmIcon
import swarm.intellij.language.psi_node.SwarmDefineStatementNode
import swarm.intellij.language.psi_node.SwarmIdentifierNode
import swarm.intellij.language.psi_node.SwarmRuleBodyNode

open class MixinDefineStatement(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement() = this as SwarmDefineStatementNode

    override fun getNameIdentifier() = originalElement.namespace.lastChild as SwarmIdentifierNode

    override fun getIcon(flags: Int) = SwarmIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    val parameterNodes: Array<SwarmIdentifierNode>
        get() {
            val list = mutableListOf<SwarmIdentifierNode>();
            val names = mutableListOf<String>()
            if (originalElement.defineParameters != null) {
                for (pair in originalElement.defineParameters!!.definePairList) {
                    list.add(pair.identifier as SwarmIdentifierNode)
                    names.add(pair.identifier.text)
                }
            }
//            for (node in (originalElement.ruleBody as SwarmRuleBodyNode).identifiers) {
//                if (node.name in names) {
//                    list.add(node)
//                }
//            }
            return list.toTypedArray()
        }
}