/*
 * Title: Midterm Exam Number 6
 * Name: Ezekiel P. Villadolid
 * Description: MyJava Café wants you to write a program to take orders from the Internet. 
                Your program asks for  item, its price, and if overnight shipping is wanted. 
                Regular shipping for items under 10 is 2.00; for ems 10 or more shipping is 3.00. 
                For overnight delivery add 5.00. Provide an invoice as summary of purchase.
 * Date: 4/30/2021
 */
package Number6;

import java.util.Scanner;


public class MidtermExam_Number6 {
        //Declaring Global Variables
        public static String item;
	public static  char toShip;
	public static  double price, shippingFee, totalPrice;
        
    public static void main(String [] args) {
        
        //The Scanner
	Scanner readInput = new Scanner(System.in);
        
        //To get the Item
	System.out.print("Please enter the item you would like to order: ");
	item = readInput.nextLine();

        //To get the Item price
	System.out.print("Please enter the price of your item : $");
	price = readInput.nextDouble();

        //To check it it's for shipping
	System.out.print("Would you like overnight shipping? (Y/N) : ");
	toShip = readInput.next().charAt(0);
        
        //--When it's for shipping and the price is greater than $10
	if (toShip == 'Y' && price > 10) {
            shippingFee = 3 + 5;
            totalPrice = shippingFee + price;	
               invoice(totalPrice); //To pass the total price
	} 
        
        //--When it's for shipping and the price is less than $10
        else if (toShip == 'Y' && price < 10) {
            shippingFee = 2 + 5;
            totalPrice = shippingFee + price;
            invoice(totalPrice);//To pass the total price
        } 
        
        //--When it's not for shipping and the price is greater than $10
        else if (toShip == 'N' && price > 10) {
            shippingFee = 3 + 5;
            totalPrice = shippingFee + price;
            invoice(totalPrice); //To pass the total price
        } 
        
        //--When it's not for shipping and the price is less than $10
        else {
            shippingFee = 2 + 5;  
            totalPrice = shippingFee + price;
            invoice(totalPrice);//To pass the total price
        }
    }
    
    //A Method to print the Invoice as Summary
    public static  void invoice(double totalCost){
        System.out.println("\nINVOICE");
        System.out.println("Item: "+item); //To print the item
        System.out.println("Price: $ " + price );  //To print the price
        System.out.println("Shipping: $"+shippingFee);  //To print the shipping cost
        System.out.println("Total: $ " +totalCost);

    }
}
    

