package hotelAutomation;

import java.util.ArrayList;

public class Hotel {
	ArrayList<Floors>floors;

	public Hotel(ArrayList<Floors>floors) {
		this.floors = floors;	
	}
	public void display() {
		for(Floors floor: floors) {
			int indexNO = floors.indexOf(floor);
			int num = indexNO+1;
			System.out.println("Floor "+num);
			floor.display();
		}
	}

}

	