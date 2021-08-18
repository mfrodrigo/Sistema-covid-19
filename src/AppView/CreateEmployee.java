package AppView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class CreateEmployee {

	private JFrame frame;
	private JTextField textFieldUserName;
	private JTextField textFieldUserPhone;
	private JTextField textFieldUserAdress;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEmployee window = new CreateEmployee();
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
	public CreateEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modo:");
		lblNewLabel.setBounds(10, 11, 30, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar funcion\u00E1rio");
		lblNewLabel_1.setBounds(50, 11, 104, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastrar funcion\u00E1rio");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(10, 36, 1244, 100);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Preencha os campos abaixo para efetuar o cadastro do funcion\u00E1rio");
		lblNewLabel_4.setBounds(50, 147, 1164, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 184, 1164, 760);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblUsername = new JLabel("Nome:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 1;
		panel.add(lblUsername, gbc_lblUsername);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setColumns(10);
		GridBagConstraints gbc_textFieldUserName = new GridBagConstraints();
		gbc_textFieldUserName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUserName.gridx = 3;
		gbc_textFieldUserName.gridy = 1;
		panel.add(textFieldUserName, gbc_textFieldUserName);
		
		JLabel lblNewLabel_6 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 2;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1.gridx = 1;
		gbc_lblNewLabel_6_1.gridy = 3;
		panel.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);
		
		JLabel lblUserPhone = new JLabel("Telefone:");
		lblUserPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblUserPhone = new GridBagConstraints();
		gbc_lblUserPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserPhone.gridx = 1;
		gbc_lblUserPhone.gridy = 4;
		panel.add(lblUserPhone, gbc_lblUserPhone);
		
		textFieldUserPhone = new JTextField();
		textFieldUserPhone.setColumns(10);
		GridBagConstraints gbc_textFieldUserPhone = new GridBagConstraints();
		gbc_textFieldUserPhone.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUserPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUserPhone.gridx = 3;
		gbc_textFieldUserPhone.gridy = 4;
		panel.add(textFieldUserPhone, gbc_textFieldUserPhone);
		
		JLabel lblNewLabel_6_4 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_4 = new GridBagConstraints();
		gbc_lblNewLabel_6_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_4.gridx = 1;
		gbc_lblNewLabel_6_4.gridy = 5;
		panel.add(lblNewLabel_6_4, gbc_lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_2 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_2 = new GridBagConstraints();
		gbc_lblNewLabel_6_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_2.gridx = 1;
		gbc_lblNewLabel_6_2.gridy = 6;
		panel.add(lblNewLabel_6_2, gbc_lblNewLabel_6_2);
		
		JLabel lblUserAdress = new JLabel("Endere\u00E7o:");
		lblUserAdress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblUserAdress = new GridBagConstraints();
		gbc_lblUserAdress.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserAdress.gridx = 1;
		gbc_lblUserAdress.gridy = 7;
		panel.add(lblUserAdress, gbc_lblUserAdress);
		
		textFieldUserAdress = new JTextField();
		textFieldUserAdress.setColumns(10);
		GridBagConstraints gbc_textFieldUserAdress = new GridBagConstraints();
		gbc_textFieldUserAdress.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUserAdress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUserAdress.gridx = 3;
		gbc_textFieldUserAdress.gridy = 7;
		panel.add(textFieldUserAdress, gbc_textFieldUserAdress);
		
		JLabel lblNewLabel_6_3 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_3 = new GridBagConstraints();
		gbc_lblNewLabel_6_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_3.gridx = 1;
		gbc_lblNewLabel_6_3.gridy = 8;
		panel.add(lblNewLabel_6_3, gbc_lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_5 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_5 = new GridBagConstraints();
		gbc_lblNewLabel_6_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_5.gridx = 1;
		gbc_lblNewLabel_6_5.gridy = 9;
		panel.add(lblNewLabel_6_5, gbc_lblNewLabel_6_5);
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblEspecialidade = new GridBagConstraints();
		gbc_lblEspecialidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidade.gridx = 1;
		gbc_lblEspecialidade.gridy = 10;
		panel.add(lblEspecialidade, gbc_lblEspecialidade);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 10;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M\u00E9dico");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 0;
		panel_1.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Enfermeiro");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 1;
		gbc_rdbtnNewRadioButton_1.gridy = 0;
		panel_1.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Gerente");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.gridx = 2;
		gbc_rdbtnNewRadioButton_2.gridy = 0;
		panel_1.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_6_6 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_6 = new GridBagConstraints();
		gbc_lblNewLabel_6_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_6.gridx = 1;
		gbc_lblNewLabel_6_6.gridy = 11;
		panel.add(lblNewLabel_6_6, gbc_lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("                             ");
		GridBagConstraints gbc_lblNewLabel_6_7 = new GridBagConstraints();
		gbc_lblNewLabel_6_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_7.gridx = 1;
		gbc_lblNewLabel_6_7.gridy = 12;
		panel.add(lblNewLabel_6_7, gbc_lblNewLabel_6_7);
		
		JLabel lblNewLabel_5 = new JLabel("Clinica selecionada:   ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 13;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 13;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 26;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
}
