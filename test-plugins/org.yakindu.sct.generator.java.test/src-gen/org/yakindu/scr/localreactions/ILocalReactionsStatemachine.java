/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.localreactions;

import org.yakindu.scr.IStatemachine;

public interface ILocalReactionsStatemachine extends IStatemachine {
	public interface SCInterface {
	
		public long getX();
		
		public void setX(long value);
		
		public long getEn_false();
		
		public void setEn_false(long value);
		
		public long getEn_true();
		
		public void setEn_true(long value);
		
		public long getEx_true();
		
		public void setEx_true(long value);
		
		public long getEx_false();
		
		public void setEx_false(long value);
		
	}
	
	public SCInterface getSCInterface();
	
}
