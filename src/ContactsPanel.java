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
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ContactsPanel extends JPanel {

	private JTextField txtSearch;
	
	/**
	 * Create the panel.
	 */
	public ContactsPanel() {
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout(0, 0));
		
		
		JPanel panelTitle = new JPanel();
		panelTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		add(panelTitle, BorderLayout.NORTH);
		panelTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUserId = new JLabel("User ID: 00001");
		lblUserId.setBorder(new EmptyBorder(0, 0, 0, 12));
		lblUserId.setHorizontalTextPosition(SwingConstants.LEADING);
		panelTitle.add(lblUserId, BorderLayout.EAST);
		
		JLabel lblContacts = new JLabel("Contacts");
		lblContacts.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblContacts.setHorizontalTextPosition(SwingConstants.CENTER);
		lblContacts.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacts.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitle.add(lblContacts, BorderLayout.CENTER);
		
		JLabel lblContactsNo = new JLabel("Contacts: 5");
		lblContactsNo.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblContactsNo, BorderLayout.SOUTH);
		
		JPanel panelBody = new JPanel();
		add(panelBody, BorderLayout.CENTER);
		GridBagLayout gbl_panelBody = new GridBagLayout();
		gbl_panelBody.columnWidths = new int[]{0, 0};
		gbl_panelBody.rowHeights = new int[]{0, 53, 20, 0};
		gbl_panelBody.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBody.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelBody.setLayout(gbl_panelBody);
		
		JPanel panelToolBar = new JPanel();
		GridBagConstraints gbc_panelToolBar = new GridBagConstraints();
		gbc_panelToolBar.anchor = GridBagConstraints.NORTH;
		gbc_panelToolBar.insets = new Insets(0, 0, 5, 0);
		gbc_panelToolBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelToolBar.gridx = 0;
		gbc_panelToolBar.gridy = 0;
		panelBody.add(panelToolBar, gbc_panelToolBar);
		GridBagLayout gbl_panelToolBar = new GridBagLayout();
		gbl_panelToolBar.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelToolBar.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelToolBar.rowWeights = new double[]{0.0};
		panelToolBar.setLayout(gbl_panelToolBar);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 0;
		panelToolBar.add(btnAdd, gbc_btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.anchor = GridBagConstraints.WEST;
		gbc_btnRemove.weightx = 3.0;
		gbc_btnRemove.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemove.gridx = 1;
		gbc_btnRemove.gridy = 0;
		panelToolBar.add(btnRemove, gbc_btnRemove);
		
		txtSearch = new JTextField();
		GridBagConstraints gbc_txtSearch = new GridBagConstraints();
		gbc_txtSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearch.weightx = 1.0;
		gbc_txtSearch.insets = new Insets(0, 5, 5, 0);
		gbc_txtSearch.gridx = 2;
		gbc_txtSearch.gridy = 0;
		panelToolBar.add(txtSearch, gbc_txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 0, 12);
		gbc_btnSearch.gridx = 3;
		gbc_btnSearch.gridy = 0;
		panelToolBar.add(btnSearch, gbc_btnSearch);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		panelBody.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		///ROW 0////
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 2;
		gbc_lblPhone.gridy = 0;
		panel.add(lblPhone, gbc_lblPhone);
		
		///ROW 1////
		JLabel lblDoc1 = new JLabel("Dr. Smith");
		lblDoc1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDoc1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc1 = new GridBagConstraints();
		gbc_lblDoc1.weightx = 1.0;
		gbc_lblDoc1.anchor = GridBagConstraints.WEST;
		gbc_lblDoc1.insets = new Insets(0, 20, 5, 5);
		gbc_lblDoc1.gridx = 1;
		gbc_lblDoc1.gridy = 1;
		panel.add(lblDoc1, gbc_lblDoc1);
		
		JButton btnExpand1 = new JButton("Expand");
		btnExpand1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		
		JLabel lblDoc1No = new JLabel("0412345678");
		lblDoc1No.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc1No = new GridBagConstraints();
		gbc_lblDoc1No.weightx = 1.0;
		gbc_lblDoc1No.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoc1No.gridx = 2;
		gbc_lblDoc1No.gridy = 1;
		panel.add(lblDoc1No, gbc_lblDoc1No);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		gbc_btnExpand1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand1.gridx = 3;
		gbc_btnExpand1.gridy = 1;
		panel.add(btnExpand1, gbc_btnExpand1);
		
		
		///ROW 2////
		JLabel lblDoc2 = new JLabel("Dr. William");
		lblDoc2.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc2 = new GridBagConstraints();
		gbc_lblDoc2.anchor = GridBagConstraints.WEST;
		gbc_lblDoc2.weightx = 1.0;
		gbc_lblDoc2.insets = new Insets(0, 20, 5, 5);
		gbc_lblDoc2.gridx = 1;
		gbc_lblDoc2.gridy = 2;
		panel.add(lblDoc2, gbc_lblDoc2);
		
		JLabel lblDoc2No = new JLabel("0498765432");
		lblDoc2No.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc2No = new GridBagConstraints();
		gbc_lblDoc2No.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoc2No.gridx = 2;
		gbc_lblDoc2No.gridy = 2;
		panel.add(lblDoc2No, gbc_lblDoc2No);
		
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		gbc_btnExpand2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand2.gridx = 3;
		gbc_btnExpand2.gridy = 2;
		panel.add(btnExpand2, gbc_btnExpand2);
		
		
		///ROW 3////
		JLabel lblDoc3 = new JLabel("Dr. Jane");
		lblDoc3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc3 = new GridBagConstraints();
		gbc_lblDoc3.anchor = GridBagConstraints.WEST;
		gbc_lblDoc3.insets = new Insets(0, 20, 5, 5);
		gbc_lblDoc3.gridx = 1;
		gbc_lblDoc3.gridy = 3;
		panel.add(lblDoc3, gbc_lblDoc3);
		
		JLabel lblDoc3No = new JLabel("0491827364");
		lblDoc3No.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc3No = new GridBagConstraints();
		gbc_lblDoc3No.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoc3No.gridx = 2;
		gbc_lblDoc3No.gridy = 3;
		panel.add(lblDoc3No, gbc_lblDoc3No);
		
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 12);
		gbc_button.gridx = 3;
		gbc_button.gridy = 3;
		panel.add(btnExpand3, gbc_button);
		
		///ROW 4////
		JLabel lblDoc4 = new JLabel("Dr. Isaac");
		lblDoc4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc4 = new GridBagConstraints();
		gbc_lblDoc4.anchor = GridBagConstraints.WEST;
		gbc_lblDoc4.insets = new Insets(0, 20, 5, 5);
		gbc_lblDoc4.gridx = 1;
		gbc_lblDoc4.gridy = 4;
		panel.add(lblDoc4, gbc_lblDoc4);
		
		JLabel lblDoc4No = new JLabel("0457483920");
		lblDoc4No.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc4No = new GridBagConstraints();
		gbc_lblDoc4No.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoc4No.gridx = 2;
		gbc_lblDoc4No.gridy = 4;
		panel.add(lblDoc4No, gbc_lblDoc4No);
		
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 12);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 4;
		panel.add(btnExpand4, gbc_button_1);
		
		
		///ROW 5////
		
		JLabel lblDoc5 = new JLabel("Dr. Robert");
		lblDoc5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc5 = new GridBagConstraints();
		gbc_lblDoc5.anchor = GridBagConstraints.WEST;
		gbc_lblDoc5.insets = new Insets(0, 20, 0, 5);
		gbc_lblDoc5.gridx = 1;
		gbc_lblDoc5.gridy = 5;
		panel.add(lblDoc5, gbc_lblDoc5);
		
		JLabel lblDoc5No = new JLabel("0401987654");
		lblDoc5No.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoc5No = new GridBagConstraints();
		gbc_lblDoc5No.insets = new Insets(0, 0, 0, 5);
		gbc_lblDoc5No.gridx = 2;
		gbc_lblDoc5No.gridy = 5;
		panel.add(lblDoc5No, gbc_lblDoc5No);
		
		JButton btnExpand5 = new JButton("Expand");
		btnExpand5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand5.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 0, 12);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 5;
		panel.add(btnExpand5, gbc_button_2);
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar, BorderLayout.EAST);

	}

}
