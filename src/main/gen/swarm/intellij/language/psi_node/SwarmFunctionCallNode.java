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

public class SwarmFunctionCallNode extends ASTWrapperPsiElement implements SwarmFunctionCall {

  public SwarmFunctionCallNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwarmVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwarmVisitor) accept((SwarmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwarmCmdBlock getCmdBlock() {
    return findChildByClass(SwarmCmdBlock.class);
  }

  @Override
  @NotNull
  public SwarmFunctionArgs getFunctionArgs() {
    return findNotNullChildByClass(SwarmFunctionArgs.class);
  }

  @Override
  @NotNull
  public SwarmNamespace getNamespace() {
    return findNotNullChildByClass(SwarmNamespace.class);
  }

}
