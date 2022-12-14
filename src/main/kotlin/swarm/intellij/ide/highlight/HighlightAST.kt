package swarm.intellij.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import swarm.intellij.language.file.SwarmFileNode
import swarm.intellij.language.psi.*
import swarm.intellij.language.psi_node.SwarmDefineStatementNode

class HighlightAST : SwarmVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is SwarmFileNode

    override fun visit(element: PsiElement) = element.accept(this)

    override fun visitGrammarStatement(o: SwarmGrammarStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitExportStatement(o: SwarmExportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitImportStatement(o: SwarmImportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
    }

    override fun visitModifiers(o: SwarmModifiers) {
        for (modifier in o.identifierList) {
            highlight(modifier, HighlightColor.KEYWORD)
        }
    }

    override fun visitClassStatement(o: SwarmClassStatement) {
        highlight(o.identifier, HighlightColor.SYM_CLASS)
    }

    override fun visitUnionStatement(o: SwarmUnionStatement) {
        highlight(o.identifier, HighlightColor.SYM_UNION)
    }

    override fun visitDefineStatement(o: SwarmDefineStatement) {
        o as SwarmDefineStatementNode
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
        for (node in o.parameterNodes) {
            highlight(node, HighlightColor.SYM_PARAMETER)
        }
    }

    override fun visitMacroCall(o: SwarmMacroCall) {
        highlight(o.firstChild, HighlightColor.SYM_MACRO)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitFunctionCall(o: SwarmFunctionCall) {
        highlight(o.firstChild, HighlightColor.SYM_FUNCTION)
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
    }

    override fun visitBranchMark(o: SwarmBranchMark) {
        highlight(o, HighlightColor.BRANCH_MARK)
    }

    override fun visitFieldMark(o: SwarmFieldMark) {
        highlight(o.firstChild, HighlightColor.FIELD_MARK)
    }

    override fun visitObjectKey(o: SwarmObjectKey) {
        highlight(o, HighlightColor.FIELD_MARK)
    }

    override fun visitIdentifier(o: SwarmIdentifier) {
        var const = true
        for (char in o.text) {
            if (char.isLowerCase()) {
                const = false;
                break
            }
        }
        if (const) {
            highlight(o, HighlightColor.SYM_CONSTANT);
            return
        }
        when (o.text) {
            "Self", "Any" -> {
                highlight(o, HighlightColor.KEYWORD)
            }

            else -> {}
        }
    }


    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()
        return true
    }

    private fun highlight(element: PsiElement, color: HighlightColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)
        infoHolder?.add(builder.create())
    }

}