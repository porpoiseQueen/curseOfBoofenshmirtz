import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO;
public class dieScreen extends Screen{ 
	private Sign dieSign;  
	private Sign returnSign;  	
	private backGround b1; 
	private BufferedImage image;
	public dieScreen(){ 
		b1=new backGround(0,0, MyGame.SCREEN_WIDTH, MyGame.SCREEN_HEIGHT, Color.BLACK); 
		objects.add(b1);
		dieSign=new Sign(50,50,200,75,Color.BLACK, "You're Desab", Color.RED,40);
		objects.add(dieSign); 
		returnSign=new Sign(200,200,200,75,Color.BLACK, "Press any key to return to Start", Color.WHITE, 20);
		objects.add(returnSign);
		
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/Bidoofinshmirtz.jpg"));
		}catch (IOException e){ 
			e.printStackTrace();
		} 
		
	}  
	public void draw(Graphics pen){ 
		super.draw(pen);
		//pen.setColor(Color.RED);  
		//pen.setFont(new Font("Arial",1,40));
		pen.drawImage(image,100,100,100,100,null);
	}
	public void keyTyped(KeyEvent ke) {
		MyGame.activeScreen=MyGame.start;
	}

   
    public void keyPressed(KeyEvent ke) {  
		
	}
	public void keyReleased(KeyEvent ke) { 
	
	}

  
    public void mouseClicked(MouseEvent me) {}

  
    public void mousePressed(MouseEvent me) {}
    
   
    public void mouseReleased(MouseEvent me) {}

 
    public void mouseEntered(MouseEvent me) {}

  
    public void mouseExited(MouseEvent me) {}  
	public void mouseDragged(MouseEvent me){ 
		
	} 
	
	 
	public void mouseMoved(MouseEvent me){ 
		
		
	}
}