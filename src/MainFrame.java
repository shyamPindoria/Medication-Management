import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;
	
	private MenuPanel panelMenu;
	private JPanel panelBody;
	
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
		
		this.setVisible(true);
	}
	
	private JPanel createBodyPanel() {
		
		panelBody = new JPanel();
		panelBody.setBorder(new EmptyBorder(0, 12, 0, 0));
		panelBody.setLayout(new CardLayout(0, 0));
		
		this.panelMedication = new MedicationPanel();
		panelBody.add(this.panelMedication);
		
		this.panelHistory = new HistoryPanel();
		panelBody.add(this.panelHistory);
		
		this.panelContacts = new ContactsPanel();
		panelBody.add(this.panelContacts);
		
		this.panelUpload = new UploadPanel();
		panelBody.add(this.panelUpload);
		
		this.panelHelp = new HelpPanel();
		panelBody.add(this.panelHelp);
		
		this.panelSettings = new SettingsPanel();
		panelBody.add(this.panelSettings);
		
		return panelBody;
	}
}