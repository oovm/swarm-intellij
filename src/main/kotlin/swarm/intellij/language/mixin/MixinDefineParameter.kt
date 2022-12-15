package swarm.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import swarm.intellij.language.file.SwarmIcon
import swarm.intellij.language.psi_node.SwarmDefinePairNode
import swarm.intellij.language.psi_node.SwarmIdentifierNode

abstract class MixinDefineParameter(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement() = this as SwarmDefinePairNode

    override fun getNameIdentifier() = originalElement.identifier as SwarmIdentifierNode


    override fun getIcon(flags: Int) = SwarmIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

}