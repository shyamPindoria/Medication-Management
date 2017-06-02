import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class ContactsPanel extends JPanel {
	
	private JTextField textFieldSearch;
	
	public ContactsPanel() {
		//Size of the panel
		setSize(new Dimension(640, 485));
		//Add a border layout to the panel
		setLayout(new BorderLayout());
		
		//Add a panel that will display the title
		add(createTitlePane(), BorderLayout.NORTH);
		
		//Display the count of the contacts at the bottom of the panel
		JLabel lblContactsNo = new JLabel("Contacts: 5");
		lblContactsNo.setFont(MedicationManagement.BODY_FONT);
		lblContactsNo.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblContactsNo, BorderLayout.SOUTH);
		
		//Add a scroll pane to display the contact list
		add(createScrollPane(), BorderLayout.CENTER);

	}

	/**
	 * Create a panel with two labels to be displayed at the top of the main panel 
	 * @return JPanel with two labels
	 */
	private JPanel createTitlePane() {
		//Create a new panel and set a border layout to it
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(new BorderLayout());
		
		//Create a label that shows the user id
		JLabel lblUserId = new JLabel("User ID: 00001");
		//Add an empty border to push label slightly to the left
		lblUserId.setBorder(new EmptyBorder(0, 0, 0, 12));
		lblUserId.setHorizontalTextPosition(SwingConstants.LEADING);
		panelTitle.add(lblUserId, BorderLayout.EAST);
		
		//Create a label to display the header
		JLabel lblContacts = new JLabel("Contacts");
		lblContacts.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacts.setFont(MedicationManagement.HEADER_FONT);
		panelTitle.add(lblContacts, BorderLayout.CENTER);
		
		return panelTitle;
		
	}
	
	/**
	 * Create a scroll pane to hold the contact list
	 * @return JScrollPane
	 */
	private JScrollPane createScrollPane(){
		
		JScrollPane scrollPane = new JScrollPane();
		//Set the main viewport of the scroll pane
		scrollPane.setViewportView(createViewPortPane());
		
		return scrollPane;
		
	}

	/**
	 * Create the main panel that will be displayed in the scroll pane
	 * @return Panel containing the contacts
	 */
	private JPanel createViewPortPane() {
		
		JPanel mainPanel = new JPanel();
	
		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWeights = new double[]{1.0};
		gbl_mainPanel.rowWeights = new double[]{0.0, 1.0};
		mainPanel.setLayout(gbl_mainPanel);
		
		//Add the tool bar to the panel
		JPanel panelToolBar = createToolBarPane();
		GridBagConstraints gbc_panelToolBar = new GridBagConstraints();
		gbc_panelToolBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelToolBar.gridx = 0;
		gbc_panelToolBar.gridy = 0;
		mainPanel.add(panelToolBar, gbc_panelToolBar);
		
		//Add the contact list panel
		JPanel panelContactList = createContactListPane();
		GridBagConstraints gbc_panelContactList = new GridBagConstraints();
		gbc_panelContactList.fill = GridBagConstraints.BOTH;
		gbc_panelContactList.gridx = 0;
		gbc_panelContactList.gridy = 1;
		mainPanel.add(panelContactList, gbc_panelContactList);
		
		
		return mainPanel;
		
	}
	
	/**
	 * Create and populate a tool bar pane
	 * @return Tool bar pane
	 */
	private JPanel createToolBarPane() {
		//Panel for tool bar contents
		JPanel panelToolBar = new JPanel();
		
		//Set the panel's layout to grid bag layout
		GridBagLayout gbl_panelToolBar = new GridBagLayout();
		gbl_panelToolBar.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		gbl_panelToolBar.rowWeights = new double[]{0.0};
		panelToolBar.setLayout(gbl_panelToolBar);
		
		//Create an Add button and add it to the tool bar
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 12, 0, 5);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 0;
		panelToolBar.add(btnAdd, gbc_btnAdd);
		
		//Create a remove button and add it to the tool bar
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.weightx = 3.0;
		gbc_btnRemove.anchor = GridBagConstraints.WEST;
		gbc_btnRemove.insets = new Insets(0, 0, 0, 5);
		gbc_btnRemove.gridx = 1;
		gbc_btnRemove.gridy = 0;
		panelToolBar.add(btnRemove, gbc_btnRemove);
		
		//Search text field
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		GridBagConstraints gbc_textFieldSearch = new GridBagConstraints();
		gbc_textFieldSearch.weightx = 1.0;
		gbc_textFieldSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSearch.insets = new Insets(0, 5, 0, 5);
		gbc_textFieldSearch.gridx = 2;
		gbc_textFieldSearch.gridy = 0;
		panelToolBar.add(textFieldSearch, gbc_textFieldSearch);
		
		//Search button
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(MedicationManagement.BODY_FONT);
		Image searchIcon = new ImageIcon(this.getClass().getResource("search.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnSearch.setIcon(new ImageIcon(searchIcon));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 0, 12);
		gbc_btnSearch.gridx = 3;
		gbc_btnSearch.gridy = 0;
		panelToolBar.add(btnSearch, gbc_btnSearch);
		
		return panelToolBar;
		
	}
	
	/**
	 * Create and populate a contact list pane
	 * @return contact list pane
	 */
	private JPanel createContactListPane() {
		//Main panel to hold all the labels and buttons
		JPanel panelContactList = new JPanel();
		
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		
		//Set a grid bag layout to the contact pane list
		GridBagLayout gbl_panelContactList = new GridBagLayout();
		gbl_panelContactList.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelContactList.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelContactList.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelContactList.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelContactList.setLayout(gbl_panelContactList);
		
		//Add labels for names and phone numbers to the pane
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		panelContactList.add(lblName, gbc_lblName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 2;
		gbc_lblPhone.gridy = 0;
		panelContactList.add(lblPhone, gbc_lblPhone);
		
		JLabel name1 = new JLabel("Dr. Smith");
		name1.setHorizontalTextPosition(SwingConstants.CENTER);
		name1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_name1 = new GridBagConstraints();
		gbc_name1.weightx = 1.0;
		gbc_name1.anchor = GridBagConstraints.WEST;
		gbc_name1.insets = new Insets(0, 20, 5, 5);
		gbc_name1.gridx = 1;
		gbc_name1.gridy = 1;
		panelContactList.add(name1, gbc_name1);
		
		JLabel phone1 = new JLabel("0412345678");
		phone1.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone1 = new GridBagConstraints();
		gbc_phone1.weightx = 1.0;
		gbc_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_phone1.gridx = 2;
		gbc_phone1.gridy = 1;
		panelContactList.add(phone1, gbc_phone1);
		
		//Expand buttons
		JButton btnExpand1 = new JButton("Expand");
		btnExpand1.setFont(MedicationManagement.BODY_FONT);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		gbc_btnExpand1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand1.gridx = 3;
		gbc_btnExpand1.gridy = 1;
		panelContactList.add(btnExpand1, gbc_btnExpand1);
		
		JLabel name2 = new JLabel("Dr. William");
		name2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name2 = new GridBagConstraints();
		gbc_name2.weightx = 1.0;
		gbc_name2.anchor = GridBagConstraints.WEST;
		gbc_name2.insets = new Insets(0, 20, 5, 5);
		gbc_name2.gridx = 1;
		gbc_name2.gridy = 2;
		panelContactList.add(name2, gbc_name2);
		
		JLabel phone2 = new JLabel("0498765432");
		phone2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone2 = new GridBagConstraints();
		gbc_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_phone2.gridx = 2;
		gbc_phone2.gridy = 2;
		panelContactList.add(phone2, gbc_phone2);
		
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(MedicationManagement.BODY_FONT);
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		gbc_btnExpand2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand2.gridx = 3;
		gbc_btnExpand2.gridy = 2;
		panelContactList.add(btnExpand2, gbc_btnExpand2);
		
		JLabel name3 = new JLabel("Dr. Jane");
		name3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name3 = new GridBagConstraints();
		gbc_name3.anchor = GridBagConstraints.WEST;
		gbc_name3.insets = new Insets(0, 20, 5, 5);
		gbc_name3.gridx = 1;
		gbc_name3.gridy = 3;
		panelContactList.add(name3, gbc_name3);
		
		JLabel phone3 = new JLabel("0491827364");
		phone3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone3 = new GridBagConstraints();
		gbc_phone3.insets = new Insets(0, 0, 5, 5);
		gbc_phone3.gridx = 2;
		gbc_phone3.gridy = 3;
		panelContactList.add(phone3, gbc_phone3);
		
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		btnExpand3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnExpand3 = new GridBagConstraints();
		gbc_btnExpand3.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand3.gridx = 3;
		gbc_btnExpand3.gridy = 3;
		panelContactList.add(btnExpand3, gbc_btnExpand3);
		
		JLabel name4 = new JLabel("Dr. Isaac");
		name4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name4 = new GridBagConstraints();
		gbc_name4.anchor = GridBagConstraints.WEST;
		gbc_name4.insets = new Insets(0, 20, 5, 5);
		gbc_name4.gridx = 1;
		gbc_name4.gridy = 4;
		panelContactList.add(name4, gbc_name4);
		
		JLabel phone4 = new JLabel("0457483920");
		phone4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone4 = new GridBagConstraints();
		gbc_phone4.insets = new Insets(0, 0, 5, 5);
		gbc_phone4.gridx = 2;
		gbc_phone4.gridy = 4;
		panelContactList.add(phone4, gbc_phone4);
		
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		btnExpand4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnExpand4 = new GridBagConstraints();
		gbc_btnExpand4.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand4.gridx = 3;
		gbc_btnExpand4.gridy = 4;
		panelContactList.add(btnExpand4, gbc_btnExpand4);
		
		JLabel name5 = new JLabel("Dr. Robert");
		name5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name5 = new GridBagConstraints();
		gbc_name5.anchor = GridBagConstraints.WEST;
		gbc_name5.insets = new Insets(0, 20, 0, 5);
		gbc_name5.gridx = 1;
		gbc_name5.gridy = 5;
		panelContactList.add(name5, gbc_name5);
		
		JLabel phone5 = new JLabel("0401987654");
		phone5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone5 = new GridBagConstraints();
		gbc_phone5.insets = new Insets(0, 0, 0, 5);
		gbc_phone5.gridx = 2;
		gbc_phone5.gridy = 5;
		panelContactList.add(phone5, gbc_phone5);
		
		JButton btnExpand5 = new JButton("Expand");
		btnExpand5.setFont(MedicationManagement.BODY_FONT);
		btnExpand5.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand5 = new GridBagConstraints();
		gbc_btnExpand5.insets = new Insets(0, 0, 0, 12);
		gbc_btnExpand5.gridx = 3;
		gbc_btnExpand5.gridy = 5;
		panelContactList.add(btnExpand5, gbc_btnExpand5);
		
		return panelContactList;
	}

}
