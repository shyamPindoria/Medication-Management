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


public class SplashScreen extends JDialog  {
	
	public SplashScreen() {
		this.setSize(500, 220);
		this.setLocationRelativeTo(MedicationManagement.main);
		this.setUndecorated(true);
		this.setModal(true);
		
		
		this.getContentPane().add(createBodyPanel(), BorderLayout.CENTER);

		Timer tim = new Timer();
		tim.schedule(new TimerTask(){

			@Override
			public void run() {
				close();
			}
			
		}, 2000);
		
		
	}
	
	private void close(){
		this.dispose();
	}
	
	private JPanel createBodyPanel(){
		JPanel bodyPanel =new JPanel();
		bodyPanel.setBorder(BorderFactory.createLineBorder(MedicationManagement.MENU_BACKGROUND,3));
		bodyPanel.setLayout(new BorderLayout());
		bodyPanel.setBackground(MedicationManagement.MENU_BUTTON_UNSELECTED);
		
		bodyPanel.add(createMessageLable(), BorderLayout.NORTH);
		bodyPanel.add(createAnimationPane(), BorderLayout.CENTER);
		return bodyPanel;
	}
	
	
	
	private JLabel createMessageLable(){
		
		JLabel lblMessage = new JLabel("We are implementing the changes, this may take while");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		return lblMessage;
	}
	
	private JPanel createAnimationPane(){
		AnimPanel anim = new AnimPanel(200,30);
		anim.setBackground(MedicationManagement.MENU_BUTTON_UNSELECTED);
		return anim;
	}
	
	

}
