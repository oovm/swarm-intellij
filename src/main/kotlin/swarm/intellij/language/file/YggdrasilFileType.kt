package swarm.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import swarm.intellij.language.SwarmLanguage
import javax.swing.Icon

object SwarmFileType : LanguageFileType(SwarmLanguage) {
    override fun getName(): String = SwarmLanguage.id
    override fun getDescription(): String = SwarmBundle.message("filetype.description")
    override fun getDefaultExtension(): String = SwarmLanguage.FileExtension
    override fun getIcon(): Icon = SwarmIcon.FILE
}