// -------------------------------------------------------
// Assignment 1 Question 1
// Written by: Hao Yi Liu (40174210)
// Date: 05/02/2021
// For COMP 248 Section W 2204 - Winter 2021
// -------------------------------------------------------
import java.util.Scanner;
public class finalQuestion1 //defining a class
{ 
// This program asks the user to prompt a 6 digits number and will output an encrypted password
	public static void main(String[] args) //declaring the main function
	{
		System.out.println("**************************************");
		System.out.println("Welcome to Password Encryption Program"); //printing the welcome message
		System.out.println("**************************************");
		Scanner in=new Scanner(System.in); //inputing the number from the user
		System.out.println("\nPlease enter a 6-digits number : "); //printing the message
		String number=in.next(); //storing input in a string variable
		final int value=10; //storing the value 10 in the program using the variable value

		char digit1=number.charAt(5); //swapping the first and the sixth digits
		int character1=Character.getNumericValue(digit1); //transforming the character of digit1 into integer
		char digit2=number.charAt(1); // defining the position of the second digit 
		int character2=Character.getNumericValue(digit2)%2; //transforming the second digit into integer and replacing it with the remainder divided by 2
		char digit3=number.charAt(2); 
		int character3=Character.getNumericValue(digit3)+1; //adding 1 to the third digit

		int digit4=number.charAt(3); 
		int character4=Character.getNumericValue(digit4);
		character4=character3%3; // replacing the fourth digit with the remainder of the third digit divided by 3

		int digit5=number.charAt(4); 
		int character5=Character.getNumericValue(digit5);
		int placeHolder1=character5; //declaring a new variable to keep the initial values of c5
		int placeHolder2=character4;
		character4=placeHolder1; //swapping the fourth and fifth digits
		character5=placeHolder2;

		int digit6=number.charAt(0); 
		int character6=Character.getNumericValue(digit6);
		if (character3==value)
		{
			character2=character2+1;
			character3=0;
		} //concatenating the data
		System.out.println("\nGenerating the encrypted number... "); //displaying a farewell message
		System.out.println("\nThe encrypted 6-digits nyumber is : " +character1+character2+character3+character4+character5+character6); //concatenating the digits together 
		System.out.println("\nThank you for using Password Encryption Program! "); 
	}

}
