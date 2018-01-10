package ut13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField t;
	private JTextArea a;
	private DefaultListModel model;

	public static void main(String[] args) {
		
		new MainFrame ();

	}
// ������� ����������� Alt+Shift+S

	public MainFrame() throws HeadlessException {
		super();
		
		setTitle ("������");
	
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
		
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		contentPane.add(p, BorderLayout.NORTH);
		
		final ButtonAction action = new ButtonAction("Click Me");		
		JButton b = new JButton(action);
		contentPane.add(b, BorderLayout.WEST);
		b.addActionListener(new ActionListener() { // ��� ������ b ������� ���������, ������� ����� ����������� �� �������.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("click");
				a.setText(t.getText());
				a.setBackground(Color.YELLOW);
				
				model.addElement("CC");
		
		//		a.setBackground(new Color(248, 3, 20)); ���� RGB
				
			}
		});
		
		t = new JTextField("������� ����� � ������� 00:00"); // ���� ���������� t �� �������� ����� ������, �� �� ����� ����� � ��� ������ �� ������ ������� ������. ������� t refactor/Convert Local Variable to Field
		contentPane.add(t, BorderLayout.SOUTH);
		
		a = new JTextArea("textArea");
		contentPane.add(a, BorderLayout.EAST);
		a.addPropertyChangeListener("background", new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				
				System.out.println(String.format("Ol: %s, New: %s", evt.getOldValue(), evt.getNewValue()));
				
				action.setEnabled(false);
			}
		});
		
		contentPane.add(new JButton(action), BorderLayout.EAST);
		
		JList list = new JList();
		contentPane.add(list, BorderLayout.CENTER);
		
		model = new DefaultListModel();
		list.setModel(model);
		
		model.addElement("AA");
		model.addElement("BB");
		
		
	}
	
}
