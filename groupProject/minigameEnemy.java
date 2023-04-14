import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent; 
import java.util.ArrayList;  
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
import javax.swing.JPanel; 
public class minigameEnemy extends GameObject{ 
	private int direction;
	private BufferedImage eImage;
	public minigameEnemy(int x, int y, int width, int height, Color c, int direction, BufferedImage enemyImage){ 
		super(x,y,width,height,c); 
		direction=0; 
		eImage=enemyImage;
	} 
	public void update(){ 
		if(direction==0){ 
			x+=2;
		} 
		if(direction==1){ 
			y-=2;
		} 
		if(direction==2){ 
			y+=2;
		} 
		if(direction==3){ 
			x-=2;
		}
	}   
	public int getX(){ 
		return x;
	} 
	public int getY(){  
		return y;
	}
	public int getDirection(){ 
		return this.direction;
	} 
	public BufferedImage getImage(){ 
		return this.eImage;
	} 
	
	
}