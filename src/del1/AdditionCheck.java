package del1;
import java.lang.Math;     //importing Math package to enable math calculations
import java.util.Scanner;  //importing Scanner package to enable user input
public class AdditionCheck {
	 public static void main(String[] args) {
	 Scanner scnr = new Scanner(System.in);  //Creating scanner
	 int num1;
	 int num2;
	 int hundreds = 0;
	 int tens = 0;
	 int ones = 0;
	 int hundreds2 = 0;
	 int tens2 = 0;
	 int ones2 = 0;
	 
	 System.out.print("Please enter first 3-digit number: ");  //user enters first number
	 num1 = scnr.nextInt();
	 if (num1 > 999) {
		 System.out.print("Error! Number has more than 3 digits!");
		 
	 }
	 if (num1 < 100) {
		 System.out.print("Error! Number has less than 3 digits!");
	 }
	 System.out.print("Please enter second 3-digit number: ");  //user enters second number
	 num2 = scnr.nextInt();
	 if (num2 > 999) {
		 System.out.print("Error! Number has more than 3 digits!");
	 }
	 if (num2 < 100) {
		 System.out.print("Error! Number has less than 3 digits!");
	 }
	 
	 //Calculations to extract each digit from each number 
	 hundreds = num1 / 100;
	 tens = (num1 / 10) % 10; 
	 ones = (num1 / 1)  % 10;
	
	 
	 hundreds2 = num2 / 100;
	 tens2 = (num2 / 10) % 10;
	 ones2 = (num2 / 1) % 10;

	 
	 //Sums of each respective digit;
	 int sumOne = hundreds + hundreds2;
	 int sumTwo = tens + tens2;
	 int sumThree = ones + ones2;
	
	
	 
	 //Task to compare the sums of each place between the two numbers and see if they're equal
	 
	 if((sumOne == sumTwo) && (sumTwo == sumThree) && (sumOne == sumThree)){
		 System.out.println("True");
	 }
	 else {
		 System.out.println("False");
	 }
}
}