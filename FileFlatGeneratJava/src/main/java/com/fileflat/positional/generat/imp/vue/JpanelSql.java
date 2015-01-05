package com.fileflat.positional.generat.imp.vue;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;

import com.fileflat.positional.generat.api.control.InterControl;
import com.fileflat.positional.generat.api.outils.RDialog;
import com.fileflat.positional.log.OneLogClass;



public class JpanelSql {
	
	private static Logger log =  OneLogClass.getInstlogger(JpanelSql.class);

	private JPanel jPanelSql = null; // @jve:decl-index=0:visual-constraint="333,64"
	private JEditorPane jEditorPaneReqest = null;
	private JTable jTableResponce = null;
	private JToolBar jJToolBarExecute = null;
	private JButton jButtonExec = null;
	private JButton jButtonActive = null;
	private InterControl controlMouse;
	private InterControl controlLisner;
	private RDialog dialog;
	private JButton jButtonClear = null;
	private JToolBar jJToolBarResulta = null;
	private JButton jButtonClearResulta = null;
	private JScrollBar jScrollBarJeditPane = null; // @jve:decl-index=0:visual-constraint="40,2"
	private JScrollPane jScrollPaneeditSQL = null;
	private JScrollPane jScrollPaneResponse = null;
	private JScrollPane jScrollPane = null;

	/****************************************************/
//	String data[][] = {
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" },
//			{ "001", "vinod", "Bihar", "India", "Biology", "65", "First" },
//			{ "002", "Raju", "ABC", "Kanada", "Geography", "58", "second" },
//			{ "003", "Aman", "Delhi", "India", "computer", "98", "Dictontion" },
//			{ "004", "Ranjan", "Bangloor", "India", "chemestry", "90",
//					"Dictontion" } };
//	String col[] = { "Roll", "Name", "State", "country", "Math", "Marks",
//			"Grade" };

	private GridBagConstraints gridBagConstraints;
	private GridBagConstraints gridBagConstraints1; // @jve:decl-index=0:
	private GridBagConstraints gridBagConstraints2; // @jve:decl-index=0:
	private GridBagConstraints gridBagConstraints5; // @jve:decl-index=0:
	private GridBagConstraints gridBagConstraints4; // @jve:decl-index=0:
	private GridBagConstraints gridBagConstraints21;
	private GridBagConstraints gridBagConstraints11; // @jve:decl-index=0:
	private GridBagConstraints gridBagConstraints12;

	/*****************************************************/

	/**
	 * This method initializes jPanelSql
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJPanelSql() {
		if (this.jPanelSql == null) {
			this.controlMouse = new AdminSqlMouseImp(this);
			this.controlLisner = new AdminSqlListenerImp(this);
			this.dialog = RDialog.getInstance();
			this.jPanelSql = new JPanel();
			this.jPanelSql.setLayout(new GridBagLayout());
			this.jPanelSql.setSize(new Dimension(800, 600));
			this.jPanelSql.add(getJJToolBarExecute(), getGridBagConstraints2());
			this.jPanelSql
					.add(getJJToolBarResulta(), getGridBagConstraints11());
			this.jPanelSql.add(getJScrollPaneeditSQL(),
					getGridBagConstraints4());
			this.jPanelSql.add(getJScrollPaneResponse(),
					getGridBagConstraints5());
			// this.jPanelSql.add(getJTableResponce(), gridBagConstraints5);
		}
		return this.jPanelSql;
	}

	public void init() {
		
		this.jScrollPaneResponse = null ;
		
//		this.jPanelSql.add(getJJToolBarExecute(), getGridBagConstraints2());
//		this.jPanelSql.add(getJJToolBarResulta(), getGridBagConstraints11());
//		this.jPanelSql.add(getJScrollPaneeditSQL(), getGridBagConstraints4());
		this.jPanelSql.add(getJScrollPaneResponse(), getGridBagConstraints5());
	}

	/**
	 * This method initializes jEditorPaneReqest
	 * 
	 * @return javax.swing.JEditorPane
	 */
	public JEditorPane getJEditorPaneReqest() {
		if (this.jEditorPaneReqest == null) {
			Dimension dim = new Dimension(790, 270);
			this.jEditorPaneReqest = new JEditorPane();
			this.jEditorPaneReqest.setName("Request");
			this.jEditorPaneReqest.setPreferredSize(dim);
			this.jEditorPaneReqest.setMaximumSize(dim);
			this.jEditorPaneReqest.setMinimumSize(dim);
			this.jEditorPaneReqest.add(getJScrollBarJeditPane());

		}
		return this.jEditorPaneReqest;
	}

