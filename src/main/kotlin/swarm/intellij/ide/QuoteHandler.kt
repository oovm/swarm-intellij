package swarm.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import swarm.intellij.language.psi.SwarmTypes

class QuoteHandler : SimpleTokenSetQuoteHandler(SwarmTypes.STRING_LITERAL)
