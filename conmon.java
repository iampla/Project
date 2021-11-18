package pp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;


public class conmon {
    static LinkedList<monster> mon = new LinkedList<>();
    static LinkedList<monster2> mon1 = new LinkedList<>();
    static LinkedList<monster3> mon2 = new LinkedList<>();
    
    monster temp;
    monster2 temp2;
    monster3 temp3;
    private int x;
    private int y;
    private int ny= 10* (11+(int) (Math.random() * (34)));
    private int n1= 10* (int) (Math.random() * (70));
    private int ny2= 10* (11+(int) (Math.random() * (34)));
    private int n3= 10* (int) (Math.random() * (70));
    private int ny4= 10* (11+(int) (Math.random() * (34)));
    private int n5= 10* (int) (Math.random() * (70));
    private int ny6= 10* (11+(int) (Math.random() * (34)));
    private int n7= 10* (int) (Math.random() * (70));

    public conmon() {
        addMonster(new monster(150, 360));
        addMonster(new monster(480, 170));
        addMonster(new monster3(100,460));
        addMonster(new monster3(100,50));
        
        addMonster(new monster2(330, 260));
        addMonster(new monster2(450, 100));
         
    }
    public conmon(int d) {
        
        if(d==1){
        addMonster(new monster3(ny,ny6));
        addMonster(new monster(n1, ny));
        addMonster(new monster(n3, ny2));
        addMonster(new monster2(n5, ny4)); 
         
        }
         
    }
    
    public void draw(Graphics g){
        for(int i =0 ; i<mon.size() ; i++){
            temp=mon.get(i);
            temp.draw((Graphics2D) g);
        }
    }
    public void draw2(Graphics g){
        for(int j =0 ; j<mon1.size() ; j++){
            temp2=mon1.get(j);
            temp2.draw((Graphics2D) g);
        }
    }
    public void draw3(Graphics g){
        for(int j =0 ; j<mon2.size() ; j++){
            temp3=mon2.get(j);
            temp3.draw((Graphics2D) g);
        }
    }

    public void update(){
        for(int i =0 ; i<mon.size() ; i++){
            
            temp=mon.get(i);
            
            temp.update();
        }
    }
    public void update2(){
        for(int j =0 ; j<mon1.size() ; j++){
            
            temp2=mon1.get(j);
            
            temp2.update();
        }
    }
    public void update3(){
        for(int j =0 ; j<mon1.size() ; j++){
            
            temp3=mon2.get(j);
            
            temp3.update();
        }
    }

    public void addMonster(monster e){
        mon.add(e); 
    }
    public void addMonster(monster2 e){
        mon1.add(e); 
    }
    public void addMonster(monster3 e){
        mon2.add(e); 
    }
    
   
    public static LinkedList<monster> getMonsteryBounds(){
        return mon;
    }
    public static LinkedList<monster2> getMonsteryBounds2(){
        return mon1;
    }
    public static LinkedList<monster3> getMonsteryBounds3(){
        return mon2;
    }
}

