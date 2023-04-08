import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
import javax.swing.JPanel; 
public class BasicEnemy extends GameObject{
	String name;
	int attack; 
	int health; 
	int defense;
	BufferedImage image;
	public BasicEnemy(String name, int x, int y, int width, int height, Color c, int hp, int atk, int def, BufferedImage image ){ 
		super(x,y,width,height,c); 
		this.name = name;
		attack=atk; 
		health=hp; 
		defense=def; 
		this.image=image;
	} 
	public void update(){ 
	
	}   
	public int getX(){ 
		return x;
	}
	public String getName() {
		return name;
	} 
	public int getY(){ 
	return y;
	} 
	public BufferedImage returnImage(){
		return image;
	} 
	public int getHealth(){ 
		return health;
	}
	public void playerAttack(int playerAtk, int playerHit){ 
		int randomNum = (int)Math.floor(Math.random() * (defense - 0 + 1) + 0); 
		if(randomNum < playerHit){ 
			health-=playerAtk;
		} 
	}
	public String toString() {
		return name;
	}
}