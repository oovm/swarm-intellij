// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static swarm.intellij.language.psi.SwarmTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import swarm.intellij.language.psi.*;

public class SwarmValueNode extends ASTWrapperPsiElement implements SwarmValue {

  public SwarmValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwarmVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwarmVisitor) accept((SwarmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwarmCharset getCharset() {
    return findChildByClass(SwarmCharset.class);
  }

  @Override
  @Nullable
  public SwarmNamespace getNamespace() {
    return findChildByClass(SwarmNamespace.class);
  }

  @Override
  @Nullable
  public SwarmNumberSuffix getNumberSuffix() {
    return findChildByClass(SwarmNumberSuffix.class);
  }

  @Override
  @Nullable
  public SwarmStringLiteral getStringLiteral() {
    return findChildByClass(SwarmStringLiteral.class);
  }

  @Override
  @Nullable
  public SwarmTable getTable() {
    return findChildByClass(SwarmTable.class);
  }

}
