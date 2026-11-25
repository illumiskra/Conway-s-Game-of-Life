import javax.swing.*;

public class Window implements Runnable{ //This class has a specific method which starts its work (eg rn it is the Run method)

    JFrame frame; //create a field for the game (canvas)


    @Override
    public void run() //run the "functions"
    {
        initFrame();
    }

    void initFrame(){
        frame = new JFrame(); //the frame
        frame.getContentPane().setLayout(null); //set layout for the window
        frame.setSize(100,100); //Window sizes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window and stop the program when you click the cross
        frame.setLocationRelativeTo(null); //the window will appear in the center of the screen
        frame.setVisible(true);
        frame.setTitle("Conway's Game of Life"); // name the window
    }
}
