import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;

public class MainPanel{

	private JFrame frmMartinsProgram;
	private final ButtonGroup StarFtGroup = new ButtonGroup();
	private final ButtonGroup FirstFtGroup = new ButtonGroup();
	private final ButtonGroup SecondFtGroup = new ButtonGroup();
	private final ButtonGroup ThirdFtGroup = new ButtonGroup();
	JButton logout = new JButton("Logout");
	private final JButton button = new JButton("Open");

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPanel window = new MainPanel();
					window.frmMartinsProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmMartinsProgram = new JFrame();
		frmMartinsProgram.setTitle("Martin's Program");
		frmMartinsProgram.setResizable(false);
		frmMartinsProgram.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmMartinsProgram.setBackground(Color.WHITE);
		frmMartinsProgram.getContentPane().setForeground(Color.WHITE);
		frmMartinsProgram.setForeground(Color.CYAN);
		frmMartinsProgram.setBounds(100, 100, 425, 516);
		frmMartinsProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 10, 399, 100);
		ImageIcon image = new ImageIcon(this.getClass().getResource(("icon.png")));
		frmMartinsProgram.getContentPane().setLayout(null);
		label.setIcon(image);
		frmMartinsProgram.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Encryption");
		lblNewLabel.setBounds(20, 120, 129, 56);
		frmMartinsProgram.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Open");
		btnNewButton.setBounds(221, 132, 129, 37);
		frmMartinsProgram.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encryption temp001 =new Encryption();
				temp001.newFrame();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Decryption");
		lblNewLabel_1.setBounds(20, 186, 129, 56);
		frmMartinsProgram.getContentPane().add(lblNewLabel_1);
		button.setBounds(221, 198, 129, 37);
		frmMartinsProgram.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Decryption temp002 = new Decryption();
				temp002.newFrame();
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(24, 140, 129, 56);
		frmMartinsProgram.getContentPane().add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 264, 389, 165);
		frmMartinsProgram.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4,3));
		
		JLabel lblNewLabel_2 = new JLabel("Function3");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Enable");
		SecondFtGroup.add(rdbtnNewRadioButton_3);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Disable");
		SecondFtGroup.add(rdbtnNewRadioButton_6);
		panel.add(rdbtnNewRadioButton_6);
		
		JLabel lblNewLabel_3 = new JLabel("Function4");
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Enable");
		ThirdFtGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Disable");
		ThirdFtGroup.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_6.setSelected(true);
		rdbtnNewRadioButton_7.setSelected(true);
		
		setSelected(ThirdFtGroup,false);
		panel.add(rdbtnNewRadioButton_7);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == logout) {
					LoginPanel temp = new LoginPanel();
					temp.BackScreen();
					frmMartinsProgram.dispose();
				}
			}
		});

		

		logout.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		logout.setBounds(319, 454, 90, 23);
		frmMartinsProgram.getContentPane().add(logout);
	}

	private void setSelected(ButtonGroup ThirdFtGroup2, boolean b) {
		// TODO Auto-generated method stub
		
	}
}
