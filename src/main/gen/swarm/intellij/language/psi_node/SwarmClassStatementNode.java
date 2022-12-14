// This is a generated file. Not intended for manual editing.
package swarm.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static swarm.intellij.language.psi.SwarmTypes.*;
import swarm.intellij.language.mixin.MixinClassStatement;
import swarm.intellij.language.psi.*;

public class SwarmClassStatementNode extends MixinClassStatement implements SwarmClassStatement {

  public SwarmClassStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwarmVisitor visitor) {
    visitor.visitClassStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwarmVisitor) accept((SwarmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SwarmIdentifier getIdentifier() {
    return findNotNullChildByClass(SwarmIdentifier.class);
  }

  @Override
  @NotNull
  public SwarmModifiers getModifiers() {
    return findNotNullChildByClass(SwarmModifiers.class);
  }

  @Override
  @Nullable
  public SwarmRuleBody getRuleBody() {
    return findChildByClass(SwarmRuleBody.class);
  }

  @Override
  @Nullable
  public SwarmRuleType getRuleType() {
    return findChildByClass(SwarmRuleType.class);
  }

}
