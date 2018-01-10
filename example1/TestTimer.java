package simT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Timer;
import java.util.TimerTask;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;





public class TestTimer extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private JTextField timerField;
	
	
	public static void main(String[] args) {
		
		new TestTimer();

	}
	
	public TestTimer() throws HeadlessException {
		super();
		
		setTitle("Timer");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setPreferredSize(new Dimension(500, 400));
		
		
		addComponents(getContentPane());
		
		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	public void addComponents(Container contantPane){
		
		contantPane.setLayout(new BorderLayout());
		
		JButton start = new JButton("Start");
		contantPane.add(start, BorderLayout.SOUTH);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(System.currentTimeMillis());
				
				
				
				Timer myTimer = new Timer();
				myTimer.schedule(new TimerTask() {
					
					@Override
					public void run() {
						
						System.out.println("Время истекло!");
						
						timerField.setText("Время истекло");
						timerField.setBackground(Color.RED);
						
					}
				}, Long.parseLong(timerField.getText()));
				
				
				
			}
		});
		
		timerField = new JTextField("Задайте время в милисекундах");
		contantPane.add(timerField, BorderLayout.CENTER);
		
		
		
		
		
	}
	

}
