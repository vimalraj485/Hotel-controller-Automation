package hotelAutomation;

import java.util.ArrayList;

public class Floors {
	ArrayList<mainCorridors> maincorridors;
	ArrayList<subCorridors> subcorridors;
	
	
	public Floors(ArrayList<mainCorridors> mcorridors, ArrayList<subCorridors> scorridors ) {
		
		this.maincorridors = mcorridors;
		this.subcorridors = scorridors;
	}

	int totalPowerConsumed() {
		
		int mainPower = 0;
		int subPower = 0;
		for(mainCorridors mc : maincorridors) {
			mainPower += mc.powerCalculation();
		}
			
		for(subCorridors sc : subcorridors) {
		subPower += sc.powerCalculation();
				
			}
		
		int totalPower = mainPower + subPower;
		return totalPower;
	}
	
	int maxCurrent() {
		int powerforMaincorridor = maincorridors.size()*15;
		int powerforSubcorridor = subcorridors.size() *10;
		int maxCurrent = powerforMaincorridor + powerforSubcorridor;
		return maxCurrent;
	}

	public void display() {
		

		for(mainCorridors mc : maincorridors) {
			int indexNO = maincorridors.indexOf(mc);
			int num = indexNO+1;
			
			
			System.out.println("Maincorridor "+num);
			mc.display();
		}
		for(subCorridors sc : subcorridors) {
			int indexNO = subcorridors.indexOf(sc);
			int num = indexNO+1;
			
			System.out.println("Subcorridor "+num);
			sc.display();
		}
	}

}
