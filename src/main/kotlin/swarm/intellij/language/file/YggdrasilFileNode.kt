package swarm.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import swarm.intellij.language.SwarmLanguage
import javax.swing.Icon

class SwarmFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SwarmLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = SwarmFileType
    override fun getPresentableText(): String {
        return SwarmBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return SwarmIcon.FILE
    }
}