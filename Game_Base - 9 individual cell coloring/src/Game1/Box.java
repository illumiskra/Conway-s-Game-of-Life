package Game1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Box extends JPanel {
    //
    Cell cell;

    public Box (int x, int y){      //coordinates for the little panels/ boxes
        super(); //call for a base constructor
        cell = new Cell();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cell.turn();
            }
        });
    }

    //public void initCells (int x; int y){
    //}

    public void setColor (){
        setBackground(Config.getColor(cell.status)); //go to the Config java and use the color for a specific cell status
    }

    void step1(){
        cell.step1();
        setColor();
    }
    void step2(){
        cell.step2();
        setColor();
    }
}
