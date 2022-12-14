// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmFunctionArguments extends PsiElement {

  @NotNull
  List<SwarmCmdPair> getCmdPairList();

  @NotNull
  List<SwarmCmdString> getCmdStringList();

  @NotNull
  List<SwarmFunctionCall> getFunctionCallList();

}
