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
public class Battle extends Screen{ 
	private BattlePlayer bp1; 
	private BasicEnemy e1;  
	private BufferedImage image;
	private BufferedImage eImage; 
	private BufferedImage select1;	 
	private BufferedImage select2;	 
	private BufferedImage select3;	 
	private BufferedImage select4;	 
	private BufferedImage activeSelect;	 
	Screen returnScreen;
	protected Color myColour; 
	int select; 
	
	public Battle(BattlePlayer bp1, BasicEnemy e1, Screen returnScreen){  
		myColour = new Color(0, 0,0,0);	
		this.bp1=bp1; 
		
		this.e1=e1;
		objects.add(bp1); 
		objects.add(e1); 
		select=1; 
		this.returnScreen=returnScreen;		
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/battleBackground1.png"));  
			select1=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Fight.png")); 
			select2=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Run.png")); 
			select3=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Item.png"));
			select4=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Skill.png")); 
			eImage=ImageIO.read(getClass().getResourceAsStream("/sprites/attackJaguar4.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		} 	
	}   
	public void update(){ 
		super.update();
		if(select>=5){ 
			select=1;
		} 
		if(select<1){ 
			select=4;
		}
		if(select==1){ 
			activeSelect=select1;
		} 
		else if(select==2){ 
			activeSelect=select2;
		} 
		else if(select==3){ 
			activeSelect=select3;
		} 
		else if(select==4){ 
			activeSelect=select4;
		} 
		if(e1.getHealth()<=0){ 
			MyGame.activeScreen=returnScreen;
		}
	}
	public void draw(Graphics pen){ 
		pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
		super.draw(pen);  
		pen.drawImage(bp1.returnImage(),bp1.getX(),bp1.getY(), 100,100,null); 
		pen.drawImage(e1.returnImage(),e1.getX(),e1.getY(), 100,100,null);
		pen.drawImage(activeSelect,0,500,200,200,null); 	
	} 
	public void keyTyped(KeyEvent ke) {  
		System.out.println(select); 
		char control=ke.getKeyChar();  
		if(control=='s'){ 	
			select+=1;
		} 
		if(control=='w'){ 
			select-=1;
		} 
		if(control==KeyEvent.VK_ENTER || control==KeyEvent.VK_SPACE){ 
			MyGame.activeScreen=returnScreen;
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