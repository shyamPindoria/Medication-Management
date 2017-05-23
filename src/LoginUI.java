import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Component;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JTextField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		setMinimumSize(new Dimension(740, 485));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLogInTo = new JLabel("Log In");
		lblLogInTo.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblLogInTo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLogInTo, BorderLayout.NORTH);
		
		JPanel signUpArea = new JPanel();
		contentPane.add(signUpArea, BorderLayout.SOUTH);
		signUpArea.setLayout(new BoxLayout(signUpArea, BoxLayout.Y_AXIS));
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account?");
		lblDontHaveAn.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblDontHaveAn.setHorizontalAlignment(SwingConstants.CENTER);
		signUpArea.add(lblDontHaveAn);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		signUpArea.add(btnSignUp);
		
		JPanel loginArea = new JPanel();
		contentPane.add(loginArea, BorderLayout.CENTER);
		GridBagLayout gbl_loginArea = new GridBagLayout();
		gbl_loginArea.columnWidths = new int[]{0, 0, 0, 0};
		gbl_loginArea.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_loginArea.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0 };
		gbl_loginArea.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0 };
		loginArea.setLayout(gbl_loginArea);
		
		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 1;
		loginArea.add(lblUsername, gbc_lblUsername);
		
		usernameTxt = new JTextField();
		GridBagConstraints gbc_usernameTxt = new GridBagConstraints();
		gbc_usernameTxt.insets = new Insets(0, 0, 5, 0);
		gbc_usernameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_usernameTxt.gridx = 2;
		gbc_usernameTxt.gridy = 1;
		loginArea.add(usernameTxt, gbc_usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 2;
		loginArea.add(lblPassword, gbc_lblPassword);
		
		passwordTxt = new JTextField();
		GridBagConstraints gbc_passwordTxt = new GridBagConstraints();
		gbc_passwordTxt.insets = new Insets(0, 0, 5, 0);
		gbc_passwordTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTxt.gridx = 2;
		gbc_passwordTxt.gridy = 2;
		loginArea.add(passwordTxt, gbc_passwordTxt);
		passwordTxt.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.gridwidth = 2;
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 3;
		Image go = new ImageIcon(this.getClass().getResource("go.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		btnLogin.setIcon(new ImageIcon(go));
		btnLogin.setHorizontalTextPosition(SwingConstants.LEFT);
		loginArea.add(btnLogin, gbc_btnLogin);
	}

}
