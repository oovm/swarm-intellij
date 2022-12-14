package swarm.intellij.ide.annotator.checkers

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement


class SwarmScopeCheckerAnnotator : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult {
        return CheckerAnnotatorResult.Ok
    }
}

