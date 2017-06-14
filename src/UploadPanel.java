import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;

public class UploadPanel extends JPanel implements ActionListener, ChangeListener {
	
	private JTextField textFieldEmail;
	private JTextField textFieldNumber;
	private JProgressBar progressBarUpload;
	private JScrollPane scrollPaneBluetooth;
	private JScrollPane scrollPaneUSB;
	private JToggleButton tglbtnBluetooth;

	/**
	 * Create the panel.
	 */
	public UploadPanel() {
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout());
		
		JLabel lblUpload = new JLabel("Upload");
		lblUpload.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpload.setFont(MedicationManagement.HEADER_FONT);
		add(lblUpload, BorderLayout.NORTH);
		
		add(createTabbedPane(), BorderLayout.CENTER);
		
		add(createUploadPane(), BorderLayout.SOUTH);
		
	}
	
	/**
	 * Create a tabbed pane and add the panels to it
	 * @return tabbed pane
	 */
	private JTabbedPane createTabbedPane() {
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.addTab("Email", null, createEmailPane(), null); //Add Email tab
		 
		tabbedPane.addTab("Phone", null, createPhonePane(), null); //Add Phone tab
		
		tabbedPane.addTab("Bluetooth", null, createBluetoothPane(), null); //Add Blue tooth tab
		
		tabbedPane.addTab("USB", null, createUSBPane(), null); //Add USB tab
		
		tabbedPane.addChangeListener(this); //Listening for tab chnages
		
		return tabbedPane;
		
	}

	/**
	 * Create email tab
	 * @return Email tab
	 */
	private JPanel createEmailPane() {
		
		//Create email pane and set a grid bag layout to it
		JPanel panelEmail = new JPanel();
		GridBagLayout gbl_panelEmail = new GridBagLayout();
		gbl_panelEmail.columnWidths = new int[]{0, 0, 0};
		gbl_panelEmail.rowHeights = new int[]{0, 0, 0};
		gbl_panelEmail.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelEmail.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panelEmail.setLayout(gbl_panelEmail);
		
		//Create email label and add it to the panel
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblEmail.weightx = 1.0;
		gbc_lblEmail.insets = new Insets(0, 0, 7, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 0;
		panelEmail.add(lblEmail, gbc_lblEmail);
		
		//Create a text field for entering the email and add it to the panel
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(20); //Width of the text box
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.SOUTHWEST;
		gbc_textField.weightx = 1.0;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelEmail.add(textFieldEmail, gbc_textField);
		
		//Create a label for notifying the user that Internet is required
		JLabel lblNoteInternetConnection = new JLabel("Note: An active internet connection is required");
		lblNoteInternetConnection.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblNoteInternetConnection = new GridBagConstraints();
		gbc_lblNoteInternetConnection.anchor = GridBagConstraints.NORTH;
		gbc_lblNoteInternetConnection.gridwidth = 2;
		gbc_lblNoteInternetConnection.insets = new Insets(0, 0, 0, 5);
		gbc_lblNoteInternetConnection.gridx = 0;
		gbc_lblNoteInternetConnection.gridy = 1;
		panelEmail.add(lblNoteInternetConnection, gbc_lblNoteInternetConnection);
		
		return panelEmail;
	}

	/**
	 * Create phone tab
	 * @return Phone panel
	 */
	private JPanel createPhonePane() {
		//Create a panel with grid bag layout
		JPanel panelPhone = new JPanel();
		GridBagLayout gbl_panelPhone = new GridBagLayout();
		gbl_panelPhone.columnWidths = new int[]{0, 0, 0};
		gbl_panelPhone.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelPhone.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelPhone.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panelPhone.setLayout(gbl_panelPhone);
		
		//Add number label
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.weightx = 1.0;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 7, 5);
		gbc_lblPhoneNumber.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblPhoneNumber.gridx = 0;
		gbc_lblPhoneNumber.gridy = 0;
		panelPhone.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		//Text field for getting number input
		textFieldNumber = new JTextField();
		GridBagConstraints gbc_textFieldNumber = new GridBagConstraints();
		gbc_textFieldNumber.weightx = 1.0;
		gbc_textFieldNumber.anchor = GridBagConstraints.SOUTHWEST;
		gbc_textFieldNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNumber.gridx = 1;
		gbc_textFieldNumber.gridy = 0;
		panelPhone.add(textFieldNumber, gbc_textFieldNumber);
		textFieldNumber.setColumns(15);
		
		//Add OR label
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblOr = new GridBagConstraints();
		gbc_lblOr.gridwidth = 2;
		gbc_lblOr.weightx = 1.0;
		gbc_lblOr.insets = new Insets(0, 0, 5, 5);
		gbc_lblOr.gridx = 0;
		gbc_lblOr.gridy = 1;
		panelPhone.add(lblOr, gbc_lblOr);
		
		//Add choose from contacts label
		JLabel lblChooseFromContacts = new JLabel("Choose from Contacts:");
		lblChooseFromContacts.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblChooseFromContacts = new GridBagConstraints();
		gbc_lblChooseFromContacts.weightx = 1.0;
		gbc_lblChooseFromContacts.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblChooseFromContacts.insets = new Insets(2, 0, 0, 5);
		gbc_lblChooseFromContacts.gridx = 0;
		gbc_lblChooseFromContacts.gridy = 2;
		panelPhone.add(lblChooseFromContacts, gbc_lblChooseFromContacts);
		
		//Add a combo box to allow the user to select a contact
		JComboBox<String> comboBoxContacts = new JComboBox<String>();
		comboBoxContacts.setPreferredSize(new Dimension(200, 27));
		comboBoxContacts.setModel(new DefaultComboBoxModel<String>(new String[] {"Dr. Smith", "Dr. William", "Dr. Jane", "Dr. Isaac", "Dr. Robert"}));
		GridBagConstraints gbc_comboBoxContacts = new GridBagConstraints();
		gbc_comboBoxContacts.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBoxContacts.weightx = 1.0;
		gbc_comboBoxContacts.gridx = 1;
		gbc_comboBoxContacts.gridy = 2;
		panelPhone.add(comboBoxContacts, gbc_comboBoxContacts);
		
		return panelPhone;
		
	}

	/**
	 * Create blue tooth tab
	 * @return blue tooth pane
	 */
	private JPanel createBluetoothPane() {
		//Create blue tooth pane with a grid bag layout
		JPanel panelBluetooth = new JPanel();
		GridBagLayout gbl_panelBluetooth = new GridBagLayout();
		gbl_panelBluetooth.columnWidths = new int[]{0, 0};
		gbl_panelBluetooth.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelBluetooth.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBluetooth.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelBluetooth.setLayout(gbl_panelBluetooth);
		
		//Add connect label
		JLabel lblConnect = new JLabel("Connect to a Bluetooth Device from the list below");
		lblConnect.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblConnect = new GridBagConstraints();
		gbc_lblConnect.insets = new Insets(5, 0, 5, 0);
		gbc_lblConnect.gridx = 0;
		gbc_lblConnect.gridy = 0;
		panelBluetooth.add(lblConnect, gbc_lblConnect);
		
		//Create a tool bar for the buttons
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 1;
		panelBluetooth.add(toolBar, gbc_toolBar);
		
		//Blue tooth on/off toggle button
		tglbtnBluetooth = new JToggleButton("Turn on Bluetooth");
		tglbtnBluetooth.setFont(MedicationManagement.BODY_FONT);
		tglbtnBluetooth.addActionListener(this);
		tglbtnBluetooth.setActionCommand("Toggle Bluetooth");
		toolBar.add(tglbtnBluetooth);
		
		//Refresh button
		JButton btnRefreshBluetooth = new JButton("Refresh");
		btnRefreshBluetooth.setFont(MedicationManagement.BODY_FONT);
		Image refreshIcon = new ImageIcon(this.getClass().getResource("refresh.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnRefreshBluetooth.setIcon(new ImageIcon(refreshIcon));
		btnRefreshBluetooth.addActionListener(this);
		btnRefreshBluetooth.setActionCommand("Refresh Bluetooth");
		toolBar.add(btnRefreshBluetooth);
		
		//Add a scroll pane that will display available blue tooth devices
		scrollPaneBluetooth = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panelBluetooth.add(scrollPaneBluetooth, gbc_scrollPane);
		
		return panelBluetooth;
	}

	/**
	 * Create USB tab
	 * @return USB panel
	 */
	private JPanel createUSBPane() {
		//USB panel with grid bag layout
		JPanel panelUSB = new JPanel();
		GridBagLayout gbl_panelUSB = new GridBagLayout();
		gbl_panelUSB.columnWidths = new int[]{0, 0};
		gbl_panelUSB.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelUSB.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelUSB.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelUSB.setLayout(gbl_panelUSB);
		
		//Select device label
		JLabel lblSelectAUsb = new JLabel("Select a USB device from the list below");
		lblSelectAUsb.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblSelectAUsb = new GridBagConstraints();
		gbc_lblSelectAUsb.insets = new Insets(5, 0, 5, 0);
		gbc_lblSelectAUsb.gridx = 0;
		gbc_lblSelectAUsb.gridy = 0;
		panelUSB.add(lblSelectAUsb, gbc_lblSelectAUsb);
		
		//Tool bar to contain the buttons
		JToolBar toolBarUSB = new JToolBar();
		GridBagConstraints gbc_toolBarUSB = new GridBagConstraints();
		gbc_toolBarUSB.anchor = GridBagConstraints.WEST;
		gbc_toolBarUSB.insets = new Insets(0, 0, 5, 0);
		gbc_toolBarUSB.gridx = 0;
		gbc_toolBarUSB.gridy = 1;
		panelUSB.add(toolBarUSB, gbc_toolBarUSB);
		
		//Refresh button
		JButton btnRefreshUSB = new JButton("Refresh");
		btnRefreshUSB.setFont(MedicationManagement.BODY_FONT);
		Image refreshIcon = new ImageIcon(this.getClass().getResource("refresh.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnRefreshUSB.setIcon(new ImageIcon(refreshIcon));
		btnRefreshUSB.addActionListener(this);
		btnRefreshUSB.setActionCommand("Refresh USB");
		toolBarUSB.add(btnRefreshUSB);
		
		//Add a scroll pane to display the available USB devices
		scrollPaneUSB = new JScrollPane();
		GridBagConstraints gbc_scrollPaneUSB = new GridBagConstraints();
		gbc_scrollPaneUSB.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneUSB.gridx = 0;
		gbc_scrollPaneUSB.gridy = 2;
		panelUSB.add(scrollPaneUSB, gbc_scrollPaneUSB);
		
		return panelUSB;
		
	}
	
	/**
	 * Create upload panel, add a progress bar and a button to it
	 * @return upload panel
	 */
	private JPanel createUploadPane() {
		//JPanel to hold the progress bar and the buttons
		JPanel panelUpload = new JPanel();
		panelUpload.setLayout(new BoxLayout(panelUpload, BoxLayout.Y_AXIS)); //Set a box layout
		
		JButton btnUpload = new JButton("Upload"); //Create a button for upload action
		btnUpload.setFont(MedicationManagement.BODY_FONT); //Set font
		btnUpload.setAlignmentX(Component.CENTER_ALIGNMENT); // Set the alignment of the button
		Image uploadIcon = new ImageIcon(this.getClass().getResource("upload.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnUpload.setIcon(new ImageIcon(uploadIcon)); //Set the image of the button
		btnUpload.setIconTextGap(10); //Set the gap between the image and the text
		btnUpload.addActionListener(this); //Ad action listener to the button
		btnUpload.setActionCommand("Upload"); //Action Command
		panelUpload.add(btnUpload); //Add the button to the panel
		
		progressBarUpload = new JProgressBar(); //Create a progress bar
		progressBarUpload.setMaximumSize(new Dimension(500, 30)); //Set the maximum size for the progress bar
		progressBarUpload.setStringPainted(true); //Show the percentage as well on the progress bar
		panelUpload.add(progressBarUpload); //Add the progress bar to the panel
		
		return panelUpload;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Upload")) {
			 Thread t = new Thread(){
			        public void run(){
			            for(int i = 0 ; i <= 100 ; i++){
			                final int percent = i;
			                SwingUtilities.invokeLater(new Runnable() {
			                    public void run() {
			                        progressBarUpload.setValue(percent);
			                        if (percent == 100) {
			                        	JOptionPane.showMessageDialog(UploadPanel.this, "Your history has been successfully\nshared with the recipient.", "Upload Successful", JOptionPane.INFORMATION_MESSAGE);
			                        }
			                    }
			                  });

			                try {
			                    Thread.sleep(10);
			                } catch (InterruptedException ex) {ex.printStackTrace();}
			            }
			        }
			    };
			    t.start();
		} else if (e.getActionCommand().equals("Refresh Bluetooth")) {
			JOptionPane.showMessageDialog(this, "Please make sure that Bluetooth is enabled on the recipient's device.", "No Bluetooth device found", JOptionPane.ERROR_MESSAGE);
		} else if (e.getActionCommand().equals("Refresh USB")) {
			JOptionPane.showMessageDialog(this, "Please make sure a USB device is connected.", "No USB device found", JOptionPane.ERROR_MESSAGE);
		} else if (e.getSource().equals(this.tglbtnBluetooth)) {
			if (this.tglbtnBluetooth.getText().equals("Turn on Bluetooth")) {
				this.tglbtnBluetooth.setText("Turn off Bluetooth");
			} else {
				this.tglbtnBluetooth.setText("Turn on Bluetooth");
			}
		}
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//Reset progress bar
		this.progressBarUpload.setValue(0);
	}

}
