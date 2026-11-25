package Game1;

import javax.swing.*;
import java.awt.image.ImageObserver;

public class Window implements Runnable{ //This class has a specific method which starts its work (eg rn it is the Run method)

    JFrame frame; //create a field for the game (canvas)
    Box[][] boxes;


    @Override
    public void run() //run the "functions"
    {
        initFrame();
        initBoxes();
    }

    void initFrame(){
        frame = new JFrame(); //the frame
        frame.getContentPane().setLayout(null); //set layout for the window
        frame.setSize(Config.WIDTH * Config.SIZE, Config.HEIGHT * Config.SIZE); //Window sizes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window and stop the program when you click the cross
        frame.setLocationRelativeTo(null); //the window will appear in the center of the screen
        frame.setVisible(true);
        frame.setTitle("Conway's Game of Life"); // name the window
    }

    void initBoxes (){
        boxes = new Box[Config.WIDTH] [Config.HEIGHT];
        for (int x = 0; x < Config.WIDTH; x ++) //box's x coordinates from 0 to WIDTH
            for (int y = 0; y < Config.HEIGHT; y ++) //box's y coordinates from 0 to HEIGHT
            {
                boxes [x][y] = new Box (x, y); // make a new box with coordinates (x;y)
                frame.add(boxes[x][y]); // display the box with coordinates (x;y0
            }

    }

}
