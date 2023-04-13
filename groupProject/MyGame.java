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
public class MyGame extends Game  {
    public static final String TITLE = "MyGame";
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 800;

    // declare variables here
	public static int bossCount;
	public static genericRoom g1; 
	public static genericRoom g2; 
	public static genericRoom g3; 
	public static genericRoom g4;  
	public static genericRoom g5; 
	public static genericRoom g6; 
	public static genericRoom g7; 
	public static genericRoom g8; 
	public static genericRoom g9; 
	public static genericRoom g10; 
	public static genericRoom g11; 
	public static genericRoom g12;
	public static StartRoom ov1; 
	public static dieScreen die; 
	public static StartScreen start; 
	public static Battle battle;  
	public static boofsLair boofLab;
	public static BattlePlayer player1; 
	public static basement b1; 
	public static kitchen k1; 
	public static minigame mini1;
	public static Screen activeScreen;  
	public BasicEnemy e1;  
	public static downStairsRoom downHall;
	public static startHallwayScreen startHall;
	public BufferedImage image;
	public static Color myColour;
    public MyGame() {
        // initialize variables here 
		bossCount=0;
		myColour = new Color(0, 0,0,0);	
		ov1=new StartRoom(); 
		mini1=new minigame();
		die= new dieScreen();  
		downHall=new downStairsRoom();
		start=new StartScreen();  
		b1=new basement(downHall);			
		startHall=new startHallwayScreen();
		g1=new genericRoom(startHall,0); 
		g2=new genericRoom(startHall,0);  
		g5=new genericRoom(startHall,1); 
		g6=new genericRoom(startHall,1);
		g3=new genericRoom(downHall,0); 
		g4=new genericRoom(downHall,0);   
		g7=new genericRoom(downHall,1);
		g8=new genericRoom(downHall,1); 
		g9=new genericRoom(b1,0);   
		g10=new genericRoom(b1,1); 
		g11=new genericRoom(b1,1); 
		g12=new genericRoom(b1,0); 
		b1=new basement(downHall);		
		boofLab=new boofsLair();
		k1=new kitchen();
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/spritePaprika.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		}  
		
		player1=new BattlePlayer(150,400, 100,100,myColour,10,5,5,5,1,image); 
		
		activeScreen=mini1;
    }
    
    public void update() {
        // updating logic 
		
		activeScreen.update();
    }
    
    public void draw(Graphics pen) {
        
        activeScreen.draw(pen);
	
    }
        
    @Override
    public void keyTyped(KeyEvent ke) { activeScreen.keyTyped(ke);}

    @Override
    public void keyPressed(KeyEvent ke) { 
		
	}
	
    @Override
    public void keyReleased(KeyEvent ke) {activeScreen.keyReleased(ke);}
	
    @Override
    public void mouseClicked(MouseEvent me) {activeScreen.mouseClicked(me);}

    @Override
    public void mousePressed(MouseEvent me) {activeScreen.mousePressed(me);}
    
    @Override
    public void mouseReleased(MouseEvent me) {activeScreen.mouseReleased(me);}

    @Override
    public void mouseEntered(MouseEvent me) {activeScreen.mouseEntered(me);}

    @Override
    public void mouseExited(MouseEvent me) {activeScreen.mouseExited(me);}
      
	@Override 
	public void mouseDragged(MouseEvent me){activeScreen.mouseDragged(me);} 
	
	@Override 
	public void mouseMoved(MouseEvent me){activeScreen.mouseMoved(me);}
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}