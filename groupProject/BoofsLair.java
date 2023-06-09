import java.awt.Color;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO;
public class BoofsLair extends Screen{ 
	private OvPlayer p1;  
	private BufferedImage image; 
	private BufferedImage imageP; 
	protected Color myColour; 
	public BufferedImage eImage;
	public BoofsLair(){ 
		  
		myColour = new Color(0, 0,0,0);		 
		p1=new OvPlayer(350,95,100,100,myColour);
		 objects.add(p1);		
		 
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/drBoof'sLab.png"));  
			imageP=ImageIO.read(getClass().getResourceAsStream("/sprites/spritePaprika.png"));
		
		}catch (IOException e){ 
			e.printStackTrace();
		}  
		
		
		 
	}  
	public void update(){ 
		
		for(GameObject obj: objects){ 
			obj.update();
		}   
		if(p1.x>330 && p1.x< 410){ 
			
			if(p1.y<=85){  
			p1.y=95;
				MyGame.activeScreen=MyGame.b1; 
				
			}
			
		}  
		
		
		
		
	} 
	public void keyTyped(KeyEvent ke) {  
	
		char control=ke.getKeyChar(); 
		
		if(p1.x+p1.width <800){
			if(control=='d'){ 
				p1.x+=5; 
				
			} 
		}  
		if(p1.x>0){
			if(control=='a'){ 
				p1.x-=5; 
				
			} 
		}
		
		if(p1.y+p1.height <680){
			if(control=='s'){ 
				p1.y+=5; 
				
			} 
		} 
		if(p1.y>85){
			if(control=='w'){ 
				p1.y-=5; 
				
			} 
		}
		int randomNum = (int)Math.floor(Math.random() * (300 - 0 + 1) + 0);  
		if(randomNum==1){ 
			BasicEnemy newEnemy=new BasicEnemy("John", 0,0,100,100,myColour,10,5,5,eImage); 
			Battle battle1=new Battle(MyGame.player1,newEnemy,MyGame.activeScreen); 
			MyGame.activeScreen=battle1;
		}
	}
	public void draw(Graphics pen){ 
			pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
			super.draw(pen); 
			pen.drawImage(imageP,p1.x,p1.y,100,100,null);
			
			
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