package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

public class Controller {
	private LinkedList<Entity> e = new LinkedList<Entity>();

	Bullet TempBullet;
	Enemy TempEnemy;
	Game game;
	
	Entity entity;
	private Textures t;
	Random random  = new Random();
	
	public Controller(Textures t){
		for(int i = 0; i < 20; i++)
		addEntity(new Enemy(random.nextInt(640),10,t));
		
	}
	
	
	public void tick(){
		for (int i = 0; i < e.size(); i++){
			entity = e.get(i);
			
			entity.tick();
		}
	}
	
	public void render(Graphics g){
		for (int i = 0; i < e.size(); i++){
			entity = e.get(i);
			
			entity.render(g);
		}
	}
	
	public void addEntity(Entity block){
		e.add(block);	
	}
	public void removeEntity(Entity block){
		e.remove(block);	
	}

}
