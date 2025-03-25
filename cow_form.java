package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Backend.Reader;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class cow_form extends JFrame {
	Reader read = new Reader();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblHeight;
	private JTextField textField_2;
	private JLabel lblActivity;
	private JTextField textField;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxLow;
	private JLabel lblAppetite;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JLabel lblBlisters;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JCheckBox chckbxNewCheckBox_8;
	private JCheckBox chckbxNewCheckBox_9;
	private JLabel lblBreed;
	private JTextField textField_3;
	private JLabel lblColor;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblBreed_2;
	private JLabel lblBreed_1;
	private JCheckBox chckbxYes;
	private JCheckBox chckbxNewCheckBox_11;
	private JLabel lblBreed_3;
	private JCheckBox chckbxYes_1;
	private JCheckBox chckbxNo;
	private JLabel lblBreed_4;
	private JCheckBox chckbxYes_2;
	private JCheckBox chckbxYes_3;
	private JCheckBox chckbxYes_4;
	private JLabel lblBreed_5;
	private JCheckBox chckbxYes_5;
	private JCheckBox chckbxYes_6;
	private JLabel lblTemperature;
	private JTextField textField_6;
	private JLabel lblSkin;
	private JLabel lblSwelling;
	private JCheckBox chckbxNewCheckBox_6_2;
	private JCheckBox chckbxNewCheckBox_4_2;
	private JCheckBox chckbxNewCheckBox_5_2;
	private JCheckBox chckbxNewCheckBox_7_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cow_form frame = new cow_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public class Cow {
		private String name;
		private int age;
		private double height;
		private String activity;
		private String appetite;
		private List<String> blisters;
		private String breed;
		private String color;
		private String congestion;
		private String cough;
		private String hoofHealth;
		private String milkAppearance;
		private List<String> skin;
		private List<String> swelling;
		private double temperature;
		private double weight;

		// Constructor
		public Cow(String name, int age, double height, String activity, String appetite, List<String> blisters,
				String breed, String color, String congestion, String cough, String hoofHealth, String milkAppearance,
				List<String> skin, List<String> swelling, double temperature, double weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.activity = activity;
			this.appetite = appetite;
			this.blisters = blisters;
			this.breed = breed;
			this.color = color;
			this.congestion = congestion;
			this.cough = cough;
			this.hoofHealth = hoofHealth;
			this.milkAppearance = milkAppearance;
			this.skin = skin;
			this.swelling = swelling;
			this.temperature = temperature;
			this.weight = weight;
		}
	}

	/**
	 * Create the frame.
	 */
	public cow_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(31, 0, 86, 23);
		contentPane.add(lblNewLabel);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(31, 57, 45, 13);
		contentPane.add(lblAge);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 76, 111, 23);
		contentPane.add(textField_1);
		String age = textField_1.getText();
		
		lblHeight = new JLabel("Height");
		lblHeight.setBounds(31, 109, 45, 13);
		contentPane.add(lblHeight);

		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 128, 111, 23);
		contentPane.add(textField_2);
		String heigh = textField_1.getText();
		
		lblActivity = new JLabel("Activity");
		lblActivity.setBounds(31, 161, 45, 13);
		contentPane.add(lblActivity);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(31, 24, 111, 23);
		contentPane.add(textField);
		String name = textField.getText();
		
		chckbxNewCheckBox = new JCheckBox("Normal");
		chckbxNewCheckBox.setBounds(24, 180, 66, 21);
		contentPane.add(chckbxNewCheckBox);
		String active = "";
		if(chckbxNewCheckBox.isSelected()) {
			active = "Normal";
		}
		
		chckbxLow = new JCheckBox("Low");
		chckbxLow.setBounds(92, 180, 66, 21);
		contentPane.add(chckbxLow);
		if(chckbxLow.isSelected()) {
			active = "Low";
		}
		
		lblAppetite = new JLabel("Appetite");
		lblAppetite.setBounds(31, 207, 45, 13);
		contentPane.add(lblAppetite);

		chckbxNewCheckBox_1 = new JCheckBox("High");
		chckbxNewCheckBox_1.setBounds(24, 226, 66, 21);
		contentPane.add(chckbxNewCheckBox_1);
		String apetite = "";
		if(chckbxNewCheckBox_1.isSelected()) {
			apetite = "High";
		}
		chckbxNewCheckBox_2 = new JCheckBox("Normal");
		chckbxNewCheckBox_2.setBounds(92, 226, 66, 21);
		contentPane.add(chckbxNewCheckBox_2);
		if(chckbxNewCheckBox_2.isSelected()) {
			apetite = "Normal";
		}
		
		chckbxNewCheckBox_3 = new JCheckBox("Low");
		chckbxNewCheckBox_3.setBounds(24, 249, 66, 21);
		contentPane.add(chckbxNewCheckBox_3);
		if(chckbxNewCheckBox_3.isSelected()) {
			apetite = "Low";
		}
		
		lblBlisters = new JLabel("Blisters");
		lblBlisters.setBounds(31, 276, 45, 13);
		contentPane.add(lblBlisters);

		chckbxNewCheckBox_4 = new JCheckBox("Tongue");
		chckbxNewCheckBox_4.setBounds(24, 295, 66, 21);
		contentPane.add(chckbxNewCheckBox_4);
		String blisters = "";
		
		chckbxNewCheckBox_5 = new JCheckBox("Lips");
		chckbxNewCheckBox_5.setBounds(92, 295, 66, 21);
		contentPane.add(chckbxNewCheckBox_5);

		chckbxNewCheckBox_6 = new JCheckBox("Nostrils");
		chckbxNewCheckBox_6.setBounds(24, 318, 66, 21);
		contentPane.add(chckbxNewCheckBox_6);

		chckbxNewCheckBox_7 = new JCheckBox("Hooves");
		chckbxNewCheckBox_7.setBounds(92, 318, 66, 21);
		contentPane.add(chckbxNewCheckBox_7);

		chckbxNewCheckBox_8 = new JCheckBox("Teats");
		chckbxNewCheckBox_8.setBounds(24, 341, 66, 21);
		contentPane.add(chckbxNewCheckBox_8);
		if(chckbxNewCheckBox_4.isSelected()){
			blisters = "Tongue";
		}
		if(chckbxNewCheckBox_5.isSelected()){
			blisters = "Tongue";
		}
		if(chckbxNewCheckBox_6.isSelected()){
			blisters = "Tongue";
		}
		if(chckbxNewCheckBox_7.isSelected()){
			blisters = "Tongue";
		}
		if(chckbxNewCheckBox_8.isSelected()){
			blisters = "Tongue";
		}
		chckbxNewCheckBox_9 = new JCheckBox("None");
		chckbxNewCheckBox_9.setBounds(92, 341, 66, 21);
		contentPane.add(chckbxNewCheckBox_9);

		lblBreed = new JLabel("Breed");
		lblBreed.setBounds(207, 5, 45, 13);
		contentPane.add(lblBreed);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(207, 26, 111, 23);
		contentPane.add(textField_3);
		String breed = textField_3.getText();
		
		lblColor = new JLabel("Color");
		lblColor.setBounds(207, 57, 45, 13);
		contentPane.add(lblColor);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(207, 78, 111, 23);
		contentPane.add(textField_4);
		String color = textField_4.getText();
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(207, 130, 111, 23);
		contentPane.add(textField_5);
		String weight = textField_5.getText();
		
		lblBreed_2 = new JLabel("Weight");
		lblBreed_2.setBounds(207, 109, 45, 13);
		contentPane.add(lblBreed_2);

		lblBreed_1 = new JLabel("Congestion");
		lblBreed_1.setBounds(207, 161, 66, 13);
		contentPane.add(lblBreed_1);

		chckbxYes = new JCheckBox("Yes");
		chckbxYes.setBounds(198, 180, 66, 21);
		contentPane.add(chckbxYes);
		String congest = "";
		if(chckbxYes.isSelected()) {
			congest = "Yes";
		}
		
		chckbxNewCheckBox_11 = new JCheckBox("No");
		chckbxNewCheckBox_11.setBounds(266, 180, 66, 21);
		contentPane.add(chckbxNewCheckBox_11);
		if(chckbxNewCheckBox_11.isSelected()) {
			congest = "No";
		}
		
		lblBreed_3 = new JLabel("Coughing");
		lblBreed_3.setBounds(207, 207, 45, 13);
		contentPane.add(lblBreed_3);

		chckbxYes_1 = new JCheckBox("Yes");
		chckbxYes_1.setBounds(198, 226, 66, 21);
		contentPane.add(chckbxYes_1);
		String cough = "";
		if(chckbxNewCheckBox_1.isSelected()) {
			cough = "Yes";
		}
		
		chckbxNo = new JCheckBox("No");
		chckbxNo.setBounds(266, 226, 66, 21);
		contentPane.add(chckbxNo);
		if(chckbxNewCheckBox_1.isSelected()) {
			cough = "No";
		}
		
		lblBreed_4 = new JLabel("Hoof Health");
		lblBreed_4.setBounds(207, 253, 66, 13);
		contentPane.add(lblBreed_4);
		String hoof= "";
		
		chckbxYes_2 = new JCheckBox("Healthy");
		chckbxYes_2.setBounds(198, 272, 66, 21);
		contentPane.add(chckbxYes_2);

		chckbxYes_3 = new JCheckBox("Hemorrage");
		chckbxYes_3.setBounds(266, 272, 86, 21);
		contentPane.add(chckbxYes_3);

		chckbxYes_4 = new JCheckBox("Foot Ulcers");
		chckbxYes_4.setBounds(198, 295, 96, 21);
		contentPane.add(chckbxYes_4);

		lblBreed_5 = new JLabel("Milk Appearance");
		lblBreed_5.setBounds(207, 322, 87, 13);
		contentPane.add(lblBreed_5);

		chckbxYes_5 = new JCheckBox("Healthy");
		chckbxYes_5.setBounds(198, 341, 66, 21);
		contentPane.add(chckbxYes_5);
		String milk = "";
		if(chckbxYes_5.isSelected()) {
			apetite = "Healthy";
		}
		
		chckbxYes_6 = new JCheckBox("Irregular");
		chckbxYes_6.setBounds(266, 341, 66, 21);
		contentPane.add(chckbxYes_6);
		if(chckbxYes_6.isSelected()) {
			apetite = "Irregular";
		}
		
		lblTemperature = new JLabel("Temperature");
		lblTemperature.setBounds(393, 5, 66, 13);
		contentPane.add(lblTemperature);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(393, 26, 111, 23);
		contentPane.add(textField_6);
		String temp = textField_6.getText();
		
		lblSkin = new JLabel("Skin");
		lblSkin.setBounds(393, 57, 66, 13);
		contentPane.add(lblSkin);

		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("Healthy");
		chckbxNewCheckBox_4_1.setBounds(389, 76, 66, 21);
		contentPane.add(chckbxNewCheckBox_4_1);
		String skin = "";
		if(chckbxNewCheckBox_4_1.isSelected()){
			skin = "Healthy";
		}
		
		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("Scabs");
		chckbxNewCheckBox_5_1.setBounds(457, 76, 66, 21);
		contentPane.add(chckbxNewCheckBox_5_1);
		if(chckbxNewCheckBox_5_1.isSelected()){
			skin = "scabs";
		}
		
		JCheckBox chckbxNewCheckBox_6_1 = new JCheckBox("Lesions");
		chckbxNewCheckBox_6_1.setBounds(389, 99, 66, 21);
		contentPane.add(chckbxNewCheckBox_6_1);
		if(chckbxNewCheckBox_6_1.isSelected()){
			skin = "Lesions";
		}
		
		JCheckBox chckbxNewCheckBox_7_1 = new JCheckBox("Redness");
		chckbxNewCheckBox_7_1.setBounds(457, 99, 66, 21);
		contentPane.add(chckbxNewCheckBox_7_1);
		if(chckbxNewCheckBox_7_1.isSelected()){
			skin = "Redness";
		}

		lblSwelling = new JLabel("Swelling");
		lblSwelling.setBounds(389, 133, 66, 13);
		contentPane.add(lblSwelling);

		chckbxNewCheckBox_6_2 = new JCheckBox("Body");
		chckbxNewCheckBox_6_2.setBounds(389, 175, 66, 21);
		contentPane.add(chckbxNewCheckBox_6_2);

		chckbxNewCheckBox_4_2 = new JCheckBox("Head");
		chckbxNewCheckBox_4_2.setBounds(389, 152, 66, 21);
		contentPane.add(chckbxNewCheckBox_4_2);
		

		chckbxNewCheckBox_5_2 = new JCheckBox("Legs");
		chckbxNewCheckBox_5_2.setBounds(457, 152, 66, 21);
		contentPane.add(chckbxNewCheckBox_5_2);

		chckbxNewCheckBox_7_2 = new JCheckBox("None");
		chckbxNewCheckBox_7_2.setBounds(457, 175, 66, 21);
		contentPane.add(chckbxNewCheckBox_7_2);
		String swell;
		if(chckbxNewCheckBox_4_2.isSelected()){
			swell = "Legs";
		}
		if(chckbxNewCheckBox_5_2.isSelected()){
			skin = "Legs";
		}
		if(chckbxNewCheckBox_6_2.isSelected()){
			skin = "Legs";
		}
		if(chckbxNewCheckBox_7_2.isSelected()){
			skin = "Healthy";
		}
		
		JButton btnNewButton = new JButton("Submit Info");
		btnNewButton.setBounds(393, 207, 111, 40);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setBounds(393, 260, 111, 44);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("View Cows");
		btnNewButton_1_1.setBounds(393, 318, 111, 44);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//String[] cow = {name, active, age, apetite, blisters, breed, color, congest, cough, heigh, hoof, milk, skin, swell, temp, weight};
				ViewCows userViewGUI = new ViewCows();
				userViewGUI.setVisible(true);
				cow_form.this.dispose();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				HomePage userViewGUI = new HomePage();
				userViewGUI.setVisible(true);
				cow_form.this.dispose();
			}
		});

		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCows userViewGUI = new ViewCows();
				userViewGUI.setVisible(true);
				cow_form.this.dispose();
			}
		});

	}
}
