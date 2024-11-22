public class Animal {
    private String name;
    private Question nextQuestion;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
    }
}
