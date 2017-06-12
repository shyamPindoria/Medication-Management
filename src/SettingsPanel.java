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
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.UIManager;


public class SettingsPanel extends JPanel {
	///
	private JTextField textFieldTitle;
	private JTextField textFieldDay;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JTextField textFieldContactNum;
	private JTextField textFieldAddress;
	private JTextField textFieldLanguage;

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

		Image profilePic = new ImageIcon(this.getClass().getResource("profile.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

		JScrollPane settingsScrollPane = new JScrollPane();
		this.add(settingsScrollPane,BorderLayout.CENTER);

		JPanel generalSettingspanel = new JPanel();
		settingsScrollPane.setViewportView(generalSettingspanel);
		GridBagLayout gbl_generalSettingspanel = new GridBagLayout();
		gbl_generalSettingspanel.columnWidths = new int[]{0, 0};
		gbl_generalSettingspanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_generalSettingspanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_generalSettingspanel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		generalSettingspanel.setLayout(gbl_generalSettingspanel);

		JPanel profileSettingsPanel = new JPanel();
		profileSettingsPanel.setBorder(new TitledBorder(null, "Select Profile Photo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_profileSettingsPanel = new GridBagConstraints();
		gbc_profileSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_profileSettingsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_profileSettingsPanel.gridx = 0;
		gbc_profileSettingsPanel.gridy = 0;
		generalSettingspanel.add(profileSettingsPanel, gbc_profileSettingsPanel);
		GridBagLayout gbl_profileSettingsPanel = new GridBagLayout();
		gbl_profileSettingsPanel.columnWidths = new int[]{0, 0, 0};
		gbl_profileSettingsPanel.rowHeights = new int[]{0, 0};
		gbl_profileSettingsPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_profileSettingsPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		profileSettingsPanel.setLayout(gbl_profileSettingsPanel);
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(profilePic));
		imgLabel.setAlignmentX(1.0f);
		GridBagConstraints gbc_imgLabel = new GridBagConstraints();
		gbc_imgLabel.insets = new Insets(12, 12, 12, 12);
		gbc_imgLabel.gridx = 0;
		gbc_imgLabel.gridy = 0;
		profileSettingsPanel.add(imgLabel, gbc_imgLabel);

		JButton btnBrowse = new JButton("Browse");
		GridBagConstraints gbc_btnBrowse = new GridBagConstraints();
		gbc_btnBrowse.insets = new Insets(0, 12, 0, 0);
		gbc_btnBrowse.anchor = GridBagConstraints.WEST;
		gbc_btnBrowse.gridx = 1;
		gbc_btnBrowse.gridy = 0;
		profileSettingsPanel.add(btnBrowse, gbc_btnBrowse);

		JPanel mainSettingsPanel = new JPanel();
		mainSettingsPanel.setBorder(new TitledBorder(null, "Main Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_mainSettingsPanel = new GridBagConstraints();
		gbc_mainSettingsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_mainSettingsPanel.weighty = 1.0;
		gbc_mainSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_mainSettingsPanel.gridx = 0;
		gbc_mainSettingsPanel.gridy = 1;
		generalSettingspanel.add(mainSettingsPanel, gbc_mainSettingsPanel);
		GridBagLayout gbl_mainSettingsPanel = new GridBagLayout();
		gbl_mainSettingsPanel.columnWidths = new int[]{0, 0, 0};
		gbl_mainSettingsPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_mainSettingsPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_mainSettingsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainSettingsPanel.setLayout(gbl_mainSettingsPanel);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(12, 0, 5, 12);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		mainSettingsPanel.add(lblName, gbc_lblName);

		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		GridBagConstraints gbc_textFieldName = new GridBagConstraints();
		gbc_textFieldName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldName.insets = new Insets(12, 0, 5, 12);
		gbc_textFieldName.gridx = 1;
		gbc_textFieldName.gridy = 0;
		mainSettingsPanel.add(textFieldName, gbc_textFieldName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 12);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 1;
		mainSettingsPanel.add(lblEmail, gbc_lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		GridBagConstraints gbc_textFieldEmail = new GridBagConstraints();
		gbc_textFieldEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmail.insets = new Insets(0, 0, 5, 12);
		gbc_textFieldEmail.gridx = 1;
		gbc_textFieldEmail.gridy = 1;
		mainSettingsPanel.add(textFieldEmail, gbc_textFieldEmail);

		JLabel lblContactNum = new JLabel("Contact Number");
		lblContactNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblContactNum = new GridBagConstraints();
		gbc_lblContactNum.anchor = GridBagConstraints.EAST;
		gbc_lblContactNum.insets = new Insets(0, 0, 5, 12);
		gbc_lblContactNum.gridx = 0;
		gbc_lblContactNum.gridy = 2;
		mainSettingsPanel.add(lblContactNum, gbc_lblContactNum);

		textFieldContactNum = new JTextField();
		textFieldContactNum.setColumns(10);
		GridBagConstraints gbc_textFieldContactNum = new GridBagConstraints();
		gbc_textFieldContactNum.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldContactNum.insets = new Insets(0, 0, 5, 12);
		gbc_textFieldContactNum.gridx = 1;
		gbc_textFieldContactNum.gridy = 2;
		mainSettingsPanel.add(textFieldContactNum, gbc_textFieldContactNum);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.anchor = GridBagConstraints.EAST;
		gbc_lblAddress.insets = new Insets(0, 0, 5, 12);
		gbc_lblAddress.gridx = 0;
		gbc_lblAddress.gridy = 3;
		mainSettingsPanel.add(lblAddress, gbc_lblAddress);

		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		GridBagConstraints gbc_textFieldAddress = new GridBagConstraints();
		gbc_textFieldAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAddress.insets = new Insets(0, 0, 5, 12);
		gbc_textFieldAddress.gridx = 1;
		gbc_textFieldAddress.gridy = 3;
		mainSettingsPanel.add(textFieldAddress, gbc_textFieldAddress);

		JLabel lblLanguage = new JLabel("Preferred Language");
		lblLanguage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblLanguage = new GridBagConstraints();
		gbc_lblLanguage.anchor = GridBagConstraints.EAST;
		gbc_lblLanguage.insets = new Insets(0, 12, 12, 12);
		gbc_lblLanguage.gridx = 0;
		gbc_lblLanguage.gridy = 4;
		mainSettingsPanel.add(lblLanguage, gbc_lblLanguage);

		textFieldLanguage = new JTextField();
		textFieldLanguage.setColumns(10);
		GridBagConstraints gbc_textFieldLanguage = new GridBagConstraints();
		gbc_textFieldLanguage.insets = new Insets(0, 0, 12, 12);
		gbc_textFieldLanguage.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLanguage.gridx = 1;
		gbc_textFieldLanguage.gridy = 4;
		mainSettingsPanel.add(textFieldLanguage, gbc_textFieldLanguage);

		JPanel AppearanceSettingsPanel = new JPanel();
		AppearanceSettingsPanel.setBorder(new TitledBorder(null, "Appearence Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_AppearanceSettingsPanel = new GridBagConstraints();
		gbc_AppearanceSettingsPanel.weighty = 1.0;
		gbc_AppearanceSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_AppearanceSettingsPanel.gridx = 0;
		gbc_AppearanceSettingsPanel.gridy = 2;
		generalSettingspanel.add(AppearanceSettingsPanel, gbc_AppearanceSettingsPanel);
		GridBagLayout gbl_AppearanceSettingsPanel = new GridBagLayout();
		gbl_AppearanceSettingsPanel.columnWidths = new int[]{33, 180, 0, 0};
		gbl_AppearanceSettingsPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_AppearanceSettingsPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_AppearanceSettingsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		AppearanceSettingsPanel.setLayout(gbl_AppearanceSettingsPanel);

		JLabel lblFontType = new JLabel("Font ");
		lblFontType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontType = new GridBagConstraints();
		gbc_lblFontType.anchor = GridBagConstraints.EAST;
		gbc_lblFontType.insets = new Insets(12, 12, 5, 12);
		gbc_lblFontType.gridx = 0;
		gbc_lblFontType.gridy = 0;
		AppearanceSettingsPanel.add(lblFontType, gbc_lblFontType);

		JComboBox ComboBoxFont = new JComboBox();
		ComboBoxFont.setPreferredSize(new Dimension(100, 22));
		ComboBoxFont.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ComboBoxFont.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Cosmic", "Fancy"}));
		GridBagConstraints gbc_ComboBoxFont = new GridBagConstraints();
		gbc_ComboBoxFont.anchor = GridBagConstraints.WEST;
		gbc_ComboBoxFont.insets = new Insets(12, 0, 5, 5);
		gbc_ComboBoxFont.gridx = 1;
		gbc_ComboBoxFont.gridy = 0;
		AppearanceSettingsPanel.add(ComboBoxFont, gbc_ComboBoxFont);

		JLabel lblFontColour = new JLabel("Font Colour");
		lblFontColour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontColour = new GridBagConstraints();
		gbc_lblFontColour.insets = new Insets(0, 12, 5, 12);
		gbc_lblFontColour.anchor = GridBagConstraints.EAST;
		gbc_lblFontColour.gridx = 0;
		gbc_lblFontColour.gridy = 1;
		AppearanceSettingsPanel.add(lblFontColour, gbc_lblFontColour);

		JComboBox comboBoxColor = new JComboBox();
		comboBoxColor.setPreferredSize(new Dimension(100, 22));
		comboBoxColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxColor.setModel(new DefaultComboBoxModel(new String[] {"Black", "Red", "Blue", "Brown"}));
		GridBagConstraints gbc_comboBoxColor = new GridBagConstraints();
		gbc_comboBoxColor.fill = GridBagConstraints.VERTICAL;
		gbc_comboBoxColor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxColor.anchor = GridBagConstraints.WEST;
		gbc_comboBoxColor.gridx = 1;
		gbc_comboBoxColor.gridy = 1;
		AppearanceSettingsPanel.add(comboBoxColor, gbc_comboBoxColor);

		JLabel lblFontSize = new JLabel("Font Size");
		lblFontSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontSize = new GridBagConstraints();
		gbc_lblFontSize.anchor = GridBagConstraints.EAST;
		gbc_lblFontSize.insets = new Insets(0, 12, 5, 12);
		gbc_lblFontSize.gridx = 0;
		gbc_lblFontSize.gridy = 2;
		AppearanceSettingsPanel.add(lblFontSize, gbc_lblFontSize);

		JSlider sliderFontSize = new JSlider();
		sliderFontSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_sliderFontSize = new GridBagConstraints();
		gbc_sliderFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_sliderFontSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderFontSize.gridx = 1;
		gbc_sliderFontSize.gridy = 2;
		AppearanceSettingsPanel.add(sliderFontSize, gbc_sliderFontSize);

		JButton btnDefault = new JButton("Default");
		btnDefault.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnDefault = new GridBagConstraints();
		gbc_btnDefault.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnDefault.insets = new Insets(0, 12, 12, 5);
		gbc_btnDefault.gridx = 0;
		gbc_btnDefault.gridy = 3;
		AppearanceSettingsPanel.add(btnDefault, gbc_btnDefault);

		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnSave.insets = new Insets(0, 0, 12, 12);
		gbc_btnSave.gridx = 1;
		gbc_btnSave.gridy = 3;
		AppearanceSettingsPanel.add(btnSave, gbc_btnSave);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 12, 12);
		gbc_btnCancel.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 3;
		AppearanceSettingsPanel.add(btnCancel, gbc_btnCancel);


	}

}
