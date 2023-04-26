import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class Menu<I> extends GameObject{ 
    private I option;
    private I[] options;
    private ArrayList<I> optionsArrayList;
    public Menu(int x, int y, int width, int height, Color c, I[] stuff) {
        super(x,y,width,height,c);
        options=stuff;
        option=options[0];
    }
    public Menu(int x, int y, int width, int height, Color c, ArrayList<I> stuff) {
        super(x,y,width,height,c);
        optionsArrayList=stuff;
        option=optionsArrayList.get(0);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
    public void draw(Graphics pen) {
        
    }
}
class Item<I> {
      
}
