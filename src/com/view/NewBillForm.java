package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.db.DB;
import com.model.CashierDetail;
import com.model.NewBill;
import com.service.CashierDetailImpl;
import com.service.CashierDetails;
import com.service.NewBillService;
import com.service.NewBillServiceImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;

public class NewBillForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblCustomerNamee;
	private JLabel lblProductId;
	private JLabel lblName;
	private JLabel lblMrp;
	private JLabel lblQuantity;
	private JLabel lblDiscount;
	private JTextField cnametxt;
	private JTextField nametxt;
	private JTextField mrptxt;
	private JTextField quantitytxt;
	private JTextField discounttxt;
	private JTextField billtxt;
	private JLabel lblDate;
	private JTextField textField_6;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField_7;
	private JLabel lblTotal;
	private JButton btnNewButton;
	private JButton btnAdd;
	private JButton btnRemove;
	private JComboBox<String> prodidtxt;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBillForm frame = new NewBillForm();
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
	public NewBillForm() {
		setTitle("New Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblCustomerNamee());
		contentPane.add(getLblProductId());
		contentPane.add(getLblName());
		contentPane.add(getLblMrp());
		contentPane.add(getLblQuantity());
		contentPane.add(getLblDiscount());
		contentPane.add(getCnametxt());
		contentPane.add(getNametxt());
		contentPane.add(getMrptxt());
		contentPane.add(getQuantitytxt());
		contentPane.add(getDiscounttxt());
		contentPane.add(getBilltxt());
		contentPane.add(getProdidtxt());
		contentPane.add(getLblDate());
		contentPane.add(getTextField_6());
		contentPane.add(getScrollPane());
		contentPane.add(getTextField_7());
		contentPane.add(getLblTotal());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnRemove());
		prodidtxt = new JComboBox<>();

		updatecombo();
		displayData();
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel(" Bill No");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(10, 26, 57, 25);
		}
		return lblNewLabel;
	}
	private JLabel getLblCustomerNamee() {
		if (lblCustomerNamee == null) {
			lblCustomerNamee = new JLabel("Customer Name");
			lblCustomerNamee.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCustomerNamee.setBounds(10, 62, 104, 25);
		}
		return lblCustomerNamee;
	}
	private JLabel getLblProductId() {
		if (lblProductId == null) {
			lblProductId = new JLabel("Product Id");
			lblProductId.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblProductId.setBounds(10, 98, 76, 25);
		}
		return lblProductId;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblName.setBounds(10, 135, 57, 25);
		}
		return lblName;
	}
	private JLabel getLblMrp() {
		if (lblMrp == null) {
			lblMrp = new JLabel("Mrp");
			lblMrp.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblMrp.setBounds(10, 171, 57, 25);
		}
		return lblMrp;
	}
	private JLabel getLblQuantity() {
		if (lblQuantity == null) {
			lblQuantity = new JLabel("Quantity");
			lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblQuantity.setBounds(10, 210, 57, 25);
		}
		return lblQuantity;
	}
	private JLabel getLblDiscount() {
		if (lblDiscount == null) {
			lblDiscount = new JLabel("Discount");
			lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblDiscount.setBounds(10, 257, 57, 25);
		}
		return lblDiscount;
	}
	private JTextField getCnametxt() {
		if (cnametxt == null) {
			cnametxt = new JTextField();
			cnametxt.setBounds(116, 62, 136, 25);
			cnametxt.setColumns(10);
		}
		return cnametxt;
	}
	private JTextField getNametxt() {
		if (nametxt == null) {
			nametxt = new JTextField();
			nametxt.setColumns(10);
			nametxt.setBounds(116, 135, 136, 25);
		}
		return nametxt;
	}
	private JTextField getMrptxt() {
		if (mrptxt == null) {
			mrptxt = new JTextField();
			mrptxt.setColumns(10);
			mrptxt.setBounds(116, 173, 136, 25);
		}
		return mrptxt;
	}
	private JTextField getQuantitytxt() {
		if (quantitytxt == null) {
			quantitytxt = new JTextField();
			quantitytxt.setColumns(10);
			quantitytxt.setBounds(116, 212, 136, 25);
		}
		return quantitytxt;
	}
	private JTextField getDiscounttxt() {
		if (discounttxt == null) {
			discounttxt = new JTextField();
			discounttxt.setColumns(10);
			discounttxt.setBounds(116, 259, 136, 25);
		}
		return discounttxt;
	}
	private JTextField getBilltxt() {
		if (billtxt == null) {
			billtxt = new JTextField();
			billtxt.setColumns(10);
			billtxt.setBounds(116, 28, 109, 25);
		}
		return billtxt;
	}
	private JComboBox<String> getProdidtxt() {
	    if (prodidtxt == null) {
	        prodidtxt = new JComboBox<>();
	        prodidtxt.setBounds(116, 101, 136, 22);
	    }
	    return prodidtxt;
	}
	private JLabel getLblDate() {
		if (lblDate == null) {
			lblDate = new JLabel("Date");
			lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblDate.setBounds(343, 26, 57, 25);
		}
		return lblDate;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(387, 28, 136, 25);
		}
		return textField_6;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(292, 67, 351, 355);
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
					"Quantity", "Name", "Mrp", "Price"
				}
			));
		}
		return table;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(439, 433, 136, 25);
		}
		return textField_7;
	}
	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblTotal.setBounds(369, 433, 57, 25);
		}
		return lblTotal;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Print");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBounds(96, 385, 96, 37);
		}
		return btnNewButton;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NewBill nb = new NewBill();
					nb.setBillno(Integer.parseInt(billtxt.getText()));
					nb.setCustomername(cnametxt.getText());
					nb.setProductid(prodidtxt.getSelectedIndex());
					nb.setName(nametxt.getText());
					nb.setMrp(Integer.parseInt(mrptxt.getText()));
					nb.setQuantity(Integer.parseInt(quantitytxt.getText()));
					nb.setDiscount(Double.parseDouble(discounttxt.getText()));
					NewBillService bill = new NewBillServiceImpl();
					bill.addBill(nb);
					JOptionPane.showMessageDialog(null, "Added Success");	
	
				}
			});
			btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnAdd.setBounds(27, 337, 96, 37);
		}
		return btnAdd;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("Remove");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select any row");
						return;
					}
