package main.java;

import java.util.ArrayList;
import java.util.Arrays;

import static main.java.Cardinal.N;

public class Robot {

    ArrayList<Cardinal> cardinals;
    CommandCentre nav;
    Integer numberOfMoves;
    Position currentPosition;
    Position previousPosition;
    Position lastPositionBeforeLost;
    ArrayList<Position> allLostPositions;
    boolean lost;



    public Robot(Position start) {
        this.cardinals = new ArrayList<>(Arrays.asList(N, Cardinal.E, Cardinal.S, Cardinal.E));
        this.currentPosition = start;
        this.previousPosition = start;
        this.numberOfMoves = 0;
        this.lastPositionBeforeLost = null;
        this.lost = false;
        this.allLostPositions = new ArrayList<>();

    }


    public void updatePosition() {
        if (numberOfMoves == 0) {
            return;
        }
        else if (moved() == true) {
            this.previousPosition.setX(this.currentPosition.getX());
            this.previousPosition.setY(this.currentPosition.getY());
            this.previousPosition.setD(this.currentPosition.getD());
        }
    }



    public boolean moved(){
        if ((this.currentPosition.getX() == this.previousPosition.getX()) && (this.currentPosition.getY() ==previousPosition.getY()) && currentPosition.getD() == previousPosition.getD()){
            return false;
        }
        return true;
    }


    public boolean move(CommandCentre commandCentre){

        switch(commandCentre.nextCommand) {
        case "R":
            switch(currentPosition.getD()) {
                case N:
                    currentPosition.setD(Cardinal.E);
                    break;
                case E:
                    currentPosition.setD(Cardinal.S);
                    break;
                case S:
                    currentPosition.setD(Cardinal.W);

                    break;
                case W:
                    currentPosition.setD(N);
                    break;
            }
            case "L":
                switch(currentPosition.getD()) {
                    case N:
                        currentPosition.setD(Cardinal.W);
                        break;
                    case E:
                        currentPosition.setD(N);
                        break;
                    case S:
                        currentPosition.setD(Cardinal.E);
                        break;
                    case W:
                        currentPosition.setD(Cardinal.S);
                        break;
                }
            case "F":
                Position newLocation = changeGridPoint(currentPosition.getD().seeAxis(),currentPosition.getD().seeChangePosition());
                for (Position item: allLostPositions) {
                    if (newLocation == item);
                    setCurrentPosition(previousPosition);
                }
        }
        numberOfMoves += 1;
        updatePosition();

        if (checkOffGrid(commandCentre.getGrid()) ==true){
            previousPosition = lastPositionBeforeLost;
            allLostPositions.add(lastPositionBeforeLost);
            this.lost = true;
            return true;
        }


        if (moved() == false) {return false;}
        return true;

    }


    public Position changeGridPoint(String xy, Integer change){
        if (xy == "x"){
            this.currentPosition.setX(this.currentPosition.getX() + change);
            updatePosition();
        }
        else if (xy =="y"){
            this.currentPosition.setY(this.currentPosition.getY() + change);
            updatePosition();
        }
        return currentPosition;
    }

    public boolean checkOffGrid(Grid grid){
        if ((this.currentPosition.getY() > grid.maxY) || (this.currentPosition.getY() < 0) || (this.currentPosition.getX() > grid.maxX) || (this.currentPosition.getX() < 0)){
         return true;}
        else {
        return false;
        }
    }


    public void setCurrentPosition(Position position){
        this.currentPosition = position;
    }
}





