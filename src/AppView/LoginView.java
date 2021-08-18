package AppView;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
		
		String userType;

		frame = new JFrame();
		frame.setBounds(100, 100, 675, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblLogin.setBounds(10, 32, 639, 74);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Usu\u00E1rio");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(284, 137, 86, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(284, 212, 86, 19);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Logar");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(202, 374, 258, 45);
		frame.getContentPane().add(btnNewButton);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(202, 168, 258, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 242, 258, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnSignUp = new JButton("Cadastrar");
		btnSignUp.setBounds(545, 455, 104, 45);
		frame.getContentPane().add(btnSignUp);
		
		JPanel panel = new JPanel();
		panel.setBounds(202, 312, 258, 33);
		frame.getContentPane().add(panel);
		
		ButtonGroup userTypeRadioButtons = new ButtonGroup();
		
		JRadioButton rdbtnClinic = new JRadioButton("Clinica");
		rdbtnClinic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			
		
			}
		});
		userTypeRadioButtons.add(rdbtnClinic);
		
		JRadioButton rdbtnClient = new JRadioButton("Paciente");
		userTypeRadioButtons.add(rdbtnClient);
		
		JRadioButton rdbtnEmployee = new JRadioButton("Funcion\u00E1rio");
		userTypeRadioButtons.add(rdbtnEmployee);
		
		panel.add(rdbtnClinic);
		panel.add(rdbtnClient);
		panel.add(rdbtnEmployee);
		
		panel.setLayout(new FlowLayout());
		panel.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Selecione o tipo de usu\u00E1rio:");
		lblNewLabel.setBounds(202, 287, 258, 14);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userText = textFieldUsername.getText();
				char[] password = passwordField.getPassword();
				if (userText.equals("usuario") && password.equals("senha")) {
					System.out.println("foi");
				}
			}
		});
	}
}
