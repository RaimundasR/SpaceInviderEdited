package BD_Zaidimas;

import java.awt.*;
import java.util.Date;

public class TimeThread extends Thread{

    DigitalClock dc;

    String time;
    public TimeThread(DigitalClock dc){

        this.dc = dc;
start();

    }

    public void run() {
        while (true){
            time = "" + new Date();


  dc.JclockLab.setText(time);



        }

    }
}
