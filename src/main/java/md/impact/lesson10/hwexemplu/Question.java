package md.impact.lesson10.hwexemplu;

public class Question {
    private String text;
    private String[] options;
    private int correct; // 1..4, as in the lesson quiz

    public Question(String text, String option1, String option2, String option3, String option4, int correct) {
        this.text = text;
        this.options = new String[] {option1, option2, option3, option4};
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isCorrect(int answer) {
        return answer == correct;
    }

    public int getCorrect() {
        return correct;
    }
}
