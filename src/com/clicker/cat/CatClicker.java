package com.clicker.cat;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class CatClicker {
	public static void main(String[] args) {
		JFrame gameframe;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			gameframe = new Game();
			gameframe.setVisible(true);
		} catch (Exception e) {
			System.out.println("An error has occured!");
		}
	}
}
