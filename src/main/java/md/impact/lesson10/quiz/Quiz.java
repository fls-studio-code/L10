package md.impact.lesson10.quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] Args){

        System.out.println("Chose one correct answer of 4 given");

        System.out.println("Chose category:");
        System.out.println("1.Geography");
        System.out.println("2.Here you can add your category");

        System.out.print("Your answer - ");

        Scanner answer = new Scanner(System.in);
        int number = answer.nextInt();

        if(number == 1){
            System.out.println("Geography quiz start");
            geoQuiz();
        }
        else if(number == 2){
            System.out.println("Here will be your category");
        }
        else{
            System.out.println("No such category, try another.");
        }
    }

    public static void geoQuiz(){
        Scanner geoAns = new Scanner(System.in);
        int counter = 0;

        System.out.println("Question 1: There is not a single bridge on this river.");
        System.out.println("1.Oka");
        System.out.println("2.Amazon");
        System.out.println("3.Volga");
        System.out.println("4.Yana");
        System.out.print("Your answer - ");
        int ans = geoAns.nextInt();

        if(ans == 2){
            System.out.println("Correct! +1 point.");
            counter++;
        }
        else{
            System.out.println("Wrong answer!");
        }

        System.out.println("Question 2: There are more lakes in this country than in all countries combined");
        System.out.println("1.Russia");
        System.out.println("2.Finland");
        System.out.println("3.Canada");
        System.out.println("4.USA");
        System.out.print("Your answer - ");
        ans = geoAns.nextInt();

        if(ans == 3){
            System.out.println("Correct! +1 point.");
            counter++;
        }
        else{
            System.out.println("Wrong answer!");
        }

        System.out.println("Question 3: The driest place on Earth is");
        System.out.println("1.Atacama Desert");
        System.out.println("2.Big Sandy Desert");
        System.out.println("3.Sahara desert");
        System.out.println("4.McMurdo Valley");
        System.out.print("Your answer - ");
        ans = geoAns.nextInt();

        if(ans == 4){
            System.out.println("Correct! +1 point.");
            counter++;
        }
        else{
            System.out.println("Wrong answer!");
        }

        System.out.println("Question 4: This city is the only one in the world located on two continents at once");
        System.out.println("1.Panama");
        System.out.println("2.Moscow");
        System.out.println("3.Istanbul");
        System.out.println("4.Antananarivo");
        System.out.print("Your answer - ");
        ans = geoAns.nextInt();

        if(ans == 3){
            System.out.println("Correct! +1 point.");
            counter++;
        }
        else{
            System.out.println("Wrong answer!");
        }

        System.out.println("Question 5: 336 rivers flow into Lake Baikal, and only one flows out");
        System.out.println("1.Selenga");
        System.out.println("2.Hangar");
        System.out.println("3.Venisei");
        System.out.println("4.Vitim");
        System.out.print("Your answer - ");
        ans = geoAns.nextInt();

        if(ans == 2){
            System.out.println("Correct! +1 point.");
            counter++;
        }
        else{
            System.out.println("Wrong answer!");
        }

        System.out.println("Quiz ended, you answered " + counter + " of 5question.");
    }
}
