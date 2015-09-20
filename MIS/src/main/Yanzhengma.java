package main;

import javax.swing.JOptionPane;

public class Yanzhengma {
	private static  int num;
	
	
	public static String  get()
	{
		
		num = (int)(Math.random()*(9999));
		String s = String.valueOf(num);
		return s;
		
	}
	
    public static void play()
    {
    	JOptionPane.showMessageDialog(null,  "真是日了狗了","好烦啊", JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "天天被逼做这些JAVA有意思吗！", "好烦啊",JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "原理又不懂，老师在想什么啊","好烦啊", JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "想做个网站报淫在创新都过不了","好烦啊", JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "自己又没有动力做", "好烦啊",JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "周六还有六级考试","好烦啊", JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "感觉不会再爱了", "好烦啊",JOptionPane.ERROR_MESSAGE); 
    }
    
    public static void main(String args[])
    {
    	play();
    }

}
