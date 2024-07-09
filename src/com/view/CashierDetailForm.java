package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.model.CashierDetail;
import com.service.CashierDetailImpl;
import com.service.CashierDetails;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CashierDetailForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField idTxt;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField nameTxt;
	private JLabel lblNewLabel_1_2;
	private JTextField numTxt;
	private JLabel lblNewLabel_1_3;
	private JTextField addressTxt;
	private JLabel lblNewLabel_1_4;
	private JTextField emailTxt;
	private JLabel lblNewLabel_1_5;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JButton btnNewButton;
	private JPasswordField pswTxt;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierDetailForm frame = new CashierDetailForm();
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
	public CashierDetailForm() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getIdTxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getNameTxt());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getNumTxt());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getAddressTxt());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getEmailTxt());
		contentPane.add(getLblNewLabel_1_5());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		contentPane.add(getPswTxt());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		displayData();

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Add Cashier Details");
			lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
			lblNewLabel.setBounds(39, 11, 206, 57);
		}
		return lblNewLabel;
	}
	private JTextField getIdTxt() {
		if (idTxt == null) {
			idTxt = new JTextField();
			idTxt.setBounds(132, 103, 170, 35);
			idTxt.setColumns(10);
		}
		return idTxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier Id");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(39, 107, 75, 25);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Cashier Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_1.setBounds(39, 163, 88, 25);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setColumns(10);
			nameTxt.setBounds(132, 159, 170, 35);
		}
		return nameTxt;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Mobile No.");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_2.setBounds(39, 218, 88, 25);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getNumTxt() {
		if (numTxt == null) {
			numTxt = new JTextField();
			numTxt.setColumns(10);
			numTxt.setBounds(132, 214, 170, 35);
		}
		return numTxt;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Address");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_3.setBounds(39, 274, 60, 25);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setColumns(10);
			addressTxt.setBounds(132, 270, 170, 35);
		}
		return addressTxt;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Email-Id");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_4.setBounds(39, 327, 60, 25);
		}
		return lblNewLabel_1_4;
	}
	private JTextField getEmailTxt() {
		if (emailTxt == null) {
			emailTxt = new JTextField();
			emailTxt.setColumns(10);
			emailTxt.setBounds(132, 323, 170, 35);
		}
		return emailTxt;
	}
	private JLabel getLblNewLabel_1_5() {
		if (lblNewLabel_1_5 == null) {
			lblNewLabel_1_5 = new JLabel("Password");
			lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1_5.setBounds(39, 384, 75, 25);
		}
		return lblNewLabel_1_5;
		
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(322, 28, 451, 493);
			scrollPane.setViewportView(getScrollPane_1());
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "Name", "Phone No.", "Address", "Email", "Password"
				}
			));
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CashierDetail cd = new CashierDetail();
					cd.setId(Integer.parseInt(idTxt.getText()));
					cd.setName(nameTxt.getText());
					cd.setPhone_no(numTxt.getText());
					cd.setAddress(addressTxt.getText());
					cd.setEmail(emailTxt.getText());
					cd.setPassword(pswTxt.getText());
					
					CashierDetails detail = new CashierDetailImpl();
					detail.addDetail(cd);
					
					displayData();
					JOptionPane.showMessageDialog(null, "Added Success");				
				}
				}
			);
			btnNewButton.setBounds(10, 449, 88, 35);
		}
		return btnNewButton;
	}
	private JPasswordField getPswTxt() {
		if (pswTxt == null) {
			pswTxt = new JPasswordField();
			pswTxt.setBounds(132, 382, 170, 35);
		}
		return pswTxt;
		
	}
	
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Delete");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select any row");
						return;
					}
					
					int srow = table.getSelectedRow();					
					int pid = (int) table.getModel().getValueAt(srow, 0);
					nameTxt.setText(table.getModel().getValueAt(srow, 1).toString());
					numTxt.setText(table.getModel().getValueAt(srow, 2).toString());
					addressTxt.setText(table.getModel().getValueAt(srow, 3).toString());
					emailTxt.setText(table.getModel().getValueAt(srow, 4).toString());
					pswTxt.setText(table.getModel().getValueAt(srow, 5).toString());
					
					CashierDetails detail = new CashierDetailImpl();
					detail.deleteDetail(pid);
					JOptionPane.showMessageDialog(null, "deleted success");
					displayData(); // get all product after deleted
				}
			});
			btnNewButton_1.setBounds(108, 449, 99, 35);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Update");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CashierDetail cd = new CashierDetail();
					cd.setId(Integer.parseInt(idTxt.getText()));
					cd.setName(nameTxt.getText());
					cd.setPhone_no(numTxt.getText());
					cd.setAddress(addressTxt.getText());
					cd.setEmail(emailTxt.getText());
					cd.setPassword(pswTxt.getText());

					CashierDetails detail = new CashierDetailImpl();
					detail.updateDetail(cd);
					
					displayData();
					JOptionPane.showMessageDialog(null, "Update Success");				
					}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_2.setBounds(217, 449, 89, 35);
		}
		return btnNewButton_2;
		
	}
	
	private void displayData(){
		 CashierDetails detail = new CashierDetailImpl();
			List<CashierDetail> dlist = detail.getAllDetail();
			
			DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
			
			tmodel.setRowCount(0); //table reset
			
			for(CashierDetail cd : dlist) {
				
				tmodel.addRow(new Object[] {cd.getId(), cd.getName(), cd.getPhone_no(), cd.getAddress(), cd.getEmail(), cd.getPassword()});
				
			}
	}
	
	}
//int srow = table.getSelectedRow();					
//idTxt.setText(table.getModel().getValueAt(srow, 0).toString());
//nameTxt.setText(table.getModel().getValueAt(srow, 1).toString());
//numTxt.setText(table.getModel().getValueAt(srow, 2).toString());
//addressTxt.setText(table.getModel().getValueAt(srow, 3).toString());
//emailTxt.setText(table.getModel().getValueAt(srow, 4).toString());
//pswTxt.setText(table.getModel().getValueAt(srow, 5).toString());