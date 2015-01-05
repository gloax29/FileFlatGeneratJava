/**
 * 
 */
package com.fileflat.positional.generat.api.fabrique;

import javax.swing.JMenuItem;

import com.fileflat.positional.generat.api.menupack.ActionInter;

/**
 * @author CS697
 *
 */
public interface FabriqueInstance {

	/**
	 * @return
	 */
	public abstract JMenuItem getJMItem() ;
	/**
	 * methode for fabrique
	 * @return
	 */
	public abstract ActionInter getAction(Object object); 
	
	
}
