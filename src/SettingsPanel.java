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


public class SettingsPanel extends JPanel {
	private JTextField titleTextField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		Image profilePic = new ImageIcon(this.getClass().getResource("profile.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		
		JPanel panelNotifications = new JPanel();
		tabbedPane.addTab("Notifications", null, panelNotifications, null);
		GridBagLayout gbl_panelNotifications = new GridBagLayout();
		gbl_panelNotifications.columnWidths = new int[]{317, 317, 0};
		gbl_panelNotifications.rowHeights = new int[]{430, 0};
		gbl_panelNotifications.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelNotifications.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelNotifications.setLayout(gbl_panelNotifications);
		
		JPanel previousReminderPanel = new JPanel();
		previousReminderPanel.setBorder(new TitledBorder(null, "Previous Reminder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		previousReminderPanel.setAutoscrolls(true);
		GridBagConstraints gbc_previousReminderPanel = new GridBagConstraints();
		gbc_previousReminderPanel.anchor = GridBagConstraints.WEST;
		gbc_previousReminderPanel.fill = GridBagConstraints.BOTH;
		gbc_previousReminderPanel.insets = new Insets(0, 0, 0, 5);
		gbc_previousReminderPanel.gridx = 0;
		gbc_previousReminderPanel.gridy = 0;
		panelNotifications.add(previousReminderPanel, gbc_previousReminderPanel);
		GridBagLayout gbl_previousReminderPanel = new GridBagLayout();
		gbl_previousReminderPanel.columnWidths = new int[]{12, 0};
		gbl_previousReminderPanel.rowHeights = new int[]{25, 0};
		gbl_previousReminderPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_previousReminderPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		previousReminderPanel.setLayout(gbl_previousReminderPanel);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\tDiabetes - Evening pills", "\tHigh Fever - Syrup"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(null);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.anchor = GridBagConstraints.WEST;
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		previousReminderPanel.add(list, gbc_list);
		
		JPanel DetailedSettingPanel = new JPanel();
		DetailedSettingPanel.setBorder(new TitledBorder(null, "Detailed Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_DetailedSettingPanel = new GridBagConstraints();
		gbc_DetailedSettingPanel.insets = new Insets(0, 12, 0, 0);
		gbc_DetailedSettingPanel.fill = GridBagConstraints.BOTH;
		gbc_DetailedSettingPanel.gridx = 1;
		gbc_DetailedSettingPanel.gridy = 0;
		panelNotifications.add(DetailedSettingPanel, gbc_DetailedSettingPanel);
		GridBagLayout gbl_DetailedSettingPanel = new GridBagLayout();
		gbl_DetailedSettingPanel.columnWidths = new int[]{0, 0, 0};
		gbl_DetailedSettingPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_DetailedSettingPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_DetailedSettingPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		DetailedSettingPanel.setLayout(gbl_DetailedSettingPanel);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 12, 5, 12);
		gbc_lblTitle.anchor = GridBagConstraints.EAST;
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 0;
		DetailedSettingPanel.add(lblTitle, gbc_lblTitle);
		
		titleTextField = new JTextField();
		titleTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_titleTextField = new GridBagConstraints();
		gbc_titleTextField.anchor = GridBagConstraints.WEST;
		gbc_titleTextField.insets = new Insets(0, 0, 5, 12);
		gbc_titleTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_titleTextField.gridx = 1;
		gbc_titleTextField.gridy = 0;
		DetailedSettingPanel.add(titleTextField, gbc_titleTextField);
		titleTextField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDescription.insets = new Insets(0, 12, 5, 12);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 1;
		DetailedSettingPanel.add(lblDescription, gbc_lblDescription);
		
		JScrollPane descScrollPane = new JScrollPane();
		GridBagConstraints gbc_descScrollPane = new GridBagConstraints();
		gbc_descScrollPane.insets = new Insets(0, 0, 5, 12);
		gbc_descScrollPane.fill = GridBagConstraints.BOTH;
		gbc_descScrollPane.gridx = 1;
		gbc_descScrollPane.gridy = 1;
		DetailedSettingPanel.add(descScrollPane, gbc_descScrollPane);
		
		JTextArea descTextArea = new JTextArea();
		descTextArea.setName("");
		descTextArea.setMaximumSize(new Dimension(50, 50));
		descTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		descTextArea.setDropMode(DropMode.INSERT);
		descScrollPane.setViewportView(descTextArea);
		
		JLabel lblDay = new JLabel("Day (DD/MM/YYYY)");
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDay = new GridBagConstraints();
		gbc_lblDay.anchor = GridBagConstraints.EAST;
		gbc_lblDay.insets = new Insets(0, 12, 5, 12);
		gbc_lblDay.gridx = 0;
		gbc_lblDay.gridy = 2;
		DetailedSettingPanel.add(lblDay, gbc_lblDay);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 12);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		DetailedSettingPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.anchor = GridBagConstraints.EAST;
		gbc_lblTime.insets = new Insets(0, 12, 5, 12);
		gbc_lblTime.gridx = 0;
		gbc_lblTime.gridy = 3;
		DetailedSettingPanel.add(lblTime, gbc_lblTime);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.insets = new Insets(0, 0, 5, 12);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		DetailedSettingPanel.add(panel, gbc_panel);
		
		JLabel lblH = new JLabel("H");
		panel.add(lblH);
		
		JSpinner spinner_1 = new JSpinner();
		panel.add(spinner_1);
		
		JLabel lblM = new JLabel("M");
		panel.add(lblM);
		
		JSpinner spinner_2 = new JSpinner();
		panel.add(spinner_2);
		
		JLabel lblSendIntervalsmin = new JLabel("Send Intervals(Min)");
		lblSendIntervalsmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSendIntervalsmin = new GridBagConstraints();
		gbc_lblSendIntervalsmin.anchor = GridBagConstraints.EAST;
		gbc_lblSendIntervalsmin.insets = new Insets(0, 12, 5, 12);
		gbc_lblSendIntervalsmin.gridx = 0;
		gbc_lblSendIntervalsmin.gridy = 4;
		DetailedSettingPanel.add(lblSendIntervalsmin, gbc_lblSendIntervalsmin);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 12);
		gbc_spinner.anchor = GridBagConstraints.WEST;
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 4;
		DetailedSettingPanel.add(spinner, gbc_spinner);
		
		JCheckBox checkBox = new JCheckBox("Activate Smart Medicine Cabinet");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_checkBox = new GridBagConstraints();
		gbc_checkBox.insets = new Insets(0, 0, 5, 12);
		gbc_checkBox.gridx = 1;
		gbc_checkBox.gridy = 5;
		DetailedSettingPanel.add(checkBox, gbc_checkBox);
		
		JButton btnCreate = new JButton("Create");
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnCreate.insets = new Insets(0, 12, 12, 5);
		gbc_btnCreate.gridx = 0;
		gbc_btnCreate.gridy = 6;
		DetailedSettingPanel.add(btnCreate, gbc_btnCreate);
		
		JButton btnReset = new JButton("Reset");
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 12, 12);
		gbc_btnReset.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnReset.gridx = 1;
		gbc_btnReset.gridy = 6;
		DetailedSettingPanel.add(btnReset, gbc_btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("General", null, scrollPane, null);
		
		JPanel generalSettingspanel = new JPanel();
		scrollPane.setViewportView(generalSettingspanel);
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
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(profilePic));
		label.setAlignmentX(1.0f);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(12, 12, 12, 12);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		profileSettingsPanel.add(label, gbc_label);
		
		JButton button = new JButton("Browse");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 12, 0, 0);
		gbc_button.anchor = GridBagConstraints.WEST;
		gbc_button.gridx = 1;
		gbc_button.gridy = 0;
		profileSettingsPanel.add(button, gbc_button);
		
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
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(12, 0, 5, 12);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		mainSettingsPanel.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(12, 0, 5, 12);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 0;
		mainSettingsPanel.add(textField_1, gbc_textField_1);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 12);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 1;
		mainSettingsPanel.add(label_2, gbc_label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 12);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		mainSettingsPanel.add(textField_2, gbc_textField_2);
		
