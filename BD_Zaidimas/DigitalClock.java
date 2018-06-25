package BD_Zaidimas;





import javafx.scene.layout.BackgroundPosition;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class DigitalClock extends JFrame{

    JLabel JclockLab;
    TimeThread tt;

    public DigitalClock() {
        JclockLab = new JLabel("Time");

JclockLab.setForeground(Color.red);


        setLayout(new FlowLayout());


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JclockLab.setFont(new Font("Times new roman",Font.BOLD, 14));


        add(JclockLab);
        setSize(300, 70);

        setLocation(518,650);

        tt = new TimeThread(this);
        setVisible(true);

    }


}