package com.clicker.cat;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class CatClicker {
	public static void main(String[] args) {
		JFrame gameframe;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			gameframe = Game.getInstance();
			gameframe.setVisible(true);
			gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (Exception e) {
			System.out.println("An error has occured!");
		}
	}
}
