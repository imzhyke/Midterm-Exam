/*
 * Title: Midterm Exam Number 4
 * Name: Ezekiel P. Villadolid
 * Description: Write a program that read number N and input number as to how many N being read. 
                Classify number like the program counts the number of odd, even numbers and number of zeros.
 * Date: 4/30/2021
 */
package Number4;

import java.util.Scanner;


public class MidtermExam_Number4 {

    public static void main(String[] args) {
        
        Scanner readInput = new Scanner(System.in);
        
        //To get the value of N
        System.out.print("Input N: ");
        int N= readInput.nextInt();
        
        //Declaration and initialization 
        int i,num,countEven=0,countOdd=0,countZero=0;
        
        for(i=0;i<N;i++){
            //To read the value
            num = readInput.nextInt();
                if(num%2==0&&num!=0){ //To check if number entered is even number
                    countEven++;
                }
                else if(num%2!=0){ //To check if number entered is odd number
                    countOdd++;
                }
                else if(num==0){ //To check if number entered is zero
                    countZero++;
                }
                else{
                    System.out.println("Value not valid");
                }
            
        }
        //To display the counts of odd, even and zero being entred
        System.out.println("Count of odd,even and zero being entered");
        System.out.println("Odd Numbers Entered: "+countOdd); //Number of odd numbers being entered
        System.out.println("Even Numbers Entered: "+countEven);//Number of even numbers being entered
        System.out.println("Zeros Entered: "+countZero);//Number of zeros being entered
    }
    
    
}
