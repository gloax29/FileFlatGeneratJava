package com.fileflat.positional.generat.api.control;


public interface InterControl  {

	/**
	 * @return
	 */
	public abstract String getNameImp();
	/**
	 * @return
	 */
	public abstract Object getDependance() ;
	/**
	 * for the action class
	 */
	public abstract void runAction(Object object);
	
}