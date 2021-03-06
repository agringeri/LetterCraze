package playercontroller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;

import entities.LevelModel;
import entities.Model;
import junit.framework.TestCase;
import playerboundary.Application;

public class TestResetProgressController extends TestCase {

	public void testNavigation() {
		Model model = new Model();
		Application app = new Application(model);
		ResetProgressController rpc = new ResetProgressController(app, model);
		JButton butt = new JButton();
		ActionEvent ae = new ActionEvent(butt, (int) ActionEvent.MOUSE_EVENT_MASK, "click butt"); //want butt.doClick or butt.doClick()
		rpc.actionPerformed(ae);
		
	}
	
}
