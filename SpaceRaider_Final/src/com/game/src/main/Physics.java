package com.game.src.main;

import java.util.LinkedList;

import com.game.src.main.classes.Entity1;
import com.game.src.main.classes.Entity2;

public class Physics {
	public static boolean Collision(Entity1 e1, Entity2 e2){
			if (e1.getBounds().intersects(e2.getBounds())){
				return true;
		}
		
		return false;
	}
	
	public static boolean Collision(Entity2 e2, Entity1 e1){
			if (e2.getBounds().intersects(e1.getBounds())){
				return true;

		}
		
		return false;
	}
}
