package playercontroller;

import entities.LevelModel;
import entities.LightningLevel;
import entities.Model;
import entities.PuzzleLevel;
import entities.ThemeLevel;
import playerboundary.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controls all actions when initializing Levels.
 */

public class ViewLevelController implements ActionListener {
	
	/** The main frame for LevelCraze. */
	Application app;
	/** Player Model/Level information. */
	Model model;
	/** The level number. */
	int levelNumber;

	/**
	 * Provides all actions to level when accessed.
	 * <p>
	 * @param e ActionEvent
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		LevelModel level = model.getMainLevels().getLevels().get(levelNumber);
		if (level.getIsUnlocked()) {
			level.initializeLevel();
			if (level.getType().equals("Puzzle")) {
				app.getLevelApplications().get(levelNumber).refreshPanel((PuzzleLevel)level);
				app.setContentPane(app.getLevelApplications().get(levelNumber));
			}
			else if (level.getType().equals("Lightning")) {
				LightningLevelApplication l = (LightningLevelApplication)app.getLevelApplications().get(levelNumber);
				l.refreshPanel((LightningLevel)level);
				l.initializeTimeLeft();
				l.getTimer().start();
				app.setContentPane(l);
			}
			else {
				app.getLevelApplications().get(levelNumber).refreshPanel((ThemeLevel)level);
				((ThemeLevelApplication) app.getLevelApplications().get(levelNumber)).refreshObjective((ThemeLevel)level);
				app.setContentPane(app.getLevelApplications().get(levelNumber));
			}
		}
	}
	
	/**
	 * Sets parameters for ViewLevelController.
	 * <p>
	 * @param app Application
	 * @param m model
	 * @param levelNumber level number
	 */
	
	
	public ViewLevelController(Application app, Model m, int levelNumber) {
		this.app = app;
		this.model = m;
		this.levelNumber = levelNumber;
	}

}