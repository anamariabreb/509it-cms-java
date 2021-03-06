package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbConn.businessDbConn;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BusinessContact extends JFrame {

	private JPanel contentPane;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable busConTable;
	private JTextField textField_ID;
	private JTextField textField_FName;
	private JTextField textField_LName;
	private JTextField textField_Tel;
	private JTextField textField_BusTel;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnExit;
	private JButton btnHomepage;
	private JTextField textField_Email;
	private JTextField textField_AddrL1;
	private JTextField textField_AddrL2;
	private JTextField textField_City;
	private JTextField textField_Postcode;
	private JLabel lblEmail;
	private JLabel lblAddrL1;
	private JLabel lblAddrL2;
	private JLabel lblCity;
	private JLabel lblPostcode;
	
	dbConn.businessDbConn mysqlConn = new businessDbConn();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusinessContact frame = new BusinessContact();
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
	public BusinessContact() {
		mysqlConn.Connect();
		
		
		setTitle("Business Contacts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setBounds(0, 212, 674, 138);
		contentPane.add(scrollPane);
		
		busConTable = new JTable();
		busConTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_ID.setText(busConTable.getValueAt(busConTable.getSelectedRow(),0). toString());
				textField_FName.setText(busConTable.getValueAt(busConTable.getSelectedRow(),1). toString());
				textField_LName.setText(busConTable.getValueAt(busConTable.getSelectedRow(),2). toString());
				textField_Tel.setText(busConTable.getValueAt(busConTable.getSelectedRow(),3). toString());
				textField_BusTel.setText(busConTable.getValueAt(busConTable.getSelectedRow(),4). toString());
				textField_Email.setText(busConTable.getValueAt(busConTable.getSelectedRow(),5). toString());
				textField_AddrL1.setText(busConTable.getValueAt(busConTable.getSelectedRow(),6). toString());
				textField_AddrL2.setText(busConTable.getValueAt(busConTable.getSelectedRow(),7). toString());
				textField_City.setText(busConTable.getValueAt(busConTable.getSelectedRow(),8). toString());
				textField_Postcode.setText(busConTable.getValueAt(busConTable.getSelectedRow(),9). toString());
			}
		});
		scrollPane.setViewportView(busConTable);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(66, 11, 86, 20);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_FName = new JTextField();
		textField_FName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows only letters
				 char c = e.getKeyChar();
			     if (((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z'))) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_FName.setBounds(66, 33, 86, 20);
		contentPane.add(textField_FName);
		textField_FName.setColumns(10);
		
		textField_LName = new JTextField();
		textField_LName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows only letters
				 char c = e.getKeyChar();
			     if (((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z'))) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_LName.setBounds(66, 56, 86, 20);
		contentPane.add(textField_LName);
		textField_LName.setColumns(10);
		
		textField_Tel = new JTextField();
		// Tel Field Validation
		textField_Tel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows only numbers, back space and +
				 char c = e.getKeyChar();
			     if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  && (c != '+')) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_Tel.setBounds(66, 79, 86, 20);
		contentPane.add(textField_Tel);
		textField_Tel.setColumns(10);
		
		textField_BusTel = new JTextField();
		// Business Tel Field Validation
		textField_BusTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows only numbers, back space and +
				 char c = e.getKeyChar();
			     if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)  && (c != '+')) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_BusTel.setBounds(66, 100, 86, 20);
		contentPane.add(textField_BusTel);
		textField_BusTel.setColumns(10);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 14, 46, 14);
		contentPane.add(lblID);
		
		JLabel lblFName = new JLabel("First Name");
		lblFName.setBounds(10, 36, 46, 14);
		contentPane.add(lblFName);
		
		JLabel lblLName = new JLabel("Last Name");
		lblLName.setBounds(10, 59, 46, 14);
		contentPane.add(lblLName);
		
		JLabel lblTel = new JLabel("Tel");
		lblTel.setBounds(10, 82, 46, 14);
		contentPane.add(lblTel);
		
		JLabel lblBusTel = new JLabel("Business Tel");
		lblBusTel.setBounds(10, 103, 46, 14);
		contentPane.add(lblBusTel);
		
		//Add Button action
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classes.BusinessContact busCon = new Classes.BusinessContact(
						Integer.parseInt(textField_ID.getText()), 
						textField_FName.getText(), 
						textField_LName.getText(), 
						textField_Tel.getText(), 
						textField_BusTel.getText(), 
						textField_Email.getText(), 
						textField_AddrL1.getText(), 
						textField_AddrL2.getText(), 
						textField_City.getText(),
						textField_Postcode.getText());

                mysqlConn.insertContact(busCon);
                
			}
		});
		btnAdd.setBounds(0, 183, 89, 23);
		contentPane.add(btnAdd);
		
		//Update Button action
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classes.BusinessContact busCon = new Classes.BusinessContact(
						Integer.parseInt(textField_ID.getText()), 
						textField_FName.getText(), 
						textField_LName.getText(), 
						textField_Tel.getText(), 
						textField_BusTel.getText(), 
						textField_Email.getText(), 
						textField_AddrL1.getText(), 
						textField_AddrL2.getText(), 
						textField_City.getText(),
						textField_Postcode.getText());

                mysqlConn.updateContact(busCon);
			}
			
		});
		btnUpdate.setBounds(91, 183, 89, 23);
		contentPane.add(btnUpdate);
		
				
		
		//Delete Button action
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classes.BusinessContact busCon = new Classes.BusinessContact(
						Integer.parseInt(textField_ID.getText()), 
						textField_FName.getText(), 
						textField_LName.getText(), 
						textField_Tel.getText(), 
						textField_BusTel.getText(), 
						textField_Email.getText(), 
						textField_AddrL1.getText(), 
						textField_AddrL2.getText(), 
						textField_City.getText(),
						textField_Postcode.getText());
				
                mysqlConn.deleteContact(busCon);
			}
		});
		btnDelete.setBounds(182, 183, 89, 23);
		contentPane.add(btnDelete);
		
		//Exit Button action
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //close the current view
			}
		});
		btnExit.setBounds(404, 183, 89, 23);
		contentPane.add(btnExit);
		
		btnHomepage = new JButton("Homepage");
		btnHomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage home = new Homepage();
				dispose(); //close the current view
				home.frame.setVisible(true); //open the Homepage view
			}
		});
		btnHomepage.setBounds(313, 183, 89, 23);
		contentPane.add(btnHomepage);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(397, 11, 86, 20);
		contentPane.add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_AddrL1 = new JTextField();
		textField_AddrL1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows letters, numbers, space, period and coma
				 char c = e.getKeyChar();
			     if (((c < 'A') || (c > 'Z')) 
			    		 && ((c < 'a') || (c > 'z'))
			    		 && ((c < '0') || (c > '9')) 
			    		 && (c != KeyEvent.VK_BACK_SPACE)  
			    		 && (c != '.')
			    		 && (c != ',')) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_AddrL1.setBounds(397, 33, 86, 20);
		contentPane.add(textField_AddrL1);
		textField_AddrL1.setColumns(10);
		
		textField_AddrL2 = new JTextField();
		textField_AddrL2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows letters, numbers, space, period and coma
				 char c = e.getKeyChar();
			     if (((c < 'A') || (c > 'Z')) 
			    		 && ((c < 'a') || (c > 'z'))
			    		 && ((c < '0') || (c > '9')) 
			    		 && (c != KeyEvent.VK_BACK_SPACE)  
			    		 && (c != '.')
			    		 && (c != ',')) {
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_AddrL2.setBounds(397, 56, 86, 20);
		contentPane.add(textField_AddrL2);
		textField_AddrL2.setColumns(10);
		
		textField_City = new JTextField();
		textField_City.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// allows only letters and space
				 char c = e.getKeyChar();
			     if (((c < 'A') || (c > 'Z')) 
			    		 && ((c < 'a') || (c > 'z'))
			    		 && (c != KeyEvent.VK_BACK_SPACE)){
			    	 e.consume();  // ignore event
			     }
			}
		});
		textField_City.setBounds(397, 79, 86, 20);
		contentPane.add(textField_City);
		textField_City.setColumns(10);
		
		textField_Postcode = new JTextField();
		textField_Postcode.setBounds(397, 100, 86, 20);
		contentPane.add(textField_Postcode);
		textField_Postcode.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(306, 14, 46, 14);
		contentPane.add(lblEmail);
		
		lblAddrL1 = new JLabel("Address Line 1");
		lblAddrL1.setBounds(306, 36, 46, 14);
		contentPane.add(lblAddrL1);
		
		lblAddrL2 = new JLabel("Address Line 2");
		lblAddrL2.setBounds(306, 59, 46, 14);
		contentPane.add(lblAddrL2);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(306, 82, 46, 14);
		contentPane.add(lblCity);
		
		lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(306, 103, 46, 14);
		contentPane.add(lblPostcode);
		
		//Display content in the table
		busConTable.setModel(DbUtils.resultSetToTableModel(mysqlConn.view()));
	}

}
