package builderboundary;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import entities.BuilderModel;
import entities.Model;

/**
 * The containing Frame for LetterCraze Player.
 */

public class InitializeBuilderApplication extends JPanel {
	BuilderModel model;

	JButton createLevelButton;
	JButton editSavedLevelsButton;

	public InitializeBuilderApplication(BuilderModel model2) {
		
		model = model2;
		setBounds(0, 0, 800, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);

		JLabel title = new JLabel("LetterCraze Builder");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		title.setBounds(0, 150, 800, 26);
		this.add(title);

		createLevelButton = new JButton("Create New Level");
		createLevelButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		createLevelButton.setBounds(325, 250, 150, 100);
		this.add(createLevelButton);

		editSavedLevelsButton = new JButton("Edit Saved Level");
		editSavedLevelsButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		editSavedLevelsButton.setBounds(325, 360, 150, 100);
		this.add(editSavedLevelsButton);
	}

	public JButton getCreateLevelButton() {
		return createLevelButton;
	}
	
	public JButton getEditSavedLevelsButton() {
		return editSavedLevelsButton;
	}

}
