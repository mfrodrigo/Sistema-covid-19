package AppView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class CreateClinic {

	private JFrame frame;
	private JTextField textFieldClinicName;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateClinic window = new CreateClinic();
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
	public CreateClinic() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar cl\u00EDnica");
		lblNewLabel_1.setBounds(50, 11, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro de cl\u00EDnica");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 36, 1244, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Preencha os campos abaixo para efetuar o cadastro do estabelecimento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(50, 147, 1164, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Modo:");
		lblNewLabel_4.setBounds(1224, 11, 30, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cadastrar cl\u00EDnica");
		lblNewLabel_1_1.setBounds(139, 11, 1075, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 182, 1164, 760);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblClinicName = new JLabel("Nome do Estabelecimento:");
		lblClinicName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblClinicName = new GridBagConstraints();
		gbc_lblClinicName.insets = new Insets(0, 0, 5, 5);
		gbc_lblClinicName.gridx = 1;
		gbc_lblClinicName.gridy = 1;
		panel.add(lblClinicName, gbc_lblClinicName);
		
		textFieldClinicName = new JTextField();
		GridBagConstraints gbc_textFieldClinicName = new GridBagConstraints();
		gbc_textFieldClinicName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldClinicName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldClinicName.gridx = 3;
		gbc_textFieldClinicName.gridy = 1;
		panel.add(textFieldClinicName, gbc_textFieldClinicName);
		textFieldClinicName.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 3;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Endere\u00E7o:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 5;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 5;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
	}
}
