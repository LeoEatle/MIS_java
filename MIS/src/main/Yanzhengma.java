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
    	JOptionPane.showMessageDialog(null,  "�������˹���","�÷���", JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "���챻������ЩJAVA����˼��", "�÷���",JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "ԭ���ֲ�������ʦ����ʲô��","�÷���", JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "��������վ�����ڴ��¶�������","�÷���", JOptionPane.ERROR_MESSAGE);
    	JOptionPane.showMessageDialog(null,  "�Լ���û�ж�����", "�÷���",JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "����������������","�÷���", JOptionPane.ERROR_MESSAGE); 
    	JOptionPane.showMessageDialog(null,  "�о������ٰ���", "�÷���",JOptionPane.ERROR_MESSAGE); 
    }
    
    public static void main(String args[])
    {
    	play();
    }

}
