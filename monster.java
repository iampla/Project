package pp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class monster {
    private int x;
    private int y;
    private int p;
    
    private int speedx = 4;
    private int speedy = 0;
    
    public monster(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void draw(Graphics2D g){
        ImageIcon img1 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\w1.png");
        ImageIcon img2 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\w2.png");
        if(p==1){
        g.drawImage(img1.getImage(), x, y, 75, 75, null);
        }
        if(p==0){
        g.drawImage(img2.getImage(), x, y, 75, 75, null);
        }
        
        
    }
    public void update(){
        x+=speedx;

        if(x<0){
            p=1;
           speedx=4;
        }
        if(x>750){
            p=0;
           speedx=-4;
        }
            
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    
}
