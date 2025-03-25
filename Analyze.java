package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Backend.Reader;
import javax.swing.ScrollPaneConstants;

public class Analyze extends JFrame {
	public static Reader read = new Reader();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					read.initialize_cows();
					Analyze frame = new Analyze();
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
	public Analyze() {
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
				Analyze.this.dispose();
			}
		});

		JTextField txtCows = new JTextField();
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

		// Initialize and populate display list
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 108, 150, 200); // Adjust the bounds as needed

		// Create a JList and populate it with cow data
		JList<String> cowList = new JList<>(read.analyze());
		// Add the JList to the JScrollPane
		scrollPane.setViewportView(cowList);

		// Add the JScrollPane to the content pane
		contentPane.add(scrollPane);
		
		 JTextArea txtrCowIsAn1 = new JTextArea();
 		txtrCowIsAn1.setBackground(new Color(255, 255, 255));
 		txtrCowIsAn1.setEditable(false);
 		txtrCowIsAn1.setText("");
 		txtrCowIsAn1.setBounds(220, 108, 235, 200);
 		
 		
 		JScrollPane scrollPane_1 = new JScrollPane();
 		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
 		scrollPane_1.setBounds(170, 108, 285, 200);
 		contentPane.add(scrollPane_1);
 		scrollPane_1.setViewportView(txtrCowIsAn1);
 		scrollPane_1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0)); // Small vertical scroll bar
        
		
		cowList.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCow = cowList.getSelectedValue();
                    String[] currCow = Reader.getCow(selectedCow);
                    
                    if (selectedCow != null) {
                 		txtrCowIsAn1.setText(currCow[10]);
                    }
                }
            }
        });
	}
	    

}
