package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.game.main.libs.Animation;
import com.game.src.main.classes.Entity1;
import com.game.src.main.classes.Entity2;

public class Player extends GameObject implements Entity1 {
	
	private double velX = 0;
	private double velY = 0;
	
	private Textures t;
	private BufferedImage gameOver = null;
	
	Game game;
	Controller c;
	Animation animate;
	
	public Player(double x, double y, Textures t, Game game, Controller c){
		super(x,y);
		this.t = t;
		this.game = game;
		this.c = c;
		
		animate = new Animation(1, t.player[0], t.player[1], t.player[2]);
		
	}
	

	public void tick(){
		x += velX;
		y += velY;
		
		if(x <= 0)
			x = 0;
		if(x >= 640 - 16)
			x = 640 - 16;
		if (y <= 0)
			y = 0;
		if (y >= 480 - 32)
			y = 480 - 32;
		
		for(int i = 0; i < game.e2.size(); i++){
			Entity2 tempEnt = game.e2.get(i);
			
			if(Physics.Collision(this, tempEnt)){
				c.removeEntity(tempEnt);
				game.HEALTH -= 10;
				game.setEnemyKilled(game.getEnemyKilled() + 1);
			}
		}
		animate.runAnimation();
	}
	
	public void render(Graphics g){
		animate.drawAnimation(g, x, y, 0);	
		}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	public void setVelX(double velX){
		this.velX = velX;
	}
	public void setVelY(double velY){
		this.velY = velY;
	}
}