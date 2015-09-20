package main;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.sql.SQLException;

public class signframe {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JPanel content;
	private JPanel panel_1,panel_2,panel_4,panel_5,panel_6,panel_7;
	//private JPanel panel_zhuce; 
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton button_submit;
	private JPasswordField passwordField; 
	private ButtonGroup group1,group2;
	private JRadioButton radioButton, radioButton_1, radioButton_2, radioButton_3, radioButton_4;
	private JLabel yanzhengma;
	private JComboBox  comboBox;
	
	private int id = 0;
	public static String name;
	private String password;
	private String phonenumber;
	private String mail;
	private int sex;
	private int VIP;
	
	//蝕尼方象垂
	private Forsql sql = new Forsql();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signframe window = new signframe();
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
	public signframe() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 220, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("鞠村/廣過順中");
		content = new JPanel();
		frame.getContentPane().add(content, BorderLayout.CENTER);
		content.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		content.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u8BF7\u9009\u62E9");
		panel.add(label);
		
		comboBox = new JComboBox();
		comboBox.setActionCommand("selection");
		comboBox.addItemListener(new PropertyListener() );
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u767B\u5F55", "\u6CE8\u518C"}));
		panel.add(comboBox);
		
		button_submit = new JButton();
		button_submit.setText("submit");
		button_submit.setActionCommand("submit");
		button_submit.addActionListener(new SubmitListener());
		panel.add(button_submit);
		
		
		panel_1 = new JPanel();
		content.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		FlowLayout fl_panel_2 = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel_2.setLayout(fl_panel_2);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A ");
		panel_2.add(label_1);
		label_1.setVerticalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		radioButton = new JRadioButton("\u7537");
		panel_2.add(radioButton);
		radioButton.setVisible(false);
		
		radioButton_1 = new JRadioButton("\u5973");
		panel_2.add(radioButton_1);
		radioButton_1.setVisible(false);
		
