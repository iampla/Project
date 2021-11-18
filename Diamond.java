package pp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Diamond {
    private int x;
    private int y;
    
    Diamond(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draw(Graphics2D g){
        ImageIcon img1 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\IMG_3814.GIF");
        g.drawImage(img1.getImage(), x, y, 75, 75, null);
    }
    public Rectangle getBoundsd(){
        return new Rectangle(x,y,32,32);
    }
   }
    
    
    
    
    
    
    

