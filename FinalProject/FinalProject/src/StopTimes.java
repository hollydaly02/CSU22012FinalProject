import java.time.LocalTime;

public class StopTimes {
	// trip_id,arrival_time,departure_time,stop_id,stop_sequence,stop_headsign,pickup_type,drop_off_type,shape_dist_traveled
	int trip_id;
	LocalTime arrival_time;
	LocalTime departure_time;
	String arrivalTimeString;
	String departureTimeString;
	int stop_id;
	int stop_sequence;
	int stop_headsign;
	int pickup_type;
	int drop_off_type;
	double shape_dist_traveled;
	
	public StopTimes(String inputLine) {
		String[] inputs = inputLine.split(",");
		
		try {
			this.trip_id = Integer.parseInt(inputs[0]);
		}
		catch(Exception e) {
			this.trip_id = -1;
		}
		
		try {
			this.arrival_time = LocalTime.parse(inputs[1]);
		}
		catch(Exception e) {
			this.arrival_time = null;
		}
		
		try {
			this.departure_time = LocalTime.parse(inputs[2]);
		}
		catch(Exception e) {
			this.departure_time = null;
		}
		
		try {
			this.arrivalTimeString = inputs[1];
		} catch (Exception e) {

		}

		try {
			this.departureTimeString = inputs[2];
		} catch (Exception e) {

		}
		
		try {
			this.stop_id = Integer.parseInt(inputs[3]);
		}
		catch(Exception e) {
			this.stop_id = -1;
		}
		
		try {
			this.stop_sequence = Integer.parseInt(inputs[4]);
		}
		catch(Exception e) {
			this.stop_sequence = -1;
		}
		
		try {
			this.stop_headsign = Integer.parseInt(inputs[5]);
		}
		catch(Exception e) {
			this.stop_headsign = -1;
		}
		
		try {
			this.pickup_type = Integer.parseInt(inputs[6]);
		}
		catch(Exception e) {
			this.pickup_type = -1;
		}
		
		try {
			this.drop_off_type = Integer.parseInt(inputs[7]);
		}
		catch(Exception e) {
			this.drop_off_type = -1;
		}
		
		try {
			this.shape_dist_traveled = Double.parseDouble(inputs[8]);
		}
		catch(Exception e) {
			this.shape_dist_traveled = -1;
		}
	}
	
	public String getTripID() {
		if (this.trip_id == -1) {
			return "invalid";
		}
		else return Integer.toString(this.trip_id);
	}
	
	public LocalTime getArrivalTime() {
		return this.arrival_time;
	}
	
	public LocalTime getDepartureTime() {
		return this.departure_time;
	}
	
	public String getArrivalTimeString() {
		return this.arrivalTimeString;
	}
	
	public String getDepartureTimeString() {
		return this.departureTimeString;
	}
	
	
	public String getStopID() {
		if (this.stop_id == -1) {
			return "invalid";
		}
		else return Integer.toString(this.stop_id);
	}
	
	public String getStopSequence() {
		if (this.stop_sequence == -1) {
			return "invalid";
		}
		else return Integer.toString(this.stop_sequence);
	}
	
	public String getStopHeadsign() {
		if (this.stop_headsign == -1) {
			return "invalid";
		}
		else return Integer.toString(this.stop_headsign);
	}
	
	public String getPickupType() {
		if (this.pickup_type == -1) {
			return "invalid";
		}
		else return Integer.toString(this.pickup_type);
	}
	
	public String getDropOffType() {
		if (this.drop_off_type == -1) {
			return "invalid";
		}
		else return Integer.toString(this.drop_off_type);
	}
	
	public String getShapeDistTraveled() {
		if (this.shape_dist_traveled == -1) {
			return "invalid";
		}
		else return Double.toString(this.shape_dist_traveled);
	}

}
