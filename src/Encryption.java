import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPanel;

public class Encryption {

	private JFrame frmEncryptText;
	
	JTextArea textArea_1 = new JTextArea();
	char process;
	int b;
	String input = "";

	/**
	 * Launch the application.
	 */
	public static void newFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encryption window = new Encryption();
					window.frmEncryptText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Encryption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEncryptText = new JFrame();
		frmEncryptText.setTitle("Encrypt Text");
		frmEncryptText.setBounds(100, 100, 450, 300);
		frmEncryptText.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Encryption:");
		lblNewLabel.setBounds(20, 10, 97, 15);
		frmEncryptText.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 35, 404, 98);
		frmEncryptText.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(20, 143, 46, 15);
		frmEncryptText.getContentPane().add(lblResult);
		
		JButton encrypt = new JButton("Encrypt");
		encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==encrypt) {
					for (int i=0;i<textArea.getText().length();i++) {
						process = textArea.getText().charAt(i);
						if ((process >='A' && process<='Z')|| (process >='a' && process<='z'))
							process += (char)2;
							if (process >'z') {
								b = (int)process - 'z' +'a' - 1;
								process = (char)b;
							}
							else if(process>'Z' && process<'a') {
								b=(int)process -'Z'+'A' -1; 
								process=(char)b;
							}
						input += process+"";
						
					}
					textArea_1.setText(input);
					input="";
				}
			}
		});
		encrypt.setBounds(251, 143, 87, 23);
		frmEncryptText.getContentPane().add(encrypt);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEncryptText.dispose();
			}
		});
		btnBack.setBounds(337, 143, 87, 23);
		frmEncryptText.getContentPane().add(btnBack);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 169, 404, 82);
		frmEncryptText.getContentPane().add(scrollPane_1);
				textArea_1.setEditable(false);
				scrollPane_1.setViewportView(textArea_1);
		
				textArea_1.setBackground(UIManager.getColor("Button.background"));
	}
}
