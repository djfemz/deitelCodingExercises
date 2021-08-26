import java.util.*;

public class StudentGrade {
   private int numberOfStudentsInClass;
   private int numberOfSubjectsOffered;
   private int[] studentsTotals;
   private double[] studentsAverages;
 
    public int[][] collectStudentGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have?");
        numberOfStudentsInClass=scanner.nextInt();
        System.out.println("How many subjects do they offer?");
        numberOfSubjectsOffered=scanner.nextInt();
        int[][] students = new int[numberOfStudentsInClass][numberOfSubjectsOffered];
        for (int i=0; i<numberOfStudentsInClass; i++){
            for (int j=0; j<numberOfSubjectsOffered;j++){
                System.out.printf("Enter grade for student %d in subject %d%n", i+1, j+1);
                students[i][j] = scanner.nextInt();
            }
        }
        return students;
    }

    public int[] calculateTotalOf(int[][] studentsScores) {
        studentsTotals = new int[studentsScores.length];
        
        for(int i=0; i<studentsScores.length; i++) {
            int total=0;
            for (int j=0; j<studentsScores[i].length; j++){
                total=total+studentsScores[i][j];
            }
            studentsTotals[i]=total;
        }
        return studentsTotals;
    }

    public double[] calculateAverageOf(int[] studentsTotals) {
        studentsAverages = new double[studentsTotals.length];
        for (int i=0; i<studentsTotals.length; i++) {
            studentsAverages[i] = studentsTotals[i]/(double)numberOfSubjectsOffered;
        }
        return studentsAverages;
    }

    public int[] calculatePositionOf(int[] totals) {
        int[] reorderedTotalScores = reOrderInDescendingOrder(totals);
        for (int i = 0; i < numberOfStudentsInClass; i++) {
            for (int j = 0; j < numberOfStudentsInClass; j++) {
                if (totals[i]==reorderedTotalScores[j]) {
                    totals[i] = j+1;
                }
            }
        }
        return totals;
    }

    public static int[] reOrderInDescendingOrder(int[] studentsTotals) {
        int temp = 0;
        for (int i = 0; i < studentsTotals.length; i++) {
            for (int j = i+1; j < studentsTotals.length; j++) {
                if (studentsTotals[j] > studentsTotals[i]){
                    temp = studentsTotals[j];
                    studentsTotals[j] = studentsTotals[i];
                    studentsTotals[i] = temp;
                }
            }
        }
        return studentsTotals;
    }

    public static String displayTable() {
        return "=".repeat(90);
    }
}
