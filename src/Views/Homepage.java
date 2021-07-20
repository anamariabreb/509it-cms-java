package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPersonalContacts = new JButton("Personal Contacts");
		btnPersonalContacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalContact persCon = new PersonalContact();
				frame.dispose(); //close the current view
				persCon.setVisible(true); //open the Personal Contact view
			}
		});
		btnPersonalContacts.setBounds(138, 203, 143, 23);
		frame.getContentPane().add(btnPersonalContacts);
		
		JButton btnNewButton = new JButton("Business Contacts");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusinessContact persCon = new BusinessContact();
				frame.dispose(); //close the current view
				persCon.setVisible(true); //open the Business Contact view
			}
		});
		btnNewButton.setBounds(387, 203, 159, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome! What would you like to do today?");
		lblNewLabel.setBounds(237, 65, 210, 56);
		frame.getContentPane().add(lblNewLabel);
	}
}
