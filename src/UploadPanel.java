import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import java.awt.Component;
import java.awt.Label;
import java.awt.ScrollPane;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;

public class UploadPanel extends JPanel {
	private JTextField textField;
	private JTextField textFieldNumber;

	/**
	 * Create the panel.
	 */
	public UploadPanel() {
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblUpload = new JLabel("Upload");
		lblUpload.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpload.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(lblUpload, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setName("");
		tabbedPane.addTab("Email", null, panelEmail, null);
		GridBagLayout gbl_panelEmail = new GridBagLayout();
		gbl_panelEmail.columnWidths = new int[]{0, 0, 0};
		gbl_panelEmail.rowHeights = new int[]{0, 0, 0};
		gbl_panelEmail.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelEmail.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panelEmail.setLayout(gbl_panelEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblEmail.weightx = 1.0;
		gbc_lblEmail.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 0;
		panelEmail.add(lblEmail, gbc_lblEmail);
		
		textField = new JTextField();
		textField.setColumns(20);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.SOUTHWEST;
		gbc_textField.weightx = 1.0;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelEmail.add(textField, gbc_textField);
		
		JLabel lblNoteInternetConnection = new JLabel("Note: An active internet connection is required");
		GridBagConstraints gbc_lblNoteInternetConnection = new GridBagConstraints();
		gbc_lblNoteInternetConnection.anchor = GridBagConstraints.NORTH;
		gbc_lblNoteInternetConnection.gridwidth = 2;
		gbc_lblNoteInternetConnection.insets = new Insets(0, 0, 0, 5);
		gbc_lblNoteInternetConnection.gridx = 0;
		gbc_lblNoteInternetConnection.gridy = 1;
		panelEmail.add(lblNoteInternetConnection, gbc_lblNoteInternetConnection);
		
		
		JPanel panelPhone = new JPanel();
		tabbedPane.addTab("Phone", null, panelPhone, null);
		GridBagLayout gbl_panelPhone = new GridBagLayout();
		gbl_panelPhone.columnWidths = new int[]{0, 0, 0};
		gbl_panelPhone.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelPhone.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelPhone.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panelPhone.setLayout(gbl_panelPhone);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.weightx = 1.0;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 10, 5);
		gbc_lblPhoneNumber.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblPhoneNumber.gridx = 0;
		gbc_lblPhoneNumber.gridy = 0;
		panelPhone.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		textFieldNumber = new JTextField();
		GridBagConstraints gbc_textFieldNumber = new GridBagConstraints();
		gbc_textFieldNumber.weightx = 1.0;
		gbc_textFieldNumber.anchor = GridBagConstraints.SOUTHWEST;
		gbc_textFieldNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNumber.gridx = 1;
		gbc_textFieldNumber.gridy = 0;
		panelPhone.add(textFieldNumber, gbc_textFieldNumber);
		textFieldNumber.setColumns(15);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_lblOr = new GridBagConstraints();
		gbc_lblOr.gridwidth = 2;
		gbc_lblOr.weightx = 1.0;
		gbc_lblOr.insets = new Insets(0, 0, 5, 5);
		gbc_lblOr.gridx = 0;
		gbc_lblOr.gridy = 1;
		panelPhone.add(lblOr, gbc_lblOr);
		
		JLabel lblChooseFromContacts = new JLabel("Choose from Contacts:");
		GridBagConstraints gbc_lblChooseFromContacts = new GridBagConstraints();
		gbc_lblChooseFromContacts.weightx = 1.0;
		gbc_lblChooseFromContacts.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblChooseFromContacts.insets = new Insets(5, 0, 0, 5);
		gbc_lblChooseFromContacts.gridx = 0;
		gbc_lblChooseFromContacts.gridy = 2;
		panelPhone.add(lblChooseFromContacts, gbc_lblChooseFromContacts);
		
		JComboBox<String> comboBoxContacts = new JComboBox<String>();
		comboBoxContacts.setPreferredSize(new Dimension(200, 27));
		comboBoxContacts.setModel(new DefaultComboBoxModel<String>(new String[] {"Dr. Smith", "Dr. William", "Dr. Jane", "Dr. Isaac", "Dr. Robert"}));
		GridBagConstraints gbc_comboBoxContacts = new GridBagConstraints();
		gbc_comboBoxContacts.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBoxContacts.weightx = 1.0;
		gbc_comboBoxContacts.gridx = 1;
		gbc_comboBoxContacts.gridy = 2;
		panelPhone.add(comboBoxContacts, gbc_comboBoxContacts);
		
		JPanel panelBluetooth = new JPanel();
		tabbedPane.addTab("Bluetooth", null, panelBluetooth, null);
		GridBagLayout gbl_panelBluetooth = new GridBagLayout();
		gbl_panelBluetooth.columnWidths = new int[]{0, 0};
		gbl_panelBluetooth.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelBluetooth.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBluetooth.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelBluetooth.setLayout(gbl_panelBluetooth);
		
		JLabel lblConnect = new JLabel("Connect to a Bluetooth Device from the list below");
		GridBagConstraints gbc_lblConnect = new GridBagConstraints();
		gbc_lblConnect.insets = new Insets(5, 0, 5, 0);
		gbc_lblConnect.gridx = 0;
		gbc_lblConnect.gridy = 0;
		panelBluetooth.add(lblConnect, gbc_lblConnect);
		
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 1;
		panelBluetooth.add(toolBar, gbc_toolBar);
		
		JToggleButton tglbtnBluetooth = new JToggleButton("Turn on Bluetooth");
		toolBar.add(tglbtnBluetooth);
		
		JButton btnRefreshBluetooth = new JButton("Refresh");
		btnRefreshBluetooth.setMaximumSize(new Dimension(91, 45));
		Image refreshIcon = new ImageIcon(this.getClass().getResource("refresh.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnRefreshBluetooth.setIcon(new ImageIcon(refreshIcon));
		toolBar.add(btnRefreshBluetooth);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panelBluetooth.add(scrollPane, gbc_scrollPane);
		
		JPanel panelUSB = new JPanel();
		tabbedPane.addTab("USB", null, panelUSB, null);
		GridBagLayout gbl_panelUSB = new GridBagLayout();
		gbl_panelUSB.columnWidths = new int[]{0, 0};
		gbl_panelUSB.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelUSB.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelUSB.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelUSB.setLayout(gbl_panelUSB);
		
		JLabel lblSelectAUsb = new JLabel("Select a USB device from the list below");
		GridBagConstraints gbc_lblSelectAUsb = new GridBagConstraints();
		gbc_lblSelectAUsb.insets = new Insets(5, 0, 5, 0);
		gbc_lblSelectAUsb.gridx = 0;
		gbc_lblSelectAUsb.gridy = 0;
		panelUSB.add(lblSelectAUsb, gbc_lblSelectAUsb);
		
		JToolBar toolBarUSB = new JToolBar();
		GridBagConstraints gbc_toolBarUSB = new GridBagConstraints();
		gbc_toolBarUSB.anchor = GridBagConstraints.WEST;
		gbc_toolBarUSB.insets = new Insets(0, 0, 5, 0);
		gbc_toolBarUSB.gridx = 0;
		gbc_toolBarUSB.gridy = 1;
		panelUSB.add(toolBarUSB, gbc_toolBarUSB);
		
		JButton btnRefreshUSB = new JButton("Refresh");
		btnRefreshUSB.setPreferredSize(new Dimension(91, 30));
		btnRefreshUSB.setMaximumSize(new Dimension(91, 45));
		btnRefreshUSB.setIcon(new ImageIcon(refreshIcon));
		toolBarUSB.add(btnRefreshUSB);
		
		JScrollPane scrollPaneUSB = new JScrollPane();
		GridBagConstraints gbc_scrollPaneUSB = new GridBagConstraints();
		gbc_scrollPaneUSB.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneUSB.gridx = 0;
		gbc_scrollPaneUSB.gridy = 2;
		panelUSB.add(scrollPaneUSB, gbc_scrollPaneUSB);
		
		JPanel panelUpload = new JPanel();
		add(panelUpload, BorderLayout.SOUTH);
		Image uploadIcon = new ImageIcon(this.getClass().getResource("upload.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		panelUpload.setLayout(new BoxLayout(panelUpload, BoxLayout.Y_AXIS));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnUpload.setPreferredSize(new Dimension(100, 29));
		btnUpload.setIconTextGap(10);
		btnUpload.setIcon(new ImageIcon(uploadIcon));
		panelUpload.add(btnUpload);
		
		JProgressBar progressBarUpload = new JProgressBar();
		progressBarUpload.setPreferredSize(new Dimension(146, 30));
		progressBarUpload.setMaximumSize(new Dimension(500, 30));
		progressBarUpload.setStringPainted(true);
		panelUpload.add(progressBarUpload);

	}

}
