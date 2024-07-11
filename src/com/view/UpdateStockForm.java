package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.CashierDetail;
import com.model.UpdateStock;
import com.service.CashierDetailImpl;
import com.service.CashierDetails;
import com.service.UpdateStockService;
import com.service.UpdateStockServiceImpl;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateStockForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextField idTxt;
	private JLabel lblNewLabel_1_1;
	private JTextField nameTxt;
	private JLabel lblNewLabel_1_1_1;
	private JTextField availTxt;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField addedTxt;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField mrpTxt;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStockForm frame = new UpdateStockForm();
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
	public UpdateStockForm() {
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getIdTxt());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getNameTxt());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getAvailTxt());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getAddedTxt());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getMrpTxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnUpdate());
		displayData();

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Update Stock");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel.setBounds(70, 11, 229, 54);
		}
		return lblNewLabel;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					DefaultTableModel model = (DefaultTableModel) table.getModel();

					int srow = table.getSelectedRow();
					idTxt.setText(model.getValueAt(srow, 0).toString());
					nameTxt.setText(model.getValueAt(srow, 1).toString());
					availTxt.setText(model.getValueAt(srow, 2).toString());
					addedTxt.setText(model.getValueAt(srow, 3).toString());
					mrpTxt.setText(model.getValueAt(srow, 4).toString());
				}
			});
			scrollPane.setBounds(304, 26, 383, 430);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product Id");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 97, 71, 22);
		}
		return lblNewLabel_1;
	}

	private JTextField getIdTxt() {
		if (idTxt == null) {
			idTxt = new JTextField();
			idTxt.setBounds(136, 93, 137, 35);
			idTxt.setColumns(10);
		}
		return idTxt;
	}

	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(10, 143, 95, 22);
		}
		return lblNewLabel_1_1;
	}

	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setColumns(10);
			nameTxt.setBounds(136, 139, 137, 35);
		}
		return nameTxt;
	}

	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Quantity Available");
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1.setBounds(10, 190, 116, 22);
		}
		return lblNewLabel_1_1_1;
	}

	private JTextField getAvailTxt() {
		if (availTxt == null) {
			availTxt = new JTextField();
			availTxt.setColumns(10);
			availTxt.setBounds(136, 185, 137, 35);
		}
		return availTxt;
	}

	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Quantity Added");
			lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1.setBounds(10, 239, 116, 22);
		}
		return lblNewLabel_1_1_1_1;
	}

	private JTextField getAddedTxt() {
		if (addedTxt == null) {
			addedTxt = new JTextField();
			addedTxt.setColumns(10);
			addedTxt.setBounds(136, 235, 137, 35);
		}
		return addedTxt;
	}

	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Mrp");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1_1_1_1_1.setBounds(10, 285, 116, 22);
		}
		return lblNewLabel_1_1_1_1_1;
	}

	private JTextField getMrpTxt() {
		if (mrpTxt == null) {
			mrpTxt = new JTextField();
			mrpTxt.setColumns(10);
			mrpTxt.setBounds(136, 281, 137, 35);
		}
		return mrpTxt;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "Product Id", "Product Name", "Available", "Mrp" }));
		}
		return table;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					UpdateStock us = new UpdateStock();
					us.setProductId(Integer.parseInt(idTxt.getText()));
					us.setProductName(nameTxt.getText());
					us.setQuantityAvail(Integer.parseInt(availTxt.getText()));
					us.setQuantityAdded(Integer.parseInt(addedTxt.getText()));
					us.setMrp(Integer.parseInt(mrpTxt.getText()));

					UpdateStockService stock = new UpdateStockServiceImpl();
					stock.addStock(us);
					displayData();
					JOptionPane.showMessageDialog(null, "Added Success");
					
					idTxt.setText("");
					nameTxt.setText("");
					availTxt.setText("");
					addedTxt.setText("");
					mrpTxt.setText("");

				}
			});
			btnNewButton.setBackground(new Color(0, 255, 128));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton.setBounds(28, 368, 116, 40);
		}
		return btnNewButton;
	}

	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					UpdateStock us = new UpdateStock();
					us.setProductId(Integer.parseInt(idTxt.getText()));
					us.setProductName(nameTxt.getText());
					us.setQuantityAvail(Integer.parseInt(availTxt.getText()));
					us.setQuantityAdded(Integer.parseInt(addedTxt.getText()));
					us.setMrp(Integer.parseInt(mrpTxt.getText()));

					UpdateStockService stock = new UpdateStockServiceImpl();
					stock.updateStock(us);
					displayData();
					JOptionPane.showMessageDialog(null, "Update Success");
					
					idTxt.setText("");
					nameTxt.setText("");
					availTxt.setText("");
					addedTxt.setText("");
					mrpTxt.setText("");

				}
			});
			btnUpdate.setBackground(new Color(151, 169, 255));
			btnUpdate.setForeground(new Color(255, 255, 255));
			btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnUpdate.setBounds(167, 368, 116, 40);
		}
		return btnUpdate;
	}

	private void displayData() {
		UpdateStockService stock = new UpdateStockServiceImpl();
		List<UpdateStock> slist = stock.getAllStock();

		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();

		tmodel.setRowCount(0); // table reset

		for (UpdateStock us : slist) {

			tmodel.addRow(new Object[] { us.getProductId(), us.getProductName(), us.getQuantityAvail(), us.getMrp() });

		}
	}
}

//		if(table.getSelectedRow()<0) {
//			JOptionPane.showMessageDialog(null, "Please select any row");
//			return;
//		}
//		int srow = table.getSelectedRow();
//		if (srow != -1) { // Ensure a row is selected
//		    idTxt.setText(table.getModel().getValueAt(srow, 1).toString());
//		    nameTxt.setText(table.getModel().getValueAt(srow, 2).toString());
//		    availTxt.setText(table.getModel().getValueAt(srow, 3).toString());
//		    addedTxt.setText(table.getModel().getValueAt(srow, 4).toString());
//		    mrpTxt.setText(table.getModel().getValueAt(srow, 5).toString());
//		} else {
//		    // Handle the case where no row is selected
//		    JOptionPane.showMessageDialog(null, "Please select a row from the table.");
//		}
//	}
//}
