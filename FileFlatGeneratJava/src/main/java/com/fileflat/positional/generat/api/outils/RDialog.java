package com.fileflat.positional.generat.api.outils;

import java.util.ResourceBundle;

public class RDialog {

	private static RDialog instance = null;
	private  ResourceBundle lesDialogues ;

	private RDialog() {
		
		//this.lesDialogues = ResourceBundle.getBundle(getClass().getResource("/com/ClefDialogue.properties").getPath()) ;
		this.lesDialogues = ResourceBundle.getBundle("ClefDialogue") ;
		
	}

	public static RDialog getInstance() {
		if (instance == null) {
			instance = new RDialog();
		}
		return instance;
	}
	public String getStr(String key) {
			return this.lesDialogues.getString(key);
		}


}
