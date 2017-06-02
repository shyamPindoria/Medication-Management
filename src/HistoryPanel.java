import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HistoryPanel extends JPanel {
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public HistoryPanel() {
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
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblHistory.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistory.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitle.add(lblHistory, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panelTitle.add(panel_1, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("Sort By:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 12, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel_1.add(comboBox, gbc_comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.weightx = 1.0;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 5, 0, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		
		JButton button = new JButton("Search");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 12);
		gbc_button.gridx = 3;
		gbc_button.gridy = 0;
		panel_1.add(button, gbc_button);
		
		JLabel lblAdded = new JLabel("Items: 5");
		lblAdded.setBorder(new EmptyBorder(0, 12, 12, 0));
		add(lblAdded, BorderLayout.SOUTH);
		
		JScrollPane scrollPaneBody = new JScrollPane();
		JPanel panelBody = new JPanel();
		
		scrollPaneBody.setViewportView(panelBody);
		add(scrollPaneBody, BorderLayout.CENTER);
		
		GridBagLayout gbl_panelBody = new GridBagLayout();
		gbl_panelBody.columnWidths = new int[]{0, 0};
		gbl_panelBody.rowHeights = new int[]{53, 20, 0};
		gbl_panelBody.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBody.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panelBody.setLayout(gbl_panelBody);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panelBody.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		///ROW 0////
		JLabel lblNewLabel_1 = new JLabel("Illness");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblDose = new JLabel("Medication");
		lblDose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDose = new GridBagConstraints();
		gbc_lblDose.insets = new Insets(0, 0, 5, 5);
		gbc_lblDose.gridx = 2;
		gbc_lblDose.gridy = 0;
		panel.add(lblDose, gbc_lblDose);
		
		///ROW 1////
		JLabel lblPanadol = new JLabel("Headache");
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
		
		JLabel lblDoseEvery = new JLabel("Panadol");
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
		JLabel lblNewLabel = new JLabel("Cold & Flu");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 20, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAfterDinner = new JLabel("Sambucol");
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
		JLabel lblNewLabel_2 = new JLabel("Diabetes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 20, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Glucophage");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnExpand3 = new JButton("Expand");
		btnExpand3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExpand3.setIcon(new ImageIcon(expandIcon));
		GridBagConstraints gbc_button00 = new GridBagConstraints();
		gbc_button00.insets = new Insets(0, 0, 5, 12);
		gbc_button00.gridx = 3;
		gbc_button00.gridy = 3;
		panel.add(btnExpand3, gbc_button00);
		
		///ROW 4////
		JLabel lblHydrocodone = new JLabel("Body Pain");
		lblHydrocodone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHydrocodone = new GridBagConstraints();
		gbc_lblHydrocodone.anchor = GridBagConstraints.WEST;
		gbc_lblHydrocodone.insets = new Insets(0, 20, 5, 5);
		gbc_lblHydrocodone.gridx = 1;
		gbc_lblHydrocodone.gridy = 4;
		panel.add(lblHydrocodone, gbc_lblHydrocodone);
		
		JLabel lblNewLabel_4 = new JLabel("Hydrocodone");
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
		
		JLabel lblSimvastatin = new JLabel("High Cholesterol");
		lblSimvastatin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSimvastatin = new GridBagConstraints();
		gbc_lblSimvastatin.anchor = GridBagConstraints.WEST;
		gbc_lblSimvastatin.insets = new Insets(0, 20, 0, 5);
		gbc_lblSimvastatin.gridx = 1;
		gbc_lblSimvastatin.gridy = 5;
		panel.add(lblSimvastatin, gbc_lblSimvastatin);
		
		JLabel lblEveryEvening = new JLabel("Simvastatin");
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


	}

}
