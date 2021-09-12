public class MyersBriggsTest {
    public static void main(String[] args) {
        MyersBriggs questionaire = new MyersBriggs();
        questionaire.getQuestions();
        questionaire.displayQuestionsToUser();
        questionaire.divideAnswersIntoCategories();
        questionaire.setPersonalityTraitsBasedOnAnswers();
        questionaire.tabulateQuestionaireAnswers();
    } 
}
