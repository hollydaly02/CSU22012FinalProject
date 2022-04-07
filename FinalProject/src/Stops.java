
public class Stops {
	// stop_id,stop_code,stop_name,stop_desc,stop_lat,stop_lon,zone_id,stop_url,location_type,parent_station
	int stop_id;
	int stop_code;
	String stop_name;
	String stop_desc;
	double stop_lat;
	double stop_lon;
	String zone_id;
	String stopr_url;
	int location_type;
	int parent_station;
	
	public Stops(String inputLine) {
		String[] inputs = inputLine.split(",");
		
		// error if stop_id isn't integer
		try {
			this.stop_id = Integer.parseInt(inputs[0]);
		}
		catch(Exception e) {
			this.stop_id = -1;
		}
		
		// error if stop_id isn't integer
		try {
			this.stop_code = Integer.parseInt(inputs[1]);
		}
		catch(Exception e) {
			this.stop_code = -1;
		}
		
		// stop_name
		this.stop_name = moveKeywords(inputs[2]);
		
		// stop_desc
		this.stop_desc = inputs[3];

		// error if stop_lat isn't double
		try {
			this.stop_lat = Double.parseDouble(inputs[4]);
		}
		catch(Exception e) {
			this.stop_lat = -1;
		}
		
		// error if stop_id isn't integer
		try {
			this.stop_lon = Double.parseDouble(inputs[5]);
		}
		catch(Exception e) {
			this.stop_lon = -1;
		}

		// zone_id
		this.zone_id = inputs[6];
	}
	
	public String moveKeywords(String stopName) {
		// move 'FLAGSTOP'
		if (stopName.charAt(0) == 'F' && stopName.charAt(1) == 'L' && stopName.charAt(2) == 'A' && stopName.charAt(3) == 'G'
				&& stopName.charAt(4) == 'S' && stopName.charAt(5) == 'T' && stopName.charAt(6) == 'O' && stopName.charAt(7) == 'P'
				&& stopName.charAt(8) == ' ') {
			// FLAGSTOP can be followed by WB, NB, SB, EB, 
			stopName = stopName.substring(9) + " FLAGSTOP";
		}
		
		// move 'WB' to end
		if (stopName.charAt(0) == 'W' && stopName.charAt(1) == 'B' && stopName.charAt(2) == ' ') {
			stopName = stopName.substring(3) + "WB";
			return stopName;
		}
		
		// move 'NB' to end
		else if (stopName.charAt(0) == 'N' && stopName.charAt(1) == 'B' && stopName.charAt(2) == ' ') {
			stopName = stopName.substring(3) + "NB";
			return stopName;
		}
		
		// move 'SB' to end
		else if (stopName.charAt(0) == 'S' && stopName.charAt(1) == 'B' && stopName.charAt(2) == ' ') {
			stopName = stopName.substring(3) + "SB";
			return stopName;
		}
		
		// move 'EB' to end
		else if (stopName.charAt(0) == 'E' && stopName.charAt(1) == 'B' && stopName.charAt(2) == ' ') {
			stopName = stopName.substring(3) + "EB";
			return stopName;
		}
		
		else {
			return stopName;
		}
		
	}
	
	public int getStopID() {
		return this.stop_id;
	}
	
	public int getStopCode() {
		return this.stop_code;
	}
	
	public String getStopName() {
		return stop_name;
	}
	
	public String getStopDesc() {
		return stop_desc;
	}
	
	public double getStopLat() {
		return this.stop_lat;
	}
	
	public double getStopLon() {
		return this.stop_lon;
	}
}
