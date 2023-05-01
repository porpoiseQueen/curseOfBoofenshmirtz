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
        
        
    }
    public void draw(Graphics pen) {
        if(optionsArrayList.get(0).equals(null)) {
            for(int i = 0; i < options.length; i++) {
                // pen.setColor(options[i].getBgColor());
            }
        }
    }
}
class Item<I> {
      private int positionX, positionY;
      private Item up, down, left, right;
      private Color bgColor, textColor;
      public Item(int posX, int posY, Item up, Item down, Item left, Item right, Color bg, Color txt) {
        positionX = posX;
        positionY = posY;
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        bgColor = bg;
        textColor = txt;
      }
      // Item knows name and position, return value?
      public int getX() { return positionX; }
      public int getY() { return positionY; }
      public Item getUp() { return up; }
      public Item getDown() { return down; }
      public Item getLeft() { return left; }
      public Item getRight() { return right; }
      public Color getBgColor() { return bgColor; }
      public Color getTextColor() { return textColor; }
}







// [a, a, a, a, a, a, a, a, a, a, a, a]