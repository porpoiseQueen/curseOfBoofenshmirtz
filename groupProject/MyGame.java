import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
public class MyGame extends Game  {
    public static final String TITLE = "MyGame";
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 800;

    // declare variables here
	public static int bossCount;
	public static GenericRoom g1; 
	public static GenericRoom g2; 
	public static GenericRoom g3; 
	public static GenericRoom g4;  
	public static GenericRoom g5; 
	public static GenericRoom g6; 
	public static GenericRoom g7; 
	public static GenericRoom g8; 
	public static GenericRoom g9; 
	public static GenericRoom g10; 
	public static GenericRoom g11; 
	public static GenericRoom g12;
	public static StartRoom ov1; 
	public static DieScreen die; 
	public static StartScreen start; 
	public static Battle battle;  
	public static BoofsLair boofLab;
	public static BattlePlayer player1; 
	public static Basement b1; 
	public static Kitchen k1; 
	public static Minigame mini1;
	public static Screen activeScreen;  
	public BasicEnemy e1;  
	public static DownStairsRoom downHall;
	public static StartHallwayScreen startHall;
	public BufferedImage image;
	public Menu<String> men;
	public Item<String>[] names;
	public String str;
	public static Color myColour;
    public MyGame() {
        // initialize variables here 
		bossCount=0;
		myColour = new Color(0, 0,0,0);	
		ov1=new StartRoom(); 
		mini1=new Minigame();
		die= new DieScreen();  
		downHall=new DownStairsRoom();
		start=new StartScreen();  
		b1=new Basement(downHall);			
		startHall=new StartHallwayScreen();
		g1=new GenericRoom(startHall,0); 
		g2=new GenericRoom(startHall,0);  
		g5=new GenericRoom(startHall,1); 
		g6=new GenericRoom(startHall,1);
		g3=new GenericRoom(downHall,0); 
		g4=new GenericRoom(downHall,0);   
		g7=new GenericRoom(downHall,1);
		g8=new GenericRoom(downHall,1); 
		g9=new GenericRoom(b1,0);   
		g10=new GenericRoom(b1,1); 
		g11=new GenericRoom(b1,1); 
		g12=new GenericRoom(b1,0); 
		b1=new Basement(downHall);		
		boofLab=new BoofsLair();
		k1=new Kitchen();
		//names = new Item<>("", "Boo", 500, 500, "", "", "", "", myColour, Color.RED)[5];
		//men = new Menu<>(50, 50, 300, 300, myColour, names);
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/spritePaprika.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		}  
		
		player1=new BattlePlayer(150,400, 100,100,myColour,10,5,5,5,1,image); 
		
		activeScreen=start;
    }
    
    public void update() {
        // updating logic 
		
		activeScreen.update();
    }
    
    public void draw(Graphics pen) {
        
        activeScreen.draw(pen);
		//men.draw(pen);
	
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