package swarm.intellij.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement
import swarm.intellij.language.psi.SwarmNumberSuffix

class HighlightingAnnotator : AnnotatorBase() {
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            else -> {}
        }
    }
}
