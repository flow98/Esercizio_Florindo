package esercizio;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClasseS implements Runnable{

     private  int[]v;

    
    public ClasseS(int[] v) {
        this.v = v;
    }
    
    public int[] genera(int[] v)
    {
        for(int i=0;i<this.v.length;i++)
        {
            v[i]= (int) (Math.random()*100);
        }
        return v;
    }
    
    public int[]ordina(int[]v)
    {
        for(int i=0;i<this.v.length;i++)
        {
            for(int k=0;k<this.v.length;k++)
            {
                if(v[] < v[k])
                {
                    int app=v[i];
                    v[i]=v[k];
                    v[k]=app;
                }
            }
        }
        return v;
    }
    @Override
    public void run()
    {
       genera(this.v); 
        try 
        {
            sleep(200);
        }catch (InterruptedException ex){} 
       ordina(this.v);   
       
         try {
             sleep(400);
         } catch (InterruptedException ex) {
             Logger.getLogger(ClasseS.class.getName()).log(Level.SEVERE, null, ex);
         }
       for(int i=0;i<this.v.length;i++)
       {
           System.out.println("Valore Vettore t2: "+this.v[i]);
       }
    }
    
}
