/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paine;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author drobles
 */
public class HaceAlgoTTask extends TimerTask {

    //SOEServletSBLocal soeSB;

    int id_relay;
    int timeout = 0;
    //int contador = 0;
    Timer timer;

    public HaceAlgoTTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 100000; i++)
            {
                System.out.println("i: " + i);
            }
            detener();
            

        } catch (Exception ex) {
            Logger.getLogger(HaceAlgoTTask.class.getName()).log(Level.SEVERE, null, ex);
            detener();
        }
    }


    public void detener() {
        timer.cancel();
        timer.purge();
    }

}
