package com.javagamefundamentals.api;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	protected Player(int posX, int posY/*, GameObjectId id*/) {
		super(posX, posY/*, id*/);

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(posX, posY, 32, 32);
		
	}

}
