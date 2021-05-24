package hotelAutomation;

public class Light {
	int status;
	int power = 5;

	void setStatus(int status) {
		this.status=status;
	}

	public void display() {
		if(status == 0) {
			System.out.println("Light: OFF");
		}
		else if(status == 1) {
			System.out.println("Light: ON");
		}
		else {
			System.out.println("Invalid Input!");
			
		}
		
	}
	
}
