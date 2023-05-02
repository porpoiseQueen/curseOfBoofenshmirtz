import java.awt.Color;
import java.util.ArrayList;
public class MinigamePlayer extends GameObject{ 
	private int direction; 
	private int score;
	public MinigamePlayer(int x, int y, int width, int height, Color c, int direction){ 
		super(x,y,width,height,c); 
		direction=0; 
		score=0;
	} 
	public void update(){ 
	
	}  
	public int getDirection(){ 
		return this.direction;
	} 
	public void checkCollide(ArrayList<MinigameEnemy> eList){ 
		for(MinigameEnemy e :eList){ 
			if(e.getX()+e.getWidth()>=this.x && e.getX()<this.x&&e.getY()+e.getWidth()>=this.y&&e.getY()<=this.y){ 
				System.out.println("top left");
			}
		}
	}
	
}