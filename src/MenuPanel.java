import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class MenuPanel extends JPanel {

	/**
	 * Create the panel and add the menu buttons to it
	 */
	public MenuPanel() {
		this.setBackground(Color.DARK_GRAY);
		GridBagLayout gbl_panelMenu = new GridBagLayout();
		gbl_panelMenu.columnWidths = new int[]{51, 0};
		gbl_panelMenu.rowHeights = new int[]{16, 0, 16, 0, 0, 0, 0, 0};
		gbl_panelMenu.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelMenu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gbl_panelMenu);
		
		
		GridBagConstraints gbc_btnCurrent = new GridBagConstraints();
		gbc_btnCurrent.fill = GridBagConstraints.BOTH;
		gbc_btnCurrent.weighty = 0.1;
		gbc_btnCurrent.gridx = 0;
		gbc_btnCurrent.gridy = 0;
		this.add(createCurrentBtn(), gbc_btnCurrent);
		
		
		GridBagConstraints gbc_btnHistory = new GridBagConstraints();
		gbc_btnHistory.fill = GridBagConstraints.BOTH;
		gbc_btnHistory.weighty = 0.1;
		gbc_btnHistory.insets = new Insets(5, 0, 0, 0);
		gbc_btnHistory.gridx = 0;
		gbc_btnHistory.gridy = 1;
		this.add(createHistoryBtn(), gbc_btnHistory);
		
		
		GridBagConstraints gbc_btnContacts = new GridBagConstraints();
		gbc_btnContacts.fill = GridBagConstraints.BOTH;
		gbc_btnContacts.weighty = 0.1;
		gbc_btnContacts.insets = new Insets(5, 0, 0, 0);
		gbc_btnContacts.gridx = 0;
		gbc_btnContacts.gridy = 2;
		this.add(createContactsBtn(), gbc_btnContacts);
		
		
		GridBagConstraints gbc_btnUpload = new GridBagConstraints();
		gbc_btnUpload.fill = GridBagConstraints.BOTH;
		gbc_btnUpload.weighty = 0.1;
		gbc_btnUpload.insets = new Insets(5, 0, 0, 0);
		gbc_btnUpload.gridx = 0;
		gbc_btnUpload.gridy = 3;
		this.add(createUploadBtn(), gbc_btnUpload);
		
		
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.fill = GridBagConstraints.BOTH;
		gbc_btnHelp.weighty = 0.1;
		gbc_btnHelp.insets = new Insets(5, 0, 0, 0);
		gbc_btnHelp.gridx = 0;
		gbc_btnHelp.gridy = 4;
		this.add(createHelpBtn(), gbc_btnHelp);
		

		GridBagConstraints gbc_btnSettings = new GridBagConstraints();
		gbc_btnSettings.fill = GridBagConstraints.BOTH;
		gbc_btnSettings.weighty = 0.1;
		gbc_btnSettings.insets = new Insets(5, 0, 0, 0);
		gbc_btnSettings.gridx = 0;
		gbc_btnSettings.gridy = 5;
		this.add(createSettingsBtn(), gbc_btnSettings);
		
		
		GridBagConstraints gbc_btnLogOut = new GridBagConstraints();
		gbc_btnLogOut.weighty = 1.0;
		gbc_btnLogOut.anchor = GridBagConstraints.SOUTH;
		gbc_btnLogOut.insets = new Insets(5, 0, 0, 0);
		gbc_btnLogOut.gridx = 0;
		gbc_btnLogOut.gridy = 6;
		add(createLogOutBtn(), gbc_btnLogOut);
	}

	/**
	 * Create current medication button
	 * @return current medication button
	 */
	private JButton createCurrentBtn() {

		JButton btnCurrent = new JButton("Medication"); //Creates button with text
		btnCurrent.setHorizontalAlignment(SwingConstants.LEFT);  //Sets the alignment to left
		btnCurrent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image medicationIcon = new ImageIcon(this.getClass().getResource("medication.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnCurrent.setIcon(new ImageIcon(medicationIcon)); //Add the medication image to the button
		btnCurrent.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnCurrent.setOpaque(true); //To allow the background color to show
		btnCurrent.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnCurrent.setBackground(new Color(0, 255, 220)); //Set the background color

		return btnCurrent;
	}

	/**
	 * Create history button
	 * @return history button
	 */
	private JButton createHistoryBtn(){
		
		JButton btnHistory = new JButton("History"); //Creates button with text
		btnHistory.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnHistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image historyIcon = new ImageIcon(this.getClass().getResource("history.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnHistory.setIcon(new ImageIcon(historyIcon)); //Add the history image to the button
		btnHistory.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnHistory.setOpaque(true); //To allow the background color to show
		btnHistory.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnHistory.setBackground(new Color(0, 255, 220)); //Set the background color
		
		return btnHistory;
	}
	
	/**
	 * Create contacts button
	 * @return contacts button
	 */
	private JButton createContactsBtn() {
		
		JButton btnContacts = new JButton("Contacts"); //Creates button with text
		btnContacts.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnContacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image contactsIcon = new ImageIcon(this.getClass().getResource("contacts.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnContacts.setIcon(new ImageIcon(contactsIcon)); //Add the contact image to the button
		btnContacts.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnContacts.setOpaque(true); //To allow the background color to show
		btnContacts.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnContacts.setBackground(new Color(0, 255, 220)); //Set the background color
		
		return btnContacts;
	}

	/**
	 * Create upload button
	 * @return upload button
	 */
	private JButton createUploadBtn() {
		
		JButton btnUpload = new JButton("Upload"); //Creates button with text
		btnUpload.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnUpload.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image uploadIcon = new ImageIcon(this.getClass().getResource("upload.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnUpload.setIcon(new ImageIcon(uploadIcon)); //Add the upload image to the button
		btnUpload.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnUpload.setOpaque(true); //To allow the background color to show
		btnUpload.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnUpload.setBackground(new Color(0, 255, 220)); //Set the background color
		return btnUpload;
		
	}

	/**
	 * Create help button
	 * @return help button
	 */
	private JButton createHelpBtn() {
		JButton btnHelp = new JButton("Help"); //Creates button with text
		btnHelp.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image helpIcon = new ImageIcon(this.getClass().getResource("help.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnHelp.setIcon(new ImageIcon(helpIcon)); //Add the help image to the button
		btnHelp.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnHelp.setOpaque(true); //To allow the background color to show
		btnHelp.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnHelp.setBackground(new Color(0, 255, 220)); //Set the background color
		return btnHelp;
	}
	
	/**
	 * Create settings button
	 * @return settings button
	 */
	private JButton createSettingsBtn() {
		JButton btnSettings = new JButton("Settings"); //Creates button with text
		btnSettings.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image settingsIcon = new ImageIcon(this.getClass().getResource("settings.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnSettings.setIcon(new ImageIcon(settingsIcon)); //Add the settings image to the button
		btnSettings.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnSettings.setOpaque(true); //To allow the background color to show
		btnSettings.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnSettings.setBackground(new Color(0, 255, 220)); //Set the background color
		return btnSettings;
	}

	/**
	 * Create log out button
	 * @return log out button
	 */
	private JButton createLogOutBtn() {
		JButton btnLogOut = new JButton("Log Out"); //Creates button with text
		btnLogOut.setHorizontalAlignment(SwingConstants.LEFT); //Sets the alignment to left
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Changes the mouse over cursor to a hand cursor
		Image logOutIcon = new ImageIcon(this.getClass().getResource("lock.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnLogOut.setIcon(new ImageIcon(logOutIcon)); //Add the lock image to the button
		btnLogOut.setPreferredSize(new Dimension(100, 25)); //Set the size of the button
		btnLogOut.setOpaque(true); //To allow the background color to show
		btnLogOut.setBorder(new EmptyBorder(0, 12, 0, 0)); //Set an empty border to push the image off the left edge
		btnLogOut.setBackground(new Color(0, 255, 220)); //Set the background color
		return btnLogOut;
	}
	
}