package pp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import static pp.play.score;
//import static text.play.score;


public class game extends JPanel implements ActionListener  {

    Timer loop;
    play pl;
    Graphics g;
    public int d;
    conmon mon;
   
    ImageIcon img1 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectGAME\\src\\GAME1\\gameover.png");
    public game(){
        loop = new  Timer(10,this);
        loop.start();
        pl = new play(350,550);
        mon = new conmon();
        addKeyListener(new keyinput(pl));
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawImage(getBackgroundImage(),0, 0, 800, 700, this);
        pl.draw((Graphics2D) g);
        pl.a.draw((Graphics2D) g);
        if(d==1){
        pl.b.draw((Graphics2D) g);
        pl.c.draw((Graphics2D) g);
        }
        
        
        mon.draw(g);
        mon.draw2(g);
        mon.draw3(g);
        
        g.setColor(Color.BLACK);
        //g.setFont(new Font("Tahoma",Font.BOLD,20));
        g.drawString("Score :"+play.score, 200, 30);
        if(pl.over()==true){
            loop.stop();
            g.drawImage(img1.getImage(), 0, 0, 800, 700, null);
            
        }
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(pl.over()==false){
        pl.update();
        mon.update2();
        mon.update3();
        mon.update();
        repaint();
        
        }
        else{
        loop.stop();
           
        }
        if(pl.win()){
          score+=100;
           pl.set(350,550);
           
           d=1;
           new conmon(d);
           
           pl.g=0;  
            
        
           
        }
       
    }
     public Image getBackgroundImage() {
        ImageIcon image = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\bg1.png");
        
        
        ImageIcon image2 = new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\GAME\\src\\pp\\bg2.png");
        if(d==1){
        return image2.getImage();
        }
         return image.getImage();
         
         
         
}     
}


