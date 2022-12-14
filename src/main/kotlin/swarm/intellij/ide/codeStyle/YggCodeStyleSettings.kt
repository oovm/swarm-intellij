package swarm.intellij.ide.codeStyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class SwarmCodeStyleSettings(settings: CodeStyleSettings?) : CustomCodeStyleSettings(
    "SwarmCodeStyleSettings",
    settings!!
)
