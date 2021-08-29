import java.util.Scanner;

public class Student{
  
    public static int[][] collectStudentGrades(int numberOfStudentsInClass, int numberOfSubjectsOffered) {   
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[numberOfStudentsInClass][numberOfSubjectsOffered];
        for (int i=0; i<numberOfStudentsInClass; i++){
            for (int j=0; j<numberOfSubjectsOffered;j++){
                System.out.printf("Enter grade for student %d in subject %d%n", i+1, j+1);
                students[i][j] = scanner.nextInt();
                if (students[i][j] <0 || students[i][j]>100){
                    collectStudentGrades(numberOfStudentsInClass, numberOfSubjectsOffered);
                }
            }
        }
        return students;
    }

    public static int collectNumberOfStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int numberOfStudentsInClass=scanner.nextInt();
        if (numberOfStudentsInClass<0){
            collectNumberOfStudents();
        }
        return numberOfStudentsInClass;
    }

    public static int collectNumberOfSubjects() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subjects do students offer?");
        int numberOfSubjectsOffered=scanner.nextInt();
        if (numberOfSubjectsOffered<0){
            collectNumberOfSubjects();
        } 
        return numberOfSubjectsOffered;
    }

    public static int[] calculateTotalOf(int[][] studentsScores) {
       int[] studentsTotals = new int[studentsScores.length];
        
        for(int i=0; i<studentsScores.length; i++) {
            int total=0;
            for (int j=0; j<studentsScores[i].length; j++){
                total=total+studentsScores[i][j];
            }
            studentsTotals[i]=total;
        }
        return studentsTotals;
    }

    public static double[] calculateAverageOf(int[] studentsTotals, int numberOfSubjectsOffered) {
       double[] studentsAverages = new double[studentsTotals.length];
        for (int i=0; i<studentsTotals.length; i++) {
            studentsAverages[i] = studentsTotals[i]/(double)numberOfSubjectsOffered;
        }
        return studentsAverages;
    }

    public static int[] calculatePositionOf(int[] totals, int[] reorderedTotalScores, int numberOfStudentsInClass) {
        for (int i = 0; i < numberOfStudentsInClass; i++) {
            for (int j = 0; j < numberOfStudentsInClass; j++) {
                if (totals[i]==reorderedTotalScores[j]) {
                    totals[i] = j+1;
                }
            }
        }
        return totals; 
    }

    public  static int[] reOrderInDescendingOrder(int[] studentsTotals) {
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

    public static void displayTable(int numberOfSubjectsOffered, int[] positions, int[][] studentGrades, int[] totalSumOfStudentScores, double[] studentAverages) {
        for (int i = 0; i < numberOfSubjectsOffered; i++) {
            System.out.printf("\t%s%d\t", "subject ", i+1);
        }

        System.out.printf("\t%s\t\t\t%s\t\t\t%s", "total", "average", "position");
        System.out.println();
        System.out.print("=".repeat(numberOfSubjectsOffered*50)); 
        System.out.println();
       
        for (int i = 0; i < positions.length; i++) {
            System.out.printf("%s%d%s", "student ", i+1, "  ");
            for (int j = 0; j <numberOfSubjectsOffered; j++) {
                System.out.printf("%d\t\t\t", studentGrades[i][j]);
            }
            System.out.printf("%d\t\t\t", totalSumOfStudentScores[i]);
            System.out.printf("%.2f\t\t\t", studentAverages[i]);
            System.out.printf("%d", positions[i]);

            System.out.println();
        }
    }

    public static void calculateHighestPerSubjectOf(int[][] studentGrades, int numberOfSubjectsOffered,int numberOfStudentsInClass) {
        System.out.println();
        for (int m = 0; m < numberOfSubjectsOffered; m++) {
            int highestScorePerSubject = studentGrades[0][m];
            int indexOfMaximum=0;
            for (int k=0; k < numberOfStudentsInClass; k++) {
                if(studentGrades[k][m]>highestScorePerSubject){
                    highestScorePerSubject = studentGrades[k][m];
                    indexOfMaximum = k;
                }
            }
            System.out.printf("student %d scored the highest in subject %d with a score of %d%n", indexOfMaximum+1,  m+1, highestScorePerSubject);
        }
    }  

    public static void calculateLowestPerSubjectOf(int[][] studentGrades, int numberOfSubjectsOffered,int numberOfStudentsInClass) {
        System.out.println();
        for (int subjectIndex = 0; subjectIndex < numberOfSubjectsOffered; subjectIndex++) {
            int lowestScorePerSubject = studentGrades[0][subjectIndex];
            int indexOfMinimum=0;
            for (int studentIndex=0; studentIndex < numberOfStudentsInClass; studentIndex++) {
                if(studentGrades[studentIndex][subjectIndex]<lowestScorePerSubject){
                    lowestScorePerSubject = studentGrades[studentIndex][subjectIndex];
                    indexOfMinimum = studentIndex;
                }
            }
            System.out.printf("student %d scored the lowest in subject %d with a score of %d%n", indexOfMinimum+1,  subjectIndex+1, lowestScorePerSubject);
        }
    } 
    
    public static void findOverallHighestScoringStudent(int[] reorderedTotalScores, int[] totalScores) {
        System.out.println();
        int indexOfOverallHighestScoringStudent =0;
        for (int i = 0; i < totalScores.length; i++) {
            if (reorderedTotalScores[0]==totalScores[i]) {
                indexOfOverallHighestScoringStudent = i;
            }
        }
        System.out.println("the overall highest scoring student is student" + " " + (indexOfOverallHighestScoringStudent+1));
    }

    public static void findOverallLowestScoringStudent(int[] reorderedTotalScores, int[] totalScores) {
        System.out.println();
        int indexOfOverallLowestScoringStudent =0;
        for (int i = 0; i < totalScores.length; i++) {
            if (reorderedTotalScores[reorderedTotalScores.length-1]==totalScores[i]) {
                indexOfOverallLowestScoringStudent = i;
            }
        }
        System.out.println("the overall lowest scoring student is student" + " " + (indexOfOverallLowestScoringStudent+1));
    }

    public static void calculateAveragePerSubjectOf(int[][] studentTotals, int numberOfSubjects, int numberOfStudents) {
            int[] subjectTotals = new int[numberOfSubjects];
            for (int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
                int totalPerSubject=0;
                double subjectAverage;
                for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
                    totalPerSubject+=studentTotals[studentIndex][subjectIndex];
                }
                subjectTotals[subjectIndex] = totalPerSubject;
                subjectAverage = (totalPerSubject/(double)numberOfStudents);
                System.out.printf("average score in subject %d is %2f%n", subjectIndex+1, subjectAverage);
            }
        System.out.println();
            findHardestSubject(subjectTotals, numberOfSubjects);

    }

    public static void findHardestSubject(int[] totalPerSubject, int numberOfSubjects){
        int minimumTotalPerSubject = totalPerSubject[0];
        int indexOfMinimumTotalPerSubject =0;
        for (int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
            if (totalPerSubject[subjectIndex]< minimumTotalPerSubject){
                minimumTotalPerSubject = totalPerSubject[subjectIndex];
                indexOfMinimumTotalPerSubject=subjectIndex;
            }
        }
        System.out.printf("the hardest subject is subject %d", indexOfMinimumTotalPerSubject+1);
    }
}
