package hotelAutomation;

public class AC {
	int status;
	int power = 10;
	

	void setStatus(int status) {
		this.status = status;
	}

	public void display() {
		if(status == 0) {
			System.out.println("AC: OFF");
		}
		else if(status == 1) {
			System.out.println("AC: ON");
		}
		else {
			System.out.println("Invalid Input!");
			
		}
		
	}
	}



