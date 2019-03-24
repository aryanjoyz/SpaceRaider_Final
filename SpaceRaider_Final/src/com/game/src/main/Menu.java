package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {

	public Rectangle playButton = new Rectangle(Game.WIDTH /2 + 120, 150, 100,50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH /2 + 120, 250, 100,50);

	public void render(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Font font = new Font("times new roman", Font.BOLD, 50);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("SPACE RAIDER", Game.WIDTH / 2, 100);
		
		Font fnt = new Font("times new roman", Font.BOLD, 30);
		g.setFont(fnt);
		g.drawString("PLAY", playButton.x + 11, playButton.y + 35);
		g2d.draw(playButton);
		g.drawString("QUIT", playButton.x + 12, playButton.y + 135);
		g2d.draw(quitButton);
	}
}