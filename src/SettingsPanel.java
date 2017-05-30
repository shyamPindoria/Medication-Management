import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import java.awt.Color;


public class SettingsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SettingsPanel() {
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSettings, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelProfile = new JPanel();
		tabbedPane.addTab("Profile", null, panelProfile, null);
		GridBagLayout gbl_panelProfile = new GridBagLayout();
		gbl_panelProfile.columnWidths = new int[]{0, 0};
		gbl_panelProfile.rowHeights = new int[]{0, 0, 0};
		gbl_panelProfile.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelProfile.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panelProfile.setLayout(gbl_panelProfile);
		
		JPanel panelPhotoTitle = new JPanel();
		panelPhotoTitle.setBorder(new TitledBorder(null, "Select Profile Photo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelPhotoTitle = new GridBagConstraints();
		gbc_panelPhotoTitle.insets = new Insets(0, 0, 5, 0);
		gbc_panelPhotoTitle.fill = GridBagConstraints.BOTH;
		gbc_panelPhotoTitle.gridx = 0;
		gbc_panelPhotoTitle.gridy = 0;
		panelProfile.add(panelPhotoTitle, gbc_panelPhotoTitle);
		GridBagLayout gbl_panelPhotoTitle = new GridBagLayout();
		gbl_panelPhotoTitle.columnWidths = new int[]{0, 0, 0};
		gbl_panelPhotoTitle.rowHeights = new int[]{0, 0};
		gbl_panelPhotoTitle.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelPhotoTitle.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelPhotoTitle.setLayout(gbl_panelPhotoTitle);
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(12, 12, 12, 12);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelPhotoTitle.add(lblNewLabel, gbc_lblNewLabel);
		Image profilePic = new ImageIcon(this.getClass().getResource("profile.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(profilePic));
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		JButton btnBrowse = new JButton("Browse");
		GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
		gbc_btnBrowse.insets = new Insets(0, 12, 0, 0);
		gbc_btnBrowse.anchor = GridBagConstraints.WEST;
		gbc_btnBrowse.gridx = 1;
		gbc_btnBrowse.gridy = 0;
		panelPhotoTitle.add(btnBrowse, gbc_btnBrowse);
		
		
		
		JPanel panelMainSettings = new JPanel();
		panelMainSettings.setBorder(new TitledBorder(null, "Main Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelMainSettings = new GridBagConstraints();
		gbc_panelMainSettings.weighty = 10.0;
		gbc_panelMainSettings.fill = GridBagConstraints.BOTH;
		gbc_panelMainSettings.gridx = 0;
		gbc_panelMainSettings.gridy = 1;
		panelProfile.add(panelMainSettings, gbc_panelMainSettings);
		GridBagLayout gbl_panelMainSettings = new GridBagLayout();
		gbl_panelMainSettings.columnWidths = new int[]{0, 0, 0};
		gbl_panelMainSettings.rowHeights = new int[]{0, 0, 0};
		gbl_panelMainSettings.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelMainSettings.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panelMainSettings.setLayout(gbl_panelMainSettings);
		
		JPanel panelNotifications = new JPanel();
		tabbedPane.addTab("Notifications", null, panelNotifications, null);
		
		JPanel panelAppearance = new JPanel();
		tabbedPane.addTab("Appearance", null, panelAppearance, null);
		
		
	}

}
