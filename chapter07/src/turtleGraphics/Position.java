package turtleGraphics;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition=rowPosition;
        this.columnPosition=columnPosition;
    }

    @Override
    public boolean equals(Object given) {
        if (given == null){
            return false;
        }
        if (this.getClass()!=given.getClass()){
            return false;
        }
        Position b = (Position)given;
        if(this.rowPosition!=b.rowPosition || this.columnPosition!=b.columnPosition){
            return false;
        }
        return true;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int currentColumnPosition) {
        this.columnPosition=currentColumnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int currentRowPosition) {
        this.rowPosition=currentRowPosition;
    }

}
