package playercontroller;

import entities.LevelModel;
import entities.LightningLevel;
import entities.Model;
import entities.PuzzleLevel;
import entities.ThemeLevel;
import playerboundary.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewLevelController implements ActionListener {
	
	Application app;
	Model model;
	int levelNumber;

	@Override
	public void actionPerformed(ActionEvent e) {
		LevelModel level = model.getMainLevels().getLevels().get(levelNumber);
		if (level.getIsUnlocked()) {
			if (level.getType().equals("Puzzle")) {
				app.getPuzzleLevelApplication().refreshPanel((PuzzleLevel)level);
				app.setContentPane(app.getPuzzleLevelApplication());
			}
			else if (level.getType().equals("Lightning")) {
				app.getLightningLevelApplication().refreshPanel((LightningLevel)level);
				app.setContentPane(app.getLightningLevelApplication());
			}
			else {
				app.getThemeLevelApplication().refreshPanel((ThemeLevel)level);
				app.setContentPane(app.getThemeLevelApplication());
			}
		}
	}
	
	public ViewLevelController(Application app, Model m, int levelNumber) {
		this.app = app;
		this.model = m;
		this.levelNumber = levelNumber;
	}

}