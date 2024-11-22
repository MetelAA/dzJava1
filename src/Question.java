public class Question {
    private String questionText;
    private Animal animalIfYes;
    private Animal animalIfNo;

    public Question(String questionText, Animal animal, Boolean flag) {
        if (flag) {
            this.questionText = questionText;
            this.animalIfYes = animal;
        } else {
            this.questionText = questionText;
            this.animalIfNo = animal;
        }
    }

    public Question(String questionText, Animal animalIfYes, Animal animalIfNo) {
        this.questionText = questionText;
        this.animalIfYes = animalIfYes;
        this.animalIfNo = animalIfNo;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Animal getAnimalIfYes() {
        return animalIfYes;
    }

    public Animal getAnimalIfNo() {
        return animalIfNo;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnimalIfYes(Animal animalIfYes) {
        this.animalIfYes = animalIfYes;
    }

    public void setAnimalIfNo(Animal animalIfNo) {
        this.animalIfNo = animalIfNo;
    }
}
