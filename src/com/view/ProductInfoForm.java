package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.UpdateStock;
import com.service.UpdateStockServiceImpl;
import com.service.UpdateStockService;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class ProductInfoForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField searchTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfoForm frame = new ProductInfoForm();
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
	public ProductInfoForm() {
		setTitle("Product Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSearchTxt());
		displayData();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Product Information");
			lblNewLabel.setBounds(146, 11, 236, 50);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(44, 140, 419, 323);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Product Id", "Product Name", "Available", "Mrp"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Search");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(73, 96, 63, 20);
		}
		return lblNewLabel_1;
	}

	private JTextField getSearchTxt() {
		if (searchTxt == null) {
			searchTxt = new JTextField();
			searchTxt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String sdata = searchTxt.getText().trim();
					
					UpdateStockService info = new UpdateStockServiceImpl();
					List<UpdateStock> slist = info.searchUpdateStock(sdata);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					
					tmodel.setRowCount(0); //table reset
					
					for(UpdateStock s : slist) {
						
						
						tmodel.addRow(new Object[] {s.getProductId(), s.getProductName(), s.getQuantityAvail(), s.getMrp()});
				}
				}
			});
			searchTxt.setBounds(146, 93, 182, 26);
			searchTxt.setColumns(10);
		}
		return searchTxt;
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
	