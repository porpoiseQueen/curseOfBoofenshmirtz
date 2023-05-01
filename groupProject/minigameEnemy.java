import java.awt.Color; 
import java.awt.image.BufferedImage;
public class MinigameEnemy extends GameObject{ 
	private int direction;
	private BufferedImage eImage;
	public MinigameEnemy(int x, int y, int width, int height, Color c, int direction, BufferedImage enemyImage){ 
		super(x,y,width,height,c); 
		this.direction=direction; 
		eImage=enemyImage;
	} 
	public void update(){ 
		if(this.direction==0){ 
			x+=2; 
			if(x>=900){ 
				int randomENum1 = ((int)Math.floor(Math.random() * (800 - 100 + 1) + 100)) *-1; 
				int randomENum2 = (int)Math.floor(Math.random() * (700 - 0 + 1) + 0); 
				this.x=randomENum1; 
				this.y=randomENum2; 
				
			}
		} 
		if(this.direction==1){ 
			y-=2; 
			if(this.y<=-100){ 
				int randomENum1 = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0); 
				int randomENum2 = (int)Math.floor(Math.random() * (2000 - 800 + 1) + 800);  
				this.x=randomENum1; 
				this.y=randomENum2; 
				
			}
		} 
		if(this.direction==2){ 
			y+=2; 
			if(y>= 900){ 
				int randomENum1 = (int)Math.floor(Math.random() * (800 - 0 + 1) + 0); 
				int randomENum2 = ((int)Math.floor(Math.random() * (800 - 100 + 1) + 100))*-1; 
				this.x=randomENum1; 
				this.y=randomENum2;
			}
		} 
		if(this.direction==3){ 
			x-=2;  
			if(x<=-100){
				int randomENum1 = (int)Math.floor(Math.random() * (2000 - 800 + 1) + 800); 
				int randomENum2 = (int)Math.floor(Math.random() * (700 - 0 + 1) + 0);  
				this.x=randomENum1; 
				this.y=randomENum2; 
			}
		}
	}   
	public int getX(){ 
		return x;
	} 
	public int getY(){  
		return y;
	}  
	public int getWidth(){ 
		return width;
	} 
	public int getHeight(){  
		return height;
	}
	public int getDirection(){ 
		return this.direction;
	} 
	public BufferedImage getImage(){ 
		return this.eImage;
	} 
	
	
}