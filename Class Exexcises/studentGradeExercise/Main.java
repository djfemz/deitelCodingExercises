import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        StudentGrade studentGrade = new StudentGrade();
        int[][] studentGrades= studentGrade.collectStudentGrades();
        int[] studentTotals= studentGrade.calculateTotalOf(studentGrades);
        System.out.println(Arrays.toString(studentTotals));
        double[] studentAverages= studentGrade.calculateAverageOf(studentTotals);
        System.out.println(Arrays.toString(studentAverages));
        int[] positions= studentGrade.calculatePositionOf(studentTotals);
        System.out.println(Arrays.toString(positions));	for i := 0; i < numberOfSubjects; i++ {
            fmt.Printf("%s\t", "subject"+strconv.Itoa(i+1))
        }
        
        for (int i = 0; i < studentTotals.length; i++) {
            System.out.printf("%s\t", "subject", (i+1));
        }

        System.out.printf("\t%s\t%s\t%s\t%s\t%s\t%s", "");
       
     
    }
}
