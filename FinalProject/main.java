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
					//System.out.println("Exiting program");
					//System.exit(0);
					break;
				}
				
				if (inputFunction.equals("1"))
				{
					System.out.println("Enter Stop ID for starting stop here: ");
					String startStop = inputScanner.nextLine();
					System.out.println("Enter Stop ID for finishing stop here: ");
					String finalStop = inputScanner.nextLine();
					System.out.printf("start: " + startStop + " finish: " + finalStop);
				}
				if (inputFunction.equals("2")) 
				{
					System.out.print("Enter the stop name you are looking for here: ");
					String stopName = inputScanner.nextLine();
					System.out.printf("name:" + stopName);
				}
				if (inputFunction.equals("3")) 
				{
					System.out.print("Enter the arrival time here in the format hh:mm:ss: ");
					String arrivalTime = inputScanner.nextLine();
					System.out.printf("time:" + arrivalTime);
				}
			}
		}
		inputScanner.close();
		System.out.println("Program has now exited");
	}
}

