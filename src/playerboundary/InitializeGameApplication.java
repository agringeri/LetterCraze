package playerboundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Model;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

/**
 * The containing Frame for LetterCraze Main Menu View.
 */

public class InitializeGameApplication extends JPanel {

        /** All Player information. */
	Model model;
	/** Button to play game. */
	JButton playGameButton;
	/** Button to play custom levels. */
	JButton playCustomLevelsButton;
	/** Button to reset progress. */
	JButton resetProgressButton;
	/** Button to play custom levels. */
	JButton howToPlayButton;

	/**
	 * This is the default constructor.
	 * @param m		Model which contains all entity objects
	 */
	
	public InitializeGameApplication(Model m) {
		setBounds(0, 0, 800, 600);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		model = m;
		
		// Title
		JLabel title = new JLabel("LetterCraze");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		title.setBounds(0, 150, 800, 26);
		this.add(title); 
		
		// Play Main Game Button
		playGameButton = new JButton("Play Game");
		playGameButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		playGameButton.setBounds(325, 250, 150, 100);
		this.add(playGameButton);		
		
		// Play Custom Levels Button
		playCustomLevelsButton = new JButton("Play Custom Levels");
		playCustomLevelsButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		playCustomLevelsButton.setBounds(325, 360, 150, 100);
		this.add(playCustomLevelsButton);
		
		resetProgressButton = new JButton("<html><center>" + "Reset Main" + "<br>" + "Game Progress" + "</center></html>");
		resetProgressButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		resetProgressButton.setBounds(644, 6, 150, 50);
		add(resetProgressButton);
		
		howToPlayButton = new JButton("How To Play");
		howToPlayButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		howToPlayButton.setBounds(6, 6, 150, 50);
		add(howToPlayButton);
	}

	/**Getter that returns button for getting to Main Game.
	 * @return Play Main Game Button
	 */
	public JButton getMapButton() {
		return playGameButton;
	}
		
	/**Getter that returns button for getting to CustomLevelsMap.
	 * @return Play Custom Levels Button
	 */
	public JButton getCustomLevelsButton() {
		return playCustomLevelsButton;
	}

	/**Getter that returns button for getting to ResetProgressButton.
	 * @return Reset Progress Button
	 */
	public JButton getResetProgressButton() {
		return resetProgressButton;
	}
	
	/**Getter that returns button for getting to howToPlayButton.
	 * @return How to Play Button
	 */
	public JButton getHowToPlayButton() {
		return howToPlayButton;
	}
}
