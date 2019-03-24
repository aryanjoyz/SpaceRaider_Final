package com.game.src.main;

import java.util.LinkedList;

import com.game.src.main.classes.Entity1;
import com.game.src.main.classes.Entity2;

public class Physics {
	public static boolean Collision(Entity1 e1, LinkedList<Entity2> e2){
		for(int i = 0; i < e2.size(); i++){
			if (e1.getBounds().intersects(e2.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean Collision(Entity2 e2, LinkedList<Entity1> e1){
		for(int i = 0; i < e1.size(); i++){
			if (e2.getBounds().intersects(e1.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
}
