package homebuhg;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

	public class Frame1OfBuhg extends JFrame {


		private static final long serialVersionUID = 1L;

		private JTextField tzatr;
		private JTextField tcomm;


		/*public static void main(String[] args) {
			
			new Frame1OfBuhg ();

		}
		*/
	// Создаем конструктор Alt+Shift+S

		public Frame1OfBuhg() throws HeadlessException {
			super();
			
			setTitle ("Personal the bookkeeping");
		
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			setBackground(Color.ORANGE);
			
			setPreferredSize(new Dimension(530, 200));
			
			
			
//			setSize(500, 400);
			
			
			addComponents(getContentPane()); // Добавим панель, так как все отображается на панели , а не на форме.
			
			pack(); // Делает отрисовку всей формы, перед тем как setVisible её покажет.
			
			setLocationRelativeTo(null);
			
			setVisible(true); // Отображает форму, все компоненты надо создавать до setVisible


		}

		private void addComponents(Container contentPane) {
			
			
			SpringLayout layout = new SpringLayout();
	        contentPane.setLayout(layout);
	        
	        JLabel lzatr = new JLabel("Введите потраченную сумму: "); // Пока переменная t не является полем класса, мы не можем иметь к ней доступ из метода другого класса. Поэтому t refactor/Convert Local Variable to Field
	        JLabel lcat = new JLabel("Выбирете категорию: "); 
	        JLabel lcomm = new JLabel("Комментарий: "); 
			
			tzatr = new JTextField(15); // 15 width field
			tcomm = new JTextField(15);
			
			JButton badd = new JButton("Add");
			JButton bshow = new JButton("Show book");
			
			//Create the combo box, select item at index 4.
			//Indices start at 0, so 4 specifies the category.
			String[] petStrings = { "Food", "Communal", "Bit", "Journey", "Other" };
			JComboBox catList = new JComboBox(petStrings);
			catList.setSelectedIndex(4);
			//petList.addActionListener(this);


	        contentPane.add(lzatr);
	        contentPane.add(lcat);
	        contentPane.add(lcomm);
	        contentPane.add(tzatr);
	        contentPane.add(tcomm);
	        contentPane.add(badd);
	        contentPane.add(bshow);
	        contentPane.add(catList);	

	        
	        //Adjust constraints for the label so it's at (10,10).
	        layout.putConstraint(SpringLayout.WEST, lzatr,
	                             10,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, lzatr,
	                             10,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the lcat so it's at (10,40).
	        layout.putConstraint(SpringLayout.WEST, lcat,
	                             10,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, lcat,
	                             40,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the lcomm so it's at (10,70).
	        layout.putConstraint(SpringLayout.WEST, lcomm,
	                             10,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, lcomm,
	                             70,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the tzatr so it's at (200,10).
	        layout.putConstraint(SpringLayout.WEST, tzatr,
	                             200,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, tzatr,
	                             10,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the tcomm so it's at (200,70).
	        layout.putConstraint(SpringLayout.WEST, tcomm,
	                             200,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, tcomm,
	                             70,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the badd so it's at (200,100).
	        layout.putConstraint(SpringLayout.WEST, badd,
	                             200,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, badd,
	                             100,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the bshow so it's at (400,100).
	        layout.putConstraint(SpringLayout.WEST, bshow,
	                             400,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, bshow,
	                             100,
	                             SpringLayout.NORTH, contentPane);
	        
	        //Adjust constraints for the catList so it's at (200,40).
	        layout.putConstraint(SpringLayout.WEST, catList,
	                             200,
	                             SpringLayout.WEST, contentPane);
	        layout.putConstraint(SpringLayout.NORTH, catList,
	                             40,
	                             SpringLayout.NORTH, contentPane);

		}
		
	}

/*
 * SpringLayout - отступ от другого элемента на панели
 * Adjust constraints for the text field so it's at
   (<label's right edge> + 5, 5).
   layout.putConstraint(SpringLayout.WEST, textField,
                     5,
                     SpringLayout.EAST, label);
   layout.putConstraint(SpringLayout.NORTH, textField,
                     5,
                     SpringLayout.NORTH, contentPane);
 */
