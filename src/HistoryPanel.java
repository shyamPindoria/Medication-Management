import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HistoryPanel extends JPanel {
	
	private JTextField textFieldSearch;
	
	/**
	 * Create and populate the history panel
	 */
	public HistoryPanel() {
		//Set size and layout
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout());
	
		//Add title pane to north
		add(createTitlePane(), BorderLayout.NORTH);
		
		//Added Label
		JLabel lblAdded = new JLabel("Items: 5");
		lblAdded.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblAdded, BorderLayout.SOUTH);
		
		//Add scroll pane to center
		add(createScrollPane(), BorderLayout.CENTER);

	}

	/**
	 * Create title pane
	 * @return title panel
	 */
	private JPanel createTitlePane() {
		//New panel with border layout
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(new BorderLayout());
		
		//User ID label
		JLabel lblUserId = new JLabel("User ID: 00001");
		lblUserId.setBorder(new EmptyBorder(0, 0, 0, 12));
		lblUserId.setHorizontalTextPosition(SwingConstants.LEADING);
		panelTitle.add(lblUserId, BorderLayout.EAST);
		
		//History label
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblHistory.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistory.setFont(MedicationManagement.HEADER_FONT);
		panelTitle.add(lblHistory, BorderLayout.CENTER);
		
		//Add tool bar panel to the south region
		panelTitle.add(createToolBarPane(), BorderLayout.SOUTH);
		
		return panelTitle;
	}
	
	/**
	 * Create tool bar pane
	 * @return tool bar panel
	 */
	private JPanel createToolBarPane() {
		//New panel with grid bag layout
		JPanel panelToolBar = new JPanel();
		GridBagLayout gbl_panelToolBar = new GridBagLayout();
		gbl_panelToolBar.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelToolBar.rowHeights = new int[]{0, 0};
		gbl_panelToolBar.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelToolBar.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelToolBar.setLayout(gbl_panelToolBar);
		
		//Sort by label
		JLabel labelSort = new JLabel("Sort By:");
		GridBagConstraints gbc_labelSort = new GridBagConstraints();
		gbc_labelSort.anchor = GridBagConstraints.EAST;
		gbc_labelSort.insets = new Insets(0, 12, 0, 5);
		gbc_labelSort.gridx = 0;
		gbc_labelSort.gridy = 0;
		panelToolBar.add(labelSort, gbc_labelSort);
		
		//Sort by combo box
		JComboBox<String[]> comboBoxSort = new JComboBox<String[]>();
		comboBoxSort.setModel(new DefaultComboBoxModel(new String[] {"Illness", "Medication"}));
		GridBagConstraints gbc_comboBoxSort = new GridBagConstraints();
		gbc_comboBoxSort.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxSort.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxSort.gridx = 1;
		gbc_comboBoxSort.gridy = 0;
		panelToolBar.add(comboBoxSort, gbc_comboBoxSort);
		
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
		Image searchIcon = new ImageIcon(this.getClass().getResource("search.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		buttonSearch.setIcon(new ImageIcon(searchIcon)); //Set search Icon
		GridBagConstraints gbc_buttonSearch = new GridBagConstraints();
		gbc_buttonSearch.insets = new Insets(0, 0, 0, 12);
		gbc_buttonSearch.gridx = 3;
		gbc_buttonSearch.gridy = 0;
		panelToolBar.add(buttonSearch, gbc_buttonSearch);
		
		return panelToolBar;
	}
	
	/**
	 * Create the scroll pane
	 * @return scroll panel
	 */
	private JScrollPane createScrollPane() {

		JScrollPane scrollPane = new JScrollPane();
		
		//Set the view post to body panel
		scrollPane.setViewportView(createBodyPane());
		
		return scrollPane;
	}
	
	/**
	 * Create the body pane
	 * @return body panel
	 */
	private JPanel createBodyPane() {
		
		//Panel with grid bag layout
		JPanel panelBody = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBody.setLayout(gbl_panel);

		//ROW 0
		//Illness label
		JLabel lblIllness = new JLabel("Illness");
		lblIllness.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblIllness = new GridBagConstraints();
		gbc_lblIllness.anchor = GridBagConstraints.WEST;
		gbc_lblIllness.insets = new Insets(0, 0, 5, 5);
		gbc_lblIllness.gridx = 1;
		gbc_lblIllness.gridy = 0;
		panelBody.add(lblIllness, gbc_lblIllness);

		//Dose label
		JLabel lblDose = new JLabel("Medication");
		lblDose.setFont(MedicationManagement.HEADER_FONT);
		GridBagConstraints gbc_lblDose = new GridBagConstraints();
		gbc_lblDose.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose.gridx = 2;
		gbc_lblDose.gridy = 0;
		panelBody.add(lblDose, gbc_lblDose);

		//ROW 1
		//Item label
		JLabel lblItem1 = new JLabel("Headache");
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
		JLabel lblDose1 = new JLabel("Panadol");
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
		GridBagConstraints gbc_btnExpand_1 = new GridBagConstraints();
		gbc_btnExpand_1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand_1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand_1.gridx = 3;
		gbc_btnExpand_1.gridy = 1;
		panelBody.add(btnExpand1, gbc_btnExpand_1);


		//ROW 2
		//Item label
		JLabel lblItem2 = new JLabel("Cold & Flu");
		lblItem2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem2 = new GridBagConstraints();
		gbc_lblItem2.anchor = GridBagConstraints.WEST;
		gbc_lblItem2.weightx = 1.0;
		gbc_lblItem2.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem2.gridx = 1;
		gbc_lblItem2.gridy = 2;
		panelBody.add(lblItem2, gbc_lblItem2);

		//Dose label
		JLabel lblDose2 = new JLabel("Sambucol");
		lblDose2.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose2 = new GridBagConstraints();
		gbc_lblDose2.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose2.gridx = 2;
		gbc_lblDose2.gridy = 2;
		panelBody.add(lblDose2, gbc_lblDose2);

		//Expand button
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(MedicationManagement.BODY_FONT);
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand_2 = new GridBagConstraints();
		gbc_btnExpand_2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand_2.gridx = 3;
		gbc_btnExpand_2.gridy = 2;
		panelBody.add(btnExpand2, gbc_btnExpand_2);


		//ROW 3
		//Item label
		JLabel lblItem3 = new JLabel("Diabetes");
		lblItem3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem3 = new GridBagConstraints();
		gbc_lblItem3.anchor = GridBagConstraints.WEST;
		gbc_lblItem3.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem3.gridx = 1;
		gbc_lblItem3.gridy = 3;
		panelBody.add(lblItem3, gbc_lblItem3);

		//Dose label
		JLabel lblDose3 = new JLabel("Glucophage");
		lblDose3.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose3 = new GridBagConstraints();
		gbc_lblDose3.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose3.gridx = 2;
		gbc_lblDose3.gridy = 3;
		panelBody.add(lblDose3, gbc_lblDose3);

		//Expand button
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setFont(MedicationManagement.BODY_FONT);
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_buttonExpand_3 = new GridBagConstraints();
		gbc_buttonExpand_3.insets = new Insets(0, 0, 5, 12);
		gbc_buttonExpand_3.gridx = 3;
		gbc_buttonExpand_3.gridy = 3;
		panelBody.add(btnExpand3, gbc_buttonExpand_3);

		//ROW 4
		//Item label
		JLabel lblItem4 = new JLabel("Body Pain");
		lblItem4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem4 = new GridBagConstraints();
		gbc_lblItem4.anchor = GridBagConstraints.WEST;
		gbc_lblItem4.insets = new Insets(0, 20, 5, 5);
		gbc_lblItem4.gridx = 1;
		gbc_lblItem4.gridy = 4;
		panelBody.add(lblItem4, gbc_lblItem4);

		//Dose label
		JLabel lblDose4 = new JLabel("Hydrocodone");
		lblDose4.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose4 = new GridBagConstraints();
		gbc_lblDose4.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose4.gridx = 2;
		gbc_lblDose4.gridy = 4;
		panelBody.add(lblDose4, gbc_lblDose4);

		//Expand button
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setFont(MedicationManagement.BODY_FONT);
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_buttonExpand_4 = new GridBagConstraints();
		gbc_buttonExpand_4.insets = new Insets(0, 0, 5, 12);
		gbc_buttonExpand_4.gridx = 3;
		gbc_buttonExpand_4.gridy = 4;
		panelBody.add(btnExpand4, gbc_buttonExpand_4);


		//ROW 5
		//Item label
		JLabel lblItem5 = new JLabel("High Cholesterol");
		lblItem5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblItem5 = new GridBagConstraints();
		gbc_lblItem5.anchor = GridBagConstraints.WEST;
		gbc_lblItem5.insets = new Insets(0, 20, 0, 5);
		gbc_lblItem5.gridx = 1;
		gbc_lblItem5.gridy = 5;
		panelBody.add(lblItem5, gbc_lblItem5);

		//Dose label
		JLabel lblDose5 = new JLabel("Simvastatin");
		lblDose5.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblDose5 = new GridBagConstraints();
		gbc_lblDose5.insets = new Insets(0, 0, 0, 5);
		gbc_lblDose5.gridx = 2;
		gbc_lblDose5.gridy = 5;
		panelBody.add(lblDose5, gbc_lblDose5);

		//Expand button
		JButton btnExpand5 = new JButton("Expand");
		btnExpand5.setFont(MedicationManagement.BODY_FONT);
		btnExpand5.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_buttonExpand_5 = new GridBagConstraints();
		gbc_buttonExpand_5.insets = new Insets(0, 0, 0, 12);
		gbc_buttonExpand_5.gridx = 3;
		gbc_buttonExpand_5.gridy = 5;
		panelBody.add(btnExpand5, gbc_buttonExpand_5);

		return panelBody;
	}

}
