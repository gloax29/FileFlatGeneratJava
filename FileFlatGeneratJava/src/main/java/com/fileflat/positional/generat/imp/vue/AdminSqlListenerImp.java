package com.fileflat.positional.generat.imp.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.fileflat.positional.generat.api.control.InterControl;
import com.fileflat.positional.generat.api.fabrique.FabriqueInstance;
import com.fileflat.positional.generat.api.menupack.ActionInter;
import com.fileflat.positional.generat.imp.control.FabriqueInstanceJButtonImp;



public class AdminSqlListenerImp implements ActionListener,  InterControl {
	
	protected String nameClass = "AdminSqlListenerImp";
	private Object dependance;
	private FabriqueInstance fabriqueInstance  ;

	
	public AdminSqlListenerImp(Object dependance ) {
		this.dependance = dependance;
		this.fabriqueInstance = FabriqueInstanceJButtonImp.getInstance();

	}
	
	@Override
	public String getNameImp() {
		return this.nameClass;
	}

	@Override
	public Object getDependance() {
		return this.dependance ;
	}

	@Override
	public void runAction(Object object) {
		System.out.println("AdminSqlImp.runAction()");
		ActionInter actionInter = this.fabriqueInstance.getAction(object);
		if(actionInter != null){
		actionInter.execAction(this.dependance);
		}
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("AdminSqlImp.actionPerformed()");
		System.out.println("e.getSource().getClass().getSimpleName() "
				+ e.getSource().getClass().getSimpleName());
		System.out.println("Control.actionPerformed() " + e.getActionCommand());
		runAction(e.getSource()); // pour les action ;
	}

}
