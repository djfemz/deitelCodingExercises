public class MyersBriggsTest {
    public static void main(String[] args) {
        MyersBriggs questionaire = new MyersBriggs();
        questionaire.saveQuestions();
        questionaire.displayQuestionsToUser();
        questionaire.divideAnswersIntoCategories();
        questionaire.setPersonalityTraitsBasedOnAnswers();
        questionaire.tabulateQuestionaireAnswers();
    } 
}
