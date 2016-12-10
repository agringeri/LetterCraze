package playerboundary;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Stack;

import javax.swing.*;
import entities.*;

public abstract class LevelApplication extends JPanel {
	
	LevelModel model;
	JButton exitButton;
	JButton confirmButton;
	JButton[][] squareButtons;
	JLabel titleLabel;
	JLabel scoreLabel;
	JLabel objectiveLabel;
	JLabel objectiveValueLabel; // displays moves left
	DefaultListModel<String> listModel; // keeps element of list
	JList<String> wordsList;
	JScrollPane scrollPane;
	JButton resetButton;
	JButton undoButton;
	Stack<JButton> selectedButtons;
	JLabel starLabel;
	JProgressBar progressBar;
	
	public LevelApplication(LevelModel m) {
		model = m;
		
		setBounds(0,0,800,600);
		this.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 600, 600);
		leftPanel.setLayout(null);
		add(leftPanel);
		
		titleLabel = new JLabel("");
		titleLabel.setVerticalAlignment(SwingConstants.TOP);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		titleLabel.setBounds(6, 50, 588, 29);
		leftPanel.add(titleLabel);
		
		// create 36 squareButtons
		squareButtons = new JButton[6][6];
		for (int y = 0; y < 6; y++) {
			for (int x = 0; x < 6; x++) {
				JButton b = new JButton();
				b.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
				b.setBounds(120+(x*60), 120+(y*60), 60, 60);
				b.setOpaque(true);
				b.setBorderPainted(false);
				b.setBackground(Color.WHITE);
				squareButtons[x][y] = b;
				leftPanel.add(b);
			}
		}
		
		
		scoreLabel = new JLabel("0");
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		scoreLabel.setBounds(50, 520, 508, 16);
		leftPanel.add(scoreLabel);
		
		progressBar = new JProgressBar();
		progressBar.setMaximum(model.getGoals().getStar3());
		progressBar.setEnabled(false);
		progressBar.setValue(0);
		progressBar.setBounds(50, 547, 400, 20);
		leftPanel.add(progressBar);
		
		starLabel = new JLabel();
		//starLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		starLabel.setBounds(480, 537, 81, 27);
		Image image = new ImageIcon("image/StarsEmpty.png").getImage();
		image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH);
		starLabel.setIcon(new ImageIcon(image));
		leftPanel.add(starLabel);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(20, 20, 70, 29);
		leftPanel.add(exitButton);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.LIGHT_GRAY);
		rightPanel.setBounds(600, 0, 200, 600);
		rightPanel.setLayout(null);

		add(rightPanel);
		
		objectiveLabel = new JLabel("");
		objectiveLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		objectiveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		objectiveLabel.setBounds(6, 40, 188, 16);
		rightPanel.add(objectiveLabel);
		
		objectiveValueLabel = new JLabel("0");
		objectiveValueLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		objectiveValueLabel.setHorizontalAlignment(SwingConstants.CENTER);
		objectiveValueLabel.setBounds(6, 60, 188, 40);
		rightPanel.add(objectiveValueLabel);
		
		JLabel wordsLabel = new JLabel("Completed Words:");
		wordsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		wordsLabel.setBounds(15, 130, 170, 16);
		rightPanel.add(wordsLabel);
		
		resetButton = new JButton("Reset");
		resetButton.setBounds(120, 525, 70, 29);
		rightPanel.add(resetButton);
		
		undoButton = new JButton("Undo");
		undoButton.setBounds(10, 525, 70, 29);
		rightPanel.add(undoButton);
		
		listModel = new DefaultListModel<String>();
		wordsList = new JList<String>(listModel);
		scrollPane = new JScrollPane(wordsList);
		scrollPane.setViewportView(wordsList);
		scrollPane.setBounds(15, 150, 170, 360);
		rightPanel.add(scrollPane);
		
		confirmButton = new JButton("Add word");
		confirmButton.setBounds(470, 20, 110, 29);
		leftPanel.add(confirmButton);
		
		selectedButtons = new Stack<JButton>();
	}

	public void refreshPanel(LevelModel level) {

		// set board
		for (int y = 0; y < 6; y++) {
			for (int x = 0; x < 6; x++) {

				Square s = level.getBoard().lookUpSquare(x, y);
				if (s.isEnabled()) {
					squareButtons[x][y].setVisible(true);
					if (s.hasTile()) {
						squareButtons[x][y].setText(s.tilePeek().toString());
					} else {
						squareButtons[x][y].setText("");
					}
				}
				else {
					squareButtons[x][y].setVisible(false);
				}
			}
		}
		
		// update score
		scoreLabel.setText(String.valueOf(level.getCurrentScore().getScore()));
		
		progressBar.setValue(level.getCurrentScore().getScore());
		
		// update stars
		if (level.getCurrentScore().getStar() == 0) {
			Image image = new ImageIcon("image/StarsEmpty.png").getImage();
			image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH);
			starLabel.setIcon(new ImageIcon(image));
		}
		else if (level.getCurrentScore().getStar() == 1) {
			Image image = new ImageIcon("image/StarsOne.png").getImage();
			image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH);
			starLabel.setIcon(new ImageIcon(image));
		}
		else if (level.getCurrentScore().getStar() == 2) {
			Image image = new ImageIcon("image/StarsTwo.png").getImage();
			image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH);
			starLabel.setIcon(new ImageIcon(image));
		}
		else {
			Image image = new ImageIcon("image/StarsThree.png").getImage();
			image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH);
			starLabel.setIcon(new ImageIcon(image));
		}
		
		
		// deselect panels
		for (int x = 0; x < 6; x++) {
			for (int y = 0; y < 6; y++) {
				squareButtons[x][y].setBackground(Color.WHITE);
			}
		}
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton[][] getButtonList() {
		return squareButtons;
	}
	
	public JButton getConfirmButton() {
		return confirmButton;
	}
	
	public void deselectButtons() {
		for (int x = 0; x < 6; x++) {
			for (int y = 0; y < 6; y++) {
				squareButtons[x][y].setBackground(Color.WHITE);
			}
		}
	}
	
	public DefaultListModel<String> getListModel() {
		return listModel;
	}
	
	public void clearList() {
		listModel.clear();
	}
	
	public void updateObjectiveValue(int change) {
		int currentValue = Integer.parseInt(objectiveValueLabel.getText());
		int newValue = (currentValue + change);
		objectiveValueLabel.setText(String.valueOf(newValue));
	}
	
	public void resetObjectiveValue(int resetTo) {
		objectiveValueLabel.setText(String.valueOf(resetTo));
	}
	
	public void incrementObjectiveValue() {
		objectiveValueLabel.setText(String.valueOf(Integer.valueOf(objectiveValueLabel.getText())+1));
	}
	
	public JButton getResetButton() {
		return resetButton;
	}
	
	public JButton getUndoButton() {
		return undoButton;
	}
	
	public LevelModel getLevelModel() {
		return model;
	}
	
	public JLabel getObjectiveValueLabel() {
		return objectiveValueLabel;
	}
	
	public int getObjectiveValue() {
		return Integer.parseInt(objectiveValueLabel.getText());
	}
	
	public Stack<JButton> getSelectedButtons() {
		return selectedButtons;
	}
	
	public JButton popSelectedButton() {
		return selectedButtons.pop();
	}
	
	public JButton peekSelectedButton() {
		return selectedButtons.peek();
	}
	
	public void pushSelectedButton(JButton b) {
		selectedButtons.push(b);
	}

}
