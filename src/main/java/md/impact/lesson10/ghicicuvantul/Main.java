package md.impact.lesson10.ghicicuvantul;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> games = new ArrayList<>();

        games.add("counter strike");
        games.add("world of tanks");
        games.add("skyrim");

        List<String> music = new ArrayList<>();

        music.add("linkin park");
        music.add("hollywood undead");
        music.add("powerwolf");

        List<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("soup");
        food.add("burger");

        List<String> animals = new ArrayList<>();

        animals.add("lion");
        animals.add("dog");
        animals.add("penguin");

        int lives = 6;
        Scanner letter = new Scanner(System.in);
        String gameWord = "";

        while (true){
            System.out.println("");
            System.out.println("Chose a category of the word.");
            System.out.println("1.Games");
            System.out.println("2.Music");
            System.out.println("3.Food");
            System.out.println("4.Animals");
            System.out.println("________________________________________");
            System.out.print("Enter a number: ");

            String category = letter.next();
            Random rand = new Random();

            switch (category){
                case "1":
                    gameWord = games.get(rand.nextInt(games.size()));
                    break;
                case "2":
                    gameWord = music.get(rand.nextInt(games.size()));
                    break;
                case "3":
                    gameWord = food.get(rand.nextInt(games.size()));
                    break;
                case "4":
                    gameWord = animals.get(rand.nextInt(games.size()));
                    break;
                default:
                    System.out.println("Unknown category, enter a valid number.");
            }
            if(!gameWord.equals("")){
                break;
            }
        }

        List<Character> hiddenWord = new ArrayList<>();
        List<Character> usedLetters = new ArrayList<>();

        for(int i = 0 ; i < gameWord.length() ; i++){
            if(gameWord.charAt(i) == ' '){
                hiddenWord.add(' ');
            }
            else{
                hiddenWord.add('_');
            }
        }

        while(true){
            for (char symb:hiddenWord
            ) {
                System.out.print(symb + " ");
            }

            System.out.println("");
            System.out.println("You have " + lives + " attempts left");
            System.out.print("You used this letters : ");
            for (char let:usedLetters
            ) {
                System.out.print(let + ", ");
            }
            System.out.println("");
            System.out.print("Enter a letter : ");
            String enteredLetter = letter.next();
            if(enteredLetter.length() > 1){
                System.out.println("Enter only one letter");
            }
            else{
                enteredLetter = enteredLetter.toLowerCase();
                if(gameWord.contains(enteredLetter)){
                    List<Integer> indexes = new ArrayList<>();

                    for(int i = 0 ; i < gameWord.length() ; i++){
                        if(gameWord.charAt(i) == enteredLetter.charAt(0)){
                            indexes.add(i);
                        }
                        else{
                            continue;
                        }
                    }

                    for (int i: indexes
                    ) {
                        hiddenWord.set(i , enteredLetter.charAt(0));
                    }

                    if(!hiddenWord.contains('_')){
                        System.out.println("Congratulations, you win!!!");
                        break;
                    }

                    if(!usedLetters.contains(enteredLetter.charAt(0))){
                        usedLetters.add(enteredLetter.charAt(0));
                    }

                }
                else {
                    if(!usedLetters.contains(enteredLetter.charAt(0))){
                        usedLetters.add(enteredLetter.charAt(0));
                        lives--;
                    }
                    if(lives>0) {
                        System.out.println("You entered wrong letter, try again");
                    }
                    else{
                        System.out.println("You lose.");
                        System.out.println("The word was " + gameWord );
                        break;
                    }
                }
            }
        }
    }
}
