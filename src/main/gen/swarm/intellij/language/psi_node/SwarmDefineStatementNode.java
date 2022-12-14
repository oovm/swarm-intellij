// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static swarm.intellij.language.psi.SwarmTypes.*;
import swarm.intellij.language.mixin.MixinDefineStatement;
import swarm.intellij.language.psi.*;

public class SwarmDefineStatementNode extends MixinDefineStatement implements SwarmDefineStatement {

  public SwarmDefineStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwarmVisitor visitor) {
    visitor.visitDefineStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwarmVisitor) accept((SwarmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwarmDefineBody getDefineBody() {
    return findChildByClass(SwarmDefineBody.class);
  }

  @Override
  @Nullable
  public SwarmDefineParameters getDefineParameters() {
    return findChildByClass(SwarmDefineParameters.class);
  }

  @Override
  @NotNull
  public SwarmModifiers getModifiers() {
    return findNotNullChildByClass(SwarmModifiers.class);
  }

  @Override
  @NotNull
  public SwarmNamespace getNamespace() {
    return findNotNullChildByClass(SwarmNamespace.class);
  }

}
