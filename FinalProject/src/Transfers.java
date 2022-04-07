
public class Transfers {
	// from_stop_id,to_stop_id,transfer_type,min_transfer_time
	int from_stop_id;
	int to_stop_id;
	int transfer_type;
	int min_transfer_time;
	
	public Transfers(String inputLine) {
		String[] inputs = inputLine.split(",");
		
		try {
			this.from_stop_id = Integer.parseInt(inputs[0]);
		}
		catch(Exception e) {
			this.from_stop_id = -1;
		}
		
		try {
			this.to_stop_id = Integer.parseInt(inputs[1]);
		}
		catch(Exception e) {
			this.to_stop_id = -1;
		}
		
		try {
			this.transfer_type = Integer.parseInt(inputs[2]);
		}
		catch(Exception e) {
			this.transfer_type = -1;
		}
		
		try {
			this.min_transfer_time = Integer.parseInt(inputs[3]);
		}
		catch(Exception e) {
			this.min_transfer_time = -1;
		}
	}

	public int getFromStopID() {
		return this.from_stop_id;
	}
	
	public int getToStopID() {
		return this.to_stop_id;
	}
	
	public int getTransferType() {
		return this.transfer_type;
	}
	
	public int getMinTransferTime() {
		return this.min_transfer_time;
	}
}
