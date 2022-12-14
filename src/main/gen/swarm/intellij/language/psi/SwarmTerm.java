// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmTerm extends PsiElement {

  @NotNull
  SwarmAtom getAtom();

  @NotNull
  List<SwarmPrefix> getPrefixList();

  @NotNull
  List<SwarmSuffix> getSuffixList();

}
