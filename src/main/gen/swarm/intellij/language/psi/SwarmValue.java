// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmValue extends PsiElement {

  @Nullable
  SwarmCharset getCharset();

  @Nullable
  SwarmNamespace getNamespace();

  @Nullable
  SwarmNumberSuffix getNumberSuffix();

  @Nullable
  SwarmStringLiteral getStringLiteral();

  @Nullable
  SwarmTable getTable();

}
