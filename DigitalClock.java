package BD_Zaidimas;







import javafx.scene.layout.Background;

import javax.swing.*;


import java.awt.*;

public class DigitalClock extends JPanel{

    JLabel JclockLab;
    TimeThread tt;

    public DigitalClock() {
        JclockLab = new JLabel("Time");
        JclockLab.setForeground(Color.green);
        setLayout(new FlowLayout());
        JclockLab.setFont(new Font("Calibri",Font.BOLD, 18));
        add(JclockLab);
        //setSize(0,0);
        setBackground(Color.BLACK);
        tt = new TimeThread(this);
        setVisible(true);

    }


}
