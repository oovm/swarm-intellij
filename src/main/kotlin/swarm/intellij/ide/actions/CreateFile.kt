package swarm.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import swarm.intellij.language.SwarmLanguage
import swarm.intellij.language.file.SwarmBundle
import swarm.intellij.language.file.SwarmIcon

private const val TEMPLATE_NAME = "Swarm File"

class CreateFile : CreateFileFromTemplateAction(Name, Description, SwarmIcon.FILE) {
    companion object {
        val Name = SwarmLanguage.id
        val Description = SwarmBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", SwarmIcon.FILE, TEMPLATE_NAME)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
