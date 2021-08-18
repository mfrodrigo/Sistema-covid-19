package AppView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Clinica.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class ShowClinic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		            System.out.println("entrei no try");
					for(int i = 0; i < args.length; i++) {
						System.out.println("entrei no for");
						System.out.println(args[i]);
			        }
					ShowClinic window = new ShowClinic(null, null, null);
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
	public ShowClinic(String userName, String userPassword, String userType) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1280, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 39, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Exibir cl\u00EDnica");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(59, 11, 1146, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cl\u00EDnica: \"Colocar nome da clinica\"");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 39, 1244, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(59, 150, 1146, 780);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_4 = new JLabel("Informa\u00E7\u00F5es gerais da cl\u00EDnica");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblName = new JLabel("Nome: ");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		panel_2.add(lblName, gbc_lblName);
		
		JLabel lblNameData = new JLabel("NomeData");
		GridBagConstraints gbc_lblNameData = new GridBagConstraints();
		gbc_lblNameData.anchor = GridBagConstraints.WEST;
		gbc_lblNameData.insets = new Insets(0, 0, 5, 0);
		gbc_lblNameData.gridx = 1;
		gbc_lblNameData.gridy = 0;
		panel_2.add(lblNameData, gbc_lblNameData);
		
		JLabel lblNewLabel_6 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("   Telefone:   ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 2;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblPhoneData = new JLabel("TelefoneData");
		GridBagConstraints gbc_lblPhoneData = new GridBagConstraints();
		gbc_lblPhoneData.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneData.insets = new Insets(0, 0, 5, 0);
		gbc_lblPhoneData.gridx = 1;
		gbc_lblPhoneData.gridy = 2;
		panel_2.add(lblPhoneData, gbc_lblPhoneData);
		
		JLabel lblNewLabel_6_1 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1.gridx = 0;
		gbc_lblNewLabel_6_1.gridy = 3;
		panel_2.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);
		
		JLabel lblNewLabel_3 = new JLabel("CNPJ:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblCnpj = new JLabel("CNPJData");
		GridBagConstraints gbc_lblCnpj = new GridBagConstraints();
		gbc_lblCnpj.anchor = GridBagConstraints.WEST;
		gbc_lblCnpj.insets = new Insets(0, 0, 5, 0);
		gbc_lblCnpj.gridx = 1;
		gbc_lblCnpj.gridy = 4;
		panel_2.add(lblCnpj, gbc_lblCnpj);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1_1.gridx = 0;
		gbc_lblNewLabel_6_1_1.gridy = 5;
		panel_2.add(lblNewLabel_6_1_1, gbc_lblNewLabel_6_1_1);
		
		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 6;
		panel_2.add(lblEmail, gbc_lblEmail);
		
		JLabel lblEmailData = new JLabel("Emaildata");
		GridBagConstraints gbc_lblEmailData = new GridBagConstraints();
		gbc_lblEmailData.anchor = GridBagConstraints.WEST;
		gbc_lblEmailData.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmailData.gridx = 1;
		gbc_lblEmailData.gridy = 6;
		panel_2.add(lblEmailData, gbc_lblEmailData);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_6_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1_2.gridx = 0;
		gbc_lblNewLabel_6_1_2.gridy = 7;
		panel_2.add(lblNewLabel_6_1_2, gbc_lblNewLabel_6_1_2);
		
		JLabel lblAgenda = new JLabel("Agenda:");
		GridBagConstraints gbc_lblAgenda = new GridBagConstraints();
		gbc_lblAgenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgenda.gridx = 0;
		gbc_lblAgenda.gridy = 8;
		panel_2.add(lblAgenda, gbc_lblAgenda);
		
		JButton btnOpenAgenda = new JButton("Abrir agenda da cl\u00EDnica");
		btnOpenAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnOpenAgenda = new GridBagConstraints();
		gbc_btnOpenAgenda.anchor = GridBagConstraints.WEST;
		gbc_btnOpenAgenda.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpenAgenda.gridx = 1;
		gbc_btnOpenAgenda.gridy = 8;
		panel_2.add(btnOpenAgenda, gbc_btnOpenAgenda);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_6_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1_3.gridx = 0;
		gbc_lblNewLabel_6_1_3.gridy = 9;
		panel_2.add(lblNewLabel_6_1_3, gbc_lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_8 = new JLabel("   Quantidade de testes PCR dispon\u00EDveis:   ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 10;
		panel_2.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblTestsQuantityData = new JLabel("TesteData");
		GridBagConstraints gbc_lblTestsQuantityData = new GridBagConstraints();
		gbc_lblTestsQuantityData.anchor = GridBagConstraints.WEST;
		gbc_lblTestsQuantityData.insets = new Insets(0, 0, 5, 0);
		gbc_lblTestsQuantityData.gridx = 1;
		gbc_lblTestsQuantityData.gridy = 10;
		panel_2.add(lblTestsQuantityData, gbc_lblTestsQuantityData);
		
		JLabel lblNewLabel_6_4 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_4 = new GridBagConstraints();
		gbc_lblNewLabel_6_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_4.gridx = 0;
		gbc_lblNewLabel_6_4.gridy = 11;
		panel_2.add(lblNewLabel_6_4, gbc_lblNewLabel_6_4);
		
		JLabel lblNewLabel_9 = new JLabel("   Cadastrar novos testes adiquiridos:   ");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 12;
		panel_2.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 12;
		panel_2.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 0;
		panel_4.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddTestQuantity = new JButton("Cadastrar");
		GridBagConstraints gbc_btnAddTestQuantity = new GridBagConstraints();
		gbc_btnAddTestQuantity.gridx = 1;
		gbc_btnAddTestQuantity.gridy = 0;
		panel_4.add(btnAddTestQuantity, gbc_btnAddTestQuantity);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_6_1_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6_1_4.gridx = 0;
		gbc_lblNewLabel_6_1_4.gridy = 2;
		panel.add(lblNewLabel_6_1_4, gbc_lblNewLabel_6_1_4);
		
		JLabel lblNewLabel_6_1_5 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_1_5 = new GridBagConstraints();
		gbc_lblNewLabel_6_1_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6_1_5.gridx = 0;
		gbc_lblNewLabel_6_1_5.gridy = 3;
		panel.add(lblNewLabel_6_1_5, gbc_lblNewLabel_6_1_5);
		
		JLabel lblNewLabel_10 = new JLabel("Funcion\u00E1rios da cl\u00EDnica:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 4;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 5;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_2 = new GridBagConstraints();
		gbc_lblNewLabel_6_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_2.gridx = 0;
		gbc_lblNewLabel_6_2.gridy = 0;
		panel_1.add(lblNewLabel_6_2, gbc_lblNewLabel_6_2);
		
		JLabel lblNewLabel_7 = new JLabel("   Cadastrar novo funcion\u00E1rio:   ");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 1;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel_3.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Cadastrar");
		GridBagConstraints gbc_btnAddEmployee = new GridBagConstraints();
		gbc_btnAddEmployee.gridx = 1;
		gbc_btnAddEmployee.gridy = 0;
		panel_3.add(btnAddEmployee, gbc_btnAddEmployee);
		
		JLabel lblNewLabel_6_3 = new JLabel("          ");
		GridBagConstraints gbc_lblNewLabel_6_3 = new GridBagConstraints();
		gbc_lblNewLabel_6_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_3.gridx = 0;
		gbc_lblNewLabel_6_3.gridy = 2;
		panel_1.add(lblNewLabel_6_3, gbc_lblNewLabel_6_3);
		
		JLabel lblEmployees = new JLabel("   Lista de funcion\u00E1rios:   ");
		GridBagConstraints gbc_lblEmployees = new GridBagConstraints();
		gbc_lblEmployees.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmployees.gridx = 0;
		gbc_lblEmployees.gridy = 3;
		panel_1.add(lblEmployees, gbc_lblEmployees);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 3;
		panel_1.add(list, gbc_list);
	}
}
