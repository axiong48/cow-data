package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Backend.Reader;

import javax.swing.JToolBar;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;

public class ViewCows extends JFrame {
	Reader read = new Reader();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    Reader.initialize_cows(); // Call initialize_cows method
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                ViewCows frame = new ViewCows();
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
	public ViewCows() {
		setResizable(false);
		setTitle("View Cows");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(201, 27, 106, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage userViewGUI = new HomePage();
                userViewGUI.setVisible(true);
                ViewCows.this.dispose();
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
		
		contentPane.setLayout(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		contentPane.add(btnNewButton);
		
		JButton btnAddCow = new JButton("Add Cow");
		btnAddCow.setForeground(Color.BLACK);
		btnAddCow.setBackground(Color.WHITE);
		btnAddCow.setBounds(331, 27, 106, 21);
		contentPane.add(btnAddCow);
		
		JEditorPane dtrpnHello = new JEditorPane();
		dtrpnHello.setBounds(0, 0, 497, 67);
		dtrpnHello.setBackground(new Color(0, 255, 0));
		contentPane.add(dtrpnHello);
		
		 // Initialize and populate display list
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 108, 200, 200); // Adjust the bounds as needed

        // Create a JList and populate it with cow data
        JList<String> cowList = new JList<>(getListOfCows());
        
        // Add the JList to the JScrollPane
        scrollPane.setViewportView(cowList);
        
        // Add the JScrollPane to the content pane
        contentPane.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("Breed");
        lblNewLabel.setBounds(240, 110, 67, 13);
        contentPane.add(lblNewLabel);
        
        JLabel lblTemperature = new JLabel("Temp");
        lblTemperature.setBounds(240, 144, 67, 13);
        contentPane.add(lblTemperature);
        
        JLabel lblHeight = new JLabel("Height");
        lblHeight.setBounds(240, 180, 67, 13);
        contentPane.add(lblHeight);
        
        JLabel lblWeight = new JLabel("Weight");
        lblWeight.setBounds(240, 219, 67, 13);
        contentPane.add(lblWeight);
        
        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(240, 260, 67, 13);
        contentPane.add(lblAge);
        
        JLabel lblAge_1 = new JLabel("Color");
        lblAge_1.setBounds(240, 295, 67, 13);
        contentPane.add(lblAge_1);
        
        textField = new JTextField();
        textField.setBounds(317, 107, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(317, 141, 96, 19);
        contentPane.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(317, 177, 96, 19);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(317, 216, 96, 19);
        contentPane.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(317, 257, 96, 19);
        contentPane.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(317, 289, 96, 19);
        contentPane.add(textField_5);
        
        JButton btnNewButton_1 = new JButton("Analyze");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btnNewButton_1.setBounds(156, 346, 151, 43);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.setBorder(new RoundedBorder(20));
        
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Analyze userViewGUI = new Analyze();
                userViewGUI.setVisible(true);
                ViewCows.this.dispose();
            }
        });
        
        btnAddCow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cow_form userViewGUI = new cow_form();
                userViewGUI.setVisible(true);
                ViewCows.this.dispose();
            }
        });
        
        cowList.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCow = cowList.getSelectedValue();
                    String[] currCow = read.getCow(selectedCow);
                    if (selectedCow != null) {
                        // Assuming each cow's data is formatted as a single string
                        
                        textField.setText(currCow[4]);
                        
                        textField_1.setText(currCow[12]); // Assuming the first element is cow's name
                        
                        textField_2.setText(currCow[7]);
                        
                        textField_3.setText(currCow[13]);
                        
                        textField_4.setText(currCow[2]);
                        
                        textField_5.setText(currCow[5]);
                    }
                }
            }
        });


	}
	
    static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.BLACK);
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }


    public String[] getListOfCows() {
    	Reader read = new Reader();
        String[] cowNames = new String[read.getSize()];
        for (int i = 0; i < read.getSize(); i++) {
            cowNames[i] = read.getName(i); // Assuming the first element of each cow's data is its name
        }
        return cowNames;
    }
}
