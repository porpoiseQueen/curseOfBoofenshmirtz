import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class Menu<I> extends GameObject{ 
    private Item<I> option;
    private Item<I>[] options;    //String[]
    private ArrayList<Item<I>> optionsArrayList;    //ArrayList<String>
    public Menu(int x, int y, int width, int height, Color c, Item<I>[] stuff) {
        super(x,y,width,height,c);
        options=stuff;
        option=options[0];
    }
    public Menu(int x, int y, int width, int height, Color c, ArrayList<Item<I>> stuff) {
        super(x,y,width,height,c);
        optionsArrayList=stuff;
        option=optionsArrayList.get(0);
        optionsArrayList.set(0, option);
    }

    @Override
    public void update() {
        
        
    }
    public void draw(Graphics pen) {
        if(optionsArrayList.isEmpty()) {
            for(int i = 0; i < options.length; i++) {
                pen.setColor(options[i].getBgColor());
                pen.fillRect(options[i].getX(), options[i].getY(), width, height);
                pen.setColor(options[i].getTextColor());
                pen.drawString(options[i].getName(), options[i].getX(), options[i].getY());
            }
        } else {
            for(int i = 0; i < optionsArrayList.size(); i++) {
                pen.setColor(optionsArrayList.get(i).getBgColor());
                pen.fillRect(optionsArrayList.get(i).getX(), optionsArrayList.get(i).getY(), width, height);
                pen.setColor(optionsArrayList.get(i).getTextColor());
                pen.drawString(optionsArrayList.get(i).getName(), optionsArrayList.get(i).getX(), optionsArrayList.get(i).getY());
            }
        }
    }
}
class Item<I> {   //Item<String>
    private int positionX, positionY;
    private Item<I> up, down, left, right;
    private Color bgColor, textColor;
    private I value;
    private String name;
    public Item(I value, String name, int posX, int posY, Item<I> up, Item<I> down, Item<I> left, Item<I> right, Color bg, Color txt) {
        positionX = posX;
        positionY = posY;
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        bgColor = bg;
        textColor = txt;
        this.value = value;
        this.name = name;
    }
    public String getName() { return name; }
    public int getX() { return positionX; }
    public int getY() { return positionY; }
    public Item<I> getUp() { return up; }
    public Item<I> getDown() { return down; }
    public Item<I> getLeft() { return left; }
    public Item<I> getRight() { return right; }
    public Color getBgColor() { return bgColor; }
    public Color getTextColor() { return textColor; }
    public I getValue() { return value; }
}