	/**
	 * This method initializes jTableResponce
	 * 
	 * @return javax.swing.JTable
	 */
	public JTable getJTableResponce() {
		if (this.jTableResponce == null) {
			this.jTableResponce = new JTable();
			//JTable jTable2 = new JTable(this.data, this.col);
			//this.jTableResponce = jTable2;//
			Dimension dimension = new Dimension(600, 120);
			this.jTableResponce.setMaximumSize(dimension);
			this.jTableResponce.setMinimumSize(dimension);
			this.jTableResponce.setAutoscrolls(true);
			this.jTableResponce.setName("Response");
			this.jTableResponce.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
	
		return this.jTableResponce;
	}

	public void setJTableResponce(JTable jTable) {
		log.debug("JpanelSql.setJTableResponce()");
		this.jTableResponce = jTable;
	}

	/**
	 * This method initializes jJToolBarExecute
	 * 
	 * @return javax.swing.JToolBar
	 */
	private JToolBar getJJToolBarExecute() {
		if (this.jJToolBarExecute == null) {
			
			this.jJToolBarExecute = new JToolBar();
			this.jJToolBarExecute.setFloatable(false);
			this.jJToolBarExecute.setPreferredSize(new Dimension(100, 16));
			this.jJToolBarExecute.add(getJButtonActive());
			this.jJToolBarExecute.add(getJButtonExec());
			this.jJToolBarExecute.add(getJButtonClear());
		}
		return this.jJToolBarExecute;
	}

	/**
	 * This method initializes jButtonExec
	 * 
	 * @return javax.swing.JButton
	 */
	public JButton getJButtonExec() {
		if (this.jButtonExec == null) {
			this.jButtonExec = new JButton();
			this.jButtonExec.setIcon(new ImageIcon(getClass().getResource(
					this.dialog.getStr("_ICONEXEC"))));
			this.jButtonExec.setName(this.dialog.getStr("JTOOLBAR_EXEC"));
			this.jButtonExec
					.addActionListener((ActionListener) this.controlLisner);
			this.jButtonExec
					.addMouseListener((MouseListener) this.controlMouse);
		}
		return this.jButtonExec;
	}

	/**
	 * This method initializes jButtonActive
	 * 
	 * @return javax.swing.JButton
	 */
	public JButton getJButtonActive() {
		if (this.jButtonActive == null) {
			this.jButtonActive = new JButton();
			this.jButtonActive.setIcon(new ImageIcon(getClass().getResource(
					this.dialog.getStr("_ICONACTIVE"))));
			this.jButtonActive.setName(this.dialog.getStr("JTOOLBAR_ACTIVE"));
			this.jButtonActive
					.addActionListener((ActionListener) this.controlLisner);
			this.jButtonActive
					.addMouseListener((MouseListener) this.controlMouse);
		}
		return this.jButtonActive;
	}

	/**
	 * This method initializes jButtonClear
	 * 
	 * @return javax.swing.JButton
	 */
	public JButton getJButtonClear() {
		if (this.jButtonClear == null) {
			this.jButtonClear = new JButton();
			this.jButtonClear.setIcon(new ImageIcon(getClass().getResource(
					this.dialog.getStr("_ICONCLEAR"))));
			this.jButtonClear.setName(this.dialog.getStr("JTOOLBAR_CLEAR"));
			this.jButtonClear
					.addActionListener((ActionListener) this.controlLisner);
			this.jButtonClear
					.addMouseListener((MouseListener) this.controlMouse);
		}
		return this.jButtonClear;
	}

	/**
	 * This method initializes jJToolBarResulta
	 * 
	 * @return javax.swing.JToolBar
	 */
	private JToolBar getJJToolBarResulta() {
		if (this.jJToolBarResulta == null) {
			this.jJToolBarResulta = new JToolBar();
			this.jJToolBarResulta.setFloatable(false);
			this.jJToolBarResulta.setPreferredSize(new Dimension(100, 16));
			// this.jJToolBarResulta.add("");
			this.jJToolBarResulta.add(getJButtonClearResulta());
			// this.jJToolBarResulta.add("");
			// this.jJToolBarResulta.add("");
		}
		return this.jJToolBarResulta;
	}

	/**
	 * This method initializes jButtonClearResulta
	 * 
	 * @return javax.swing.JButton
	 */
	public JButton getJButtonClearResulta() {
	
		if (this.jButtonClearResulta == null) {
			this.jButtonClearResulta = new JButton();
			this.jButtonClearResulta.setName(this.dialog
					.getStr("JTOOLBAR_CLEAR_RESULTA"));
			this.jButtonClearResulta.setIcon(new ImageIcon(getClass()
					.getResource(this.dialog.getStr("_ICONCLEAR"))));
			
			this.jButtonClearResulta
					.addActionListener((ActionListener) this.controlLisner);
			this.jButtonClearResulta
					.addMouseListener((MouseListener) this.controlMouse);
		}
		return this.jButtonClearResulta;
	}

	/**
	 * This method initializes jScrollBarJeditPane
	 * 
	 * @return javax.swing.JScrollBar
	 */
	private JScrollBar getJScrollBarJeditPane() {
		if (this.jScrollBarJeditPane == null) {
			this.jScrollBarJeditPane = new JScrollBar();
		}
		return this.jScrollBarJeditPane;
	}

	/**
	 * This method initializes jScrollPaneeditSQL
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPaneeditSQL() {
		if (this.jScrollPaneeditSQL == null) {
			this.jScrollPaneeditSQL = new JScrollPane();
			this.jScrollPaneeditSQL.setPreferredSize(new Dimension(700, 270));
			this.jScrollPaneeditSQL.setViewportView(getJEditorPaneReqest());
		}
		return this.jScrollPaneeditSQL;
	}

	/**
	 * This method initializes jScrollPaneResponse
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPaneResponse() {
		if (this.jScrollPaneResponse == null) {
			this.jScrollPaneResponse = new JScrollPane();
			this.jScrollPaneResponse.setPreferredSize(new Dimension(460, 440));
			this.jScrollPaneResponse.setViewportView(getJScrollPane());

		}
		return this.jScrollPaneResponse;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (this.jScrollPane == null) {
			this.jScrollPane = new JScrollPane();
			this.jScrollPane.setPreferredSize(new Dimension(700, 180));
			this.jScrollPane.setViewportView(getJTableResponce());
		}
		return this.jScrollPane;
	}

	/**
	 * @return the gridBagConstraints
	 */
	private GridBagConstraints getGridBagConstraints() {
		if (this.gridBagConstraints == null) {
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints.gridy = 1;
			this.gridBagConstraints.weightx = 1.0;
			this.gridBagConstraints.weighty = 0.6;
			this.gridBagConstraints.gridheight = 1;
			this.gridBagConstraints.insets = new Insets(5, 5, 5, 5);
			this.gridBagConstraints.gridx = 0;
		}

		return this.gridBagConstraints;
	}

	/**
	 * @return the gridBagConstraints1
	 */
	private GridBagConstraints getGridBagConstraints1() {

		if (this.gridBagConstraints1 == null) {
			this.gridBagConstraints1 = new GridBagConstraints();
			this.gridBagConstraints1.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints1.gridy = 3;
			this.gridBagConstraints1.weightx = 1.0;
			this.gridBagConstraints1.weighty = 0.6;
			this.gridBagConstraints1.insets = new Insets(5, 5, 5, 5);
			this.gridBagConstraints1.gridx = 0;
		}

		return this.gridBagConstraints1;
	}

	/**
	 * @return the gridBagConstraints2
	 */
	private GridBagConstraints getGridBagConstraints2() {

		if (this.gridBagConstraints2 == null) {
			this.gridBagConstraints2 = new GridBagConstraints();
			this.gridBagConstraints2.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints2.gridy = 0;
			this.gridBagConstraints2.weightx = 1.0;
			this.gridBagConstraints2.weighty = 0.1;
			this.gridBagConstraints2.anchor = GridBagConstraints.WEST;
			this.gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
			this.gridBagConstraints2.ipadx = 1;
			this.gridBagConstraints2.ipady = 1;
			this.gridBagConstraints2.gridx = 0;
		}

		return this.gridBagConstraints2;
	}

	/**
	 * @return the gridBagConstraints5
	 */
	private GridBagConstraints getGridBagConstraints5() {
		if (this.gridBagConstraints5 == null) {
			this.gridBagConstraints5 = new GridBagConstraints();
			this.gridBagConstraints5.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints5.gridy = 3;
			this.gridBagConstraints5.weightx = 1.0;
			this.gridBagConstraints5.weighty = 1.0;
			this.gridBagConstraints5.gridx = 0;
		}
		return this.gridBagConstraints5;
	}

	/**
	 * @return the gridBagConstraints4
	 */
	private GridBagConstraints getGridBagConstraints4() {
		if (this.gridBagConstraints4 == null) {
			this.gridBagConstraints4 = new GridBagConstraints();
			this.gridBagConstraints4.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints4.gridy = 1;
			this.gridBagConstraints4.weightx = 1.0;
			this.gridBagConstraints4.weighty = 1.0;
			this.gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
			this.gridBagConstraints4.gridx = 0;
		}
		return this.gridBagConstraints4;
	}

	/**
	 * @return the gridBagConstraints21
	 */
	private GridBagConstraints getGridBagConstraints21() {
		if (this.gridBagConstraints21 == null) {
			this.gridBagConstraints21 = new GridBagConstraints();
			this.gridBagConstraints21.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints21.gridy = 3;
			this.gridBagConstraints21.weighty = 1.0;
			this.gridBagConstraints21.gridx = 1;
		}
		return this.gridBagConstraints21;
	}

	/**
	 * @return the gridBagConstraints11
	 */
	private GridBagConstraints getGridBagConstraints11() {
		if (this.gridBagConstraints11 == null) {
			this.gridBagConstraints11 = new GridBagConstraints();
			this.gridBagConstraints11.fill = GridBagConstraints.BOTH;
			this.gridBagConstraints11.gridy = 2;
			this.gridBagConstraints11.weightx = 1.0;
			this.gridBagConstraints11.weighty = 0.1;
			this.gridBagConstraints11.gridx = 0;
		}
		return this.gridBagConstraints11;
	}

	/**
	 * @return the gridBagConstraints12
	 */
	private GridBagConstraints getGridBagConstraints12() {
		if (this.gridBagConstraints12 == null) {
			this.gridBagConstraints12 = new GridBagConstraints();
			this.gridBagConstraints12.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints12.gridy = 1;
			this.gridBagConstraints12.weighty = 1.0;
			this.gridBagConstraints12.gridx = 1;
		}

		return this.gridBagConstraints12;
	}

}
