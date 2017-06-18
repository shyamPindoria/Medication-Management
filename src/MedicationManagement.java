import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JOptionPane;

/**
 * Main Class to launch the program
 * @author Shyam Pindoria - pinsy004
 * @author Rushi Patel - patry019
 */
public class MedicationManagement{
	
	protected static Font BODY_FONT = new Font("Arial", Font.PLAIN, 18);
	protected static Font HEADER_FONT = new Font("Arial", Font.PLAIN, 20);
	protected static Color MENU_BUTTON_UNSELECTED = new Color(0, 255, 220);
	protected static Color MENU_BUTTON_SELECTED =  new Color(238, 238, 238);
	protected static Color MENU_BUTTON_HOVER = new Color(225, 255, 255);
	protected static Color MENU_BACKGROUND = new Color(37, 48, 49);
	protected static String THEME = "Green";
	static MainFrame main;
	
	public static void main(String[] args) {
		
		LoginFrame login = new LoginFrame(new Point(50,50));
		//For testing purposes the username and password will be displayed
		JOptionPane.showMessageDialog(login, "Your username is: usr1\nYour password is abc1", "Need help logging in?", JOptionPane.PLAIN_MESSAGE);
		
		
	}

	/**
	 * Relaunches the app for settings to take place
	 */
	public static void refreshUI() {
		// Create animation by displaying splashScreen
		new SplashScreen().setVisible(true);
		// create new mainFrame to refresh the changes
		MainFrame temp = new MainFrame(main.getLocation());
		
		// Close previous and set newly created main frame as main
		main.dispose();
		main = temp;
	}

	/**
	 * Changes the colors of the menu bar
	 * @param theme color to change to
	 */
	public static void setTheme(String theme) {
		//Green
		if (theme.equals("Green")) {
			MENU_BUTTON_UNSELECTED = new Color(0, 255, 220);
			MENU_BUTTON_HOVER = new Color(225, 255, 255);
			MENU_BACKGROUND = new Color(37, 48, 49);
		//Red
		} else if (theme.equals("Red")) {
			MENU_BUTTON_UNSELECTED = new Color(200,15, 55);
			MENU_BUTTON_HOVER = new Color(160,15, 55);
			MENU_BACKGROUND = new Color(5, 25, 65);
		//Blue
		} else if (theme.equals("Blue")) {
			MENU_BUTTON_UNSELECTED = new Color(0,130, 255);
			MENU_BUTTON_HOVER = new Color(0, 100, 195);
			MENU_BACKGROUND = new Color(37, 48, 49);
		}
		THEME = theme;
	}
}
