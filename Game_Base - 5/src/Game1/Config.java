package Game1;

import java.awt.*;

public class Config {
    public static final int SIZE = 20; // a size of a square/cell
    public static final int WIDTH = 40;
    public static final int HEIGHT = 30; //Height and size ints

    public static Color getColor (Status status){
        switch (status){
            default:
            case NONE: return Color.black;
            case BORN: return Color.GRAY;
            case DIED: return Color.WHITE;
            case LIVE: return Color.BLUE;
        }
    }
}
