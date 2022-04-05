import java.util.Scanner;

import edu.princeton.cs.algs4.DijkstraSP;

public class main {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		boolean exit = false;
		while (exit == false) {
			System.out.println("Please chose which feature you would like to do by entering the number. If you would like to exit, type exit.");
			if (inputScanner.hasNextLine()) {
				String inputFunction = inputScanner.nextLine();

				if (inputFunction.equals("exit"))// Exit the Program
				{
					exit = true;
					System.out.println("Program is now exiting.");
					System.exit(0);
				}
			}
		}
		//System.out.println("hello");
	}
}

