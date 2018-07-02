package BD_Zaidimas;

import javax.swing.ImageIcon;
import java.security.PublicKey;
import java.util.Random;

public class Alien extends Sprite {

    private Bomb bomb;
    private final String alienImg = "src/images/alien1.png";


    public Alien(int x, int y) {

        initAlien(x, y);


    }



    private void initAlien(int x, int y) {

        this.x = x;
        this.y = y;

       bomb = new Bomb(x, y);
        ImageIcon ii = new ImageIcon(alienImg);
        setImage(ii.getImage());
    }

    public void act(int direction) {

        this.x += direction;
    }

    public Bomb getBomb() {

        return bomb;
    }

    public class Bomb extends Sprite {

        private final String bombImg = "src/images/bomb1.png";
        public boolean destroyed;

        public Bomb(int x, int y) {


            initBomb(x, y);

        }

        private void initBomb(int x, int y) {

            setDestroyed(true);
            this.x = x;
            this.y = y;
            ImageIcon ii = new ImageIcon(bombImg);
            setImage(ii.getImage());


        }



        public void setDestroyed(boolean destroyed) {

            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {

            return destroyed;
        }

    }
}

