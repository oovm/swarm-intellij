// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmFunctionCall extends PsiElement {

  @Nullable
  SwarmCmdBlock getCmdBlock();

  @NotNull
  SwarmFunctionArgs getFunctionArgs();

  @NotNull
  SwarmNamespace getNamespace();

}
