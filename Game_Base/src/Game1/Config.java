package Game1;

import java.awt.*;

public class Config {
    public static final int SIZE = 10; // a size of a square/cell
    public static final int WIDTH = 80;
    public static final int HEIGHT = 60; //Height and size ints

    public static final int SLEEP = 1200;

    public static Color getColor (Status status){ //color "function"/method
        switch (status){
            default:
            case NONE: return Color.black;
            case BORN: return Color.GRAY;
            case DIED: return Color.BLUE;
            case LIVE: return Color.WHITE; //Different colors for different cell statuses
        }
    }
}
