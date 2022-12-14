package swarm.intellij.ide.annotator.checkers

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement
import swarm.intellij.language.psi.SwarmPair


class SwarmTableCheckerAnnotator : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is SwarmPair -> checkPair(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkPair(mapEntry: SwarmPair): CheckerAnnotatorResult {
//        val filteredEntries = (mapEntry.parent as SwarmMap)
//            .mapEntryList
//            .asSequence()
//            .filterNot { it == mapEntry }
//
//        val duplicatesFound = filteredEntries.any { mapEntry.keyAsTextMatches(it.keyAsText) }
//
//        return if (duplicatesFound) {
//            CheckerAnnotatorResult.Error(
//                "Duplicate keys found in a dictionary",
//                mapEntry.mapKey.textRange
//            )
//        } else {
//            CheckerAnnotatorResult.Ok
//        }
        return CheckerAnnotatorResult.Ok
    }
}