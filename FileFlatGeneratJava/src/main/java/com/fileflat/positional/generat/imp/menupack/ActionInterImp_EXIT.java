package com.fileflat.positional.generat.imp.menupack;

import javax.swing.JOptionPane;

import com.fileflat.positional.generat.api.menupack.ActionInter;
import com.fileflat.positional.generat.api.outils.RDialog;
import com.fileflat.positional.generat.imp.VueGeneratFileFlat;



public class ActionInterImp_EXIT implements ActionInter {

	@Override
	public void execAction(Object object) {

		String option[] = {
				RDialog.getInstance().getStr("MESSAGE_CONFIRME_YES"),
				RDialog.getInstance().getStr("MESSAGE_CONFIRME_NO") };
		if (JOptionPane.showOptionDialog(null,
				RDialog.getInstance().getStr("MESSAGE_CONFIRME_QUIT"),
				"Confirmation", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, option, null) == 0) {
			
			((VueGeneratFileFlat) object).dispose();
		}
	}

	@Override
	public void afficheName() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName());
	}

	@Override
	public Object getReff() {
		// TODO Auto-generated method stub
		return null;
	}

}
