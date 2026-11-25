package Game1;
import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {

    Cell cell;

    public Box (int x, int y){      //coordinates for the little panels/ boxes
        super(); //call for a base constructor
        cell = new Cell();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
    }

    //public void initCells(int x; int y){
    //}
}
