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
import javax.swing.JScrollBar;

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
		
		JLabel lblAdded = new JLabel("Added: 5");
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
		
		JLabel lblDose = new JLabel("Dose");
		lblDose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDose = new GridBagConstraints();
		gbc_lblDose.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose.gridx = 2;
		gbc_lblDose.gridy = 0;
		panel.add(lblDose, gbc_lblDose);
		
		///ROW 1////
		JLabel lblPanadol = new JLabel("Panadol");
		lblPanadol.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPanadol.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPanadol = new GridBagConstraints();
		gbc_lblPanadol.weightx = 1.0;
		gbc_lblPanadol.anchor = GridBagConstraints.WEST;
		gbc_lblPanadol.insets = new Insets(0, 20, 5, 5);
		gbc_lblPanadol.gridx = 1;
		gbc_lblPanadol.gridy = 1;
		panel.add(lblPanadol, gbc_lblPanadol);
		
		JButton btnExpand1 = new JButton("Expand");
		btnExpand1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Image expandIcon = new ImageIcon(this.getClass().getResource("expand.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		
		JLabel lblDoseEvery = new JLabel("Every 4 hours");
		lblDoseEvery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDoseEvery = new GridBagConstraints();
		gbc_lblDoseEvery.weightx = 1.0;
		gbc_lblDoseEvery.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoseEvery.gridx = 2;
		gbc_lblDoseEvery.gridy = 1;
		panel.add(lblDoseEvery, gbc_lblDoseEvery);
		btnExpand1.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand1 = new GridBagConstraints();
		gbc_btnExpand1.anchor = GridBagConstraints.EAST;
		gbc_btnExpand1.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand1.gridx = 3;
		gbc_btnExpand1.gridy = 1;
		panel.add(btnExpand1, gbc_btnExpand1);
		
		
		///ROW 2////
		JLabel lblNewLabel = new JLabel("Sambucol Cols & Flu");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 20, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAfterDinner = new JLabel("After dinner");
		lblAfterDinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAfterDinner = new GridBagConstraints();
		gbc_lblAfterDinner.insets = new Insets(0, 0, 5, 5);
		gbc_lblAfterDinner.gridx = 2;
		gbc_lblAfterDinner.gridy = 2;
		panel.add(lblAfterDinner, gbc_lblAfterDinner);
		
		JButton btnExpand2 = new JButton("Expand");
		btnExpand2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand2.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_btnExpand2 = new GridBagConstraints();
		gbc_btnExpand2.insets = new Insets(0, 0, 5, 12);
		gbc_btnExpand2.gridx = 3;
		gbc_btnExpand2.gridy = 2;
		panel.add(btnExpand2, gbc_btnExpand2);
		
		
		///ROW 3////
		JLabel lblNewLabel_2 = new JLabel("Glucophage");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 20, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Twice a day");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 12);
		gbc_button.gridx = 3;
		gbc_button.gridy = 3;
		panel.add(btnExpand3, gbc_button);
		
		///ROW 4////
		JLabel lblHydrocodone = new JLabel("Hydrocodone");
		lblHydrocodone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHydrocodone = new GridBagConstraints();
		gbc_lblHydrocodone.anchor = GridBagConstraints.WEST;
		gbc_lblHydrocodone.insets = new Insets(0, 20, 5, 5);
		gbc_lblHydrocodone.gridx = 1;
		gbc_lblHydrocodone.gridy = 4;
		panel.add(lblHydrocodone, gbc_lblHydrocodone);
		
		JLabel lblNewLabel_4 = new JLabel("Every 12 hours");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JButton btnExpand4 = new JButton("Expand");
		btnExpand4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand4.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 12);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 4;
		panel.add(btnExpand4, gbc_button_1);
		
		
		///ROW 5////
		
		JLabel lblSimvastatin = new JLabel("Simvastatin");
		lblSimvastatin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSimvastatin = new GridBagConstraints();
		gbc_lblSimvastatin.anchor = GridBagConstraints.WEST;
		gbc_lblSimvastatin.insets = new Insets(0, 20, 0, 5);
		gbc_lblSimvastatin.gridx = 1;
		gbc_lblSimvastatin.gridy = 5;
		panel.add(lblSimvastatin, gbc_lblSimvastatin);
		
		JLabel lblEveryEvening = new JLabel("Every evening");
		lblEveryEvening.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEveryEvening = new GridBagConstraints();
		gbc_lblEveryEvening.insets = new Insets(0, 0, 0, 5);
		gbc_lblEveryEvening.gridx = 2;
		gbc_lblEveryEvening.gridy = 5;
		panel.add(lblEveryEvening, gbc_lblEveryEvening);
		
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
