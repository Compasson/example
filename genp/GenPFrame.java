package genp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GenPFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField show;
	
	public GenPFrame() throws HeadlessException
	{
		super();	
		setTitle ("Generated Password");	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		setBackground(Color.ORANGE);		
		setPreferredSize(new Dimension(280, 110));		
		addComponents(getContentPane()); // Добавим панель, так как все отображается на панели , а не на форме.		
		pack(); // Делает отрисовку всей формы, перед тем как setVisible её покажет.		
		setLocationRelativeTo(null);		
		setVisible(true); // Отображает форму, все компоненты надо создавать до setVisible
	}
	
	public void addComponents(Container contentPane)
	{
		SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        
        show = new JTextField(20);
        JButton gen = new JButton("GENERATED");
        
        contentPane.add(show);
        contentPane.add(gen);
        
      //Adjust constraints for the label so it's at (10,10).
        layout.putConstraint(SpringLayout.WEST, show,
                             10,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, show,
                             10,
                             SpringLayout.NORTH, contentPane);
        
        //Adjust constraints for the label so it's at (10,40).
        layout.putConstraint(SpringLayout.WEST, gen,
                             10,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, gen,
                             40,
                             SpringLayout.NORTH, contentPane);
        
		gen.addActionListener(new ActionListener() { // Для кнопки gen создаем слушатель, который будет реагировать на нажатие.
			
			@Override
			public void actionPerformed(ActionEvent e) {
                 
				 GenP g = new GenP();
				 g.generate();
				 show.setText(g.fullp);
			}
		});
	}
	
	

}
