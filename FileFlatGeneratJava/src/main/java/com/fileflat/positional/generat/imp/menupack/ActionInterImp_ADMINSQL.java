package com.fileflat.positional.generat.imp.menupack;

import org.apache.log4j.Logger;

import com.fileflat.positional.generat.api.menupack.ActionInter;
import com.fileflat.positional.generat.imp.VueGeneratFileFlat;
import com.fileflat.positional.generat.imp.vue.JpanelSql;
import com.fileflat.positional.log.OneLogClass;



public class ActionInterImp_ADMINSQL implements ActionInter {
	private static Logger log =  OneLogClass.getInstlogger(ActionInterImp_ADMINSQL.class);
	@Override
	public void execAction(Object object) {
		JpanelSql jpanelSql = new JpanelSql();
		((VueGeneratFileFlat) object).getJFrame().setContentPane(jpanelSql.getJPanelSql());
		((VueGeneratFileFlat) object).initializer();
		
	}

	@Override
	public void afficheName() {
		
		log.debug("afficheName()");
	}

	@Override
	public Object getReff() {
		
		return null;
	}

}
