package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet {
	private double x;
	private double y;
	
	private Textures t;
	
	public Bullet(double x, double y, Textures t){
		this.x = x;
		this.y = y;
		this.t = t;
		
	}
	
	public void tick(){
		y-=1;
	}
	
	public void render(Graphics g){
		g.drawImage(t.bullet, (int)x, (int)y, null);
	}

	public double getY() {
		return y;

	}
}
