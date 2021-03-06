package playerboundary;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;

import entities.LevelModel;
import entities.Model;
import entities.PuzzleLevel;
import entities.Square;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * The containing Frame for only Puzzle type levels in LetterCraze.
 */

public class PuzzleLevelApplication extends LevelApplication {
	
	public PuzzleLevelApplication(PuzzleLevel m) {
		super(m);
		titleLabel.setText("Puzzle");
		objectiveLabel.setText("Moves Left");
		objectiveValueLabel.setText(String.valueOf(m.getMoveLimit()));
	}
	

	/**
	 * Gets controllers for exit button.
	 */
	
	public JButton getExitButton() {
		return exitButton;
	}
	
	/**
	 * Gets list of Tiles selected.
	 */
	
	public JButton[][] getButtonList() {
		return squareButtons;
	}
	
	
}
