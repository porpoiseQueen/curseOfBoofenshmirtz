import java.awt.Color;
import java.awt.Graphics;
public abstract class GameObject{ 
	protected int x,y,width, height;  
	private Color color;
	
	public GameObject(int x, int y, int width, int height, Color c){ 
		this.x=x; 
		this.y=y; 
		this.height=height; 
		this.width=width; 
		this.color=c;
	}
	
	public abstract void update();
	
	
	public void draw(Graphics pen){ 
		pen.setColor(color); 
		pen.fillRect(x,y,width,height);
	}
}