package BD_Zaidimas;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame  implements Commons {

    public SpaceInvaders() {

        initUI();

    }

    private void initUI() {

        add(new Board());


        setTitle("Space Invaders");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(true);



    }






    public static void main(String[] args) {


        EventQueue.invokeLater(() -> {

           /* JFrame gui = new JFrame();
            gui.setTitle("testWindow");
            gui.setResizable(true);
            gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            gui.setSize(600, 650);
            gui.setVisible(true);*/



            SpaceInvaders ex = new SpaceInvaders();
            DigitalClock ix = new DigitalClock();



           /* Container pane  = gui.getContentPane();
            pane.add(ex, BorderLayout.CENTER);
            pane.add(ix, BorderLayout.NORTH);*/

            ix.setVisible(true);

            ex.setVisible(true);
        });






    }

}

