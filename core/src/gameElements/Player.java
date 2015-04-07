package gameElements;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Player extends Creatures {

	private String name;
	
	private int nbWall;
	
	public Player(int pv, int pa, Texture img, String name) {
		super(pv, pa, img);

		this.name = name;
		this.nbWall = 5;
	}

	public void move(int x, int y) {
		
	}
	
}
