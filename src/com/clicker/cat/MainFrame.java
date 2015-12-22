package com.clicker.cat;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 2269971701250845501L;
	MainFrame() {
		setBounds(200, 200, 1024, 700);
		getContentPane().setLayout(null);
		
		JButton bucketbutton = new JButton("BUCKET ICON");
		bucketbutton.setIcon(new ImageIcon("E:\\catclicker\\catclicker\\src\\bucket-icon.png"));
		bucketbutton.setBounds(10, 20, 239, 127);
		getContentPane().add(bucketbutton);
		bucketbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton tentbutton = new JButton("TENT ICON");
		tentbutton.setIcon(new ImageIcon(getClass().getResource("tent-icon.png")));
		tentbutton.setBounds(10, 180, 239, 127);
		getContentPane().add(tentbutton);
		setVisible(true);
		tentbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton pillowbutton = new JButton("PILLOW ICON");
		pillowbutton.setIcon(new ImageIcon("E:\\catclicker\\catclicker\\src\\pillow-icon.png"));
		pillowbutton.setBounds(10, 340, 239, 127);
		getContentPane().add(pillowbutton);
		setVisible(true);
		pillowbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton ballbutton = new JButton("BALL ICON");
		ballbutton.setIcon(new ImageIcon("E:\\catclicker\\catclicker\\src\\ball-icon.png"));
		ballbutton.setBounds(10, 500, 239, 127);
		getContentPane().add(ballbutton);
		setVisible(true);
		ballbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
