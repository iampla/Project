package pp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;


public class monster2 {
    private int x;
    private int y;
    private int speedx = 4;
    private int speedy = 4;
    
    public monster2(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void draw(Graphics2D g){

    ImageIcon img1 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\w2.png");
    g.drawImage(img1.getImage(), x, y, 75, 75, null);
    
    }
    public void update(){
        y+=speedy;

        if(y<100){
           speedy=4;
        }
        if(y>470){
           speedy=-4;
        }
            
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    
}
 
