import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class LoginPanel extends JFrame{

	private JFrame frmLogin;
	private JTextField account;
	private JPasswordField password = new JPasswordField();
	private JButton login = new JButton("Login");
	private JLabel message = new JLabel("----------Please Log in----------");
	private final JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel window = new LoginPanel();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void BackScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel window = new LoginPanel();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		login.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == login) {
					if(account.getText().equals("test001")&& password.getText().equals("aaaaa")) {
						JOptionPane.showMessageDialog(null,"----------Welcome Martin----------");
						frmLogin.dispose();
						MainPanel main = new MainPanel();
						main.NewScreen();	
					}
					else
						message.setText("Wrong account/password");
					
				}
			}
		});
		login.setBounds(258, 108, 90, 23);
		frmLogin.getContentPane().add(login);

		
		message.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		message.setBounds(100, 10, 205, 23);
		frmLogin.getContentPane().add(message);
		panel.setBounds(49, 81, 205, 50);
		
		frmLogin.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2));
		
		JLabel lblAccoount = new JLabel("Account:");
		panel.add(lblAccoount);
		
		account = new JTextField();
		panel.add(account);
		account.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		panel.add(lblPassword);
		panel.add(password);
		password.setColumns(10);
				
	}
	
}
