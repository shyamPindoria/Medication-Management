import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;


/**
 * Current Medication Panel
 * @author Shyam Pindoria - pinsy004
 * @author Rushi Patel - patry019
 *
 */
public class MedicationPanel extends JPanel implements ActionListener, Runnable{
	
	private JTextField textFieldSearch;
	ItemDetails panadol, sambucol, glucophage, hydrocodone, simvastatin;
	JButton buttonAdd;
	/**
	 * Create the Medication Panel
	 */
	public MedicationPanel() {
		//Set the layout to border layout
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout());
		
		//Add title pane to the north region
		add(createTitlePane(), BorderLayout.NORTH);
		
		//Added label
		JLabel lblAdded = new JLabel("Added: 5");
		lblAdded.setFont(MedicationManagement.BODY_FONT);
		lblAdded.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblAdded, BorderLayout.SOUTH);
		
		//Add a scroll pane to the center region
		add(createScrollPane(), BorderLayout.CENTER);

	}

	/**
	 * Create the title panel
	 * @return title panel
	 */
	private JPanel createTitlePane() {
		//Set a border layout o the title panel
		JPanel panelTitle = new JPanel();
		panelTitle.setFont(MedicationManagement.BODY_FONT);
		panelTitle.setLayout(new BorderLayout());
		
		//User ID
		JLabel lblUserId = new JLabel("User ID: 00001");
		lblUserId.setBorder(new EmptyBorder(0, 0, 0, 12));
		panelTitle.add(lblUserId, BorderLayout.EAST);
		
		//Title of the main panel
		JLabel lblCurrentMedication = new JLabel("Current Medication");
		lblCurrentMedication.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblCurrentMedication.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCurrentMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentMedication.setFont(MedicationManagement.HEADER_FONT);
		panelTitle.add(lblCurrentMedication, BorderLayout.CENTER);
		
		//Add a tool bar in the south region of the title pane
		panelTitle.add(createToolBarPane(), BorderLayout.SOUTH);
		
		return panelTitle;
	}

	/**
	 * Create a tool bar
	 * @return tool bar panel
	 */
	private JPanel createToolBarPane() {
		
		//Create a panel and set a grid bag layout to it
		JPanel panelToolBar = new JPanel();
		GridBagLayout gbl_panelToolBar = new GridBagLayout();
		gbl_panelToolBar.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelToolBar.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelToolBar.setLayout(gbl_panelToolBar);
		
		//Add button
		buttonAdd = new JButton("Add");
		buttonAdd.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_buttonAdd = new GridBagConstraints();
		gbc_buttonAdd.insets = new Insets(0, 0, 0, 5);
		gbc_buttonAdd.gridx = 0;
		gbc_buttonAdd.gridy = 0;
		panelToolBar.add(buttonAdd, gbc_buttonAdd);
		buttonAdd.addActionListener(this);
		
		//Remove Button
		JButton buttonRemove = new JButton("Remove");
		buttonRemove.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_buttonRemove = new GridBagConstraints();
		gbc_buttonRemove.weightx = 3.0;
		gbc_buttonRemove.anchor = GridBagConstraints.WEST;
		gbc_buttonRemove.insets = new Insets(0, 0, 0, 5);
		gbc_buttonRemove.gridx = 1;
		gbc_buttonRemove.gridy = 0;
		panelToolBar.add(buttonRemove, gbc_buttonRemove);
		
		//Search Text Field
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		GridBagConstraints gbc_textFieldSearch = new GridBagConstraints();
		gbc_textFieldSearch.weightx = 1.0;
		gbc_textFieldSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSearch.insets = new Insets(0, 5, 0, 5);
		gbc_textFieldSearch.gridx = 2;
		gbc_textFieldSearch.gridy = 0;
		panelToolBar.add(textFieldSearch, gbc_textFieldSearch);
		
		//Search Button
		JButton buttonSearch = new JButton("Search");
		buttonSearch.setFont(MedicationManagement.BODY_FONT);
		Image searchIcon = new ImageIcon(this.getClass().getResource("search.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		buttonSearch.setIcon(new ImageIcon(searchIcon)); //Add an image to the button
		GridBagConstraints gbc_buttonSearch = new GridBagConstraints();
		gbc_buttonSearch.insets = new Insets(0, 0, 0, 12);
		gbc_buttonSearch.gridx = 3;
		gbc_buttonSearch.gridy = 0;
		panelToolBar.add(buttonSearch, gbc_buttonSearch);
		
		return panelToolBar;
	}

	/**
	 * Populate the scroll panel
	 * @return scroll panel
	 */
	private JScrollPane createScrollPane() {
		
		JScrollPane scrollPaneBody = new JScrollPane();
		//Set the body panel to the viewport
		scrollPaneBody.setViewportView(createBodyPanel());

		return scrollPaneBody;
	}

	/**
	 * Create and populate the body panel
	 * @return body panel
	 */
	private JPanel createBodyPanel() {
		//Create the body panel and add a grid bag layout to it
		JPanel panelBody = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBody.setLayout(gbl_panel);

		//ROW 0
		JLabel lblName = new JLabel("Name");
		lblName.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 20, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		panelBody.add(lblName, gbc_lblName);

		JLabel lblDose = new JLabel("Dose");
		lblDose.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblDose = new GridBagConstraints();
		gbc_lblDose.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose.gridx = 2;
		gbc_lblDose.gridy = 0;
		panelBody.add(lblDose, gbc_lblDose);

		//ROW 1
		//Item label
		JLabel lblItem1 = new JLabel("Panadol");
		lblItem1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblItem1.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem1 = new GridBagConstraints();
		gbc_lblItem1.weightx = 1.0;
		gbc_lblItem1.anchor = GridBagConstraints.WEST;
		gbc_lblItem1.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem1.gridx = 1;
		gbc_lblItem1.gridy = 1;
		panelBody.add(lblItem1, gbc_lblItem1);
		
		//Dose label
		JLabel lblDose1 = new JLabel("Every 4 hours");
		lblDose1.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose1 = new GridBagConstraints();
		gbc_lblDose1.weightx = 1.0;
		gbc_lblDose1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose1.gridx = 2;
		gbc_lblDose1.gridy = 1;
		panelBody.add(lblDose1, gbc_lblDose1);
		
		//Expand button
		JButton btnExpand1 = new JButton("Expand");
		btnExpand1.setFont(MedicationManagement.BODY_FONT);
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		btnExpand1.setActionCommand("Panadol");
		btnExpand1.addActionListener(this);
		gbc_btnExpand1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand1.gridx = 3;
		gbc_btnExpand1.gridy = 1;
		panelBody.add(btnExpand1, gbc_btnExpand1);

		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		panadol = new ItemDetails(ItemDetails.Medicine.Panadol);
		panadol.setVisible(false);
		panelBody.add(this.panadol, c);
		
		//ROW 2
		//Item label
		JLabel lblItem2 = new JLabel("Sambucol Cols & Flu");
		lblItem2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem2 = new GridBagConstraints();
		gbc_lblItem2.anchor = GridBagConstraints.WEST;
		gbc_lblItem2.weightx = 1.0;
		gbc_lblItem2.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem2.gridx = 1;
		gbc_lblItem2.gridy = 3;
		panelBody.add(lblItem2, gbc_lblItem2);

		//Dose label
		JLabel lblDose2 = new JLabel("After dinner");
		lblDose2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose2 = new GridBagConstraints();
		gbc_lblDose2.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose2.gridx = 2;
		gbc_lblDose2.gridy = 3;
		panelBody.add(lblDose2, gbc_lblDose2);

		//Expand button
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(MedicationManagement.BODY_FONT);
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		btnExpand2.setActionCommand("Sambucol");
		btnExpand2.addActionListener(this);
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		gbc_btnExpand2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand2.gridx = 3;
		gbc_btnExpand2.gridy = 3;
		panelBody.add(btnExpand2, gbc_btnExpand2);

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		sambucol = new ItemDetails(ItemDetails.Medicine.Sambucol);
		sambucol.setVisible(false);
		panelBody.add(this.sambucol, c);

		//ROW 3
		//Item label
		JLabel lblItem3 = new JLabel("Glucophage");
		lblItem3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem3 = new GridBagConstraints();
		gbc_lblItem3.anchor = GridBagConstraints.WEST;
		gbc_lblItem3.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem3.gridx = 1;
		gbc_lblItem3.gridy = 5;
		panelBody.add(lblItem3, gbc_lblItem3);

		//Dose label
		JLabel lblDose3 = new JLabel("Twice a day");
		lblDose3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose3 = new GridBagConstraints();
		gbc_lblDose3.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose3.gridx = 2;
		gbc_lblDose3.gridy = 5;
		panelBody.add(lblDose3, gbc_lblDose3);

		//Expand button
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setFont(MedicationManagement.BODY_FONT);
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button8 = new GridBagConstraints();
		btnExpand3.setActionCommand("Glucophage");
		btnExpand3.addActionListener(this);
		gbc_button8.insets = new Insets(0, 0, 5, 12);
		gbc_button8.gridx = 3;
		gbc_button8.gridy = 5;
		panelBody.add(btnExpand3, gbc_button8);

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.glucophage = new ItemDetails(ItemDetails.Medicine.Glucophage);
		this.glucophage.setVisible(false);
		panelBody.add(this.glucophage, c);
		
		//ROW 4
		//Item label
		JLabel lblItem4 = new JLabel("Hydrocodone");
		lblItem4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem4 = new GridBagConstraints();
		gbc_lblItem4.anchor = GridBagConstraints.WEST;
		gbc_lblItem4.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem4.gridx = 1;
		gbc_lblItem4.gridy = 7;
		panelBody.add(lblItem4, gbc_lblItem4);
		
		//Dose label
		JLabel lblDose4 = new JLabel("Every 12 hours");
		lblDose4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose4 = new GridBagConstraints();
		gbc_lblDose4.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose4.gridx = 2;
		gbc_lblDose4.gridy = 7;
		panelBody.add(lblDose4, gbc_lblDose4);

		//Expand button
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setFont(MedicationManagement.BODY_FONT);
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		btnExpand4.setActionCommand("Hydrocodone");
		btnExpand4.addActionListener(this);
		gbc_button_9.insets = new Insets(0, 0, 5, 12);
		gbc_button_9.gridx = 3;
		gbc_button_9.gridy = 7;
		panelBody.add(btnExpand4, gbc_button_9);

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.hydrocodone = new ItemDetails(ItemDetails.Medicine.Hydrocodone);
		this.hydrocodone.setVisible(false);
		panelBody.add(this.hydrocodone, c);
		
		//ROW 5
		//Item label
		JLabel lblItem5 = new JLabel("Simvastatin");
		lblItem5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem5 = new GridBagConstraints();
		gbc_lblItem5.anchor = GridBagConstraints.WEST;
		gbc_lblItem5.insets = new Insets(0, 20, 0, 5);
		gbc_lblItem5.gridx = 1;
		gbc_lblItem5.gridy = 9;
		panelBody.add(lblItem5, gbc_lblItem5);

		//Dose label
		JLabel lblDose5 = new JLabel("Every evening");
		lblDose5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose5 = new GridBagConstraints();
		gbc_lblDose5.insets = new Insets(0, 0, 0, 5);
		gbc_lblDose5.gridx = 2;
		gbc_lblDose5.gridy = 9;
		panelBody.add(lblDose5, gbc_lblDose5);

		//Expand button
		JButton btnExpand5 = new JButton("Expand");
		btnExpand5.setFont(MedicationManagement.BODY_FONT);
		btnExpand5.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		btnExpand5.setActionCommand("Simvastatin");
		btnExpand5.addActionListener(this);
		gbc_button_10.insets = new Insets(0, 0, 0, 12);
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 9;
		panelBody.add(btnExpand5, gbc_button_10);

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 10;
		c.gridwidth = 5;
		c.insets = new Insets(10,10,10,10);
		this.simvastatin = new ItemDetails(ItemDetails.Medicine.Simvastatin);
		this.simvastatin.setVisible(false);
		panelBody.add(this.simvastatin, c);
		return panelBody;
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		if (arg.getSource() == buttonAdd) {
			LoadingScreen screen = new LoadingScreen();//shows up the loading screen
			Thread sT = new Thread(screen);//create a thread for the loading screen
			sT.start();//start the thread and execute the run method 
			screen.setLocation(MainFrame.LOCATION);
			Thread pT = new Thread(this);//create a thread for the MedicationPanel
			pT.start();//start the thread and execute the run method 
		}
		if(arg.getActionCommand().equals("Panadol"))
			panadol.setVisible(true);
		else if(arg.getActionCommand().equals("Sambucol"))
			sambucol.setVisible(true);
		else if(arg.getActionCommand().equals("Glucophage"))
			this.glucophage.setVisible(true);
		else if(arg.getActionCommand().equals("Hydrocodone"))
			this.hydrocodone.setVisible(true);
		else if(arg.getActionCommand().equals("Simvastatin"))
			this.simvastatin.setVisible(true);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(750);//make the add window appear late
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AddMedicationPage newM = new AddMedicationPage();
		newM.setLocationRelativeTo(this);
	}
	
}
