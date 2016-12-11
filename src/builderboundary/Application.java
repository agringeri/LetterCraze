package builderboundary;

import javax.swing.JFrame;
import javax.swing.Timer;

import entities.BuilderModel;
import entities.Model;
import builderboundary.InitializeBuilderApplication;
import buildercontroller.SplashScreenTimerController;

public class Application extends JFrame {

	BuilderModel model;
	
	// All the other views should be stored as properties here
	SplashScreenApplication splashScreen;
	InitializeBuilderApplication initializeBuilderApplication;
	CreateNewLevelApplication createNewLevelApplication;
	SavedLevelsMapApplication savedLevelsMapApplication;
	EditSavedLevelApplication editSavedLevelApplication;

	// how many seconds to display splash screen
	int displayTime;
	// Timer for determining how long splash screen should be displayed
	Timer splashScreenTimer;


	/**
	 * Create the frame.
	 */
	public Application(BuilderModel model) {
		//pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("LetterCraze Builder");
		
		this.model = model;
		
		// initialize views
		splashScreen = new SplashScreenApplication(model);
		initializeBuilderApplication = new InitializeBuilderApplication(model);
		createNewLevelApplication = new CreateNewLevelApplication(model);
		savedLevelsMapApplication = new SavedLevelsMapApplication(model);
		editSavedLevelApplication = new EditSavedLevelApplication(model);
		
		// display splash screen for 4 seconds
		displayTime = 4;  
        splashScreenTimer = new Timer(1000, new SplashScreenTimerController(this, this.model));
        splashScreenTimer.start();
		this.setContentPane(splashScreen);
		
	}
	
	public int getDisplayTime() {
		return displayTime;
	}
	
	public Timer getSplashScreenTimer() {
		return splashScreenTimer;
	}
	
	public void decrementDisplayTime() {
		displayTime--;
	}
	
	public InitializeBuilderApplication getInitializeBuilderApplication() {
		return initializeBuilderApplication;
	}
	
	public CreateNewLevelApplication getCreateNewLevelApplication() {
		return createNewLevelApplication;
	}
	
	public SavedLevelsMapApplication getSavedLevelsMapApplication() {
		return savedLevelsMapApplication;
	}
	
	public EditSavedLevelApplication getEditSavedLevelApplication() {
		return editSavedLevelApplication;
	}

}
