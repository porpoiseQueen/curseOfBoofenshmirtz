import java.awt.Color;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
public class StartRoom extends Screen{ 
	private OvPlayer p1;  
	private BufferedImage image; 
	private BufferedImage imageP; 
	protected Color myColour; 
	public BufferedImage eImage;
	public StartRoom(){ 
		  
		myColour = new Color(0, 0,0,0);		 
		p1=new OvPlayer(580,100,100,100,myColour);
		 objects.add(p1);		
		 
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/startRoom.png"));  
			imageP=ImageIO.read(getClass().getResourceAsStream("/sprites/spritePaprika.png")); 
			eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/attackJaguar4.png"));
		
		}catch (IOException e){ 
			e.printStackTrace();
		}  
		
		
		 
	}
	public void update(){ 
		//door
		for(GameObject obj: objects){ 
			obj.update();
		}   
		if(p1.x>330 && p1.x< 410){  
			if(p1.y>=580){  
			p1.x=340; 
			p1.y=570;
				MyGame.activeScreen=MyGame.startHall; 
				
			}
		}
	} 
	public void draw(Graphics pen){ 
		pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
		super.draw(pen); 
		pen.drawImage(imageP,p1.x,p1.y,100,100,null);
		
		
	}
	public void keyTyped(KeyEvent ke) {  
		char control=ke.getKeyChar();
		if(p1.x+p1.width <670){
			if(control=='d'){ 
				p1.x+=5; 
				
			} 
		}  
		if(p1.x>130){
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
			BasicEnemy newEnemy=new BasicEnemy("John", 600,400,100,100,myColour,10,5,5,eImage); 
			BasicEnemy newEnemy2=new BasicEnemy("John", 600,500,100,100,myColour,10,5,5,eImage); 
			ArrayList<BasicEnemy> enemies=new ArrayList<>();
			enemies.add(newEnemy);
			enemies.add(newEnemy2);
			Battle battle1=new Battle(MyGame.player1,newEnemy2,MyGame.ov1); 
			MyGame.activeScreen=battle1;
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