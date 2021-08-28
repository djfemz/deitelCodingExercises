

public class TicTacToe {
    public static void main(String[] args) {
        String[][] collectionOfPatterns = new String[3][3];
        String[] a = {"X", "O", "X"};
        String[] b = {"O", "X", "O"};

        collectionOfPatterns[0] = a;
        collectionOfPatterns[1] = b;
        collectionOfPatterns[2] = a;

        for (int i = 0; i <collectionOfPatterns.length; i++) {
           for (int j = 0; j <collectionOfPatterns[i].length;j++){
               System.out.print((collectionOfPatterns[i][j] + " "));
           }
           System.out.println("");
        }
    }


}
