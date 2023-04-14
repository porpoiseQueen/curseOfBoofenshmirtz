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
import java.util.ArrayList; 
public class minigame extends Screen{ 
	private minigamePlayer p1;  
	//private BufferedImage image; 
	private BufferedImage imageP;
	private BufferedImage imagePr;  
	private BufferedImage imagePl;  
	private BufferedImage imagePu;  
	private BufferedImage imagePd; 
	protected Color myColour; 
	public BufferedImage eImager; 
	public BufferedImage eImagel; 
	public BufferedImage eImaged; 
	public BufferedImage eImageu;
	private ArrayList<minigameEnemy> downEnemies; 
	private ArrayList<minigameEnemy> upEnemies; 
	private ArrayList<minigameEnemy> rightEnemies; 
	private ArrayList<minigameEnemy> leftEnemies; 
	private ArrayList<minigameEnemy> allEnemies;
	public minigame(){ 
		myColour = new Color(0, 0,0,0);		 
		p1=new minigamePlayer(350,95,100,100,myColour,0);
		objects.add(p1); 
		downEnemies=new ArrayList<>(); 
		upEnemies=new ArrayList<>();
		leftEnemies=new ArrayList<>();
		rightEnemies=new ArrayList<>(); 
		allEnemies=new ArrayList<>();
		try{ 
			//image=ImageIO.read(getClass().getResourceAsStream("/sprites/hallwayWithStairs.png"));  
			imagePr=ImageIO.read(getClass().getResourceAsStream("/sprites/cardinal-right.png")); 
			imagePl=ImageIO.read(getClass().getResourceAsStream("/sprites/cardinal-left.png")); 
			imagePu=ImageIO.read(getClass().getResourceAsStream("/sprites/cardinal-up.png")); 
			imagePd=ImageIO.read(getClass().getResourceAsStream("/sprites/cardinal-down.png"));
			
			eImager=ImageIO.read(getClass().getResourceAsStream("/sprites/blueJay-right.png"));  
			eImagel=ImageIO.read(getClass().getResourceAsStream("/sprites/blueJay-left.png"));  
			eImageu=ImageIO.read(getClass().getResourceAsStream("/sprites/blueJay-up.png"));  
			eImaged=ImageIO.read(getClass().getResourceAsStream("/sprites/blueJay-down.png")); 
			
		}catch (IOException e){ 
			e.printStackTrace();
		} 
		imageP=imagePr;
		for(int i=0;i<15;i++){ 
			int randomENum1 = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0); 
			int randomENum2 = ((int)Math.floor(Math.random() * (800 - 100 + 1) + 100))*-1;
			minigameEnemy newEnemy=new minigameEnemy(randomENum1, randomENum2, 100, 100, myColour, 2, eImaged); 
			downEnemies.add(newEnemy); 
			allEnemies.add(newEnemy); 
			objects.add(newEnemy);
		} 
		
		for(int i=0;i<15;i++){ 
			int randomENum1 = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0); 
			int randomENum2 = (int)Math.floor(Math.random() * (1600 - 800 + 1) + 800); 
			minigameEnemy newEnemy=new minigameEnemy(randomENum1, randomENum2, 100, 100, myColour, 1, eImageu); 
			upEnemies.add(newEnemy); 
			allEnemies.add(newEnemy); 
			objects.add(newEnemy);
		} 
		for(int i=0;i<15;i++){ 
			int randomENum1 = ((int)Math.floor(Math.random() * (800 - 100 + 1) + 100)) *-1; 
			int randomENum2 = (int)Math.floor(Math.random() * (700 - 0 + 1) + 0); 
			minigameEnemy newEnemy=new minigameEnemy(randomENum1, randomENum2, 100, 100, myColour, 0, eImager); 
			rightEnemies.add(newEnemy); 
			allEnemies.add(newEnemy); 
			objects.add(newEnemy);
		} 
		for(int i=0;i<15;i++){ 
			int randomENum1 = (int)Math.floor(Math.random() * (1600 - 800 + 1) + 800); 
			int randomENum2 = (int)Math.floor(Math.random() * (700 - 0 + 1) + 0); 
			minigameEnemy newEnemy=new minigameEnemy(randomENum1, randomENum2, 100, 100, myColour, 3, eImager); 
			leftEnemies.add(newEnemy); 
			allEnemies.add(newEnemy); 
			objects.add(newEnemy);
		}
	} 
	
	public void draw(Graphics pen){ 
			//pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
			super.draw(pen); 
			pen.drawImage(imageP,p1.x,p1.y,100,100,null);	 
			 
			for(minigameEnemy obj: allEnemies){ 
				obj.draw(pen); 
				pen.drawImage(obj.getImage(),obj.getX(),obj.getY(),100,100,null);
			}
		}
	 
	
	public void keyTyped(KeyEvent ke) {  
	
		char control=ke.getKeyChar(); 
		
		if(p1.x+p1.width <800){
			if(control=='d'){ 
				p1.x+=5;  
				imageP=imagePr;
				
			} 
		}  
		if(p1.x>0){
			if(control=='a'){ 
				p1.x-=5; 
				imageP=imagePl;
			} 
		}
		
		if(p1.y+p1.height <700){
			if(control=='s'){ 
				p1.y+=5; 
				imageP=imagePd;
			} 
		} 
		if(p1.y>0){
			if(control=='w'){ 
				p1.y-=5; 
				imageP=imagePu;
			} 
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