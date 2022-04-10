import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrivalTime {
	//public static ArrayList<StopTimes> stopTimes = new ArrayList<StopTimes>();
	String[] details;
	
	public static ArrayList<StopTimes> stopTimesList() {
		ArrayList<StopTimes> stopTimes = new ArrayList<StopTimes>();
		try {
			File stopTimesInputFile = new File("stops_times.txt");
			Scanner stopTimesScanner = new Scanner(stopTimesInputFile);
			stopTimesScanner.nextLine();
			while (stopTimesScanner.hasNextLine()) {  
				String stopTimesData = stopTimesScanner.nextLine();
				stopTimes.add(new StopTimes(stopTimesData));
			}
			stopTimesScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("stop_times.txt not found");
		}
		return stopTimes;
	}
	
	public static String[] getStopTimesData(String name) {
		String[] stopTimesData = new String[8];
		ArrayList<StopTimes> stopTimes = stopTimesList();
		
		for (int i=0; i<stopTimes.size(); i++) {
			
			stopTimesData[0] = stopTimes.get(i).getTripID();
			stopTimesData[1] = stopTimes.get(i).getArrivalTimeString();
			stopTimesData[2] = stopTimes.get(i).getDepartureTimeString();
			stopTimesData[3] = stopTimes.get(i).getStopID();
			stopTimesData[4] = stopTimes.get(i).getStopSequence();
			stopTimesData[5] = stopTimes.get(i).getStopHeadsign();
			stopTimesData[6] = stopTimes.get(i).getPickupType();
			stopTimesData[7] = stopTimes.get(i).getDropOffType();
		}
		return stopTimesData;
	}
	
	/*
	public static String[] printStopTimesData(String[] stopTimesData) {
		String[] printString = new String[8];
		
		printString[0] = "TripID: " + stopTimesData[0];
		printString[1] = "ArrivalTime: " + stopTimesData[1];
		printString[2] = "DepartureTime: " + stopTimesData[2];
		printString[3] = "StopID: " + stopTimesData[3];
		printString[4] = "StopSequence: " + stopTimesData[4];
		printString[5] = "StopHeadsign: " + stopTimesData[5];
		printString[6] = "PickupType: " + stopTimesData[6];
		printString[7] = "DropOffType: " + stopTimesData[7];
		
		return printString;
	}
	*/
	
	public static String[] tripDetails(String input) {
		String[] times = new String[2];
		ArrayList<StopTimes> stopTimesList = stopTimesList();
		
		times[0] = input;
		
		for(int i=0; i < stopTimesList.size(); i++) {
			times[1] = stopTimesList.get(i).getArrivalTimeString();
			if(times[1]==times[0]) {
				String [] info = 
			}
		}
		return null;
	}
}
