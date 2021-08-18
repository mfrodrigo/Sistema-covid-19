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
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class CreateClinic {

	private JFrame frame;
	private JTextField textFieldClinicName;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textFieldTestsQuantity;

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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_5_4 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_4 = new GridBagConstraints();
		gbc_lblNewLabel_5_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_4.gridx = 1;
		gbc_lblNewLabel_5_4.gridy = 0;
		panel.add(lblNewLabel_5_4, gbc_lblNewLabel_5_4);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 2;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1.gridx = 1;
		gbc_lblNewLabel_5_1.gridy = 3;
		panel.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 4;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5_2 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2.gridx = 1;
		gbc_lblNewLabel_5_2.gridy = 5;
		panel.add(lblNewLabel_5_2, gbc_lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3 = new GridBagConstraints();
		gbc_lblNewLabel_5_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_3.gridx = 1;
		gbc_lblNewLabel_5_3.gridy = 6;
		panel.add(lblNewLabel_5_3, gbc_lblNewLabel_5_3);
		
		JLabel lblNewLabel_7 = new JLabel("Endere\u00E7o:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 7;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_3_1.gridx = 1;
		gbc_lblNewLabel_5_3_1.gridy = 8;
		panel.add(lblNewLabel_5_3_1, gbc_lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_3_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_3_2.gridx = 1;
		gbc_lblNewLabel_5_3_2.gridy = 9;
		panel.add(lblNewLabel_5_3_2, gbc_lblNewLabel_5_3_2);
		
		JLabel lblNewLabel_9 = new JLabel("Cadastrar funcion\u00E1rio:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 10;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 10;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 0;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar funcion\u00E1rio");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Funcion\u00E1rios da cl\u00EDnica:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 11;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 3;
		gbc_list.gridy = 11;
		panel.add(list, gbc_list);
		
		JLabel lblNewLabel_5_3_2_1 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_3_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_3_2_1.gridx = 1;
		gbc_lblNewLabel_5_3_2_1.gridy = 12;
		panel.add(lblNewLabel_5_3_2_1, gbc_lblNewLabel_5_3_2_1);
		
		JLabel lblNewLabel_5_3_2_2 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3_2_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_3_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_3_2_2.gridx = 1;
		gbc_lblNewLabel_5_3_2_2.gridy = 13;
		panel.add(lblNewLabel_5_3_2_2, gbc_lblNewLabel_5_3_2_2);
		
		JLabel lblTestsQuantity = new JLabel("  Quantidade de testes em estoque:  ");
		lblTestsQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTestsQuantity = new GridBagConstraints();
		gbc_lblTestsQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblTestsQuantity.gridx = 1;
		gbc_lblTestsQuantity.gridy = 14;
		panel.add(lblTestsQuantity, gbc_lblTestsQuantity);
		
		textFieldTestsQuantity = new JTextField();
		GridBagConstraints gbc_textFieldTestsQuantity = new GridBagConstraints();
		gbc_textFieldTestsQuantity.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldTestsQuantity.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTestsQuantity.gridx = 3;
		gbc_textFieldTestsQuantity.gridy = 14;
		panel.add(textFieldTestsQuantity, gbc_textFieldTestsQuantity);
		textFieldTestsQuantity.setColumns(10);
		
		JLabel lblNewLabel_5_3_3 = new JLabel("              ");
		GridBagConstraints gbc_lblNewLabel_5_3_3 = new GridBagConstraints();
		gbc_lblNewLabel_5_3_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5_3_3.gridx = 1;
		gbc_lblNewLabel_5_3_3.gridy = 15;
		panel.add(lblNewLabel_5_3_3, gbc_lblNewLabel_5_3_3);
		
		JButton btnNewButton_1 = new JButton("Cadastrar cl\u00EDnica");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 15;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
	}
}
