// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmRuleExpr extends PsiElement {

  @NotNull
  List<SwarmInfix> getInfixList();

  @NotNull
  List<SwarmRuleTerm> getRuleTermList();

}
