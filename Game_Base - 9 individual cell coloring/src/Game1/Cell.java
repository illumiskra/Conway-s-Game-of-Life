package Game1;

import java.util.ArrayList;

public class Cell {

    ArrayList<Cell> near; //Array list of all (alive)Cells around a cell, It takes up a lot of space, so in the future If I would want to improve this program I would try to find a different method to count the number of alive cells around (instead of keeping the information for surroundings in each cell I would maybe use a system of coordinates and make a class where the information will be stored and calculated)
    Status status; // status "status" of the cell

    public Cell(){
        status = Status.NONE; // original status is NONE
        near = new ArrayList<>(); //create the array list (or link it to the already existing array list)
    }

    void addNear(Cell cell){ //a method which will add the new element and save it
        near.add(cell);
    }

    void step1(){ //look around for cells around
        int around = countNearCells(); // new method to count the amount of cells around
        status = status.step1(around); //tell the status how many cells are there around (alive cells)

    }

    void step2(){
        status = status.step2();
    }

//I don't use the cell coordinates, because I basically have an Array list of all cells
    int countNearCells(){ //count the cells around
        int count = 0;
        for (Cell cell : near) //go through the cells what are around
            if (cell.status.isCell())
                count ++; //if teh cell is alive then increase the count
            return count; //return the count
    }

    void turn (){
        status = Status.BORN;
        //for (Cell cell : near)
          //  cell.status = cell.status.isCell() ? Status.NONE : Status.LIVE;
    }
}
