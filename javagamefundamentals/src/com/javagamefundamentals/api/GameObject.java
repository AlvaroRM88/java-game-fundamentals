package com.javagamefundamentals.api;

import java.awt.Graphics;

public abstract class GameObject {

	protected int posX;
	protected int posY;
	protected int velX;
	protected int velY;
	protected GameObjectId id;

	protected GameObject(int posX, int posY/*, GameObjectId id*/) {
		this.posX = posX;
		this.posY = posY;
		/*this.id = id;*/
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics graphics);
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public int getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	public GameObjectId getId() {
		return id;
	}
	public void setId(GameObjectId id) {
		this.id = id;
	}
	
}
