import java.util.*;

public class MyersBriggs {
    Scanner scanner = new Scanner(System.in);
    private String[] questions = new String[20];
    private static final String FIRST_VALID_INPUT = "A";
    private static final String SECOND_VALID_INPUT = "B";
    private String[] answers = new String[20];
    private String[][] answersByCategory= new String[4][5];
    private static String[] grades = new String[4];
    private static String[] categories = new String[4];

    public void saveQuestions() {
        String display = """
                            A.                                                                          B. 
                1. expend energy                                                        conserve energy, enjoy one-on-one:
                2. interpret literally                                                  look for meaning and possibilities:
                3. logical, thinking, questioning                                       empathetic, feeling, accomodating:
                4. organized, orderly                                                   flexible, adaptible:
                5. more outgoing, think out loud                                        more reserved, think to yourself:
                6. practical, realistic, experiential                                   imaginative, innovative, theoretical:
                7. candid, straightforward, frank                                       tactful, kind, encouraging:
                8. plan, schedule                                                       unplanned, spontaneous:
                9. seek many tasks, public activities, interaction with others          seek private solitary activities with quiet to concentrate:
                10. standard, usual, conventional                                       different, novel, unique:
                11. firm, tend to criticize, hold the line                              gentle, tend to appreciate, conciliate:
                12. regulated, structured                                               easygoing, live and let live:
                13. external, communicative, express yourself                           internal, reticent, keep to yourself:
                14. focus on here and now                                               look to the future, global perspective, big picture:
                15. tough-minded, just                                                  tender-hearted, merciful:
                16. preparation, plan ahead                                             go with the flow, adapt as you go:
                17. active, initiate                                                    reflective, deliberate:
                18. facts, things, what is                                              ideas, dreams, "what could be", philosophical:
                19. matter of fact, issue-oriented                                      sensitive, people-oriented, compassionate:
                20. control, govern                                                     latitude, freedom
                """;
        questions= display.split(":", 20);
    }


    public void displayQuestionsToUser() {
        for (int questionNumber = 0; questionNumber < questions.length; questionNumber++) {     
            System.out.println(questions[questionNumber]);
            String answer = getAnswerFromUser().toUpperCase();
            
             while(!answer.equalsIgnoreCase(FIRST_VALID_INPUT) || !answer.equalsIgnoreCase(SECOND_VALID_INPUT)){
                if (answer.equals(FIRST_VALID_INPUT) ||answer.equals(SECOND_VALID_INPUT)){
                    break;
                }
                System.out.println(questions[questionNumber]); 
                answer = getAnswerFromUser().toUpperCase(); 
            }
            
               saveAnswer(answer, questionNumber);
        }  
    }

    private String getAnswerFromUser() {
        return scanner.next();
    }

    public void saveAnswer(String answer, int questionNumber) {
        answers[questionNumber] = answer.toUpperCase();
    }

    public void divideAnswersIntoCategories(){
        for (int category = 0; category < 4; category++) {
            int counter = 0;
            for (int answer = category; answer < answers.length; answer=answer+4) {
                answersByCategory[category][counter] = answers[answer];
                counter++;
            }
        }
        analyseQuestionaireAnswers(answersByCategory);
    }


    public void tabulateQuestionaireAnswers(){
        String key = """
                E - extrovert
                I - introvert
                S - sensing
                N - intuition
                T - thinking
                F - feeling
                J - judging
                P - perceiving
                """;

        int questionNumber =1;
        for (int counter = 0; counter < answersByCategory[0].length; counter++) {
            for (int counterTwo = 0; counterTwo < answersByCategory.length; counterTwo++) {
                System.out.printf("%d. %s\t", questionNumber, answersByCategory[counterTwo][counter]);
                questionNumber++;
            }
            System.out.println();
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%s\t", grades[i]);
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%s\t", categories[i]);
        }
        System.out.println();
        drawHorizontalLine();
        System.out.printf("%s%n%s", "Keys:", key);
        System.out.println();
    }

    
    private static void analyseQuestionaireAnswers(String[][] answersByCategory){
        int counterForOptionA;
        int counterForOptionB;
        int counter = 0;
        for (; counter < answersByCategory.length; counter++) {
            counterForOptionA = 0;
            counterForOptionB = 0;
            for (int option = 0; option < answersByCategory[0].length; option++) {
                if (answersByCategory[counter][option].equalsIgnoreCase("A")) {
                    counterForOptionA++;
                }
                if (answersByCategory[counter][option].equalsIgnoreCase("B")) {
                    counterForOptionB++;
                }
            }
            if (counterForOptionA > counterForOptionB) {
                grades[counter] = "A";
            }
            if (counterForOptionB > counterForOptionA) {
                grades[counter] = "B";
            }
        }
    }

    public void setPersonalityTraitsBasedOnAnswers() {
        for (int i = 0; i < grades.length; i++) {
            iterateThroughGrades(i);
        }
    }

    private static void drawHorizontalLine() {
        System.out.println("=".repeat(100));
    }

    private static void iterateThroughGrades(int i) {
        switch (i) {
            case 0:
                if (grades[i].equals("A")){
                   categories[i] = "E";
                   break;
                }else {
                    categories[i] = "I";
                    break;
                }
            case 1:
                if (grades[i].equals("A")){
                    categories[i] = "S";
                    break;
                }else {
                    categories[i] = "N";
                    break;
                }
            case 2:
                if (grades[i].equals("A")){
                    categories[i] = "T";
                    break;
                }else {
                    categories[i] = "F";
                    break;
                }
            case 3:
                if (grades[i].equals("A")){
                    categories[i] = "J";
                    break;
                }else {
                    categories[i] = "P";
                    break;
                }
            default:
                System.out.println("system failure");
                break;        
        }
    }
}

    


