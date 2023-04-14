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
import java.util.ArrayList;
public class minigamePlayer extends GameObject{ 
	private int direction; 
	private int score;
	public minigamePlayer(int x, int y, int width, int height, Color c, int direction){ 
		super(x,y,width,height,c); 
		direction=0; 
		score=0;
	} 
	public void update(){ 
	
	}  
	public int getDirection(){ 
		return this.direction;
	} 
	public void checkCollide(ArrayList<minigameEnemy> eList){ 
		for(minigameEnemy e :eList){ 
			if(e.getX()+e.getWidth()>=this.x && e.getX()<this.x&&e.getY()+e.getWidth()>=this.y&&e.getY()<=this.y){ 
				System.out.println("top left");
			}
		}
	}
	
}