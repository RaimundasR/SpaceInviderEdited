package BD_Zaidimas;

import java.awt.event.KeyEvent;
import java.util.AbstractMap;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Commons {

    private final int START_Y = 280;
    private final int START_X = 270;

    private final String playerImg = "src/images/player.png";

    private int width;
    private int heigh;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {

        ImageIcon ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);
         heigh = ii.getImage().getHeight(null);
        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {

        x += dx;
        y += fx;
        if (x <= 2) {
            x = 2;
        }

        if (x >= BOARD_WIDTH - 2 * width) {
            x = BOARD_WIDTH - 2 * width;
        }
        if (y >= BOARD_HEIGHT - 2 * heigh){
            y = BOARD_HEIGHT - 2 * heigh;
        }
    }



    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 2;
        }
        if (key == KeyEvent.VK_UP) {
            fx = -2;
        }
        if (key == KeyEvent.VK_DOWN){
            fx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 0;
        }
        if (key == KeyEvent.VK_UP) {
            fx = 0;
        }
        if (key == KeyEvent.VK_DOWN){
            fx = 0
            ;
        }
    }


}