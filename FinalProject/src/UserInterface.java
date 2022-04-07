import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	
	public static ArrayList<Stops> stops = new ArrayList<Stops>();
	public static ArrayList<StopTimes> stopTimes = new ArrayList<StopTimes>();
	public static ArrayList<Transfers> transfers = new ArrayList<Transfers>();

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		boolean exitScanner = false;
		while (exitScanner == false) {
			System.out.println("\nPlease chose which feature you would like to do by entering the number.");
			System.out.println("1: Find the shortest path between 2 bus stops");
			System.out.println("2: Search for a bus stop.");
			System.out.println("3: Search for all trips with a given arrival time.");
			System.out.println("If you would like to exit, type exit.");
			System.out.println("Type your choice here: ");
			
			if (inputScanner.hasNextLine()) {
				String inputFunction = inputScanner.nextLine();

				if (inputFunction.equals("exit"))// Exit the Program
				{
					exitScanner = true;
					System.out.println("Exiting program");
					System.exit(0);
					//break;
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
	
	public static void stopsList() {
		try {
			File stopsInputFile = new File("stops.txt");
			Scanner stopsScanner = new Scanner(stopsInputFile);
			stopsScanner.nextLine();
			while (stopsScanner.hasNextLine()) {  
				String stopsData = stopsScanner.nextLine();
				stops.add(new Stops(stopsData));
			}
			stopsScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("stops.txt not found");
		}
	}
	
	public static void stopTimesList() {
		try {
			File stopTimesInputFile = new File("stops_times.txt");
			Scanner stopTimesScanner = new Scanner(stopTimesInputFile);
			stopTimesScanner.nextLine();
			while (stopTimesScanner.hasNextLine()) {  
				String stopsData = stopTimesScanner.nextLine();
				stops.add(new Stops(stopsData));
			}
			stopTimesScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("stop_times.txt not found");
		}
	}
	
	public static void transfersList() {
		try {
			File transfersInputFile = new File("transfers.txt");
			Scanner transfersScanner = new Scanner(transfersInputFile);
			transfersScanner.nextLine();
			while (transfersScanner.hasNextLine()) {  
				String stopsData = transfersScanner.nextLine();
				stops.add(new Stops(stopsData));
			}
			transfersScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("transfers.txt not found");
		}
	}
}

