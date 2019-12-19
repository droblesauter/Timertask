package paine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Timer;

/**
 *
 * @author drobles
 */
public class Paine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tu metodo rest
        Timer timer = new Timer();
        HaceAlgoTTask tsk = new HaceAlgoTTask(timer);
        timer.schedule(tsk, 0, 1000);
        
    }
    
}
