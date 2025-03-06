/* We need to generate a random number between 1 and 10 (in Bicycle)
We need to use Input.getInt() to guarantee a valid number from the user (scanner)
We need feedback
We need a loop to check if a correct guess, and if not, prompt again
We need to handle singular/plural in our feedback  */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int num = ThreadLocalRandom.current().nextInt(1, 10+1);
        int guess = getInt("Please enter a number between 1 and 10: ");
        String feedback = "";
        String timeTimes = "times";
        boolean running = false;
        int counter = 0;


        while (!running) {
            counter++;
            if(num == guess) {
                running = true;

            } else if (num > guess) {
                guess = getInt("Higher");
            }else{

                guess = getInt("Lower");
            }

        }//end while
        feedback += "Got it! You guessed " + guess;
        if (counter == 1){
            timeTimes = "time";
        }
        feedback += " and you guessed " +counter+ " " +timeTimes;
        if(running){
            //System.out.println("You guessed "+ guess+". And it's correct!");
            System.out.println(feedback);
        } 



        System.out.println(guess);
    }//end constructor


    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        boolean gotInt = false;
        int num = 0;
        System.out.println(prompt);

        while (!gotInt) {
            String str = scanner.nextLine();

            try {
                num = Integer.parseInt(str);
                gotInt = true;
            } catch (Exception e) {
                System.out.println("That is not a number");
            }
        }
        return num;
    }





    }//end class main
