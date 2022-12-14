package swarm.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import swarm.intellij.language.file.SwarmIcon

import swarm.intellij.language.psi_node.SwarmIdentifierNode
import swarm.intellij.language.psi_node.SwarmTaskStatementNode

open class MixinTaskStatement(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement() = this as SwarmTaskStatementNode

    override fun getNameIdentifier() = originalElement.namespace.lastChild as SwarmIdentifierNode

    override fun getIcon(flags: Int) = SwarmIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


}