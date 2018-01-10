package ut13;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;




public class ButtonAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action clicked");
		
	}
	
	
	// ������� ����������� Alt+Shift+S	
	public ButtonAction(String name, Icon icon) {
		super(name, icon);
		
	}



	public ButtonAction(String name) {
		super(name);
		
	}



	
}

/* ���� � ������ ������ �������� ��������� Action, �� ����� ��� ����. �� ����� ������������� �� ������������ ������ AbstractAction � �� ���� ����� ����������� ������� �����, ��� ����.
 * public class ButtonAction implements Action {
 

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean arg0) {
		// TODO Auto-generated method stub

	}

}
*/