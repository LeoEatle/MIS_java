package main;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class infoframe extends JFrame{
	private String VIP;
	//private final static Date dd1;
	//private final static Date dd2;
	private JLabel l2;
	
	public infoframe(int v)
	
	
	{
		this.setTitle("Welcome to Leo's MIS");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//------- decide VIP ----------------
		if(v == 0)
		{
			VIP = "student";
		}
		else if (v == 1)
		{
			VIP = "teacher";
		}
		else if (v == 2)
		{
			VIP = "administrator";
		}
		
		JPanel content = new JPanel();
		add(content);
		content.setLayout(new BorderLayout());
		JLabel title = new JLabel("Welcome! Dear " + signframe.name +" !"
				+ " Your are " + VIP);
		title.setBackground(Color.green);
		title.setFont(new Font("Adobe Garamond Pro Bold", Font.BOLD, 28));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(11, 10, 450, 28);
		content.add(title, BorderLayout.NORTH);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout( 4, 2, 1, 1));
		content.add(p1);
		
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = f.format(new Date());
		JLabel l1 = new JLabel("当前时间： " + time);
		p1.add(l1);
		
		l2 = new JLabel("");
		p1.add(l2);
		decide(new Date());
		
	
	}
	
	public void decide(Date d)
	{
		Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.HOUR_OF_DAY);
		if(VIP.equals("student"))
		{
			if(hour < 22 && hour >= 6)
			{
				l2.setText("You can play the game!");
			}
			else
			{
				l2.setText("You can't play games now");
			}
		}
		if(VIP.equals("teacher"))
		{
			if(hour < 8 || hour >= 17)
			{
				l2.setText("Dear teacher, you can play game now !");
			}
			else
			{
				l2.setText("Sorry teacher, you can't play game now !");
			}
		}
		if(VIP.equals("administrator"))
		{
			l2.setText("Oh my god you are administrator, just do whatever you want!");
		}
	}
	
	public  static void main(String args[])
	{
		infoframe test = new infoframe(1);
	}
	
	
}
