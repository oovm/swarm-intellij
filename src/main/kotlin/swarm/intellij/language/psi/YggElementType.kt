package swarm.intellij.language.psi

import com.intellij.psi.tree.IElementType
import swarm.intellij.language.SwarmLanguage

class SwarmElementType(debugName: String) : IElementType(debugName, SwarmLanguage) {
    override fun toString(): String = "Swarm.${super.toString()}"
}
