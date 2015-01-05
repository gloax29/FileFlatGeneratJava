package com.fileflat.positional.generat.imp.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.fileflat.positional.generat.api.control.InterControl;
import com.fileflat.positional.generat.api.fabrique.FabriqueInstance;
import com.fileflat.positional.generat.api.menupack.ActionInter;

public class ControlImp implements ActionListener, MenuListener, InterControl {
	protected String nameClass = "";
	private Object dependance;
	private ActionInter actionInter;
	private FabriqueInstance fabriqueInstance;

	public ControlImp(Object dependance) {
		// TODO Auto-generated constructor stub
		this.dependance = dependance;
		this.fabriqueInstance = FabriqueInstanceJButtonImp.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.gde.app.dev.cont.InterControl#menuCanceled(javax.swing.event.MenuEvent
	 * )
	 */
	@Override
	public void menuCanceled(MenuEvent arg0) {
		System.out.println("Control.menuCanceled()" + arg0.getSource());
	}


	@Override
	public void menuDeselected(MenuEvent arg0) {
		System.out.println("Control.menuDeselected()" + arg0.getSource());

	}


	@Override
	public void menuSelected(MenuEvent arg0) {

		System.out.println("Control.menuSelected()" + arg0.getSource());
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("e.getSource().getClass().getSimpleName() "
				+ e.getSource().getClass().getSimpleName());
		System.out.println("Control.actionPerformed() " + e.getActionCommand());
		runAction(e.getSource()); // pour les action ;

	}

	@Override
	public String getNameImp() {

		return this.nameClass;
	}

	@Override
	public Object getDependance() {

		return this.dependance;
	}

	@Override
	public void runAction(Object object) {
		System.out.println("ControlImp.runAction()");
		this.actionInter = this.fabriqueInstance.getAction(object);
		this.actionInter.afficheName();
	this.actionInter.execAction(this.dependance);
		
		System.out.println("run de "+object.getClass());

	}

}
