public class MyersBriggsTest {
    public static void main(String[] args) {
        MyersBriggs questionaire = new MyersBriggs();
        String[] questions = questionaire.getQuestions();
        String[] answers = questionaire.displayQuestionsToUser(questions);
        String[][] answersByCategories=questionaire.divideIntoCategories(answers);
        String[] grade=questionaire.analyseQuestionaireAnswers(answersByCategories);
        questionaire.tabulateQuestionaire(answersByCategories, grade);
    } 
}
