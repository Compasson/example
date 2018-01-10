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
		 *  ����� ��������� ������ listener(���������� ActionListener) �� ������ ������ TimePrinter,
		 *             listener ���������� � ����������� ������ Timer
		 *             ����� � ����������� ���������� �������� 5000 ���������� - ������ 5 ������ �����������
		 *             Timer �������� ����� start
		 *             ����� actionPerformed ����������� ������ ���,
		 *             ��� ������ ��������� Action listener �������� ������ �� ������� Timer
		 */
		ActionListener listener = new TimePrinter();
		
		// ��������������� ������, ���������� ���������� ������� 
		// ����� ������ 5 ������
		Timer t = new Timer(5000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?"); // java.swing.*
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{
	/*
	 *  �������� ActionEvent �������� �������� �� ������������� ��� �������.
	 *          � ������ ������� �������� �������� �� �����, ������� ActionEvent ����� ����������.
	 * 
	 */
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