//					
//					int srow = table.getSelectedRow();					
//					int pid = (int) table.getModel().getValueAt(srow, 0);
//					nameTxt.setText(table.getModel().getValueAt(srow, 1).toString());
//					numTxt.setText(table.getModel().getValueAt(srow, 2).toString());
//					addressTxt.setText(table.getModel().getValueAt(srow, 3).toString());
//					emailTxt.setText(table.getModel().getValueAt(srow, 4).toString());
//					pswTxt.setText(table.getModel().getValueAt(srow, 5).toString());
//					
//					CashierDetails detail = new CashierDetailImpl();
//					detail.deleteDetail(pid);
//					JOptionPane.showMessageDialog(null, "deleted success");
//					displayData(); // get all product after deleted
				}
			});
			btnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnRemove.setBounds(161, 337, 96, 37);
		}
		return btnRemove;
	}

	private void updatecombo() {
	    String sql = "select * from updatestock";
	    try {
	        Statement stm = DB.connectDb().createStatement();
	        ResultSet rs = stm.executeQuery(sql);
	        while (rs.next()) {
	            int id = rs.getInt("productid");
	            prodidtxt.addItem(String.valueOf(id));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	private void displayData(){
		NewBillService bill = new NewBillServiceImpl();
			List<NewBill> blist = bill.getAllBill();
			
			DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
			
			tmodel.setRowCount(0); //table reset
			
			for(NewBill nb : blist) {
				
				tmodel.addRow(new Object[] { nb.getName(), nb.getMrp(), nb.getQuantity(), nb.getTotalPriceWithDiscount()});
				
			}
	}
		
}
