package GUI;

import java.awt.EventQueue;
import Backend.Reader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCows;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Reader read = new Reader();
		read.initialize_cows();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setResizable(false);
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("View Cows");
		btnNewButton.setBounds(324, 26, 106, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewCows userViewGUI = new ViewCows();
                userViewGUI.setVisible(true);
                HomePage.this.dispose();
            }
        });
		
		txtCows = new JTextField();
		txtCows.setBounds(10, 16, 126, 31);
		txtCows.setEditable(false);
		txtCows.setFont(new Font("Stencil", Font.BOLD, 20));
		txtCows.setBackground(new Color(0, 255, 0));
		txtCows.setText("Moodicine");
		contentPane.add(txtCows);
		txtCows.setColumns(10);
		txtCows.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JEditorPane dtrpnHello = new JEditorPane();
		dtrpnHello.setBounds(0, 0, 497, 67);
		dtrpnHello.setBackground(new Color(0, 255, 0));
		contentPane.add(dtrpnHello);
		
		JTextArea txtrCowIsAn = new JTextArea();
		txtrCowIsAn.setBackground(new Color(255, 255, 255));
		txtrCowIsAn.setEditable(false);
		txtrCowIsAn.setText("Moodicine is an innovative program designed to assist farmers and veterinarians in \n"
				+ "monitoring and predicting the health status of cows. With Moodicine, users can easily \n"
				+ "input detailed information about individual cows, such as age, weight, feeding \n"
				+ "habits, and physical symptoms. Once the data is entered, users can initiate the \n"
				+ "analysis process by pressing the \"Analyze\" button. Behind the scenes, \n"
				+ "Moodicine utilizes prediction algorithms based off of extensive datasets \n"
				+ "of cow health records. These algorithms analyze the input data to identify potential \n"
				+ "health issues, detect early signs of diseases, and predict future health outcomes \n"
				+ "for the cows. The program provides users with comprehensive reports and insights, \n"
				+ "highlighting any detected health issues, their severity, and recommended actions for \n"
				+ "prevention or treatment. Additionally, Moodicine offers personalized \n"
				+ "recommendations and guidelines for maintaining optimal health and well-being for \n"
				+ "individual cows based on their specific characteristics.");
		txtrCowIsAn.setBounds(10, 70, 445, 212);
		contentPane.add(txtrCowIsAn);
	}
}