		group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);
		
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A ");
		panel_3.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_3.add(passwordField);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JLabel label_3 = new JLabel("\u9A8C\u8BC1\u7801\uFF1A ");//宸頁刮屬鷹
		panel_4.add(label_3);
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		yanzhengma = new JLabel(Yanzhengma.get());
		panel_4.add(yanzhengma);
		
		//--------------------------俊和栖頁総匯倖匈中------------------
		
		panel_5 = new JPanel();
		JLabel label_4 = new JLabel("喨�箋慟沓�");
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_5.add(label_4);
		panel_5.add(textField_3);
	    
	    panel_7 = new JPanel();
	    
	    
	    
	    
	    
	    
	    
		
		//panel_zhuce = new JPanel();
		//panel_zhuce.setLayout(new GridLayout(0,1,0,0));
		//panel_zhuce.add(panel_2);//宸頁喘薩兆
		//panel_zhuce.add(panel_3);//宸頁畜鷹
		panel_1.add(panel_5);
		
	    panel_6 = new JPanel();
	    panel_5.add(panel_6);
	    JLabel label_5 = new JLabel("返字催鷹��");
	    textField_4 = new JTextField();
	    textField_4.setColumns(10);
	    panel_6.add(label_5);
	    panel_6.add(textField_4);
	    panel_6.setVisible(false);
		panel_1.add(panel_7);//宸頁僥垪
		
		radioButton_2 = new JRadioButton("\u6559\u5E08");
		panel_7.add(radioButton_2);
		radioButton_2.setVisible(false);
		radioButton_3 = new JRadioButton("\u5B66\u751F");
		panel_7.add(radioButton_3);
		radioButton_3.setVisible(false);
		radioButton_4 = new JRadioButton("\u7BA1\u7406\u5458");
		panel_7.add(radioButton_4);
		radioButton_4.setVisible(false);
		
		group2 = new ButtonGroup();
		group2.add(radioButton_2);
		group2.add(radioButton_3);
		group2.add(radioButton_4);
		
		
		//panel_zhuce.add(panel_4);//宸頁刮屬鷹
		//content.add(panel_zhuce, BorderLayout.CENTER);
		panel_5.setVisible(false);
		panel_7.setVisible(false);
	}
	
	class SubmitListener implements ActionListener{
	
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("梓泥爾試");
			//-------------刮屬鷹刮屬---------------------------
			if(textField_2.getText().equals(yanzhengma.getText()) != true)
			{
				System.out.println("textField2 :" + textField_2.getText());
				JOptionPane.showMessageDialog(button_submit, "Attention!刮屬鷹危列!","Attention!刮屬鷹危列!", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			yanzhengma.setText(Yanzhengma.get());
			
			if(comboBox.getSelectedIndex() == 0)
			{
				System.out.println("蝕兵鞠遜");
				name = textField.getText();
				char[] values = passwordField.getPassword();
				password = new String(values);
				//--------------序秘殊沫竣粁---------------------
				try {
					Forsql.open();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					int flag;
					
					flag = Forsql.signin(name, password);
					if(flag == 1)
					{
						System.out.println("鞠遜撹孔");
						JOptionPane.showMessageDialog(button_submit, "鞠遜撹孔","鞠遜撹孔", JOptionPane.INFORMATION_MESSAGE);
						VIP = Forsql.findvip(name);
						infoframe f1 = new infoframe(VIP);//序秘佚連�塋晶臙�
					}
					if(flag ==  2)
					{
						System.out.println("すみません鞠遜払移��畜鷹危列");
						JOptionPane.showMessageDialog(button_submit, "すみません鞠遜払移��畜鷹危列","すみません鞠遜払移��畜鷹危列", 
								JOptionPane.INFORMATION_MESSAGE); 
					}
					if(flag == 3)
					{
						System.out.println("すみません隆孀欺乎侖兆");
						JOptionPane.showMessageDialog(button_submit, "すみません隆孀欺乎侖兆","すみません隆孀欺乎侖兆", 
								JOptionPane.INFORMATION_MESSAGE); 
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(comboBox.getSelectedIndex() == 1)
			{
				System.out.println("蝕兵廣過");
				try {
					Forsql.open();
				} catch (ClassNotFoundException | SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					id = Forsql.getid();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				id++;
				name = textField.getText();
				char[] values = passwordField.getPassword();
				password = new String(values);
				phonenumber = textField_4.getText();
				mail = textField_3.getText();
				if(radioButton.isSelected())
				{
					sex = 0;
				}
				if(radioButton_1.isSelected())
				{
					sex = 1;
				}
				if(radioButton_2.isSelected())
				{
					VIP = 1;
				}
				if(radioButton_3.isSelected())
				{
					VIP = 0;
				}
				if(radioButton_4.isSelected())
				{
					VIP = 2;
				}
				//俊和栖委畠何廣過佚連勧秘Forsql序佩方象垂刈贋
				try {
					Forsql.insert(id, name, password, phonenumber, mail, sex, VIP);
					Forsql.show();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("贋刈撹孔");

			}
			
		}
	}
	
	
	class PropertyListener implements ItemListener{
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == 1)
			{	
				if(e.getItem().toString().equals("廣過"))
				{
					/*System.out.println("This is working");
					content.remove(panel_1);
					content.add(panel_zhuce, BorderLayout.CENTER);
					content.validate();
					content.repaint();*/
					panel_5.setVisible(true);
					panel_6.setVisible(true);
					panel_7.setVisible(true);
					radioButton.setVisible(true);
					radioButton_1.setVisible(true);
					radioButton_2.setVisible(true);
					radioButton_3.setVisible(true);
					radioButton_4.setVisible(true);
					yanzhengma.setText(Yanzhengma.get());
				}
				if(e.getItem().toString().equals("鞠村"))
				{
					/*System.out.println("denglu working");
					content.remove(panel_zhuce);
					content.add(panel_1, BorderLayout.CENTER);
					content.validate();
					content.repaint();*/
					panel_5.setVisible(false);
					panel_6.setVisible(false);
					panel_7.setVisible(false);
					radioButton_1.setVisible(false);
					radioButton.setVisible(false);
					yanzhengma.setText(Yanzhengma.get());
				}
			}
		}


		
	}


	

}
