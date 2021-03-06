package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.main.libs.Animation;
import com.game.src.main.classes.Entity1;

public class Bullet extends GameObject implements Entity1 {

	private Textures t;
	private Game game;
	Animation animate;
	
	public Bullet(double x, double y, Textures t, Game game){
		super(x,y);
		this.t = t;
		this.game = game;
		animate = new Animation(5, t.bullet[0], t.bullet[1], t.bullet[2]);

		
	}
	
	public void tick(){
		y-=1;

		animate.runAnimation();
	}
	
	public void render(Graphics g){
		g.drawImage(t.bullet[0], (int)x, (int)y, null);
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}

	public double getY() {
		return y;

	}
	public double getX(){
		return x;
	}
}
