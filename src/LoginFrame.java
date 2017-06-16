import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

public class LoginFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passwordTxt;

	/**
	 * Create the login frame
	 */
	public LoginFrame() {
		setMinimumSize(new Dimension(740, 485)); //Set the size of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		//Login label
		JLabel lblLogInTo = new JLabel("Log In");
		lblLogInTo.setFont(MedicationManagement.HEADER_FONT);
		lblLogInTo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLogInTo, BorderLayout.NORTH);
		
		//Add login area
		contentPane.add(createLoginArea(), BorderLayout.CENTER);
		
		//Add sign up area
		contentPane.add(createSignUpArea(), BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

	/**
	 * Populate login area
	 * @return login area panel
	 */
	private JPanel createLoginArea() {
		
		//Create a panel with a grid bag layout
		JPanel loginArea = new JPanel();
		GridBagLayout gbl_loginArea = new GridBagLayout();
		loginArea.setLayout(gbl_loginArea);
		
		//User name label
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		loginArea.add(lblUsername, gbc_lblUsername);
		
		//User name text field
		usernameTxt = new JTextField();
		GridBagConstraints gbc_usernameTxt = new GridBagConstraints();
		gbc_usernameTxt.insets = new Insets(0, 0, 5, 5);
		gbc_usernameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_usernameTxt.gridx = 1;
		gbc_usernameTxt.gridy = 0;
		loginArea.add(usernameTxt, gbc_usernameTxt);
		usernameTxt.setColumns(10);
		
		//Password label
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		loginArea.add(lblPassword, gbc_lblPassword);
		
		//Password text field
		passwordTxt = new JPasswordField();
		GridBagConstraints gbc_passwordTxt = new GridBagConstraints();
		gbc_passwordTxt.insets = new Insets(0, 0, 5, 5);
		gbc_passwordTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTxt.gridx = 1;
		gbc_passwordTxt.gridy = 1;
		loginArea.add(passwordTxt, gbc_passwordTxt);
		passwordTxt.setColumns(10);
		
		//Create login button
		JButton btnLogin = new JButton("Login");
		btnLogin.setIconTextGap(6);
		btnLogin.setPreferredSize(new Dimension(220, 30)); //Button size
		btnLogin.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridwidth = 2;
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 2;
		Image goIcon = new ImageIcon(this.getClass().getResource("go.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnLogin.setIcon(new ImageIcon(goIcon)); //Add an image to the button
		btnLogin.setHorizontalTextPosition(SwingConstants.LEFT); //Set the image to the right of the text
		btnLogin.addActionListener(this);
		btnLogin.setActionCommand("Login");
		loginArea.add(btnLogin, gbc_btnLogin);
		
		//Create Help button
		JButton btnHelp = new JButton("Help");
		btnHelp.setHorizontalTextPosition(SwingConstants.LEFT);
		btnHelp.setPreferredSize(new Dimension(75, 30));
		Image helpIcon = new ImageIcon(this.getClass().getResource("help.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnHelp.setIcon(new ImageIcon(helpIcon));
		btnHelp.setFont(MedicationManagement.BODY_FONT);
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.anchor = GridBagConstraints.WEST;
		gbc_btnHelp.fill = GridBagConstraints.VERTICAL;
		gbc_btnHelp.gridx = 2;
		gbc_btnHelp.gridy = 2;
		btnHelp.addActionListener(this);
		btnHelp.setActionCommand("Help");
		loginArea.add(btnHelp, gbc_btnHelp);
		
		return loginArea;
	}
	
	/**
	 * Create sign up area
	 * @return sign up area panel
	 */
	private JPanel createSignUpArea() {
		
		//Create a panel with box layout
		JPanel signUpArea = new JPanel();
		signUpArea.setLayout(new BoxLayout(signUpArea, BoxLayout.Y_AXIS));
		
		//No account label
		JLabel lblDontHaveAn = new JLabel("Don't have an account?");
		lblDontHaveAn.setFont(MedicationManagement.BODY_FONT);
		lblDontHaveAn.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblDontHaveAn.setHorizontalAlignment(SwingConstants.CENTER);
		signUpArea.add(lblDontHaveAn);
		
		//Sign up button
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(MedicationManagement.BODY_FONT);
		btnSignUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSignUp.addActionListener(this);
		btnSignUp.setActionCommand("Sign Up");
		signUpArea.add(btnSignUp);
		
		return signUpArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//If sign up button was pressed
		if (e.getActionCommand().equals("Sign Up")) {
			//Display the username and password
			JOptionPane.showMessageDialog(this, "Your username is: usr00001\nYour password is abc00001", "Sign Up Successful", JOptionPane.PLAIN_MESSAGE);
		}
		//If login button was pressed
		else if (e.getActionCommand().equals("Login")) {
			//Correct password
			char[] password = {'a', 'b', 'c', '0', '0', '0', '0', '1'};
			//Check if the username and password are correct
			if (usernameTxt.getText().equals("usr00001") && Arrays.equals(passwordTxt.getPassword(), password)) {
				Point mainFrameLoc = this.getLocation(); //Get location of current frame
				this.dispose(); //Close current frame
				new MainFrame().setLocation(mainFrameLoc); //Open main frame
			} else {
				//Display error message if username or password is incorrect
				JOptionPane.showMessageDialog(this, "The username or password you entered is incorrect.", "Unable to login", JOptionPane.ERROR_MESSAGE);
			}

		}
		//If help button is clicked
		else if (e.getActionCommand().equals("Help")) {
			//Display username and password
			//For testing purposes only
			JOptionPane.showMessageDialog(this, "Your username is: usr00001\nYour password is abc00001", "Need help logging in?", JOptionPane.PLAIN_MESSAGE);
		}
		
	}
	
}
