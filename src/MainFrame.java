import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.CardLayout;
import javax.swing.border.EmptyBorder;

/**
 * Main Frame
 * @author Shyam Pindoria - pinsy004
 * @author Rushi Patel - patry019
 *
 */
public class MainFrame extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	
	private MenuPanel panelMenu;
	private JPanel panelBody;
	
	private CardLayout cardLayout;
	
	private MedicationPanel panelMedication;
	private HistoryPanel panelHistory;
	private ContactsPanel panelContacts;
	private UploadPanel panelUpload;
	private HelpPanel panelHelp;
	private SettingsPanel panelSettings;
	private NotificationPanel panelNotification;
	
	public static Dimension SIZE;
	public static Point LOCATION;
	
	/**
	 * Create the frame.
	 */
	public MainFrame(Point location) {
		
		setMinimumSize(new Dimension(1080, 740));
		SIZE = this.getSize();
		setLocation(location);
		LOCATION = location;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		panelMenu = new MenuPanel();
		panelMenu.setPreferredSize(new Dimension(150, 235));
		contentPane.add(panelMenu, BorderLayout.WEST);
		
		panelBody = createBodyPanel();
		contentPane.add(panelBody, BorderLayout.CENTER);
		
		panelMenu.addMenuButtonListener(this);
		
		this.setVisible(true);
	}
	
	/**
	 * Add panels to the main body panel
	 * @return
	 */
	private JPanel createBodyPanel() {
		
		panelBody = new JPanel();
		cardLayout = new CardLayout();
		panelBody.setBorder(new EmptyBorder(0, 12, 0, 0));
		panelBody.setLayout(cardLayout);
		
		this.panelMedication = new MedicationPanel();
		panelBody.add(this.panelMedication, "Medication");
		
		this.panelHistory = new HistoryPanel();
		panelBody.add(this.panelHistory, "History");
		
		this.panelContacts = new ContactsPanel();
		panelBody.add(this.panelContacts, "Contacts");
		
		this.panelUpload = new UploadPanel();
		panelBody.add(this.panelUpload, "Upload");
		
		this.panelHelp = new HelpPanel();
		panelBody.add(this.panelHelp, "Help");
		
		this.panelSettings = new SettingsPanel();
		panelBody.add(this.panelSettings, "Settings");
		
		this.panelNotification = new NotificationPanel();
		panelBody.add(this.panelNotification, "Notification");
		
		return panelBody;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Check if button pressed was log out button
		if(e.getSource().equals(panelMenu.btnLogOut)) {
			Point mainFrameLoc = this.getLocation(); //Get location of current frame
			new LoginFrame(mainFrameLoc); //Open login frame
			this.dispose(); //Close current frame
		} else {
			cardLayout.show(panelBody, ((JButton) e.getSource()).getText()); //Change the panel according to the button pressed
		}
		//Change the color of the selected button
		this.panelMenu.changeSelected((JButton) e.getSource());
		
	}

}