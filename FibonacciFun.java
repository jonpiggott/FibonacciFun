import java.util.Scanner;

public class FibonacciFun {

	public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter first number for fibonacci sequence: ");
	int intA = userInput.nextInt();
	System.out.println("Enter second number for fibonacci sequence: ");
	int intB = userInput.nextInt();
	System.out.println("Specify how many times you would the sequence to loop: ");
	int loopBoundry = userInput.nextInt();

	System.out.println(intA);
	System.out.println(intB);
	System.out.println(loopBoundry);

	System.out.println("1: " + intA);
	for (int count = 1 ; count <= loopBoundry ; count++) {

		System.out.println(count + ": " + intB);
		int intC = intB;
		intB = intA + intB;
		intA = intC;

	}
	}

}