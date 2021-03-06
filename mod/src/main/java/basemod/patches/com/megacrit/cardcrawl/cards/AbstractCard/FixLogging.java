package basemod.patches.com.megacrit.cardcrawl.cards.AbstractCard;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import javassist.CannotCompileException;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

public class FixLogging
{
	@SpirePatch(
			clz = AbstractCard.class,
			method = "initializeDescription"
	)
	public static class FixDescriptionLog
	{
		public static ExprEditor Instrument()
		{
		    return new ExprEditor() {
		        @Override
		        public void edit(MethodCall m) throws CannotCompileException
		        {
		            if (m.getMethodName().equals("info")) {
		                m.replace("");
		            }
		        }
		    };
		}
	}
	
	@SpirePatch(
			clz = AbstractCard.class,
			method = "initializeDescriptionCN"
	)
	public static class FixDescriptionCNLog
	{
		public static ExprEditor Instrument()
		{
		    return new ExprEditor() {
		        @Override
		        public void edit(MethodCall m) throws CannotCompileException
		        {
		            if (m.getMethodName().equals("info")) {
		                m.replace("");
		            }
		        }
		    };
		}
	}
}
