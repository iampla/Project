package pp;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
public class play {
    private int x;
    private int y;
    private int j;
    private int speedx = 0;
    private int speedy = 0;
    private int o=0;
    public int g=0;
    
    Graphics2D d;
    
    public static int score =0;

    private LinkedList<monster>mon = conmon.getMonsteryBounds();
    private LinkedList<monster2>mon1 = conmon.getMonsteryBounds2();
    private LinkedList<monster3>mon2 = conmon.getMonsteryBounds3();
    
    public Diamond a = new Diamond(350,25);
    public Diamond b = new Diamond(100,25);
    public Diamond c=new Diamond(620,25);
    public play(int x,int y){
        this.x =x;
        this.y =y;
    }

    play() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    public void update(){ 
            x+=speedx;
            y+=speedy;
            if(x<0){
                x=0;
            }
            if(y<0){
                y=0;
            }
            if(x>750){
                x=750;
            }
            if(y>550){
                y=550;
            }
           if(y>500){
               if(x>450){
                   x=450;
               }
               if(x<250){
                   x=250;
               }
           }
           if(x>450||x<250){
               if(y>480){
                   y=480;
               }
           }
            colision();          
    }
    public void draw(Graphics2D g){
        if(j==0){
        ImageIcon img = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\3.png");
         g.drawImage(img.getImage(), x, y, 75, 75, null);
        }
        if(j==1){
        ImageIcon img = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\1.PNG");
         g.drawImage(img.getImage(), x, y, 75, 75, null);
        }
        if(j==2){
        ImageIcon img = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\2.png");
         g.drawImage(img.getImage(), x, y, 75, 75, null);
        }
        if(j==3){
        ImageIcon img = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\1.png");
         g.drawImage(img.getImage(), x, y, 75, 75, null);
        } 
    }
    public void keyPressed(KeyEvent ke){
        int key = ke.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            
            j=0;
            speedx =5;
        }
        if(key == KeyEvent.VK_UP){
            j=1;
            speedy =-5;
        }
        if(key == KeyEvent.VK_LEFT){
            j=2;
            speedx =-5;
        }
        if(key == KeyEvent.VK_DOWN){
            j=3;
            speedy =5;
        }  
    }
    public void keyReleased(KeyEvent ke) {
        int key = ke.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            speedx =0;
        }
        if(key == KeyEvent.VK_LEFT){
            speedx =0;
        }
        if(key == KeyEvent.VK_UP){
            speedy =0;
        }
        if(key == KeyEvent.VK_DOWN){
            speedy =0;
        }
        
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,50,50);
    }
    public void colision(){
        for (int i = 0; i < 10; i++) {
           
                if(getBounds().intersects(a.getBoundsd())){
                    g=1;
                    
                } 
                if(getBounds().intersects(b.getBoundsd())){
                    g=1;
                    
                } 
                if(getBounds().intersects(c.getBoundsd())){
                    g=1;
                    
                } 
       
        }   
        
        
        for(int i=0 ;i<mon.size();i++){
            if(getBounds().intersects(mon.get(i).getBounds())){
                
                
                o++;
            }    
        }
        for(int i=0 ;i<mon1.size();i++){
            if(getBounds().intersects(mon1.get(i).getBounds())){
                
                
                o++;
            } 
        }
        for(int i=0 ;i<mon2.size();i++){
            if(getBounds().intersects(mon2.get(i).getBounds())){
                 if(score>0){
                 score-=1;
                 }
                
                
                
            } 
        }
        
        
    }
    public  boolean over (){
    if(o>0){
    return true;
    }
    else{
    return false;
    }
  
    
    }
    public  boolean win (){
    if(g==1){
    return true;
    }
    else{
    return false;
    }
    
    
    }
    public void set(int x,int y){
        this.x=x;
        this.y=y;
    }
}
