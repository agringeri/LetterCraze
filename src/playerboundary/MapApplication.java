package playerboundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class MapApplication extends JPanel {

	JButton backButton;
	JButton level1Button;
	/**
	 * Create the frame.
	 */
	public MapApplication() {
		setBounds(0, 0, 800, 600);
		this.setBackground(new Color(176, 196, 222));
		this.setBorder(new EmptyBorder(2, 2, 2, 2));

		this.setLayout(null);
		
		JLabel lblPlayerMap = new JLabel("Adventure Map");
		lblPlayerMap.setForeground(new Color(0, 0, 205));
		lblPlayerMap.setFont(new Font("Snap ITC", Font.BOLD, 25));
		lblPlayerMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerMap.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPlayerMap.setBounds(151, 11, 238, 33);
		this.add(lblPlayerMap);
		
		level1Button = new JButton("Puzzle! \r\n1");
		level1Button.setForeground(new Color(0, 0, 0));
		level1Button.setFont(new Font("Corbel", Font.BOLD, 11));
		level1Button.setBackground(new Color(0, 128, 128));
		level1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		level1Button.setBounds(10, 69, 96, 46);
		this.add(level1Button);
		
		backButton = new JButton("Back");
		backButton.setForeground(Color.BLACK);
		backButton.setBackground(Color.RED);
		backButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		backButton.setBounds(444, 20, 69, 27);
		this.add(backButton);
		
		JButton btnLightning = new JButton("Lightning! \r\n2");
		btnLightning.setForeground(Color.BLACK);
		btnLightning.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLightning.setBackground(new Color(0, 128, 128));
		btnLightning.setBounds(113, 69, 96, 46);
		this.add(btnLightning);
		
		JButton btnThemeThree = new JButton("Theme! \r\n3");
		btnThemeThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemeThree.setForeground(Color.BLACK);
		btnThemeThree.setFont(new Font("Corbel", Font.BOLD, 11));
		btnThemeThree.setBackground(new Color(0, 128, 128));
		btnThemeThree.setBounds(219, 69, 96, 46);
		this.add(btnThemeThree);
		
		JButton btnLock = new JButton("LOCK");
		btnLock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLock.setForeground(Color.BLACK);
		btnLock.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock.setBackground(new Color(0, 128, 128));
		btnLock.setBounds(325, 69, 96, 46);
		this.add(btnLock);
		
		JButton btnLock_1 = new JButton("LOCK");
		btnLock_1.setForeground(Color.BLACK);
		btnLock_1.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_1.setBackground(new Color(0, 128, 128));
		btnLock_1.setBounds(431, 69, 96, 46);
		this.add(btnLock_1);
		
		JButton btnLock_2 = new JButton("LOCK");
		btnLock_2.setForeground(Color.BLACK);
		btnLock_2.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_2.setBackground(new Color(0, 128, 128));
		btnLock_2.setBounds(10, 154, 96, 46);
		this.add(btnLock_2);
		
		JButton btnLock_3 = new JButton("LOCK");
		btnLock_3.setForeground(Color.BLACK);
		btnLock_3.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_3.setBackground(new Color(0, 128, 128));
		btnLock_3.setBounds(113, 154, 96, 46);
		this.add(btnLock_3);
		
		JButton btnLock_4 = new JButton("LOCK");
		btnLock_4.setForeground(Color.BLACK);
		btnLock_4.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_4.setBackground(new Color(0, 128, 128));
		btnLock_4.setBounds(219, 154, 96, 46);
		this.add(btnLock_4);
		
		JButton btnLock_5 = new JButton("LOCK");
		btnLock_5.setForeground(Color.BLACK);
		btnLock_5.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_5.setBackground(new Color(0, 128, 128));
		btnLock_5.setBounds(325, 154, 96, 46);
		this.add(btnLock_5);
		
		JButton btnLock_6 = new JButton("LOCK");
		btnLock_6.setForeground(Color.BLACK);
		btnLock_6.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_6.setBackground(new Color(0, 128, 128));
		btnLock_6.setBounds(431, 154, 96, 46);
		this.add(btnLock_6);
		
		JButton btnLock_7 = new JButton("LOCK");
		btnLock_7.setForeground(Color.BLACK);
		btnLock_7.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_7.setBackground(new Color(0, 128, 128));
		btnLock_7.setBounds(10, 230, 96, 46);
		this.add(btnLock_7);
		
		JButton btnLock_8 = new JButton("LOCK");
		btnLock_8.setForeground(Color.BLACK);
		btnLock_8.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_8.setBackground(new Color(0, 128, 128));
		btnLock_8.setBounds(113, 230, 96, 46);
		this.add(btnLock_8);
		
		JButton btnLock_9 = new JButton("LOCK");
		btnLock_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLock_9.setForeground(Color.BLACK);
		btnLock_9.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_9.setBackground(new Color(0, 128, 128));
		btnLock_9.setBounds(219, 230, 96, 46);
		this.add(btnLock_9);
		
		JButton btnLock_10 = new JButton("LOCK");
		btnLock_10.setForeground(Color.BLACK);
		btnLock_10.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_10.setBackground(new Color(0, 128, 128));
		btnLock_10.setBounds(325, 230, 96, 46);
		this.add(btnLock_10);
		
		JButton btnLock_11 = new JButton("LOCK");
		btnLock_11.setForeground(Color.BLACK);
		btnLock_11.setFont(new Font("Corbel", Font.BOLD, 11));
		btnLock_11.setBackground(new Color(0, 128, 128));
		btnLock_11.setBounds(431, 230, 96, 46);
		this.add(btnLock_11);
		
		JLabel label = new JLabel("0000000000");
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		label.setBounds(18, 55, 88, 14);
		this.add(label);
		
		JLabel label_1 = new JLabel("0000000000");
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		label_1.setBounds(121, 56, 88, 14);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("0000000000");
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		label_2.setBounds(227, 56, 88, 14);
		this.add(label_2);
		
		//STAR IMAGES 
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon("image/StarsEmpty.png").getImage();
		image = image.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH); // scale the image when necessary
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(18, 118, 81, 27);
		this.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("");
		Image image2 = new ImageIcon("image/StarsEmpty.png").getImage();
		image2 = image2.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH); // scale the image when necessary
		lblNewLabel2.setIcon(new ImageIcon(image2));
		lblNewLabel2.setBounds(120, 118, 81, 27);
		this.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		Image image3 = new ImageIcon("image/StarsEmpty.png").getImage();
		image3 = image3.getScaledInstance(80, 30, java.awt.Image.SCALE_SMOOTH); // scale the image when necessary
		lblNewLabel3.setIcon(new ImageIcon(image3));
		lblNewLabel3.setBounds(225, 118, 81, 27);
		this.add(lblNewLabel3);

		
		
	}
	
	public JButton getBackButton() {
    	return backButton;
    }
	
	public JButton getLevel1Button() {
		return level1Button;
	}
	
	
}