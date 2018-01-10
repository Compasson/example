package homeBuhg;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ButtAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action clicked");
		
	}
	
	public ButtAction(String name) {
		super(name);
		
	}



	
}