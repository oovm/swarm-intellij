// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmRuleTerm extends PsiElement {

  @NotNull
  List<SwarmPrefix> getPrefixList();

  @NotNull
  List<SwarmRange> getRangeList();

  @NotNull
  SwarmRuleAtom getRuleAtom();

  @NotNull
  List<SwarmSuffix> getSuffixList();

}
