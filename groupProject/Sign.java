import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class Sign extends GameObject{ 
	public String text; 
	private Color textColor; 
	private int size;
	public Sign(int x, int y, int width, int height, Color c, String text, Color textC, int size){ 
		super(x,y,width,height,c); 
		this.text=text; 
		this.textColor=textC; 
		this.size=size;
	} 
	public void update(){ 
	
	} 
	public void draw(Graphics pen){ 
		super.draw(pen);   
		pen.setColor(textColor);  
	  
		pen.setFont(new Font("Arial",1,size));		
		pen.drawString(text, x, y+50);
		
	} 
	public void setColor(Color newText){ 
		this.textColor=newText;
	}
}