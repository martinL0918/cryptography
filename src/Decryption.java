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

public class Decryption {

	private JFrame frmDecryptText;
	
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
					Decryption window = new Decryption();
					window.frmDecryptText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Decryption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDecryptText = new JFrame();
		frmDecryptText.setTitle("Decrypt Text");
		frmDecryptText.setBounds(100, 100, 450, 300);
		frmDecryptText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDecryptText.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Decryption:");
		lblNewLabel.setBounds(20, 10, 97, 15);
		frmDecryptText.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 35, 404, 98);
		frmDecryptText.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(20, 143, 46, 15);
		frmDecryptText.getContentPane().add(lblResult);
		
		JButton decrypt = new JButton("Decrpyt");
		decrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==decrypt) {
					for (int i=0;i<textArea.getText().length();i++) {
						process = textArea.getText().charAt(i);
						if ((process >='A' && process<='Z')|| (process >='a' && process<='z'))
							process -= 2;
						if (process <'a' && process >'Z') {
							b = (int)process + 'z' -'a' + 1;
							process = (char)b;
						}
						input += process+"";
						
					}
					textArea_1.setText(input);
					input="";
				}
			}
		});
		decrypt.setBounds(251, 143, 87, 23);
		frmDecryptText.getContentPane().add(decrypt);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDecryptText.dispose();
			}
		});
		btnBack.setBounds(337, 143, 87, 23);
		frmDecryptText.getContentPane().add(btnBack);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 169, 404, 82);
		frmDecryptText.getContentPane().add(scrollPane_1);
				textArea_1.setEditable(false);
				scrollPane_1.setViewportView(textArea_1);
		
				textArea_1.setBackground(UIManager.getColor("Button.background"));
	}
}
