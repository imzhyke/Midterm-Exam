/*
 * Title: Midterm Exam Number 2
 * Name: Ezekiel P. Villadolid
 * Description: Java program to read age of 15 person and count total Baby age, School age and Adult age &amp; find out how many of them fall under:
        a. Still a baby = age 0 to 5
        b. Attending school = age 6 to 17
        c. Adult life = age 18 & over
 * Date: 4/30/2021
 */
package Number2;

import java.util.Scanner;

public class MidtermExam_Number2 {

    public static void main(String[] args) {
        
        //Declaration of variables needed
        int age;
	int countBaby=0,countSchool=0,countAdult=0;
	int count=0;
	
        Scanner readInput = new Scanner(System.in);
        
	while(count<15) //Loop will run 15 times
	{   
                //to get the age
		System.out.printf("Enter age of person [%d]: ",count+1);
		age = readInput.nextInt();
		
                //To check if the age is 
		if(age>=0 && age<=5){ //Baby Age
			countBaby++;   
                }
		else if(age>=6 && age<=17){ //School Age
			countSchool++;
                }
                else{  //Addult age
			countAdult++;
                }        
		//increase counter
		count++;
	}
	//To display the amount of age being entered 
	System.out.printf("Baby age: %d\n",countBaby);
	System.out.printf("School age: %d\n",countSchool);
	System.out.printf("Adult age: %d\n",countAdult);
    }
    
}
