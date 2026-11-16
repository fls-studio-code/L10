package md.impact.lesson10.hwexemplu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Chose one correct answer of 4 given");
        System.out.println("Chose category:");
        System.out.println("1.Geography");
        System.out.println("2.Java");
        System.out.print("Your answer - ");

        int number = in.nextInt();
        List<Question> questions;

        if (number == 1) {
            System.out.println("Geography quiz start");
            questions = geographyQuestions();
        } else if (number == 2) {
            System.out.println("Java quiz start");
            questions = javaQuestions();
        } else {
            System.out.println("No such category, try another.");
            return;
        }

        int counter = runQuiz(questions, in);
        System.out.println("Quiz ended, you answered " + counter + " of " + questions.size() + ".");
    }

    public static int runQuiz(List<Question> questions, Scanner in) {
        int counter = 0;
        int n = 1;
        for (Question q : questions) {
            System.out.println("Question " + n + ": " + q.getText());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + "." + options[i]);
            }
            System.out.print("Your answer - ");
            int ans = in.nextInt();
            if (q.isCorrect(ans)) {
                System.out.println("Correct! +1 point.");
                counter++;
            } else {
                System.out.println("Wrong answer!");
            }
            n++;
        }
        return counter;
    }

    public static List<Question> geographyQuestions() {
        List<Question> list = new ArrayList<>();
        list.add(new Question(
                "There is not a single bridge on this river.",
                "Oka", "Amazon", "Volga", "Yana", 2));
        list.add(new Question(
                "There are more lakes in this country than in all countries combined",
                "Russia", "Finland", "Canada", "USA", 3));
        list.add(new Question(
                "The driest place on Earth is",
                "Atacama Desert", "Big Sandy Desert", "Sahara desert", "McMurdo Valley", 4));
        list.add(new Question(
                "This city is the only one in the world located on two continents at once",
                "Panama", "Moscow", "Istanbul", "Antananarivo", 3));
        list.add(new Question(
                "336 rivers flow into Lake Baikal, and only one flows out",
                "Selenga", "Angara", "Yenisei", "Vitim", 2));
        return list;
    }

    public static List<Question> javaQuestions() {
        List<Question> list = new ArrayList<>();
        list.add(new Question(
                "How do you choose a random element from a List called words?",
                "words.get(0)",
                "words.get(new Random().nextInt(words.size()))",
                "words.random()",
                "Random.get(words)",
                2));
        list.add(new Question(
                "In Ghici cuvantul, a space inside a phrase is stored in hiddenWord as",
                "an underscore '_",
                "null",
                "a space ' '",
                "it is skipped and the word is glued together",
                3));
        list.add(new Question(
                "Which method reads an integer from the console in the lesson quiz?",
                "nextLine()",
                "next()",
                "nextInt()",
                "readInt()",
                3));
        return list;
    }
}
