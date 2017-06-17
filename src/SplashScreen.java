import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingConstants;

/**
 * Splash Screen - The class to create a extended JDialog 
 * Uses AnimPanel as the panel to visulise animation
 * @author Rushi Patel 
 * @authorID PATRY019
 *
 */
public class SplashScreen extends JDialog  {
	
	/**
	 * Constructor for creating splash screen object
	 */
	public SplashScreen() {
		this.setSize(500, 200);
		this.setLocationRelativeTo(MedicationManagement.main);		// Forces the object to always stay in the centre of the parent
		this.setUndecorated(true);	// Removing windows defalut decoration to not to allow user to move it 
		this.setModal(true);	
		
		// Add Panel on the center of the content pane 
		this.getContentPane().add(createBodyPanel(), BorderLayout.CENTER);

		
		// Creates the time event in which the close method is called after 2 seconds which will then close the splash screen
		Timer tim = new Timer();
		tim.schedule(new TimerTask(){

			@Override
			public void run() {
				close();	//call to the close method
			}		
		}, 2000);
		
	}
	
	/**
	 * Closes the current Dialog
	 */
	private void close(){
		this.dispose();
	}
	
	/**
	 * Creates panel to be added on the gcontentpane
	 * @return bodyPanel - JPanel
	 */
	private JPanel createBodyPanel(){
		JPanel bodyPanel =new JPanel();
		
		bodyPanel.setLayout(new BorderLayout());
		bodyPanel.setBackground(MedicationManagement.MENU_BUTTON_UNSELECTED);
		
		bodyPanel.add(createMessageLable(), BorderLayout.NORTH);
		bodyPanel.add(createAnimationPane(), BorderLayout.CENTER);
		return bodyPanel;
	}
	
	
	/**
	 * Creates label with changed appereance
	 * @return lblMessage - JLabel
	 */
	private JLabel createMessageLable(){
		JLabel lblMessage = new JLabel("We are implementing the changes, this may take while");
		lblMessage.setBorder(BorderFactory.createLineBorder(MedicationManagement.MENU_BACKGROUND,2));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		return lblMessage;
	}
	
	/**
	 * Creates panel to be added in the center 
	 * Instead of JPanel it creates object from anim which is the extended panel of JPanel
	 * and contains Gear icon rotaion animation
	 * @return anim - AnimPanel
	 */
	private JPanel createAnimationPane(){
		AnimPanel anim = new AnimPanel(200,30);
		anim.setBorder(BorderFactory.createLineBorder(MedicationManagement.MENU_BACKGROUND,1));
		anim.setBackground(MedicationManagement.MENU_BUTTON_UNSELECTED);
		return anim;
	}
	
	

}
