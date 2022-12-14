package swarm.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import swarm.intellij.language.psi.SwarmNamespace
import swarm.intellij.language.psi.SwarmRuleExpr
import swarm.intellij.language.psi_node.SwarmIdentifierNode


open class MixinRuleBody(node: ASTNode) : ASTWrapperPsiElement(node) {

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
