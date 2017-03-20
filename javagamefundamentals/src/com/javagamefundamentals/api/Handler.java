package com.javagamefundamentals.api;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> listGameObject = new LinkedList<GameObject>();
	
	public void addObjectToList(GameObject gameObject) {
		this.listGameObject.add(gameObject);
	}
	
	public void removeObjectToList(GameObject gameObject) {
		this.listGameObject.remove(gameObject);
	}
	
	public void tick() {
		for(GameObject gameObject : listGameObject) {
			gameObject.tick();
		}
	}
	
	public void render(Graphics graphics) {
		for(GameObject gameObject : listGameObject) {
			gameObject.render(graphics);
		}
	}
	
}
