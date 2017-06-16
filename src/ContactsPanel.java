import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class ContactsPanel extends JPanel implements ActionListener{
	private JTextField textFieldSearch;
	private ContactDetails smith, william, jane, isaac, robert;
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
		
		//Add tool bar to the south region
		panelTitle.add(createToolBarPane(), BorderLayout.SOUTH);
		
		return panelTitle;
		
	}
	
	/**
	 * Create a scroll pane to hold the contact list
	 * @return JScrollPane
	 */
	private JScrollPane createScrollPane(){
		
		JScrollPane scrollPane = new JScrollPane();
		//Set the main viewport of the scroll pane
		scrollPane.setViewportView(createContactListPane());
		
		return scrollPane;
		
	}

	/**
	 * Create and populate a tool bar pane
	 * @return Tool bar pane
	 */
	private JPanel createToolBarPane() {
		
		JPanel panelToolBar = new JPanel();
		//Set grid  bag layout to the tool bar panel 
		GridBagLayout gbl_panelToolBar = new GridBagLayout();
		gbl_panelToolBar.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelToolBar.rowHeights = new int[]{0, 0};
		gbl_panelToolBar.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelToolBar.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelToolBar.setLayout(gbl_panelToolBar);
		
		//Add button
		JButton buttonAdd = new JButton("Add");
		buttonAdd.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_buttonAdd = new GridBagConstraints();
		gbc_buttonAdd.insets = new Insets(0, 12, 0, 5);
		gbc_buttonAdd.gridx = 0;
		gbc_buttonAdd.gridy = 0;
		panelToolBar.add(buttonAdd, gbc_buttonAdd);
		
		//Remove button
		JButton buttonRemove = new JButton("Remove");
		buttonRemove.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_buttonRemove = new GridBagConstraints();
		gbc_buttonRemove.weightx = 3.0;
		gbc_buttonRemove.anchor = GridBagConstraints.WEST;
		gbc_buttonRemove.insets = new Insets(0, 0, 0, 5);
		gbc_buttonRemove.gridx = 1;
		gbc_buttonRemove.gridy = 0;
		panelToolBar.add(buttonRemove, gbc_buttonRemove);
		
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
		JButton buttonSearch = new JButton("Search");
		buttonSearch.setFont(MedicationManagement.BODY_FONT);
		Image searchIcon = new ImageIcon(this.getClass().getResource("search.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		buttonSearch.setIcon(new ImageIcon(searchIcon));
		GridBagConstraints gbc_buttonSearch = new GridBagConstraints();
		gbc_buttonSearch.insets = new Insets(0, 0, 0, 12);
		gbc_buttonSearch.gridx = 3;
		gbc_buttonSearch.gridy = 0;
		panelToolBar.add(buttonSearch, gbc_buttonSearch);
		
		return panelToolBar;
	}
	
	/**
	 * Create and populate a contact list pane
	 * @return contact list pane
	 */
	private JPanel createContactListPane() {
		//Main panel to hold all the labels and buttons
		JPanel panelContactList = new JPanel();
		//Expand icon
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		
		//Set a grid bag layout to the contact pane list
		GridBagLayout gbl_panelContactList = new GridBagLayout();
		gbl_panelContactList.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelContactList.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelContactList.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelContactList.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelContactList.setLayout(gbl_panelContactList);
		
		//Add labels for names and phone numbers to the pane
		//ROW 0
		//Name label
		JLabel lblName = new JLabel("Name");
		lblName.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 20, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		panelContactList.add(lblName, gbc_lblName);
		
		//Phone label
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 2;
		gbc_lblPhone.gridy = 0;
		panelContactList.add(lblPhone, gbc_lblPhone);
		
		//ROW1
		//Name label
		JLabel name1 = new JLabel("Dr. Smith");
		name1.setHorizontalTextPosition(SwingConstants.CENTER);
		name1.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name1 = new GridBagConstraints();
		gbc_name1.weightx = 1.0;
		gbc_name1.anchor = GridBagConstraints.WEST;
		gbc_name1.insets = new Insets(0, 20, 5, 5);
		gbc_name1.gridx = 1;
		gbc_name1.gridy = 1;
		panelContactList.add(name1, gbc_name1);
		
		//Phone label
		JLabel phone1 = new JLabel("0412345678");
		phone1.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone1 = new GridBagConstraints();
		gbc_phone1.weightx = 1.0;
		gbc_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_phone1.gridx = 2;
		gbc_phone1.gridy = 1;
		panelContactList.add(phone1, gbc_phone1);
		
		//Expand button
		JButton btnExpand1 = new JButton("Expand");
		btnExpand1.setFont(MedicationManagement.BODY_FONT);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		btnExpand1.setActionCommand("Smith");
		btnExpand1.addActionListener(this);
		gbc_btnExpand1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand1.gridx = 3;
		gbc_btnExpand1.gridy = 1;
		panelContactList.add(btnExpand1, gbc_btnExpand1);
		
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		smith = new ContactDetails(ContactDetails.Name.Smith, "0412345678");
		smith.setVisible(false);
		panelContactList.add(this.smith, c);
		
		//ROW 2
		//Name label
		JLabel name2 = new JLabel("Dr. William");
		name2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name2 = new GridBagConstraints();
		gbc_name2.weightx = 1.0;
		gbc_name2.anchor = GridBagConstraints.WEST;
		gbc_name2.insets = new Insets(0, 20, 5, 5);
		gbc_name2.gridx = 1;
		gbc_name2.gridy = 3;
		panelContactList.add(name2, gbc_name2);
		
		//Phone label
		JLabel phone2 = new JLabel("0498765432");
		phone2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone2 = new GridBagConstraints();
		gbc_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_phone2.gridx = 2;
		gbc_phone2.gridy = 3;
		panelContactList.add(phone2, gbc_phone2);
		
		//Expand button
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(MedicationManagement.BODY_FONT);
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		btnExpand2.setActionCommand("William");
		btnExpand2.addActionListener(this);
		gbc_btnExpand2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand2.gridx = 3;
		gbc_btnExpand2.gridy = 3;
		panelContactList.add(btnExpand2, gbc_btnExpand2);
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		william = new ContactDetails(ContactDetails.Name.William, "0498765432");
		william.setVisible(false);
		panelContactList.add(this.william, c);
		
		//ROW 3
		//Name label
		JLabel name3 = new JLabel("Dr. Jane");
		name3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name3 = new GridBagConstraints();
		gbc_name3.anchor = GridBagConstraints.WEST;
		gbc_name3.insets = new Insets(0, 20, 5, 5);
		gbc_name3.gridx = 1;
		gbc_name3.gridy = 5;
		panelContactList.add(name3, gbc_name3);
		
		//Phone label
		JLabel phone3 = new JLabel("0491827364");
		phone3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone3 = new GridBagConstraints();
		gbc_phone3.insets = new Insets(0, 0, 5, 5);
		gbc_phone3.gridx = 2;
		gbc_phone3.gridy = 5;
		panelContactList.add(phone3, gbc_phone3);
		
		//Expand button
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		btnExpand3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnExpand3 = new GridBagConstraints();
		btnExpand3.setActionCommand("Jane");
		btnExpand3.addActionListener(this);
		gbc_btnExpand3.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand3.gridx = 3;
		gbc_btnExpand3.gridy = 5;
		panelContactList.add(btnExpand3, gbc_btnExpand3);
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.jane = new ContactDetails(ContactDetails.Name.Jane, "0491827364");
		this.jane.setVisible(false);
		panelContactList.add(this.jane, c);
		
		//ROW 4
		//Name label
		JLabel name4 = new JLabel("Dr. Isaac");
		name4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name4 = new GridBagConstraints();
		gbc_name4.anchor = GridBagConstraints.WEST;
		gbc_name4.insets = new Insets(0, 20, 5, 5);
		gbc_name4.gridx = 1;
		gbc_name4.gridy = 7;
		panelContactList.add(name4, gbc_name4);
		
		//Phone label
		JLabel phone4 = new JLabel("0457483920");
		phone4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone4 = new GridBagConstraints();
		gbc_phone4.insets = new Insets(0, 0, 5, 5);
		gbc_phone4.gridx = 2;
		gbc_phone4.gridy = 7;
		panelContactList.add(phone4, gbc_phone4);
		
		//Expand button
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		btnExpand4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnExpand4 = new GridBagConstraints();
		btnExpand4.setActionCommand("Isaac");
		btnExpand4.addActionListener(this);
		gbc_btnExpand4.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand4.gridx = 3;
		gbc_btnExpand4.gridy = 7;
		panelContactList.add(btnExpand4, gbc_btnExpand4);
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.isaac = new ContactDetails(ContactDetails.Name.Isaac, "0457483920");
		this.isaac.setVisible(false);
		panelContactList.add(this.isaac, c);
		
		//ROW 5
		//Name label
		JLabel name5 = new JLabel("Dr. Robert");
		name5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_name5 = new GridBagConstraints();
		gbc_name5.anchor = GridBagConstraints.WEST;
		gbc_name5.insets = new Insets(0, 20, 0, 5);
		gbc_name5.gridx = 1;
		gbc_name5.gridy = 9;
		panelContactList.add(name5, gbc_name5);
		
		//Phone label
		JLabel phone5 = new JLabel("0401987654");
		phone5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_phone5 = new GridBagConstraints();
		gbc_phone5.insets = new Insets(0, 0, 0, 5);
		gbc_phone5.gridx = 2;
		gbc_phone5.gridy = 9;
		panelContactList.add(phone5, gbc_phone5);
		
		//Expand button
		JButton btnExpand5 = new JButton("Expand");
		btnExpand5.setFont(MedicationManagement.BODY_FONT);
		btnExpand5.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand5 = new GridBagConstraints();
		btnExpand5.setActionCommand("Robert");
		btnExpand5.addActionListener(this);
		gbc_btnExpand5.insets = new Insets(0, 0, 0, 12);
		gbc_btnExpand5.gridx = 3;
		gbc_btnExpand5.gridy = 9;
		panelContactList.add(btnExpand5, gbc_btnExpand5);
		
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 10;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.robert = new ContactDetails(ContactDetails.Name.Robert, "0401987654");
		this.robert.setVisible(false);
		panelContactList.add(this.robert, c);
		return panelContactList;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Smith"))
			smith.setVisible(true);
		else if(e.getActionCommand().equals("William"))
			william.setVisible(true);
		else if(e.getActionCommand().equals("Jane"))
			this.jane.setVisible(true);
		else if(e.getActionCommand().equals("Isaac"))
			this.isaac.setVisible(true);
		else if(e.getActionCommand().equals("Robert"))
			this.robert.setVisible(true);
		
	}

}
