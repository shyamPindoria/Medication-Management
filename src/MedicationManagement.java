import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MedicationManagement{

	protected static Font BODY_FONT = new Font("Arial", Font.PLAIN, 18);
	protected static Font HEADER_FONT = new Font("Arial", Font.PLAIN, 20);
	protected static Color MENU_BUTTON_UNSELECTED = new Color(0, 255, 220);
	protected static Color MENU_BUTTON_SELECTED =  new Color(238, 238, 238);
	protected static Color MENU_BUTTON_HOVER = new Color(225, 255, 255);
	protected static Color MENU_BACKGROUND = new Color(37, 48, 49);
	
	static MainFrame main;
	
	public static void main(String[] args) {
		
		//LoginFrame login = new LoginFrame(new Point(50,50));
		//For testing purposes the username and password will be displayed
		//JOptionPane.showMessageDialog(login, "Your username is: usr1\nYour password is abc1", "Need help logging in?", JOptionPane.PLAIN_MESSAGE);
		
		main = new MainFrame(new Point(50,50));
		
	}

	public static void refreshUI() {
		
		new SplashScreen().setVisible(true);
		MainFrame temp = new MainFrame(main.getLocation());
		main.dispose();
		main = temp;
	
	
	
		
	}

}
