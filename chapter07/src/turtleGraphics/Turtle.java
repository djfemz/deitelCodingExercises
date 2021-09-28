package turtleGraphics;

import static turtleGraphics.Direction.*;
import static turtleGraphics.PenPosition.DOWN;
import static turtleGraphics.PenPosition.UP;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection=EAST;
    private Position currentPosition = new Position(0,0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(DOWN);
    }

    public void penUp() {
        pen.setPosition(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection==WEST) changeCurrentDirectionTo(NORTH);
        else
        if (currentDirection==SOUTH) changeCurrentDirectionTo(WEST);
        else
        if (currentDirection==EAST) changeCurrentDirectionTo(SOUTH);
        else
        if (currentDirection==NORTH) changeCurrentDirectionTo(EAST);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection=newDirection;
    }

    public void turnLeft() {
        if (currentDirection==NORTH) changeCurrentDirectionTo(WEST);
        if (currentDirection==EAST) changeCurrentDirectionTo(NORTH);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        if (currentDirection==EAST){
            int currentColumnPosition = currentPosition.getColumnPosition();
            currentColumnPosition+=numberOfSteps;
            currentPosition.setColumnPosition(currentColumnPosition-1);
        }
        if (currentDirection==SOUTH){
            int currentRowPosition = currentPosition.getRowPosition();
            currentRowPosition+=numberOfSteps;
            currentPosition.setRowPosition(currentRowPosition-1);
        }
        if (currentDirection==WEST){
            int currentColumnPosition = currentPosition.getColumnPosition();
            currentColumnPosition+=numberOfSteps;
            currentPosition.setColumnPosition(currentColumnPosition-1);
        }
        if (currentDirection==NORTH){
            int currentRowPosition = currentPosition.getRowPosition();
            currentRowPosition+=numberOfSteps;
            currentPosition.setRowPosition(currentRowPosition-1);
        }
    }

    public void writeOn(Sketchpad sketchpad, int numberOfSteps) {
        int currentRow= currentPosition.getRowPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int[][] floor = sketchpad.getFloor();
        if (currentDirection==EAST){
            for (int i=0; i<numberOfSteps; i++) {
                floor[currentRow][currentColumn+i] = 1;
                currentPosition.setColumnPosition(currentColumn+i);
                currentPosition.setRowPosition(currentRow);
            }
        }
        if (currentDirection==SOUTH){
            for (int i=0; i<numberOfSteps; i++) {
                floor[currentRow+i][currentColumn] = 1;
                currentPosition.setColumnPosition(currentColumn);
                currentPosition.setRowPosition(currentRow+i);
            }

        }
        if (currentDirection==WEST){
            for (int i=0; i<numberOfSteps; i++) {
                floor[currentRow][currentColumn-i] = 1;
                currentPosition.setColumnPosition(currentColumn-i);
                currentPosition.setRowPosition(currentRow);
            }
        }
        if (currentDirection==NORTH){
            for (int i=0; i<numberOfSteps; i++) {
                floor[currentRow-i][currentColumn] = 1;
                currentPosition.setColumnPosition(currentColumn);
                currentPosition.setRowPosition(currentRow-i);
            }
        }

    }
}
