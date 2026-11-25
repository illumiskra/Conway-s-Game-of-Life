package Game1;
import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {

    public Box (int x, int y){      //coordinates for the little panels/ boxes
        super(); //call for a base constructor
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);

    }
}
