import java.awt.Graphics; 
import java.util.ArrayList; 
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public abstract class Screen{ 
	protected ArrayList<GameObject> objects; 

	public Screen(){  
		objects=new ArrayList<>();
	} 
	public void update(){ 
		for(GameObject obj :objects){ 
			obj.update();
		}
	}
	public void draw(Graphics pen){ 
		for(GameObject obj: objects){ 
			obj.draw(pen);
		}
	}  
	
	
    public abstract void keyTyped(KeyEvent ke);
    public abstract void keyPressed(KeyEvent ke);
    public abstract void keyReleased(KeyEvent ke); 
    public abstract void mouseClicked(MouseEvent me);

    
    public abstract void mousePressed(MouseEvent me);
    
    public abstract void mouseReleased(MouseEvent me);

 
    public abstract void mouseEntered(MouseEvent me);

    
    public abstract void mouseExited(MouseEvent me); 
	public abstract void mouseDragged(MouseEvent me);
	
	 
	public abstract void mouseMoved(MouseEvent me); 
	
}