package swarm.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import swarm.intellij.language.file.SwarmIcon

import swarm.intellij.language.psi_node.SwarmIdentifierNode

open class MixinDefineStatement(node: ASTNode) : DeclareNode(node) {
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

    val parameterNodes: Array<SwarmIdentifierNode>
        get() {
            val list = mutableListOf<SwarmIdentifierNode>();
            val names = mutableSetOf<String>()
//            if (originalElement.defParameters == null) return emptyArray()
//
//            for (param in originalElement.defParameters!!.definePairList) {
//                val name = param.identifier.text
//                names.add(name)
//                list.add(param.identifier as SwarmIdentifierNode)
//            }
            return list.toTypedArray()
        }
}