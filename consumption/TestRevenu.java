package consumption;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class TestRevenu extends JFrame {
	
	
	/*
	 *  �������� ������ ������ Consumption � ����������� � ������� � ArrayList.
	 *  ��� ������ �������� �� ����� ����������� ��� ������� ������ �������.
	 *  
	 *  ������� ����� ����������� (������) � ������������ (�������� �������), ��� ����� ������������ ������ ������� ������������ �� �������.
	 *  

	 */
	private static final long serialVersionUID = 1L;
	private JTextField revenuField;
	private JTextField consumptionField;
	private JTextField summField;
	
	public static void main(String[] args) {
		
		new TestRevenu();

	}
	
	public TestRevenu() throws HeadlessException {
		super();
		
		setTitle("Revenu And Consumption");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setPreferredSize(new Dimension(500, 400));
		
		
		addComponents(getContentPane());
		
		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	public void addComponents(Container contantPane){
		
		Consumption c = new Consumption();
		c.setVolume(0);
		
		contantPane.setLayout(new BorderLayout());
		
		JButton cons = new JButton("Consumpion");
		contantPane.add(cons, BorderLayout.NORTH);
		cons.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				c.setVolume(c.getVolume() + Integer.parseInt(consumptionField.getText()));
				
			}
		});
		
	//	JButton rev = new JButton("Revenu");
	//	contantPane.add(cons, BorderLayout.EAST);
		
		
		JButton summ = new JButton("Summ");
		contantPane.add(summ, BorderLayout.EAST);
		summ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				summField.setText(Integer.toString(c.getVolume()));
				
			}
		});
		
		
		consumptionField = new JTextField("������� ����� �������");
		contantPane.add(consumptionField, BorderLayout.WEST);		
				
		summField = new JTextField("������ �� �����");
		contantPane.add(summField, BorderLayout.SOUTH);		
		
	//  revenuField = new JTextField("������� ����� ������");
	//	contantPane.add(revenuField, BorderLayout.CENTER);	
    
	}
}    

		
		
		

	
	
	
	


