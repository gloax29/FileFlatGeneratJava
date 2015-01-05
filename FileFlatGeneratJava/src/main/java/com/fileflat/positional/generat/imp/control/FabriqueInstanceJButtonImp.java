package com.fileflat.positional.generat.imp.control;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import com.fileflat.positional.generat.api.fabrique.FabriqueInstance;
import com.fileflat.positional.generat.api.menupack.ActionInter;
import com.fileflat.positional.generat.api.outils.RDialog;
import com.fileflat.positional.generat.imp.menupack.ActionInterImp_ADMINSQL;
import com.fileflat.positional.generat.imp.menupack.ActionInterImp_EXIT;
import com.fileflat.positional.generat.imp.menupack.ActionInterImp_OPEN;
import com.fileflat.positional.generat.imp.menupack.ActionInterImp_OPTION;




public class FabriqueInstanceJButtonImp implements FabriqueInstance {
	private static FabriqueInstance instance ;
	private RDialog rDialog ;
	
	private FabriqueInstanceJButtonImp() {
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
		if(object instanceof JMenuItem){
			actionInter =	getTaitement((JMenuItem) object);
		}
		if(object instanceof JButton ){
			
			actionInter = getJbutton((JButton) object) ;
			
		}
		return actionInter ;
	}

	private ActionInter getJbutton(JButton jButton) {
		// TODO Auto-generated method stub
		
		return null ;
	}

	private ActionInter getTaitement(JMenuItem jMenuItem) {
		// TODO Auto-generated method stub
		if(this.rDialog.getStr("_OPEN").equals(jMenuItem.getText()) ){
			return new ActionInterImp_OPEN();
		}

		if(this.rDialog.getStr("_OPTION").equals(jMenuItem.getText()) ){
			return new ActionInterImp_OPTION();
		}
		if(this.rDialog.getStr("_EXIT").equals(jMenuItem.getText()) ){
			return new ActionInterImp_EXIT();
		}
		if(this.rDialog.getStr("_NEWPROJECT").equals(jMenuItem.getText()) ){
			return new ActionInterImp_OPEN();
		}
		if(this.rDialog.getStr("_SQL").equals(jMenuItem.getText()) ){
			return new ActionInterImp_ADMINSQL();
		}
		
		
		
		return null ;
	}
	
	

	public static FabriqueInstance getInstance(){
		if(instance == null ){
			instance = new FabriqueInstanceJButtonImp() ;
		}
		return instance ;
		
	}
}
