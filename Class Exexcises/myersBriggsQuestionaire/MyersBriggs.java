import java.util.*;

public class MyersBriggs {
    private String[] answers = new String[20];
    private String[][] answersByCategory= new String[4][5];
    private String[] grade = new String[4];

    public String[] getQuestions() {
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
        return display.split(":", 20);
    }

    public String[] displayQuestionsToUser(String[] questions) {
        Scanner scanner = new Scanner(System.in);
        for (int questionNumber = 0; questionNumber < questions.length; questionNumber++) {
            System.out.println(questions[questionNumber]);
            String userInput = scanner.nextLine();
            answers[questionNumber] = userInput.toUpperCase();
        }
        scanner.close();
        return answers;
    }

    public String[][] divideIntoCategories(String[] answers){
        for (int category = 0; category < 4; category++) {
            int counter = 0;
            for (int answer = category; answer < answers.length; answer=answer+4) {
                answersByCategory[category][counter] = answers[answer];
                counter++;
            }
        }
        return answersByCategory;
    }


    public void tabulateQuestionaire(String[][] answersByCategory, String[] grade){
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
        System.out.println(key);

        int questionNumber =1;
        for (int counter = 0; counter < answersByCategory[0].length; counter++) {
            for (int counterTwo = 0; counterTwo < answersByCategory.length; counterTwo++) {
                System.out.printf("%d. %s\t", questionNumber, answersByCategory[counterTwo][counter]);
                questionNumber++;
            }
            System.out.println();
        }
        for (int i = 0; i < grade.length; i++) {
            System.out.printf("%s\t", grade[i]);
        }
        System.out.println();
    }

    /**
     * Go through each category and try to find out which option was chosen the most
     * whichever option was chosen, rank accordinly
     * 
     *
     * */
    public String[] analyseQuestionaireAnswers(String[][] answersByCategory){
        int numberOfOptionA;
        int numberOfOptionB;
        int counter = 0;
        for (; counter < answersByCategory.length; counter++) {
            numberOfOptionA=0;
            numberOfOptionB=0;
            for (int i = 0; i < answersByCategory[0].length; i++) {
                if (answersByCategory[counter][i].equalsIgnoreCase("A")){
                    numberOfOptionA++;
                }
                if(answersByCategory[counter][i].equalsIgnoreCase("B")){
                    numberOfOptionB++;
                }
            }
            if (numberOfOptionA > numberOfOptionB) {
                grade[counter] = "A";
            }
            if (numberOfOptionB > numberOfOptionA){
                grade[counter] = "B";
            }
        }  
        return grade;
    }
}

    


