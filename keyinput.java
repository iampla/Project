package pp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyinput extends KeyAdapter {
    play p;
    
    public keyinput(play p) {
        this.p = p;
    }
   
    @Override
    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }
    //ปล่อยปุ่ม    

    @Override
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }   
}
