package swarm.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import swarm.intellij.language.file.SwarmIcon
import swarm.intellij.language.psi_node.SwarmIdentifierNode

abstract class MixinUnionStatement(node: ASTNode) : DeclareNode(node) {
     override fun getOriginalElement(): ASTWrapperPsiElement {
         TODO("Not yet implemented")
     }

     override fun getNameIdentifier(): ASTWrapperPsiElement {
         TODO("Not yet implemented")
     }


     override fun getIcon(flags: Int) = SwarmIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

}