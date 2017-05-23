import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Button;

public class MedicationPanel extends JPanel {
	private JTextField txtSearch;

	/**
	 * Create the panel.
	 */
	public MedicationPanel() {
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
		
		JLabel lblCurrentMedication = new JLabel("Current Medication");
		lblCurrentMedication.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblCurrentMedication.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCurrentMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentMedication.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitle.add(lblCurrentMedication, BorderLayout.CENTER);
		
		JLabel lblAdded = new JLabel("Added: 2");
		lblAdded.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblAdded, BorderLayout.SOUTH);
		
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
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
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
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPanadol = new JLabel("Panadol");
		lblPanadol.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPanadol.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPanadol = new GridBagConstraints();
		gbc_lblPanadol.anchor = GridBagConstraints.WEST;
		gbc_lblPanadol.insets = new Insets(0, 20, 5, 5);
		gbc_lblPanadol.gridx = 0;
		gbc_lblPanadol.gridy = 0;
		panel.add(lblPanadol, gbc_lblPanadol);
		
		JButton btnExpand1 = new JButton("Expand");
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 0);
		gbc_btnExpand1.gridx = 1;
		gbc_btnExpand1.gridy = 0;
		panel.add(btnExpand1, gbc_btnExpand1);
		
		JLabel lblNewLabel = new JLabel("Sambucol Cols & Flu");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 20, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		gbc_btnExpand2.gridx = 1;
		gbc_btnExpand2.gridy = 1;
		panel.add(btnExpand2, gbc_btnExpand2);

	}

}
