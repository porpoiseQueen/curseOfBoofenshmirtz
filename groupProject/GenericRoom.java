import java.awt.Color;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;  
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO;
public class GenericRoom extends Screen{ 
	private OvPlayer p1;  
	private BufferedImage image; 
	private BufferedImage imageP; 
	protected Color myColour; 
	public BufferedImage eImage;  
	private Screen returnTo; 
	private int orientation;
	
	public GenericRoom(Screen returnTo, int orientation){ 
		this.returnTo=returnTo; 
		myColour = new Color(0, 0,0,0);		 
		this.orientation=orientation;
		int randEnemy = (int)Math.floor(Math.random() * (4 - 1 + 1) + 1);
		if(orientation==0){
			p1=new OvPlayer(350,570,100,100,myColour); 
		} 
		else{ 
			p1=new OvPlayer(350,95,100,100,myColour);
		}
		 objects.add(p1);		
		try{ 
			if(orientation==0){
				image=ImageIO.read(getClass().getResourceAsStream("/sprites/trueBaseRoom.png"));   
				
			} 
			else{ 
				image=ImageIO.read(getClass().getResourceAsStream("/sprites/trueBaseRoomU.png")); 
			}
			imageP=ImageIO.read(getClass().getResourceAsStream("/sprites/spritePaprika.png"));
			if(randEnemy==1){
				eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/hoverShark.png")); 
			} 
			else if(randEnemy==2){
				eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/attackCroc.png"));  
			}
			else{
				eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/attackJaguar4.png")); 
			
			}
		}catch (IOException e){ 
			e.printStackTrace();
		}  	 
	}  
	public void update(){ 
		for(GameObject obj: objects){ 
			obj.update();
		}   
		if(p1.x>330 && p1.x< 410){ 
			if(orientation==0){
				if(p1.y>=580){  
				p1.x=340; 
				p1.y=570;
					MyGame.activeScreen=returnTo; 
				} 
			} 
			else{ 
				if(p1.y<=85){  
					p1.x=340; 
					p1.y=95;
					MyGame.activeScreen=returnTo; 	
				}
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
			
			BasicEnemy newEnemy=new BasicEnemy("Attack Jaguar",600,400,100,100,myColour,10,5,5,eImage); 
			Battle battle1=new Battle(MyGame.player1,newEnemy,MyGame.activeScreen); 
			try{ 
			
				eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/attackJaguar4.png"));
		
				}catch (IOException e){ 
					e.printStackTrace();
				}
			MyGame.activeScreen=battle1;
		}
	}
    public void keyPressed(KeyEvent ke) {  }
	public void keyReleased(KeyEvent ke) { }
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}  
	public void mouseDragged(MouseEvent me){}  
	public void mouseMoved(MouseEvent me){}
}