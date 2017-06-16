import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ContactDetails extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6701253318956575523L;
	public static enum Name{Smith, William, Jane, Isaac, Robert;};
	JLabel panelTitle, name, nameCont, title, titleCont, workplace, workplaceCont, email, emailCont, phone, phoneCont;
	JButton collapse;
	
	public ContactDetails(Name name, String number){
		this.SetupContactDetailsPage();
		switch(name){
		case Smith:
			this.CreateSmithContacts(number);break;
		case William:
			this.CreateWilliamContacts(number);break;
		case Jane:
			this.CreateJaneContacts(number);break;
		case Isaac:
			this.CreateIsaacContacts(number);break;
		case Robert:
			this.CreateRobertContacts(number);break;
		}
		this.setVisible(true);
	}
	
	private void SetupContactDetailsPage(){
		// Set up the frame layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				
		// Generate fonts
		Font titleFont = new Font("Arial", Font.BOLD, 18),
				aspectFont = new Font("Arial", Font.BOLD, 14),
				descriptionFont = new Font("Arial", Font.PLAIN, 14);
		
		// Set panel title
		this.panelTitle = new JLabel("Contact Details");
		this.panelTitle.setFont(titleFont);
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.insets = new Insets(10, 0, 0, 0);
		this.add(this.panelTitle, c);
		
		// Set Name label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(20, 10, 10, 30);
		this.name = new JLabel("Name:");
		this.name.setFont(aspectFont);
		this.add(this.name, c);
		
		// Set Name Contain label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(20, 10, 10, 0);
		this.nameCont = new JLabel();
		this.nameCont.setFont(descriptionFont);
		this.add(this.nameCont, c);
		
		// Set Title label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(20, 10, 10, 30);
		this.title = new JLabel("Title");
		this.title.setFont(aspectFont);
		this.add(title, c);
		
		// Set Title Content label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(20, 10, 10, 0);
		this.titleCont = new JLabel();
		this.titleCont.setFont(descriptionFont);
		this.add(titleCont, c);
		
		// Set Workplace label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(20, 10, 10, 30);
		this.workplace = new JLabel("Workplace:");
		this.workplace.setFont(aspectFont);
		this.add(workplace, c);
		
		// Set Workplace Content label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(20, 10, 10, 0);
		this.workplaceCont = new JLabel();
		this.workplaceCont.setFont(descriptionFont);
		this.add(workplaceCont, c);
		
		// Set Email label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(20, 10, 10, 30);
		this.email = new JLabel("Email:");
		this.email.setFont(aspectFont);
		this.add(email, c);
		
		// Set Email Content label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(20, 10, 10, 0);
		this.emailCont = new JLabel();
		this.emailCont.setFont(descriptionFont);
		this.add(emailCont, c);
		
		// Set Phone number label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(20, 10, 10, 30);
		this.phone = new JLabel("Phone number:");
		this.phone.setFont(aspectFont);
		this.add(phone, c);
		
		// Set Phone number content label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(20, 10, 10, 0);
		this.phoneCont = new JLabel();
		this.phoneCont.setFont(descriptionFont);
		this.add(phoneCont, c);
		
		// Set up button
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 9;
		c.insets = new Insets(0, 10, 10, 0);
		c.gridwidth = 2;
		this.collapse = new JButton();
		Image image = new ImageIcon(this.getClass().getResource("collapse.png")).getImage().getScaledInstance(15, 5, Image.SCALE_SMOOTH);
		this.collapse.setIcon(new ImageIcon(image));
		this.collapse.setContentAreaFilled(false);
		this.collapse.setBorder(null);
		this.collapse.setText("Collapse Contents");
		this.collapse.setBorderPainted(false);
		this.collapse.setActionCommand("Collapse");
		this.collapse.addActionListener(this);
		this.add(collapse, c);
	}
	
	private void CreateSmithContacts(String number){
		this.nameCont.setText("Smith McIntyre");
		this.titleCont.setText("Addiction psychiatrist");
		this.workplaceCont.setText("Royal Adelaide Hospital");
		this.emailCont.setText("smith@gmail.com");
		this.phoneCont.setText(number);
	}
	
	private void CreateWilliamContacts(String number){
		this.nameCont.setText("William Bailey");
		this.titleCont.setText("Adolescent medicine specialist");
		this.workplaceCont.setText("Royal Adelaide Hospital");
		this.emailCont.setText("william@gmail.com");
		this.phoneCont.setText(number);
	}
	
	private void CreateJaneContacts(String number){
		this.nameCont.setText("Jane Robertson");
		this.titleCont.setText("Nephrologist");
		this.workplaceCont.setText("Royal Adelaide Hospital");
		this.emailCont.setText("jane@gmail.com");
		this.phoneCont.setText(number);
	}
	
	private void CreateIsaacContacts(String number){
		this.nameCont.setText("Isaac Hamilton");
		this.titleCont.setText("Neurologist");
		this.workplaceCont.setText("Royal Adelaide Hospital");
		this.emailCont.setText("isaac@gmail.com");
		this.phoneCont.setText(number);
	}
	
	private void CreateRobertContacts(String number){
		this.nameCont.setText("Robert West");
		this.titleCont.setText("Pediatrician");
		this.workplaceCont.setText("Royal Adelaide Hospital");
		this.emailCont.setText("robert@gmail.com");
		this.phoneCont.setText(number);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Collapse"))
			this.setVisible(false);
	}
}
