package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IndexForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnCashierLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexForm frame = new IndexForm();
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
	public IndexForm() {
		setTitle("Quick Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 255, 254));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnCashierLogin());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(226, 32, -395, 271);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel(" Welcome To Super Market Billing System");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setBounds(130, 32, 402, 30);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Admin Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new LoginForm().setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setBounds(340, 130, 145, 48);
		}
		return btnNewButton;
	}
	private JButton getBtnCashierLogin() {
		if (btnCashierLogin == null) {
			btnCashierLogin = new JButton("Cashier Login");
			btnCashierLogin.setForeground(Color.BLACK);
			btnCashierLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnCashierLogin.setBackground(Color.WHITE);
			btnCashierLogin.setBounds(340, 232, 145, 48);
		}
		return btnCashierLogin;
	}
}
