package playercontroller;

import entities.Model;
import playerboundary.Application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAdventureMapController implements ActionListener {
	
	Application app;
	Model model;

	@Override
	public void actionPerformed(ActionEvent e) {
		app.getMapApplication().refreshPanel(); // refresh content before displaying panel
		app.setContentPane(app.getMapApplication()); // display panel
		
		// Deselect all tiles when we exit to MapApplication
	}
	
	public ViewAdventureMapController(Application app, Model m) {
		this.app = app;
		this.model = m;
	}

}