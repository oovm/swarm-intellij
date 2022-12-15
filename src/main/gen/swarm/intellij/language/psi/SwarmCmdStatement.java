// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmCmdStatement extends PsiElement {

  @Nullable
  SwarmCmdPair getCmdPair();

  @Nullable
  SwarmFunctionCall getFunctionCall();

  @Nullable
  SwarmInputStatement getInputStatement();

}
