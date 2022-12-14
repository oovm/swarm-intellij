package swarm.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import swarm.intellij.language.psi.SwarmNamespace
import swarm.intellij.language.psi.SwarmRuleExpr
import swarm.intellij.language.psi_node.SwarmIdentifierNode
import swarm.intellij.language.psi_node.SwarmRuleBodyNode


open class MixinRuleBody(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement() = this as SwarmRuleBodyNode;

    val identifiers: Array<SwarmIdentifierNode>
        get() {
            val list = mutableListOf<SwarmIdentifierNode>();
            originalElement.ruleExpr.visitIdentifier(list)
            return list.toTypedArray()
        }
}

private fun SwarmRuleExpr?.visitIdentifier(list: MutableList<SwarmIdentifierNode>) {
    if (this == null) return
    for (term in this.ruleTermList) {
        when (val child = term.ruleAtom) {
            is SwarmRuleExpr -> child.visitIdentifier(list)
            is SwarmNamespace -> {
                val path = child.identifierList;
                if (path.size == 1) {
                    list.add(path.first() as SwarmIdentifierNode)
                }
            }
        }
    }
}
