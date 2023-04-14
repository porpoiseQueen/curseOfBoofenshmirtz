import java.awt.Color;
public class minigamePlayer extends GameObject{ 
	private int direction;
	public minigamePlayer(int x, int y, int width, int height, Color c, int direction){ 
		super(x,y,width,height,c); 
		direction=0;
	} 
	public void update(){ 
	
	}  
	public int getDirection(){ 
		return this.direction;
	}
	
}