// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmUnionStatement extends PsiElement {

  @NotNull
  SwarmIdentifier getIdentifier();

  @NotNull
  SwarmModifiers getModifiers();

  @Nullable
  SwarmRuleBody getRuleBody();

  @Nullable
  SwarmRuleType getRuleType();

}
