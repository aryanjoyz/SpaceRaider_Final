package com.game.src.main;

import java.awt.Graphics;

public class Enemy {
	private double x;
	private double y;
	
	private Textures t;
	
	public Enemy(double x, double y, Textures t){
		this.x = x;
		this.y = y;
		this.t = t;
	}
	
	public void tick(){
		y += 1;
	}
	
	public void render(Graphics g){
		g.drawImage(t.enemy, (int)x, (int)y, null);
	}
}
