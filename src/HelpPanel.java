import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextPane;

public class HelpPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HelpPanel() {
		setSize(new Dimension(640, 485));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHelp, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.03);
		add(splitPane, BorderLayout.CENTER);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Medication Management") {
				{
					DefaultMutableTreeNode uploadNode;
					add(new DefaultMutableTreeNode("Welcome"));
					add(new DefaultMutableTreeNode("Current Medication"));
					add(new DefaultMutableTreeNode("History"));
					uploadNode = new DefaultMutableTreeNode("Upload");
						uploadNode.add(new DefaultMutableTreeNode("Email"));
						uploadNode.add(new DefaultMutableTreeNode("Phone"));
						uploadNode.add(new DefaultMutableTreeNode("Bluetooth"));
						uploadNode.add(new DefaultMutableTreeNode("USB"));
					add(uploadNode);
					add(new DefaultMutableTreeNode("About"));
				}
			}
		));
		splitPane.setLeftComponent(tree);
		
		JPanel panelHelpBody = new JPanel();
		splitPane.setRightComponent(panelHelpBody);
		panelHelpBody.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPaneWelcome = new JScrollPane();
		panelHelpBody.add(scrollPaneWelcome, "name_6387357734641");
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneWelcome.setColumnHeaderView(lblWelcome);
		
		JScrollPane scrollPaneCurrent = new JScrollPane();
		panelHelpBody.add(scrollPaneCurrent, "name_6398706976835");
		
		JLabel lblCurrentMedication = new JLabel("Current Medication");
		lblCurrentMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentMedication.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		scrollPaneCurrent.setColumnHeaderView(lblCurrentMedication);
		
		JScrollPane scrollPaneHistory = new JScrollPane();
		panelHelpBody.add(scrollPaneHistory, "name_6416680478885");
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistory.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		scrollPaneHistory.setColumnHeaderView(lblHistory);
		
		JScrollPane scrollPaneEmail = new JScrollPane();
		panelHelpBody.add(scrollPaneEmail, "name_6430865141985");
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneEmail.setColumnHeaderView(lblEmail);
		
		JScrollPane scrollPanePhone = new JScrollPane();
		panelHelpBody.add(scrollPanePhone, "name_6439865541132");
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPanePhone.setColumnHeaderView(lblPhone);
		
		JScrollPane scrollPaneBluetooth = new JScrollPane();
		panelHelpBody.add(scrollPaneBluetooth, "name_6570452395731");
		
		JLabel lblBluetooth = new JLabel("Bluetooth");
		lblBluetooth.setHorizontalAlignment(SwingConstants.CENTER);
		lblBluetooth.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		scrollPaneBluetooth.setColumnHeaderView(lblBluetooth);
		
		JScrollPane scrollPaneUSB = new JScrollPane();
		panelHelpBody.add(scrollPaneUSB, "name_6791803485217");
		
		JLabel lblUsbConnection = new JLabel("USB Connection");
		lblUsbConnection.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblUsbConnection.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneUSB.setColumnHeaderView(lblUsbConnection);
		
		JScrollPane scrollPaneAbout = new JScrollPane();
		panelHelpBody.add(scrollPaneAbout, "name_6353093641342");
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneAbout.setColumnHeaderView(lblAbout);

	}
}
