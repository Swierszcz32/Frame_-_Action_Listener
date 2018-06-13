package pl.java.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTrain extends JFrame{
		
	public ButtonTrain() {
		super("super");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width/4, height/3);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("adrian.jpg"));
		int widthFrame = this.getSize().width;
		int heightFrame = this.getSize().height;
		this.setLocation((width-widthFrame)/2, (height-heightFrame)/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setBounds(300, 320, 300, 200);
		initButton();
//		this.setResizable(false);
	}
	
	public void initButton() {
		
		button1.addActionListener(new Listener(Color.BLACK, button1.getText() ));
		button2.addActionListener(new Listener(Color.YELLOW, button2.getText()));
		button3.addActionListener(new Listener(Color.RED, button3.getText()));
		button4.addActionListener(new Listener(Color.GREEN, button4.getText()));
		button5.addActionListener(new Listener(Color.BLUE, button5.getText()));
		button6.addActionListener(new Listener(Color.PINK, button6.getText()));
		button7.addActionListener(new Listener(Color.GRAY, button7.getText()));
		button8.addActionListener(new Listener(Color.ORANGE, button8.getText()));
//		anuluj.addActionListener(new Listener(this.get));            // <- operacja cofniêcia koloru do domyœlnego
//		this.getContentPane().setLayout(layout);
		panel.setLayout(layout);
		
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup()
						.addComponent(cb1)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(cb2)
						.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addContainerGap(10, Short.MAX_VALUE)
				.addComponent(anuluj, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
				);
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup()
						.addComponent(cb1)
						.addComponent(cb2)
						)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

						)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addContainerGap(10, Short.MAX_VALUE)
				.addComponent(anuluj, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
				);
		
		this.add(panel);
		
	}
//	GroupLayout layout = new GroupLayout(getContentPane());
	

	JPanel panel = new JPanel();
	GroupLayout layout = new GroupLayout(panel);

	JLabel  label = new JLabel("Tittle");

	JButton button1 = new JButton("Czarny");
	JButton button2 = new JButton("¯ó³ty");
	JButton button3 = new JButton("Czerwony");
	JButton button4 = new JButton("Zielony");
	JButton button5 = new JButton("Niebieski");
	JButton button6 = new JButton("Ró¿owy");
	JButton button7 = new JButton("Szary");
	JButton button8 = new JButton("Pomarañczowy");
	JButton anuluj = new JButton("anuluj");
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox cb1 = new Checkbox( "Name 1", null, true );
	
	Checkbox cb2 = new Checkbox( "Name 2", null, true );
	
	

	private class Listener implements ActionListener {
		
		

		public Listener(Color c, String name) {
			this.name = name;
			this.color = c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(color);  // <- ustawienie koloru 
			cb1.setBackground(color);
			cb2.setBackground(color);
			label.setText(name);
		}
		Color color;
		String name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonTrain().setVisible(true);

	}

}
