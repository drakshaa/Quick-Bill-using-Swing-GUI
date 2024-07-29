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
import com.service.UpdateStockService;
import com.service.UpdateStockServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class SearchBillForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField searchField;
	private JTextField searchTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBillForm frame = new SearchBillForm();
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
	public SearchBillForm() {
		setTitle("Search Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane());
		contentPane.add(getSearchField());
		contentPane.add(getSearchTxt());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Search Bill");
			lblNewLabel.setBounds(176, 22, 153, 37);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bill no.");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1.setBounds(68, 98, 81, 20);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(42, 130, 442, 334);
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
					"Billno", "Customer Name", "Amount", "Date"
				}
			));
		}
		return table;
	}
	private JTextField getSearchField() {
		if (searchField == null) {
			searchField = new JTextField();
			searchField.addKeyListener(new KeyAdapter() {
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
			});
			searchField.setBounds(143, 98, 214, 20);
			searchField.setColumns(10);
		}
		return searchField;
	}
}	private JTextField getSearchTxt() {
		if (searchTxt == null) {
			searchTxt = new JTextField();
			searchTxt.setBounds(138, 98, 191, 20);
			searchTxt.setColumns(10);
		}
		return searchTxt;
	}

