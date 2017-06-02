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
	 * Create the panel.
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
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image logOutIcon = new ImageIcon(this.getClass().getResource("lock.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnLogOut.setIcon(new ImageIcon(logOutIcon));
		btnLogOut.setPreferredSize(new Dimension(100, 25));
		btnLogOut.setOpaque(true);
		btnLogOut.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLogOut.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnLogOut.setBackground(new Color(0, 255, 220));
		GridBagConstraints gbc_btnLogOut = new GridBagConstraints();
		gbc_btnLogOut.weighty = 1.0;
		gbc_btnLogOut.anchor = GridBagConstraints.SOUTH;
		gbc_btnLogOut.insets = new Insets(5, 0, 0, 0);
		gbc_btnLogOut.gridx = 0;
		gbc_btnLogOut.gridy = 6;
		add(btnLogOut, gbc_btnLogOut);
	}

	private JButton createCurrentBtn() {

		JButton btnCurrent = new JButton("Medication");
		btnCurrent.setHorizontalAlignment(SwingConstants.LEFT);
		btnCurrent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image medicationIcon = new ImageIcon(this.getClass().getResource("medication.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnCurrent.setIcon(new ImageIcon(medicationIcon));
		btnCurrent.setPreferredSize(new Dimension(100, 25));
		btnCurrent.setOpaque(true);
		btnCurrent.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCurrent.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnCurrent.setBackground(new Color(0, 255, 220));

		return btnCurrent;
	}

	private JButton createHistoryBtn(){
		
		JButton btnHistory = new JButton("History");
		btnHistory.setHorizontalAlignment(SwingConstants.LEFT);
		btnHistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image historyIcon = new ImageIcon(this.getClass().getResource("history.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnHistory.setIcon(new ImageIcon(historyIcon));
		btnHistory.setPreferredSize(new Dimension(100, 25));
		btnHistory.setOpaque(true);
		btnHistory.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHistory.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnHistory.setBackground(new Color(0, 255, 220));
		
		return btnHistory;
	}
	
	private JButton createContactsBtn() {
		
		JButton btnContacts = new JButton("Contacts");
		btnContacts.setHorizontalAlignment(SwingConstants.LEFT);
		btnContacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image contactsIcon = new ImageIcon(this.getClass().getResource("contacts.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnContacts.setIcon(new ImageIcon(contactsIcon));
		btnContacts.setPreferredSize(new Dimension(100, 25));
		btnContacts.setOpaque(true);
		btnContacts.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnContacts.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnContacts.setBackground(new Color(0, 255, 220));
		
		return btnContacts;
	}
	
	private JButton createUploadBtn() {
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpload.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image uploadIcon = new ImageIcon(this.getClass().getResource("upload.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnUpload.setIcon(new ImageIcon(uploadIcon));
		btnUpload.setPreferredSize(new Dimension(100, 25));
		btnUpload.setOpaque(true);
		btnUpload.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnUpload.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnUpload.setBackground(new Color(0, 255, 220));
		return btnUpload;
		
	}

	private JButton createHelpBtn() {
		JButton btnHelp = new JButton("Help");
		btnHelp.setHorizontalAlignment(SwingConstants.LEFT);
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image helpIcon = new ImageIcon(this.getClass().getResource("help.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnHelp.setIcon(new ImageIcon(helpIcon));
		btnHelp.setPreferredSize(new Dimension(100, 25));
		btnHelp.setOpaque(true);
		btnHelp.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHelp.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnHelp.setBackground(new Color(0, 255, 220));
		return btnHelp;
	}
	
	private JButton createSettingsBtn() {
		JButton btnSettings = new JButton("Settings");
		btnSettings.setHorizontalAlignment(SwingConstants.LEFT);
		btnSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image settingsIcon = new ImageIcon(this.getClass().getResource("settings.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnSettings.setIcon(new ImageIcon(settingsIcon));
		btnSettings.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnSettings.setPreferredSize(new Dimension(100, 25));
		btnSettings.setBackground(new Color(0, 255, 220));
		btnSettings.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnSettings.setOpaque(true);
		return btnSettings;
	}
}