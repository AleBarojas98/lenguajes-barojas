/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread2;

/**
 *
 * @author T-102
 */
// segunda forma de crear threads implementando la interface runnable 

public class TareMejor implements Runnable {
    public static void main(String[] args) {
    //crear el thread 
    Runnable r=new TareMejor(); 
    Thread t1=new Thread(r); 
    //iniciarlo 
    t1.start(); 
    
    
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
