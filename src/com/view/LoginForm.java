package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JTextField usernameTxt;
	private JTextField passwordTxt;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblPassword());
		contentPane.add(getUsernameTxt());
		contentPane.add(getPasswordTxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnLogin());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setBounds(55, 82, 65, 27);
		}
		return lblNewLabel;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPassword.setBounds(55, 143, 65, 27);
		}
		return lblPassword;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setBounds(155, 78, 142, 37);
			usernameTxt.setColumns(10);
		}
		return usernameTxt;
	}
	private JTextField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JTextField();
			passwordTxt.setColumns(10);
			passwordTxt.setBounds(155, 139, 142, 37);
		}
		return passwordTxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Login");
			lblNewLabel_1.setForeground(new Color(64, 0, 64));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1.setBounds(158, 28, 58, 27);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new IndexForm().setVisible(true);
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBackground(new Color(244, 91, 103));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnNewButton.setBounds(98, 202, 89, 37);
		}
		return btnNewButton;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String un = usernameTxt.getText();				
					String pw = passwordTxt.getText();
					
					if (un.equals("Ram") && pw.equals("111")) {
						
						JOptionPane.showMessageDialog(null, "Login Success");
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Login Fail");
					}
				}
			});
			btnLogin.setBackground(new Color(0, 255, 255));
			btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnLogin.setBounds(208, 202, 89, 37);
		}
		return btnLogin;
	}
}
