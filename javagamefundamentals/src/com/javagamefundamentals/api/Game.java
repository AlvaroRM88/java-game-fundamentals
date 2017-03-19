package com.javagamefundamentals.api;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = -6662756253203923937L;
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean isRunning = false;
	
	public Game() {
		new Window("Java game window", WIDTH, HEIGHT, this);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		isRunning = true;
	}
	
	public synchronized void stop() {
		isRunning = false;
		try{
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		double amountOfTicks = 60.0;
		double nanoSeconds = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int fps = 0;
		long lastTime = System.nanoTime();
		
		// Game loop
		while(isRunning) {
			long nowTime = System.nanoTime();
			delta += (nowTime - lastTime) / nanoSeconds;
			lastTime = nowTime;
			
			while(delta >= 1) {
				tick();
				delta--;
			}
			
			if(isRunning) {
				render();
			}
			fps++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + fps);
				fps = 0;
			}
			
		}
		stop();
	}
	
	private void tick() {
		
	}
	
	private void render() {
		
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics graphics = bs.getDrawGraphics();
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0, 0, WIDTH, HEIGHT);
		graphics.dispose();
		
		bs.show();
		
	}
	
	
	
	public static void main(String args[]) {
		new Game();
	}
	
}
