package turtleGraphics;

public class Sketchpad {
    private final int[][] floor;

    public Sketchpad(int numberOfRows, int numberOfColumns) {
       floor = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }

    public void displayFloor(){
        for (int[] row: floor) {
            for (int column:row) {
                if (column==1){
                    System.out.print(" #");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
