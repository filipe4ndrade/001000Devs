package locadora;

import javax.xml.crypto.Data;

public class CarRental {

	private Data start;
	private Data finish;
	
	public CarRental() {
		
	}

	public CarRental(Data start, Data finish) {
		this.start = start;
		this.finish = finish;
	}

	public Data getStart() {
		return start;
	}

	public void setStart(Data start) {
		this.start = start;
	}

	public Data getFinish() {
		return finish;
	}

	public void setFinish(Data finish) {
		this.finish = finish;
	}

	
}
