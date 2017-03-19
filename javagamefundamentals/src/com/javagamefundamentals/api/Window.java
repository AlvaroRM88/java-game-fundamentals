package com.javagamefundamentals.api;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas {

	private static final long serialVersionUID = 3160164808221934694L;

	public Window(String title, int width, int height, Game game) {
		
		JFrame frame = new JFrame(title);
		
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		
		game.start();
		
	}
	
}
