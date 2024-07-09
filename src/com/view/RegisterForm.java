package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class RegisterForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblNewLabel_1_1_4;
	private JTextField textField_6;
	private JLabel lblNewLabel_1_1_4_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getLblNewLabel_1_1_3());
		contentPane.add(getLblNewLabel_1_1_4());
		contentPane.add(getTextField_6());
		contentPane.add(getLblNewLabel_1_1_4_1());
		contentPane.add(getPasswordField());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Register");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(163, 11, 94, 40);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(40, 78, 85, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(135, 77, 216, 32);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Last Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(40, 121, 85, 27);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(135, 120, 216, 32);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(135, 167, 216, 32);
		}
		return textField_2;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(135, 253, 216, 32);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(135, 301, 216, 32);
		}
		return textField_5;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Username");
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(40, 168, 85, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Password");
			lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1_2.setBounds(40, 211, 85, 27);
		}
		return lblNewLabel_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("Retype Pass");
			lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1_3.setBounds(40, 254, 85, 27);
		}
		return lblNewLabel_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_4() {
		if (lblNewLabel_1_1_4 == null) {
			lblNewLabel_1_1_4 = new JLabel("BirthDate");
			lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1_4.setBounds(40, 301, 85, 27);
		}
		return lblNewLabel_1_1_4;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(135, 355, 216, 32);
		}
		return textField_6;
	}
	private JLabel getLblNewLabel_1_1_4_1() {
		if (lblNewLabel_1_1_4_1 == null) {
			lblNewLabel_1_1_4_1 = new JLabel("Address");
			lblNewLabel_1_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1_4_1.setBounds(40, 355, 85, 27);
		}
		return lblNewLabel_1_1_4_1;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(135, 210, 216, 32);
		}
		return passwordField;
	}
}
