/**
 * 
 */
package com.fileflat.positional.generat.api.menupack;

/**
 * @author CS697
 *
 */
public interface ActionInter {
	
	/**
	 * Methode d execution for action
	 */
	public abstract void execAction(Object object) ;
	/**
	 * sysout name classe instanci�e 
	 */
	public abstract void afficheName() ;
	
	/**
	 * return une r�f�rence
	 * @return
	 */
	public abstract Object getReff(); 

}
