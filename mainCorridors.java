package hotelAutomation;

public class mainCorridors {
	Light light;
	AC ac;

	
	//Constructor
	public mainCorridors(Light light, AC ac){
		this.light = light;
		this.ac = ac;

	}
	
	public int powerCalculation() {
		int totalPowerConsumed = 0;
		if(light.status == 1) {
			totalPowerConsumed +=5;	
		}
		if( ac.status == 1) {
			totalPowerConsumed +=10;
		}

		return totalPowerConsumed;
		
	}
	
	//Display function	
	public void display() {
		
		light.display();
		ac.display();
		
		
	}
	

}