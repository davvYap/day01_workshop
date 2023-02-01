package myapp;

import java.io.Console;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Console cons = System.console();
        Random rand = new Random();

        int correctAns = rand.nextInt(20) + 1; // from 0 to 20
        int guessTries = 5;
        boolean win = false;

        System.out.printf("The correct number is: %d\n",correctAns); 
        System.out.printf("Please guess the correct answer from 1 to 20:\n");

        
        while(guessTries>0 && !win){
            String guessStr = cons.readLine("What is your guess? (%d tries left)\n",guessTries);

            int guessNum = Integer.parseInt(guessStr);
            
            if(guessNum < correctAns){
                System.out.printf("Higher!\n");
                guessTries--;
            } else if(guessNum > correctAns){
                System.out.printf("Lower!\n");
                guessTries--;
            } else {
                win = true;
                //break;
            }
        }

        if (win){
            System.out.printf("You win!\n");
        }else{
            System.out.printf("You lose! The correct number is: %d\n",correctAns);
        }
    }
}