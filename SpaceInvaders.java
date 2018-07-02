package BD_Zaidimas;


import javafx.scene.control.Button;

import javax.swing.*;

import java.awt.*;

import java.awt.BorderLayout;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SpaceInvaders extends JFrame  implements Commons {

   public SpaceInvaders() {

        initUI();

    }

    private static void run() {
        JFrame gui = new JFrame();
        gui.setTitle("GalaxyWars");
        gui.setResizable(false);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //JPanel jpl = new JPanel();// cia bandymui


        gui.add(new Board(), BorderLayout.CENTER);
        gui.add(new DigitalClock(), BorderLayout.SOUTH);


       /* gui.remove(new Board());

        gui.remove(new DigitalClock());

        JFrame gui1 = new JFrame();
        gui1.setTitle("GalaxyWars");
        gui1.setResizable(false);
        gui1.setDefaultCloseOperation(EXIT_ON_CLOSE);

        gui1.add(new Board());
        gui1.add(new DigitalClock());*/




        gui.setSize(BOARD_WIDTH, BOARD_HEIGHT);


        gui.setVisible(true);
    }

    private void initUI () {


//add(new Board());
/*List win1, win2;


        setTitle("Space Invaders");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        setResizable(true);
        win1  = new List();
        win2 = new List();


    }*/

    }






    public static void main(String[] args) {


       EventQueue.invokeLater(// cia bandymui
//gui.remove(new Board());
               SpaceInvaders::run);


    }

}

