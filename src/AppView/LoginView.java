package AppView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginView {

	private JFrame frame;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblLogin.setBounds(10, 53, 639, 74);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Usu\u00E1rio");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(285, 168, 86, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(285, 255, 86, 19);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Logar");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(203, 373, 258, 37);
		frame.getContentPane().add(btnNewButton);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(203, 199, 258, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 285, 258, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnSignUp = new JButton("Cadastrar");
		btnSignUp.setBounds(560, 477, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userText = textFieldUsername.getText();
				String password = passwordField.getText();
				if (userText.equals("usuario")) {
					System.out.println("foi");
				}
			}
		});
	}
}
