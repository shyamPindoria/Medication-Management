import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddMedicationPage extends JFrame implements ActionListener {
	JLabel nameLabel;
	JLabel dosageLabel;
	JPanel mainPanel;
	JPanel secondPanel;
	JTextField nameText;
	JTextField dosageText;
	JButton addButton;
	JButton clearButton;

	public AddMedicationPage() {
		this.setSize(300, 150);
		this.setTitle("Add Medication");
		mainPanel = new JPanel();
		getContentPane().add(mainPanel);

		secondPanel = new JPanel(new GridBagLayout());
		mainPanel.add(secondPanel);

		GridBagConstraints c = new GridBagConstraints();// Specific layout of
														// the GridBagLayout
		c.gridx = 0;
		c.gridy = 0;

		nameLabel = new JLabel("Name");
		secondPanel.add(nameLabel, c);
		c.gridx++;
		nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(100, 30));
		secondPanel.add(nameText, c);
		c.gridy++;
		c.gridx--;

		dosageLabel = new JLabel("Dosage");
		secondPanel.add(dosageLabel, c);
		c.gridx++;
		dosageText = new JTextField();
		dosageText.setPreferredSize(new Dimension(100, 30));
		secondPanel.add(dosageText, c);
		c.gridy++;
		c.gridx--;

		// create buttons
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		secondPanel.add(addButton, c);
		c.gridx++;
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		secondPanel.add(clearButton, c);
		c.gridy++;
		c.gridx--;

		this.setLocationRelativeTo(this);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			nameText.setText("");
			dosageText.setText("");
		}
		if (e.getSource() == addButton) {
			this.dispose();
			LoadingScreen screen = new LoadingScreen();// shows up the loading												// screen
			screen.setLocationRelativeTo(this);
			Thread sT = new Thread(screen);//create a thread for the loading screen
			sT.start();//start the thread and execute the run method 
		}
	}

}