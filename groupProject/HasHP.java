import java.awt.Color;

import java.util.ArrayList;
public abstract class HasHP extends GameObject{
    private int health;
    private ArrayList<Status> statuses;
    public HasHP(int x, int y, int width, int height, Color c) {
        super(x,y,width,height,c);
    }
    public int getHealth() {
        return health;
    }
    public void heal(int heal) {
        health+=heal;
    }
    public void hurt(int hurt) {
        health-=hurt;
    }
    public void getStatus(Status status) {
        statuses.add(status);
    }
    
}
