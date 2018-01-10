package FormEx1;

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


class Car{
	int width, height, depth;
	String mark, model;
	

	
	Car(String ma, String mo){
		mark = ma;
		model = mo;
	}
	
	BD b = new BD();
}

class BD{
	Car[]  massC = new Car[100];
	
	BD(){
		
	}
	
	void create(){
		new BD();
	}
	
	void write(String ma, String mo){
		for(Car x : massC) {
			if(x.equals(null)){
			x.mark = ma;
			x.model = mo;
			} 
		    break;
		}


	}
	

}
 /*
  * 		
 
		System.out.println(massC[0].mark + " " + massC[0].model);
		int i;
        i = 0;
		Car c = new Car(timerField.getText(), timerField1.getText());
		massC[i] = c;
		i++;
		System.out.println(massC[0].mark);
  */


public class InDate extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private JTextField timerField, timerField1;
	
	
	public static void main(String[] args) {
		
		new InDate();
		

	}
	
	public InDate() throws HeadlessException {
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
		
		JButton start1 = new JButton("Start1");
		contantPane.add(start1, BorderLayout.CENTER);
		
		JButton start = new JButton("Start");
		contantPane.add(start, BorderLayout.SOUTH);
		
		

		
		start.addActionListener(new ActionListener() {
			

			
			@Override
			public void actionPerformed(ActionEvent e) {
				


				Car c = new Car(timerField.getText(), timerField1.getText());
				(timerField.getText(), timerField1.getText());
				System.out.println(System.currentTimeMillis());
				
				Timer myTimer = new Timer();
				myTimer.schedule(new TimerTask() {
					
					@Override
					public void run() {
						
						System.out.println("Время истекло!");
						
						timerField1.setText("Время истекло");
						timerField.setBackground(Color.RED);

						
					}
				}, Long.parseLong(timerField.getText()));
				
				
				
			}
		});
		
		timerField = new JTextField("Задайте время в милисекундах");
		contantPane.add(timerField, BorderLayout.WEST);
		
		timerField1 = new JTextField("Результат         ");
		contantPane.add(timerField1, BorderLayout.EAST);
		
		
		
		
		
		
	}
	

}
