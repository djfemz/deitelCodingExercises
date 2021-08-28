public class Main {
    public static void main(String[] args) {
     
        int numberOfStudentsInClass = Student.collectNumberOfStudents();
        
        int numberOfSubjectsOffered = Student.collectNumberOfSubjects();
       
       
        int[][] studentGrades= Student.collectStudentGrades(numberOfStudentsInClass, numberOfSubjectsOffered);
    

        int[] studentTotals= Student.calculateTotalOf(studentGrades);
        int[] total = Student.calculateTotalOf(studentGrades);
        int[] totalSumOfStudentScores = Student.calculateTotalOf(studentGrades);

        
        double[] studentAverages= Student.calculateAverageOf(studentTotals, numberOfSubjectsOffered);
      

        int[] reorderedTotalScores= Student.reOrderInDescendingOrder(studentTotals);
        

        int[] positions= Student.calculatePositionOf(total, reorderedTotalScores, numberOfStudentsInClass);	
      
        
        Student.displayTable(numberOfSubjectsOffered, positions, studentGrades, totalSumOfStudentScores, studentAverages);
        

        Student.calculateHighestPerSubjectOf(studentGrades, numberOfSubjectsOffered, numberOfStudentsInClass);

    }
}
