// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwarmRuleAtom extends PsiElement {

  @Nullable
  SwarmBranchMark getBranchMark();

  @Nullable
  SwarmCharset getCharset();

  @Nullable
  SwarmFieldMark getFieldMark();

  @Nullable
  SwarmFunctionCall getFunctionCall();

  @Nullable
  SwarmNamespace getNamespace();

  @Nullable
  SwarmNumberSuffix getNumberSuffix();

  @Nullable
  SwarmRuleExpr getRuleExpr();

  @Nullable
  SwarmStringLiteral getStringLiteral();

}
