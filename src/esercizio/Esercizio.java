package esercizio;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Esercizio {


    public static void main(String[] args) {
        
        int[]v=new int[100];
        
        ClasseP t1=new ClasseP(v);
        t1.start();
        
        try 
        {
            t1.join(200);
        }catch (InterruptedException ex) {}
        
        Thread t2=new Thread(new ClasseS(v));
        t2.start();
        try 
        {
            t2.join(200);
        }catch (InterruptedException ex) {}
        
    }
    
}
