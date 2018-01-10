package interfaceEx;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args)
	{
		/*
		 *  Здесь создается ссылка listener(интерфейса ActionListener) на обьект класса TimePrinter,
		 *             listener передается в конструктор класса Timer
		 *             Также в конструктор передается значение 5000 милисекунд - каждые 5 секунд срабатывает
		 *             Timer вызывает метод start
		 *             Метод actionPerformed срабатывает каждый раз,
		 *             как только интерфейс Action listener получает сигнал от объекта Timer
		 */
		ActionListener listener = new TimePrinter();
		
		// Сконструировать таймер, вызывающий обработчик событий 
		// Через каждые 5 секунд
		Timer t = new Timer(5000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?"); // java.swing.*
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{
	/*
	 *  Параметр ActionEvent содержит сведения об иницировавшем его обьекте.
	 *          В данном примере подобные сведения не важны, поэтому ActionEvent можно принебречь.
	 * 
	 */
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
