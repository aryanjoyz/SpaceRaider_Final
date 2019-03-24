package com.game.src.main;

import java.awt.Graphics;
import java.util.Random;

public class Enemy implements Entity{
	private double x;
	private double y;
	
	Random r = new Random();
	
	private Textures t;
	
	public Enemy(double x, double y, Textures t){
		this.x = x;
		this.y = y;
		this.t = t;
	}
	
	public void tick(){
		y += 0.2;
		
		if (y > (Game.HEIGHT * Game.SCALE)){
			x =r.nextInt(640);
			y = -10;
		}
	}
	
	public void render(Graphics g){
		g.drawImage(t.enemy, (int)x, (int)y, null);
	}
	
	public double getY(){
		return y;
	}
	public double setY(double y){
		return y;
	}
	public double getX(){
		return x;
	}
}