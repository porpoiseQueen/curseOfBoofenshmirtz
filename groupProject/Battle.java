import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent; 
import java.util.ArrayList; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import javax.imageio.ImageIO;
 //indiviual encounters are loaded on the screen they appear on.
public class Battle extends Screen{ 
	private BattlePlayer bp1; 
	private BasicEnemy activeEnemy;
	private ArrayList<BasicEnemy> enemies;
	private BufferedImage image; 
	private BufferedImage select1;	 
	private BufferedImage select2;	 
	private BufferedImage select3;	 
	private BufferedImage select4;	 
	private BufferedImage activeSelect;
	private BufferedImage arrow;
	private char control; 
	Screen returnScreen;
	protected Color myColour; 
	int select;
	int enemySelect;
	
	public Battle(BattlePlayer bp1, ArrayList<BasicEnemy> enemies, Screen returnScreen){  
		myColour = new Color(0, 0,0,0);	
		this.enemies=enemies;
		this.bp1=bp1;
		activeEnemy = enemies.get(0);
		for( BasicEnemy c: enemies) {
			objects.add(c);
		}
		objects.add(bp1); 
		select=1;
		enemySelect=0;
		this.returnScreen=returnScreen;		
		try{ 
			image=ImageIO.read(getClass().getResourceAsStream("/sprites/battleBackground1.png"));
			select1=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Fight.png"));
			select2=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Run.png"));
			select3=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Item.png"));
			select4=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Skill.png"));
			arrow=ImageIO.read(getClass().getResourceAsStream("/sprites/arrow.png"));
		}catch (IOException e){ 
			e.printStackTrace();
		}
	}  
	public Battle(BattlePlayer bp1, BasicEnemy activeEnemy, Screen returnScreen){ 

		    myColour = new Color(0, 0,0,0);
		
		    this.bp1=bp1;
		
		    this.activeEnemy=activeEnemy;
		
		    activeEnemy = this.activeEnemy;
		
		    enemies = new ArrayList<>();
		
		    enemies.add(activeEnemy);
		
		    objects.add(bp1);
		
		    objects.add(activeEnemy);
		
		    select=1;
		
		    enemySelect=0;
		
		    this.returnScreen=returnScreen;  
		
		    try{
		
		      image=ImageIO.read(getClass().getResourceAsStream("/sprites/battleBackground1.png"));
		
		      select1=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Fight.png"));
		
		      select2=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Run.png"));
		
		      select3=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Item.png"));
		
		      select4=ImageIO.read(getClass().getResourceAsStream("/sprites/actions-Skill.png"));
		
		      arrow=ImageIO.read(getClass().getResourceAsStream("/sprites/arrow.png"));
		
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
		if(activeEnemy.getHealth()<=0){ 
			//Win winScreen=new Win(returnScreen);
			bp1.maxHeal();
			MyGame.activeScreen=returnScreen;
		}
	}
	public void draw(Graphics pen){
		pen.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		pen.drawImage(image,0,0,MyGame.SCREEN_WIDTH,MyGame.SCREEN_HEIGHT,null);
		super.draw(pen);  
		//pen.drawImage(imageP,bp1.x,bp1.y,100,100,null);
		Sign name = new Sign(((activeEnemy.x+(activeEnemy.x+activeEnemy.width))/2)-33, activeEnemy.y-25, 50, 20, myColour, "", Color.BLACK, 12);
		objects.add(name);
		pen.drawImage(bp1.returnImage(),bp1.getX(),bp1.getY(), 100,100,null); 
		pen.drawImage(activeEnemy.returnImage(),activeEnemy.getX(),activeEnemy.getY(), 100,100,null);
		pen.drawImage(activeSelect,0,500,200,200,null);
		//pen.drawString("HP: " + activeEnemy.health, ((activeEnemy.x + (activeEnemy.x+activeEnemy.width))/2) - 20, activeEnemy.y - 3);
		pen.drawString("HP: " + activeEnemy.health, ((activeEnemy.x + (activeEnemy.x+activeEnemy.width))/2) - 20, activeEnemy.y - 3); 
		if(select == 1 && control == KeyEvent.VK_ENTER || select == 1 && control == KeyEvent.VK_SPACE) {
			pen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			pen.drawImage(arrow, ((activeEnemy.x+(activeEnemy.x+activeEnemy.width))/2)-25, activeEnemy.y+activeEnemy.height+10, 50, 100, null);
			pen.drawString(activeEnemy.getName(), ((activeEnemy.x+(activeEnemy.x+activeEnemy.width))/2)-33, activeEnemy.y-25);
		}
	} 
	
	public void keyTyped(KeyEvent ke) {
		//bp1.enemyAttack(activeEnemy.attack);
		//activeEnemy.playerAttack(2,5);
		control=ke.getKeyChar();  
		if(control=='s'){
			select+=1;
		} 
		if(control=='w'){ 
			select-=1;
		} 
		if(control==KeyEvent.VK_ENTER || control==KeyEvent.VK_SPACE){
			if(select == 1){
				activeEnemy.playerAttack(bp1.attack, bp1.hitRate);
			} else if(select == 2) {
				MyGame.activeScreen=returnScreen;
			}
			bp1.enemyAttack(activeEnemy.attack);
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