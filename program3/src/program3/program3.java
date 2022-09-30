package program3;
import java.util.*;

public class program3{
	public static void main(String args[]) {
		
		Scanner n = new Scanner(System.in); //Scanning for user input
		System.out.print("What is your name? ");
		String name = n.nextLine(); //Reading user input and storing it in 'name'
		
		Scanner number1 = new Scanner(System.in); //Scanning for user input
		System.out.print("Give a number from 0 to 100 ");
		int number = number1.nextInt(); //Reading user input and storing user input in 'number'
		
		while (!(number > 0 && number < 100)) //Checking if the number is not between 0 and 100. If it is not, ask the user for the number again
		{ 
			Scanner number2 = new Scanner(System.in); //Scanning for user input
			System.out.print(name + ", pleace entet a number between 0 and 100 ");
			number = number2.nextInt(); //Reading user input and storing user input in 'number'
			
		}
		
		System.out.println("Thank you for your input, " + name); //Printing thank you, user
		System.out.println("Starting the countdown...");
		
		for (int i = number; i >= 0; i-- ) //The countdown loop start at a given number and prints it until the number is 0
		{
			
			System.out.println("####################");
			System.out.println("#######  " + i +"  ########");
			System.out.println("####################");
			System.out.println();
		}
	}

}

