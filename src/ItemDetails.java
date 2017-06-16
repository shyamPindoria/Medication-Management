import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ItemDetails extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5025728325793483467L;
	public static enum Medicine{
		Panadol,
		Sambucol,
		Glucophage,
		Hydrocodone,
		Simvastatin;
	};
	JLabel title, indication, action, dose, sideEffects,
			indicationDes, actionDes, doseDes, sideEffectsDes;
	JButton collapse;
	public ItemDetails(Medicine name){
		this.SetupPanelComponentBases();
		switch (name){
		case Panadol:
			this.CreatePanadolDetails();break;
		case Sambucol:
			this.CreateSambucolDetails();break;
			default:
				this.CreateNoDetailAppearance(name);break;
		}

		this.setVisible(true);
	}
	
	private void SetupPanelComponentBases(){
		// Set up the frame layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		// Generate fonts
		Font titleFont = new Font("Arial", Font.BOLD, 18),
				aspectFont = new Font("Arial", Font.BOLD, 14),
				descriptionFont = new Font("Arial", Font.PLAIN, 12);
		
		// Set up title
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 0, 0, 0);
		this.title = new JLabel();
		this.title.setFont(titleFont);
		this.add(title, c);
		
		// Set up indication
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(20, 10, 10, 0);
		this.indication = new JLabel("Indication");
		this.indication.setFont(aspectFont);
		this.add(indication, c);
		
		// Set up indication description
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(0, 20, 20, 0);
		this.indicationDes = new JLabel();
		this.indicationDes.setFont(descriptionFont);
		this.add(this.indicationDes, c);
		
		// Set up action
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(0, 10, 10, 0);
		this.action = new JLabel("Action");
		this.action.setFont(aspectFont);
		this.add(action, c);
		
		// Set up action description
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(0, 20, 20, 0);
		this.actionDes = new JLabel();
		this.actionDes.setFont(descriptionFont);
		this.add(actionDes, c);
		
		// Set up dose
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(0, 10, 10, 0);
		this.dose = new JLabel("Doses");
		this.dose.setFont(aspectFont);
		this.add(dose, c);
		
		// Set up dose description
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(0, 20, 20, 0);
		this.doseDes = new JLabel();
		this.doseDes.setFont(descriptionFont);
		this.add(doseDes, c);
		
		// Set up side effects
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 7;
		c.insets = new Insets(0, 10, 10, 0);
		this.sideEffects = new JLabel("Side Effects");
		this.sideEffects.setFont(aspectFont);
		this.add(sideEffects, c);
		
		// Set up side effects description
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 8;
		c.insets = new Insets(0, 20, 20, 0);
		this.sideEffectsDes = new JLabel();
		this.sideEffectsDes.setFont(descriptionFont);
		this.add(sideEffectsDes, c);
		
		// Set up button
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 9;
		c.insets = new Insets(0, 10, 10, 0);
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
	private void CreatePanadolDetails(){
		// Set title
		this.title.setText("Panadol");
		
		// Set indication description
		this.indicationDes.setText("<html>Panadol contains paracetamol and is used for fast, "
				+ "effective, temporary relief of pain and discomfort associated with:<br>"
				+ "- Headache<br>"
				+ "- Period pain<br>"
				+ "- Cold & flu<br>"
				+ "- Tension headache<br>"
				+ "- Backache<br>"
				+ "- Muscular aches<br>"
				+ "- Arthritis/osteoarthritis<br>"
				+ "- Toothache<br>"
				+ "- Migraine<br>"
				+ "- Reduces fever</html>");
		
		// Set action description
		this.actionDes.setText("<html>Panadol is a medicine exerts analgesic (reduces pain) "
				+ "and antipyretic (reduces fever) activity, "
				+ "but does not possess anti-inflammatory activity</html>");
		
		// Set dose description
		this.doseDes.setText("<html>- Adults, Children over 12 years: One to two tablets every four hours "
				+ "(maxiumum of eight tablets in 24 hours).<br>"
				+ "- Children 7-12 years: One tablet every four hours (maxiumum of four tablets in 24 hours), "
				+ "taken with water or other fluid.</html>");
		
		// Set side effects description
		this.sideEffectsDes.setText("<html>Side effects are rare. You may experience nausea, indigestion, "
				+ "allergic reactions or blood disorders.</html>");
	}
	
	private void CreateSambucolDetails(){
		// Set title
		this.title.setText("Sambucol");
		
		// Set indication description
		this.indicationDes.setText("<html>Sambucol helps reduce the severity of cold and flu symptoms including:<br>"
				+ "- Runny nose<br>"
				+ "- Cough<br>"
				+ "- Sneezing<br>"
				+ "- Congestion<br>"
				+ "- Sore throat<br>"
				+ "- Fatique</html>");
		
		// Set action description
		this.actionDes.setText("<html>Reduces the length of the cold by at least 3 days, so that "
				+ "you can get back to doing the things you love sooner</html>");
		
		// Set dose description
		this.doseDes.setText("<html>- Adults: 15mL (1 tablespoon) 4 times daily<br>"
				+ "- Children 5 - 12 years: 15mL (1 tablespoon) 2 times daily<br>"
				+ "- Children 2 - 4 years: 7.5 - 15mL (1/2 - 1 tablespoon) per day<br>"
				+ "Best taken at first sign of cold and flu within 48hrs of the onset of symptoms or as "
				+ "recommended by your healthcare practitioner.</html>");
		
		// Set side effects description
		this.sideEffectsDes.setText("<html>There is no side effect.</html>");
	}
	
	private void CreateNoDetailAppearance(Medicine name){
		// Set title
		this.title.setText(name.toString());
		
		// Set indication description
		this.indicationDes.setText("No details shown");
		
		// Set action description
		this.actionDes.setText("No details shown");
		
		// Set dose description
		this.doseDes.setText("No details shown");
		
		// Set side effects description
		this.sideEffectsDes.setText("No details shown");
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		if(arg.getActionCommand().equals("Collapse"))
			this.setVisible(false);
		
	}
}
