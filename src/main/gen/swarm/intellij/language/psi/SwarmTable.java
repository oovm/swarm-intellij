// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmTable extends PsiElement {

  @NotNull
  List<SwarmPair> getPairList();

  @Nullable
  SwarmTypeHint getTypeHint();

  @NotNull
  List<SwarmValue> getValueList();

}
