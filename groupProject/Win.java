import java.awt.Color;
import java.awt.Graphics;  
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO;
public class Win extends Screen{ 
	Screen returning; 
	public Sign winSign;  
	public Sign moveSign;
	private BufferedImage winImage;
	public Win(Screen returning){ 
		winSign=new Sign(MyGame.SCREEN_WIDTH/2-100,600,200,100,MyGame.myColour,"You Won!",Color.BLACK,40); 
		moveSign=new Sign(MyGame.SCREEN_WIDTH/2-50,600,200,100,MyGame.myColour,"Press F to move on",Color.BLACK,25);  
		objects.add(winSign); 
		objects.add(moveSign); 
		try{ 
			winImage=ImageIO.read(getClass().getResourceAsStream("/sprites/winScreen.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		}
	}  
	public void draw(Graphics pen){ 
		super.draw(pen); 
		pen.drawImage(winImage,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
	}
	public void keyTyped(KeyEvent ke) {  
		char control=ke.getKeyChar();  
		if(control=='a'){ 
			MyGame.activeScreen=returning;
		}
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