// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmDefinePair extends PsiElement {

  @Nullable
  SwarmDefineType getDefineType();

  @Nullable
  SwarmExpr getExpr();

  @NotNull
  SwarmIdentifier getIdentifier();

}
