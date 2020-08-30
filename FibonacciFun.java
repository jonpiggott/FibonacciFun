/*
* A small java program that takes two user inputs for two integers and one input for the #
* of times the user wishes to loop the sequnce. The fibonacci is a sequence of #s where each
* number in the sequnce is equal to the previous two, e.g. 0,1,1,2,3,5,8,13,21,34,55,etc.
* This program lets the user pick the initial starting values instead of just beginning with 0 and 1.
* by: jpigg
*/

import java.util.Scanner;

public class FibonacciFun {

	public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);

	//get user input #s and the amount they wish the sequence to loop
	System.out.println("Enter first number for fibonacci sequence: ");
	int intA = userInput.nextInt();
	System.out.println("Enter second number for fibonacci sequence: ");
	int intB = userInput.nextInt();
	System.out.println("Specify how many times you would the sequence to loop: ");
	int loopBoundry = userInput.nextInt();

	//for checking user inputs
	//System.out.println(intA);
	//System.out.println(intB);
	//System.out.println(loopBoundry);

	//first output for sequence
	System.out.println("1: " + intA);
	for (int count = 1 ; count <= loopBoundry ; count++) {

		//second and repeated output for sequence
		System.out.println(count + ": " + intB);

		//store the value of b temporarily in c, b = a + B, then a becomes c (or what b was...)
		int intC = intB;
		intB = intA + intB;
		intA = intC;

	}
	}

}