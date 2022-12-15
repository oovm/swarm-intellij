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

public class SwarmCmdValueNode extends ASTWrapperPsiElement implements SwarmCmdValue {

  public SwarmCmdValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwarmVisitor visitor) {
    visitor.visitCmdValue(this);
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
  @Nullable
  public SwarmFunctionCall getFunctionCall() {
    return findChildByClass(SwarmFunctionCall.class);
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

}