		JLabel label_3 = new JLabel("Contact Number");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 12);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 2;
		mainSettingsPanel.add(label_3, gbc_label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 12);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 2;
		mainSettingsPanel.add(textField_3, gbc_textField_3);
		
		JLabel label_4 = new JLabel("Address");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 12);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 3;
		mainSettingsPanel.add(label_4, gbc_label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 12);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 3;
		mainSettingsPanel.add(textField_4, gbc_textField_4);
		
		JLabel label_5 = new JLabel("Preferred Language");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 12, 12, 12);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 4;
		mainSettingsPanel.add(label_5, gbc_label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 12, 12);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 4;
		mainSettingsPanel.add(textField_5, gbc_textField_5);
		
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
		
		JLabel lblFontSize = new JLabel("Font ");
		lblFontSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontSize = new GridBagConstraints();
		gbc_lblFontSize.anchor = GridBagConstraints.EAST;
		gbc_lblFontSize.insets = new Insets(12, 12, 5, 12);
		gbc_lblFontSize.gridx = 0;
		gbc_lblFontSize.gridy = 0;
		AppearanceSettingsPanel.add(lblFontSize, gbc_lblFontSize);
		
		JComboBox fontComboBox = new JComboBox();
		fontComboBox.setPreferredSize(new Dimension(100, 22));
		fontComboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fontComboBox.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Cosmic", "Fancy"}));
		GridBagConstraints gbc_fontComboBox = new GridBagConstraints();
		gbc_fontComboBox.anchor = GridBagConstraints.WEST;
		gbc_fontComboBox.insets = new Insets(12, 0, 5, 5);
		gbc_fontComboBox.gridx = 1;
		gbc_fontComboBox.gridy = 0;
		AppearanceSettingsPanel.add(fontComboBox, gbc_fontComboBox);
		
		JLabel lblFontColour = new JLabel("Font Colour");
		lblFontColour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontColour = new GridBagConstraints();
		gbc_lblFontColour.insets = new Insets(0, 12, 5, 12);
		gbc_lblFontColour.anchor = GridBagConstraints.EAST;
		gbc_lblFontColour.gridx = 0;
		gbc_lblFontColour.gridy = 1;
		AppearanceSettingsPanel.add(lblFontColour, gbc_lblFontColour);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(100, 22));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Black", "Red", "Blue", "Brown"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		AppearanceSettingsPanel.add(comboBox, gbc_comboBox);
		
		JLabel lblFontSize_1 = new JLabel("Font Size");
		lblFontSize_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFontSize_1 = new GridBagConstraints();
		gbc_lblFontSize_1.anchor = GridBagConstraints.EAST;
		gbc_lblFontSize_1.insets = new Insets(0, 12, 5, 12);
		gbc_lblFontSize_1.gridx = 0;
		gbc_lblFontSize_1.gridy = 2;
		AppearanceSettingsPanel.add(lblFontSize_1, gbc_lblFontSize_1);
		
		JSlider slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider.gridx = 1;
		gbc_slider.gridy = 2;
		AppearanceSettingsPanel.add(slider, gbc_slider);
		
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
