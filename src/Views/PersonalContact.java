package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbConn.personalDbConn;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonalContact extends JFrame {

	private JPanel contentPane;
	private JTable persConTable;
	private JTextField textField_ID;
	private JTextField textField_FName;
	private JTextField textField_LName;
	private JTextField textField_Tel;
	private JTextField textField_HomeTel;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnExit;
	private JButton btnHomepage;
	private JLabel lblID;
	private JLabel lblFName;
	private JLabel lblLName;
	private JLabel lblTel;
	private JLabel lblHomeTel;
	private JTextField textField_Email;
	private JTextField textField_AddrL1;
	private JTextField textField_AddrL2;
	private JTextField textField_City;
	private JTextField textField_Postcode;
	private JLabel lblNewLabel;
	private JLabel lblAddrL1;
	private JLabel lblAddrL2;
	private JLabel lblCity;
	private JLabel lblPostcode;

	dbConn.personalDbConn mysqlConn = new personalDbConn();
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalContact frame = new PersonalContact();
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
	public PersonalContact() {
		mysqlConn.Connect();
		
		
		setTitle("Personal Contacts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 217, 493, 66);
		contentPane.add(scrollPane);
		
		persConTable = new JTable();
		scrollPane.setViewportView(persConTable);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(67, 11, 86, 20);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_FName = new JTextField();
		textField_FName.setBounds(67, 35, 86, 20);
		contentPane.add(textField_FName);
		textField_FName.setColumns(10);
		
		textField_LName = new JTextField();
		textField_LName.setBounds(67, 59, 86, 20);
		contentPane.add(textField_LName);
		textField_LName.setColumns(10);
		
		textField_Tel = new JTextField();
		textField_Tel.setBounds(67, 82, 86, 20);
		contentPane.add(textField_Tel);
		textField_Tel.setColumns(10);
		
		textField_HomeTel = new JTextField();
		textField_HomeTel.setBounds(67, 106, 86, 20);
		contentPane.add(textField_HomeTel);
		textField_HomeTel.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classes.PersonalContact persCon = new Classes.PersonalContact(
						Integer.parseInt(textField_ID.getText()), 
						textField_FName.getText(), 
						textField_LName.getText(), 
						textField_Tel.getText(), 
						textField_HomeTel.getText(), 
						textField_Email.getText(), 
						textField_AddrL1.getText(), 
						textField_AddrL2.getText(), 
						textField_City.getText(),
						textField_Postcode.getText());

                mysqlConn.insertContact(persCon);
			}
		});
		btnAdd.setBounds(0, 183, 89, 23);
		contentPane.add(btnAdd);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(91, 183, 89, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(182, 183, 89, 23);
		contentPane.add(btnDelete);
		
		btnExit = new JButton("Exit");
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
		
		lblID = new JLabel("ID");
		lblID.setBounds(11, 14, 46, 14);
		contentPane.add(lblID);
		
		lblFName = new JLabel("First Name");
		lblFName.setBounds(11, 38, 63, 14);
		contentPane.add(lblFName);
		
		lblLName = new JLabel("Last Name");
		lblLName.setBounds(11, 62, 63, 14);
		contentPane.add(lblLName);
		
		lblTel = new JLabel("Tel");
		lblTel.setBounds(11, 85, 46, 14);
		contentPane.add(lblTel);
		
		lblHomeTel = new JLabel("Home Tel");
		lblHomeTel.setBounds(11, 109, 46, 14);
		contentPane.add(lblHomeTel);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(397, 11, 86, 20);
		contentPane.add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_AddrL1 = new JTextField();
		textField_AddrL1.setBounds(397, 35, 86, 20);
		contentPane.add(textField_AddrL1);
		textField_AddrL1.setColumns(10);
		
		textField_AddrL2 = new JTextField();
		textField_AddrL2.setBounds(397, 59, 86, 20);
		contentPane.add(textField_AddrL2);
		textField_AddrL2.setColumns(10);
		
		textField_City = new JTextField();
		textField_City.setBounds(397, 82, 86, 20);
		contentPane.add(textField_City);
		textField_City.setColumns(10);
		
		textField_Postcode = new JTextField();
		textField_Postcode.setBounds(397, 106, 86, 20);
		contentPane.add(textField_Postcode);
		textField_Postcode.setColumns(10);
		
		lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(313, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblAddrL1 = new JLabel("Address Line 1");
		lblAddrL1.setBounds(313, 38, 89, 17);
		contentPane.add(lblAddrL1);
		
		lblAddrL2 = new JLabel("Address Line 2");
		lblAddrL2.setBounds(313, 62, 74, 14);
		contentPane.add(lblAddrL2);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(313, 85, 46, 14);
		contentPane.add(lblCity);
		
		lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(313, 109, 46, 14);
		contentPane.add(lblPostcode);
		
		//Display content in the table
		persConTable.setModel(DbUtils.resultSetToTableModel(mysqlConn.view()));
	}
}
