/*
 * Title: Midterm Exam Number 5
 * Name: Ezekiel P. Villadolid
 * Description: program that randomly generates an integer greater than or equal to 0 and less than 100.
                The program then prompts the user to guess the number.
 * Date: 4/30/2021
 */
package Number5;

import java.util.Scanner;

public class MidtermExam_Number5 {

    public static void main(String[] args) {

        int guessNum;
        
        //To generate a random number
        int genNum = (int)(Math.random()*100);

        Scanner readInput = new Scanner(System.in);

        System.out.println("GUESS THE NUMBER GAME");
  
        do{ 
            //To get the guess number
            System.out.print("Your guess: ");
            guessNum = readInput.nextInt();
            
            //to check if number is lower than the generated value
            if(guessNum<genNum){
                System.out.println("Your guess is lower than the number ");
            }
             //to check if number is higher than the generated value
            else if(guessNum>genNum){
                System.out.println("Your guess is higher than the number ");
            }
 
        }while(guessNum!=genNum); 
         //If guess number is equals to the generated number the loop will end
        
         //And states that the user won the game
        System.out.println("\nYour guess was right the number is "+genNum+"!");
        
    } 
    
}
