package swarm.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import swarm.intellij.language.psi.SwarmTypes

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(SwarmTypes.SYMBOL),
            SymbolCompletionProvider()
        )
    }
}

