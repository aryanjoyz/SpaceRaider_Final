package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.main.libs.Animation;
import com.game.src.main.classes.Entity1;
import com.game.src.main.classes.Entity2;

public class Enemy extends GameObject implements Entity2 {
	
	Random r = new Random();
	
	private Textures t;
	private Game game;
	private Controller c;
	Animation animate;
	
	public Enemy(double x, double y, Textures t, Controller c, Game game){
		super(x,y);
		this.t = t;
		this.c = c;
		this.game = game;
		animate = new Animation(1, t.enemy[0], t.enemy[1], t.enemy[2]);

	}
	
	public void tick(){
		y += 0.1;
		
		if (y > (Game.HEIGHT * Game.SCALE)){
			x =r.nextInt(640);
			y = -10;
		}
		
		for(int i = 0; i < game.e1.size(); i++){
			Entity1 tempEnt = game.e1.get(i);
			
			if (Physics.Collision(this, tempEnt)){
				c.removeEntity(tempEnt);
				c.removeEntity(this);
				game.setEnemyKilled(game.getEnemyKilled() + 1);
			}
		}
		animate.runAnimation();

	}
	
	public void render(Graphics g){
		g.drawImage(t.enemy[0], (int)x, (int)y, null);
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