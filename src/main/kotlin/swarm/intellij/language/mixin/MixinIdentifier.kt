package swarm.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import swarm.intellij.language.psi_node.SwarmIdentifierNode


enum class IdentifierKind {
    Self,
    Builtin,
    Function,
}

open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): SwarmIdentifierNode = this as SwarmIdentifierNode


}