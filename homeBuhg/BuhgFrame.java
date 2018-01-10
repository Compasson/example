package homeBuhg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BuhgFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField t;
	private JTextArea a;
	private DefaultListModel model;
	
	// Инициализация Базы данных
	DBase dp = new DBase("Питание");
	
	// Главный метод
	public static void main (String[] args)
	{
		new BuhgFrame ();// создание фрейма
	}
	
	//Запись операции

// Создаем конструктор Alt+Shift+S

	public BuhgFrame() throws HeadlessException {
		super();
		
		setTitle ("Home buhgalter");	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		setBackground(Color.ORANGE);	
		setPreferredSize(new Dimension(500, 400));			
//		setSize(500, 400);		
		addComponents(getContentPane()); // Добавим панель, так как все отображается на панели , а не на форме.		
		pack(); // Делает отрисовку всей формы, перед тем как setVisible её покажет.		
		setLocationRelativeTo(null);		
		setVisible(true); // Отображает форму, все компоненты надо создавать до setVisible
	}

	private void addComponents(Container contentPane) {
		
		contentPane.setLayout(new BorderLayout());
		
		final ButtAction action = new ButtAction("Click Me");		
		JButton badd = new JButton(action);
		contentPane.add(badd, BorderLayout.WEST);
		badd.addActionListener(new ActionListener() { // Для кнопки b создаем слушатель, который будет реагировать на нажатие.
			
			@Override
			public void actionPerformed(ActionEvent e) {
                 
				 // Записываем значение из поля суммы в Базу данных
                 dp.listo.add(new Option(Integer.parseInt(t.getText()), "Коментарий"));
			}
		});
		
		t = new JTextField("Введите затраченную сумму"); // Пока переменная t не является полем класса, мы не можем иметь к ней доступ из метода другого класса. Поэтому t refactor/Convert Local Variable to Field
		contentPane.add(t, BorderLayout.NORTH);
		
		JButton bin = new JButton(action);
		contentPane.add(bin, BorderLayout.EAST);
		bin.addActionListener(new ActionListener() { // Для кнопки b создаем слушатель, который будет реагировать на нажатие.
			
			@Override
			public void actionPerformed(ActionEvent e) {
                 
				a.append("Cумма по категории " + dp.catg + " :"); 
				
				 //  Выводим базу данных
                for(Option x : dp.listo)  
					 a.append(String.valueOf(x.volume));
			}   
		});
		
		a = new JTextArea("Вывод будет здесь");
		contentPane.add(a, BorderLayout.CENTER);
		
		
	}
	
	
	
}
