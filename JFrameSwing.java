package pl.java.swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JFrameSwing extends JFrame{
	

	public JFrameSwing() {
		
		super("Adrian ramka"); // this.setTitle("Adrian ramka");
//	
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int hight = Toolkit.getDefaultToolkit().getScreenSize().height;
//		this.setSize(width/2, hight/2);
//		System.out.println(width+","+hight);
		int widthFrame = this.getSize().width;
		int hightFrame = this.getSize().height;
		this.setLocation((width - widthFrame)/2, (hight - hightFrame)/2);
//		this.setIconImage(Toolkit.getDefaultToolkit().getImage("adrian.jpg"));
//		
		initComponents();
		//GroupLayoutMethod();

		this.setDefaultCloseOperation(3);
		
		pack();
		
	}
	
	public  void initComponents() {
		panel.add(label);
		panel.add(time);
		ActionListener stopWatch = new Clock();

		Timer clock = new Timer(100, stopWatch);
		
		clock.start();
		
		this.getContentPane().add(panel);
		
	}
	
	private class Clock implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			GregorianCalendar calender = new GregorianCalendar();
			
			String h = ""+calender.get(Calendar.HOUR_OF_DAY);
			String m = ""+calender.get(Calendar.MINUTE);
			String s = ""+calender.get(Calendar.SECOND);
			
			if(Integer.parseInt(h)<10) h = "0" + h;
			if(Integer.parseInt(m)<10) m = "0" + m;
			if(Integer.parseInt(s)<10) s = "0" + s;
			time.setText(""+h+" : "+m+" : "+s);
		}
		
	}
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Czas : ");
	JLabel time = new JLabel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameSwing().setVisible(true);
		
	}

}
