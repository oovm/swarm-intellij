// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmDefineStatement extends PsiElement {

  @Nullable
  SwarmDefineBody getDefineBody();

  @Nullable
  SwarmDefineParameters getDefineParameters();

  @NotNull
  SwarmModifiers getModifiers();

  @NotNull
  SwarmNamespace getNamespace();

}
