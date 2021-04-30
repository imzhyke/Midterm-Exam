/*
 * Title: Midterm Exam Number 3
 * Name: Ezekiel P. Villadolid
 * Description: Create a program that reads letter codes ‘A’ through ‘Z’ and prints the corresponding telephone digit.
                The program uses a sentinel-controlled while loop. To stop the program, the user is prompted for the sentinel which is ‘ # ‘.
                Use dialog boxes for input/output.
 * Date: 4/30/2021
 */
package Number3;

//imports needed for dialog box
import javax.swing.JOptionPane;

public class MidtermExam_Number3 {

    public static void main(String[] args) {
        
        //Declaration of sentinel value
       final char SENTINEL='#';
       
       char letterCode=' ';
       
       //Condition while sentinel is not equal to the entered character
       while(letterCode!=SENTINEL){
           
           //To dispaly and get the character
           String inputLetter = JOptionPane.showInputDialog ("Input letter(A-Z)");
           letterCode = inputLetter.charAt(0);
           
           //To check  if the character's corresponding telephone digit.
           switch(letterCode){
               case 'A': case 'B': case 'C':  //since ABC = 2 in telephone digit
                    corTelNum(2); 
                    break;
               case 'D': case 'E': case 'F': //since DEF = 3 in telephone digit
                   corTelNum(3); 
                    break;
               case 'G': case 'H': case 'I': //since GHI = 4 in telephone digit
                   corTelNum(4); 
                    break;
               case 'J': case 'K': case 'L': //since JKL = 5 in telephone digit
                   corTelNum(5); 
                    break;
               case 'M': case 'N': case 'O': //since MNO = 6 in telephone digit
                   corTelNum(6); 
                    break;
                case 'P': case 'Q': case 'R': case 'S': //since PQRS = 7 in telephone digit
                   corTelNum(7); 
                    break;
                case 'T': case 'U': case 'V': //since TUV = 8 in telephone digit
                   corTelNum(8); 
                    break;
                case 'W': case 'X': case 'Y': case 'Z'://since WXYZ = 9 in telephone digit
                   corTelNum(9);  
                    break;

           }
              
       }
       
       
    }
    
    //Method to display the corresponding digit value in a dialog box
    public static void corTelNum(int num) {
       JOptionPane.showMessageDialog (null, "Corresponding Telephone Digit is "+ num );
    }
    
}
