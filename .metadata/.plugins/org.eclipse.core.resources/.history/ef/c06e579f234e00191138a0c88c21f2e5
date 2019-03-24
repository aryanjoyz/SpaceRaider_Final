package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.Entity2;

public class Enemy extends GameObject implements Entity2 {
	
	Random r = new Random();
	
	private Textures t;
	
	public Enemy(double x, double y, Textures t){
		super(x,y);
		this.t = t;
	}
	
	public void tick(){
		y += 0.1;
		
		if (y > (Game.HEIGHT * Game.SCALE)){
			x =r.nextInt(640);
			y = -10;
		}
	}
	
	public void render(Graphics g){
		g.drawImage(t.enemy, (int)x, (int)y, null);
	}
	
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
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