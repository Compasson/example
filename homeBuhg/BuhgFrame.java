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
	
	// ������������� ���� ������
	DBase dp = new DBase("�������");
	
	// ������� �����
	public static void main (String[] args)
	{
		new BuhgFrame ();// �������� ������
	}
	
	//������ ��������

// ������� ����������� Alt+Shift+S

	public BuhgFrame() throws HeadlessException {
		super();
		
		setTitle ("Home buhgalter");	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		setBackground(Color.ORANGE);	
		setPreferredSize(new Dimension(500, 400));			
//		setSize(500, 400);		
		addComponents(getContentPane()); // ������� ������, ��� ��� ��� ������������ �� ������ , � �� �� �����.		
		pack(); // ������ ��������� ���� �����, ����� ��� ��� setVisible � �������.		
		setLocationRelativeTo(null);		
		setVisible(true); // ���������� �����, ��� ���������� ���� ��������� �� setVisible
	}

	private void addComponents(Container contentPane) {
		
		contentPane.setLayout(new BorderLayout());
		
		final ButtAction action = new ButtAction("Click Me");		
		JButton badd = new JButton(action);
		contentPane.add(badd, BorderLayout.WEST);
		badd.addActionListener(new ActionListener() { // ��� ������ b ������� ���������, ������� ����� ����������� �� �������.
			
			@Override
			public void actionPerformed(ActionEvent e) {
                 
				 // ���������� �������� �� ���� ����� � ���� ������
                 dp.listo.add(new Option(Integer.parseInt(t.getText()), "����������"));
			}
		});
		
		t = new JTextField("������� ����������� �����"); // ���� ���������� t �� �������� ����� ������, �� �� ����� ����� � ��� ������ �� ������ ������� ������. ������� t refactor/Convert Local Variable to Field
		contentPane.add(t, BorderLayout.NORTH);
		
		JButton bin = new JButton(action);
		contentPane.add(bin, BorderLayout.EAST);
		bin.addActionListener(new ActionListener() { // ��� ������ b ������� ���������, ������� ����� ����������� �� �������.
			
			@Override
			public void actionPerformed(ActionEvent e) {
                 
				a.append("C���� �� ��������� " + dp.catg + " :"); 
				
				 //  ������� ���� ������
                for(Option x : dp.listo)  
					 a.append(String.valueOf(x.volume));
			}   
		});
		
		a = new JTextArea("����� ����� �����");
		contentPane.add(a, BorderLayout.CENTER);
		
		
	}
	
	
	
}
