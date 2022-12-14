// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmAtom extends PsiElement {

  @Nullable
  SwarmExpr getExpr();

  @Nullable
  SwarmFieldMark getFieldMark();

  @Nullable
  SwarmFunctionCall getFunctionCall();

  @Nullable
  SwarmValue getValue();

}
