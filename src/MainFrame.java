import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.CardLayout;
import javax.swing.border.EmptyBorder;

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
	
	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		setMinimumSize(new Dimension(740, 485));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 485);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		panelMenu = new MenuPanel();
		contentPane.add(panelMenu, BorderLayout.WEST);
		
		panelBody = createBodyPanel();
		contentPane.add(panelBody, BorderLayout.CENTER);
		
		panelMenu.addMenuButtonListener(this);
		
		this.setVisible(true);
	}
	
	private JPanel createBodyPanel() {
		
		panelBody = new JPanel();
		cardLayout = new CardLayout();
		panelBody.setBorder(new EmptyBorder(0, 12, 0, 0));
		panelBody.setLayout(cardLayout);
		
		this.panelMedication = new MedicationPanel();
		panelBody.add(this.panelMedication, "Current");
		
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
		
		return panelBody;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(panelMenu.btnCurrent)) {
			cardLayout.show(panelBody, "Current");
		}
		else if(e.getSource().equals(panelMenu.btnHistory)) {
			cardLayout.show(panelBody, "History");
		}
		else if(e.getSource().equals(panelMenu.btnContacts)) {
			cardLayout.show(panelBody, "Contacts");
		}
		else if(e.getSource().equals(panelMenu.btnUpload)) {
			cardLayout.show(panelBody, "Upload");
		}
		else if(e.getSource().equals(panelMenu.btnHelp)) {
			cardLayout.show(panelBody, "Help");
		}
		else if(e.getSource().equals(panelMenu.btnSettings)) {
			cardLayout.show(panelBody, "Settings");
		}
		else if(e.getSource().equals(panelMenu.btnLogOut)) {
			Point mainFrameLoc = this.getLocation();
			this.dispose();
			new LoginFrame().setLocation(mainFrameLoc);
		}
		
	}
}