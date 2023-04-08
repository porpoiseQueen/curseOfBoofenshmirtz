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
public class StartScreen extends Screen{ 
	private Sign title;  
	private BufferedImage image;
	private Sign startSign; 
	private Color myColour;
	public StartScreen(){   
	myColour = new Color(0, 0,0,0);
		title=new Sign(MyGame.SCREEN_WIDTH/2-100,50,200,100,myColour,"Curse of Boof",Color.WHITE,40); 
		startSign=new Sign(MyGame.SCREEN_WIDTH/2-100,200,200,100,myColour,"Press any key to start",Color.WHITE,20); 
		objects.add(title); 
		objects.add(startSign); 
	try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/Title2.png")); 
			
		}catch (IOException e){ 
			e.printStackTrace();
		}
	}  
	public void draw(Graphics pen){ 
		pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
		super.draw(pen); 
		
		
		
	}
	public void keyTyped(KeyEvent ke) {  
		char control=ke.getKeyChar(); 
	
		MyGame.activeScreen=MyGame.ov1;
	}

   
    public void keyPressed(KeyEvent ke) { }
	public void keyReleased(KeyEvent ke) {}

  
    public void mouseClicked(MouseEvent me) {}

  
    public void mousePressed(MouseEvent me) { 
	
	}
    
   
    public void mouseReleased(MouseEvent me) {}

 
    public void mouseEntered(MouseEvent me) {}

  
    public void mouseExited(MouseEvent me) {} 
	public void mouseDragged(MouseEvent me){} 
	
	 
	public void mouseMoved(MouseEvent me){ 
		
	}

}