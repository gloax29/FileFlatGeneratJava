package com.fileflat.positional.generat.imp.vue;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.fileflat.positional.generat.api.control.InterControl;
import com.fileflat.positional.generat.api.fabrique.FabriqueInstance;
import com.fileflat.positional.generat.api.menupack.ActionInter;



public class AdminSqlMouseImp implements MouseListener, InterControl {
	
	private Object dependance;
	private FabriqueInstance fabriqueInstance  ;

	
	public AdminSqlMouseImp(Object dependance ) {
		// TODO Auto-generated constructor stub
		this.dependance = dependance;
		this.fabriqueInstance = FabriqueInstanceMouseImp.getInstance();

	}
	
	@Override
	public String getNameImp() {
		return this.getClass().getName() ;
	}

	@Override
	public Object getDependance() {	
		return this.dependance ;
	}

	@Override
	public void runAction(Object object) {
		ActionInter actionInter = this.fabriqueInstance.getAction(object);
		if(actionInter != null){
		actionInter.execAction(this.dependance);
		}
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		runAction(e.getSource()); // pour les action ;
	
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

}
