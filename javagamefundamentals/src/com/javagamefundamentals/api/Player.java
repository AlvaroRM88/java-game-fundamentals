package com.javagamefundamentals.api;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	protected Player(int posX, int posY, GameObjectId id) {
		
		super(posX, posY, id);
		
	}

	@Override
	public void tick() {
		
		posX += velX;
		posY += velY;
		
	}

	@Override
	public void render(Graphics graphics) {
		
		if(id.equals(GameObjectId.Player)) graphics.setColor(Color.WHITE);
		if(id.equals(GameObjectId.Player2)) graphics.setColor(Color.GREEN);
		
		graphics.fillRect(posX, posY, 32, 32);
		
	}

}
