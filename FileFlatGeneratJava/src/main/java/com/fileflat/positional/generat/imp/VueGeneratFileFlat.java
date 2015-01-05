package com.fileflat.positional.generat.imp;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.fileflat.positional.generat.api.outils.RDialog;
import com.fileflat.positional.generat.imp.control.ControlImp;

public class VueGeneratFileFlat {

	private JFrame jFrame = null; // @jve:decl-index=0:visual-constraint="188,29"
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenuFile = null;
	private RDialog rDialog;
	private ControlImp jMenuListener; // @jve:decl-index=0:
	private JMenu jMenuEdit = null;
	private JMenuItem jMenuItemConnectBase = null;
	private JMenu jMenuAdmin = null;
	private JMenuItem jMenuItemSql = null;


	
	public VueGeneratFileFlat() {
		this.rDialog = RDialog.getInstance();
		this.jMenuListener = new ControlImp(this);
		initializer();
	}

	public void initializer() {

//		if(LOG.isDebugEnabled()){
//			LOG.logDebug("boujour");
//		}
		getJFrame().setVisible(true);
	}

	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	public JFrame getJFrame() {
		if (this.jFrame == null) {
			this.jFrame = new JFrame("Accueil"); //$NON-NLS-1$
			// this.jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.jFrame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent ev) {
					
					System.exit(0);
				}});

				
			this.jFrame.setSize(new Dimension(800, 600));
			this.jFrame.setJMenuBar(getJJMenuBar());
			this.jFrame.setContentPane(getJContentPane());
			// jFrame.setVisible(true);
		}
		return this.jFrame;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (this.jContentPane == null) {
			this.jContentPane = new JPanel();
		}
		return this.jContentPane;
	}
	

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (this.jJMenuBar == null) {
			this.jJMenuBar = new JMenuBar();
			this.jJMenuBar.add(getJMenuFile());
			this.jJMenuBar.add(getJMenuEdit());
			this.jJMenuBar.add(getJMenuAdmin());
		}
		return this.jJMenuBar;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenuFile() {
		if (this.jMenuFile == null) {
			this.jMenuFile = new JMenu();
			this.jMenuFile.setName("FILE");
			this.jMenuFile.setText(this.rDialog.getStr("FILE")); //$NON-NLS-1$
			this.jMenuFile.addActionListener(this.jMenuListener);
			this.jMenuFile.add(getJMenuItem("_NEWPROJECT"));
			this.jMenuFile.add(getJMenuItem("_OPEN"));
			this.jMenuFile.add(getJMenuItem("_EXIT"));

			
		}
		return this.jMenuFile;
	}

	

	/**
	 * This method initializes jMenuEdit
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenuEdit() {
		if (this.jMenuEdit == null) {
			this.jMenuEdit = new JMenu();
			this.jMenuEdit.setName("EDIT");
			this.jMenuEdit.setText(this.rDialog.getStr("EDIT")); //$NON-NLS-1$
			this.jMenuEdit.add(getJMenuItem("_OPTION"));
			
		}
		return this.jMenuEdit;
	}

	

	/**
	 * This method initializes jMenuItemStartBase
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem(String clefMenu) {
		
			JMenuItem jMenuItem = new JMenuItem();
			jMenuItem.setName(clefMenu);
			jMenuItem.setText(this.rDialog.getStr(clefMenu));
			jMenuItem.addActionListener(this.jMenuListener);

	
		return jMenuItem;
	}

	

	/**
	 * this method dispose JFame
	 */
	public void dispose() {

		this.jFrame.dispose();
	}

	

	

	/**
	 * This method initializes jMenuAdmin	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAdmin() {
		if (this.jMenuAdmin == null) {
			this.jMenuAdmin = new JMenu();
			this.jMenuAdmin.setText(this.rDialog.getStr("ADMINSQL"));
			this.jMenuAdmin.add(getJMenuItemSql());
			
		}
		return this.jMenuAdmin;
	}

	/**
	 * This method initializes jMenuItemSql	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemSql() {
		if (this.jMenuItemSql == null) {
			this.jMenuItemSql = new JMenuItem();
			this.jMenuItemSql.setName("_SQL");
			this.jMenuItemSql.setText(this.rDialog.getStr("_SQL"));
			this.jMenuItemSql.addActionListener(this.jMenuListener);
			
		}
		return this.jMenuItemSql;
	}

	
	

}
