import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
import javax.swing.JPanel; 
public class BattlePlayer extends GameObject{
	int maxHealth;
	int health; 
	int attack; 
	int hitRate; 
	int defense; 
	int level; 
	BufferedImage image;
	public BattlePlayer(int x, int y, int width, int height, Color c, int hp, int atk, int hit, int def, int level, BufferedImage image){ 
		super(x,y,width,height,c); 
		maxHealth = hp;
		health=hp; 
		attack=atk; 
		hitRate=hit; 
		defense=def; 
		this.level=level; 
		this.image=image;
	} 
	public void update(){ 
		if(health<=0){ 
			MyGame.activeScreen=MyGame.die;
			maxHeal();
		}
	}  
	public int getX(){ 
		return x;
	}	 
	public int getY(){ 
		return y;
	}
	public void enemyAttack(int enemyAtk){ 
		int damage=enemyAtk-defense; 
		if(damage<=0){ 
			damage=1;
		} 
		health-=damage;
	} 
	public BufferedImage returnImage(){ 
		return image;
	}
	public void maxHeal() {
		health = maxHealth;
	}
}