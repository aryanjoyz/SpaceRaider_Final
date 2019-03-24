
package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import com.game.src.main.classes.Entity1;
import com.game.src.main.classes.Entity2;

public class Controller {
	private LinkedList<Entity1> e1 = new LinkedList<Entity1>();
	private LinkedList<Entity2> e2 = new LinkedList<Entity2>();

	Entity1 ent1;
	Entity2 ent2;
	Bullet TempBullet;
	Enemy TempEnemy;
	
	private Textures t;
	Random random  = new Random();
	private Game game;
	
 	public Controller(Textures t, Game game){
		this.t = t;
		this.game = game;
		
	}
	
	public void createEnemy(int enemyCount){
		for(int i = 0; i < enemyCount; i++){
			addEntity(new Enemy(random.nextInt(640), -10, t, this, game));
		}
	}
	
	public void tick(){
		for (int i = 0; i < e1.size(); i++){
			ent1 = e1.get(i);
			
			ent1.tick();
		}
		for (int i = 0; i < e2.size(); i++){
			ent2 = e2.get(i);
			
			ent2.tick();
		}
	}
	
	public void render(Graphics g){
		for (int i = 0; i < e1.size(); i++){
			ent1 = e1.get(i);
			
			ent1.render(g);
		}
		for (int i = 0; i < e2.size(); i++){
			ent2 = e2.get(i);
			
			ent2.render(g);
		}
	}
	
	public void addEntity(Entity1 block){
		e1.add(block);	
	}
	public void removeEntity(Entity1 block){
		e1.remove(block);	
	}
	public void addEntity(Entity2 block){
		e2.add(block);	
	}
	public void removeEntity(Entity2 block){
		e2.remove(block);	
	}
	
	public LinkedList<Entity1> getEntity1(){
		return e1;
	}
	public LinkedList<Entity2> getEntity2(){
		return e2;
	}
}