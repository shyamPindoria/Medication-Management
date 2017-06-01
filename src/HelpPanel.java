import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.CardLayout;

public class HelpPanel extends JPanel {

	public HelpPanel() {
		//panel size
		setSize(new Dimension(640, 485));
		//Add a border layout to the panel
		setLayout(new BorderLayout());
		
		//Create the panel label
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(MedicationManagement.HEADER_FONT); //Set the font
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER); //Align center
		add(lblHelp, BorderLayout.NORTH); //Add the label to the north region
		
		//Create and add a split pane in the center region
		add(createSplitPane(), BorderLayout.CENTER);

	}
	
	/**
	 * Create a split pane to display the tree and help body panel in the right component
	 * @return Populated split panel
	 */
	private JSplitPane createSplitPane() {
	
		JSplitPane splitPane = new JSplitPane();
		//Place where to split from
		splitPane.setResizeWeight(0.03);
		
		//Set tree to left component
		splitPane.setLeftComponent(createTree());
		
		//Set tree to right component
		splitPane.setRightComponent(createHelpBodyPanel());
		
		return splitPane;
	}
	
	/**
	 * Create a tree to allow the user to navigate to different sections in the help panel
	 * @return Tree populated with the nodes
	 */
	private JTree createTree() {
		
		JTree tree = new JTree();
		//Populate the tree with nodes
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Medication Management") {
				{
					DefaultMutableTreeNode uploadNode;
					add(new DefaultMutableTreeNode("Welcome"));
					add(new DefaultMutableTreeNode("Current Medication"));
					add(new DefaultMutableTreeNode("History"));
					
					//Upload sub root node
					uploadNode = new DefaultMutableTreeNode("Upload");
					uploadNode.add(new DefaultMutableTreeNode("Email")); 
					uploadNode.add(new DefaultMutableTreeNode("Phone"));
					uploadNode.add(new DefaultMutableTreeNode("Bluetooth"));
					uploadNode.add(new DefaultMutableTreeNode("USB"));
					//Add the upload sub root the the root
					add(uploadNode);
					
					add(new DefaultMutableTreeNode("About"));
				}
			}
		));
		
		return tree;
	}

	/**
	 * Create the right section of the split pane
	 * @return Panel with card layout containing all the help sections
	 */
	private JPanel createHelpBodyPanel() {
		
		JPanel panelHelpBody = new JPanel();
		//Add a card layout to the panel
		panelHelpBody.setLayout(new CardLayout());
		
		//Welcome scroll pane
		JScrollPane scrollPaneWelcome = new JScrollPane();
		panelHelpBody.add(scrollPaneWelcome); //Add the scroll pane to the body panel
		JLabel lblWelcome = new JLabel("Welcome"); //Header label for the scroll panel
		lblWelcome.setFont(MedicationManagement.BODY_FONT); //Font for the label
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER); //Align the label to the center
		scrollPaneWelcome.setColumnHeaderView(lblWelcome); //Add the label to the header section of the scroll pane
		
		//Current medic scroll pane
		JScrollPane scrollPaneCurrent = new JScrollPane();
		panelHelpBody.add(scrollPaneCurrent);
		JLabel lblCurrentMedication = new JLabel("Current Medication");
		lblCurrentMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentMedication.setFont(MedicationManagement.BODY_FONT);
		scrollPaneCurrent.setColumnHeaderView(lblCurrentMedication);
		
		//History scroll pane
		JScrollPane scrollPaneHistory = new JScrollPane();
		panelHelpBody.add(scrollPaneHistory);		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistory.setFont(MedicationManagement.BODY_FONT);
		scrollPaneHistory.setColumnHeaderView(lblHistory);
		
		//Email scroll pane
		JScrollPane scrollPaneEmail = new JScrollPane();
		panelHelpBody.add(scrollPaneEmail);
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(MedicationManagement.BODY_FONT);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneEmail.setColumnHeaderView(lblEmail);
		
		//Phone scroll pane
		JScrollPane scrollPanePhone = new JScrollPane();
		panelHelpBody.add(scrollPanePhone);
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(MedicationManagement.BODY_FONT);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPanePhone.setColumnHeaderView(lblPhone);
		
		//Blue tooth scroll pane
		JScrollPane scrollPaneBluetooth = new JScrollPane();
		panelHelpBody.add(scrollPaneBluetooth);
		JLabel lblBluetooth = new JLabel("Bluetooth");
		lblBluetooth.setHorizontalAlignment(SwingConstants.CENTER);
		lblBluetooth.setFont(MedicationManagement.BODY_FONT);
		scrollPaneBluetooth.setColumnHeaderView(lblBluetooth);
		
		//USB scroll pane
		JScrollPane scrollPaneUSB = new JScrollPane();
		panelHelpBody.add(scrollPaneUSB);
		JLabel lblUsbConnection = new JLabel("USB Connection");
		lblUsbConnection.setFont(MedicationManagement.BODY_FONT);
		lblUsbConnection.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneUSB.setColumnHeaderView(lblUsbConnection);
		
		//About scroll pane
		JScrollPane scrollPaneAbout = new JScrollPane();
		panelHelpBody.add(scrollPaneAbout);
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(MedicationManagement.BODY_FONT);
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneAbout.setColumnHeaderView(lblAbout);
		
		return panelHelpBody;
		
	}

}