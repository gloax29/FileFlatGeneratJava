package com.fileflat.positional.generat.imp.vue;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import com.fileflat.positional.generat.api.fabrique.FabriqueInstance;
import com.fileflat.positional.generat.api.menupack.ActionInter;
import com.fileflat.positional.generat.api.outils.RDialog;


public class FabriqueInstanceMouseImp implements FabriqueInstance {
	private static FabriqueInstance instance ;
	private RDialog rDialog ;
	
	private FabriqueInstanceMouseImp() {
	this.rDialog = RDialog.getInstance() ;
	}

	@Override
	public JMenuItem getJMItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActionInter getAction(Object object) {
		
		ActionInter actionInter = null ;

		if(object instanceof JButton ){
			
			actionInter = getJbutton((JButton) object) ;
			
		}
		return actionInter ;
	}

	private ActionInter getJbutton(JButton jButton) {
		// TODO Auto-generated method stub
		
		
		
		return null ;
	}

	public static FabriqueInstance getInstance(){
		if(instance == null ){
			instance = new FabriqueInstanceMouseImp() ;
		}
		return instance ;
		
	}
}
