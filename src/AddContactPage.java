import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddContactPage extends JFrame implements ActionListener{
	JLabel titleLabel;
	JComboBox titleBox;
	JLabel nameLabel;
	JLabel dosageLabel;
	JPanel mainPanel;
	JPanel secondPanel;
	JTextField titleText;
	JTextField nameText;
	JTextField dosageText;
	JButton addButton;
	JButton cancelButton;
	JButton clearButton;

	public AddContactPage() {
		this.setSize(300, 150);
		this.setTitle("Add Contact");
		mainPanel = new JPanel();
		getContentPane().add(mainPanel);

		secondPanel = new JPanel(new GridBagLayout());
		mainPanel.add(secondPanel);

		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		
		String[] tileTypes = {"Dr. ", "Mr. ", "Miss. ", "Mrs. "};
		
		titleLabel = new JLabel("Title");
		secondPanel.add(titleLabel, c);
		c.gridx++;
		titleBox = new JComboBox(tileTypes);
		secondPanel.add(titleBox, c);
		c.gridy++;
		c.gridx--;
		
		nameLabel = new JLabel("Name");
		secondPanel.add(nameLabel, c);
		c.gridx++;
		nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(100, 30));
		secondPanel.add(nameText, c);
		c.gridy++;
		c.gridx--;

		dosageLabel = new JLabel("Number");
		secondPanel.add(dosageLabel, c);
		c.gridx++;
		
		//the number JTextField only accepts integers
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		dosageText = new JFormattedTextField(decimalFormat);
		dosageText.setPreferredSize(new Dimension(100, 30));
		secondPanel.add(dosageText, c);
		c.gridy++;
		c.gridx--;

		addButton = new JButton("Add");
		secondPanel.add(addButton, c);
		c.gridx ++;
		clearButton = new JButton("Clear");
		clearButton .addActionListener(this);
		secondPanel.add(clearButton, c);
		c.gridy ++;
		c.gridx --;

		this.setLocationRelativeTo(this);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == clearButton){
			 nameText.setText("");
			 dosageText.setText("");
		 }
	}
}
