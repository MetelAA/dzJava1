import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("кот");
        Animal whale = new Animal("кит");
        Question baseQuestion = new Question("Живёт на суше", cat, whale);

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Загадай животное");
            String hiddenAnimal = in.nextLine();
            Question actualQuestion = baseQuestion;
            while (true) {
                System.out.println(actualQuestion.getQuestionText()+"?");

                if (getAns(in)) {
                    if (actualQuestion.getAnimalIfYes().getNextQuestion() != null) {
                        actualQuestion = actualQuestion.getAnimalIfYes().getNextQuestion();
                    } else {
                        findAnim(in, hiddenAnimal, actualQuestion.getAnimalIfYes());
                        break;
                    }
                } else {
                    if (actualQuestion.getAnimalIfNo().getNextQuestion() != null) {
                        actualQuestion = actualQuestion.getAnimalIfNo().getNextQuestion();
                    } else {
                        findAnim(in, hiddenAnimal, actualQuestion.getAnimalIfNo());
                        break;
                    }
                }

            }
        }
    }


    static void findAnim(Scanner in, String hiddenAnimal, Animal actAnimal){
        System.out.println("Это " + actAnimal.getName() + "?");
        if (getAns(in)) {
            System.out.println("Кайфарики, давай по новой");

        } else {
            System.out.println("Тогда чем отличается " + hiddenAnimal + " от " + actAnimal.getName() + "?"); //ответ должен быть да для hidden animal и нет для actAnimal
            String newQuestionText = in. nextLine();
            Animal newAnimal = new Animal(hiddenAnimal);
            Question newQuestion = new Question(newQuestionText, newAnimal, actAnimal);
            actAnimal.setNextQuestion(newQuestion);
        }

    }

    static Boolean getAns(Scanner in) {
        String ans;
        while(true){
            ans = in.nextLine();
            if (ans.equals("да")) {
                return Boolean.TRUE;
            }else if(ans.equals("нет")){
                return Boolean.FALSE;
            }
            System.out.println("Подумай ещё раз");
        }
    }
}