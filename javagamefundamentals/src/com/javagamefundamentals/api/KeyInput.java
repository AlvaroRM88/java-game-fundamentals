package com.javagamefundamentals.api;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		
		int key = keyEvent.getKeyCode();
		
		for(GameObject gameObject: handler.listGameObject) {
			
			this.basicMove(key, gameObject, 3);
			
		}
	}
		
	@Override
	public void keyReleased(KeyEvent keyEvent) {
		
		int key = keyEvent.getKeyCode();
		
		for(GameObject gameObject: handler.listGameObject) {
			
			this.basicMove(key, gameObject, 0);		
		}
	}
	
	private void basicMove(int key, GameObject gameObject, int speed) {
		
		if(gameObject.getId().equals(GameObjectId.Player)) {
			
			if(key == KeyEvent.VK_W) gameObject.setVelY(-speed);
			if(key == KeyEvent.VK_A) gameObject.setVelX(-speed);
			if(key == KeyEvent.VK_S) gameObject.setVelY(speed);
			if(key == KeyEvent.VK_D) gameObject.setVelX(speed);
		}
		
		if(gameObject.getId().equals(GameObjectId.Player2)) {
			
			if(key == KeyEvent.VK_UP) gameObject.setVelY(-speed);
			if(key == KeyEvent.VK_LEFT) gameObject.setVelX(-speed);
			if(key == KeyEvent.VK_DOWN) gameObject.setVelY(speed);
			if(key == KeyEvent.VK_RIGHT) gameObject.setVelX(speed);
			
		}
	}

}
