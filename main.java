
package pp;

import javax.swing.JFrame;


public class main {

    public static final int WIDTH = 800;
    public static final int HIGHT = 700;
    public static JFrame window;
    
    public static void main(String[] args) {
        
        window = new JFrame("Test");
        window.setSize(WIDTH,HIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new game());
        
        window.setVisible(true);
    }
    
}


