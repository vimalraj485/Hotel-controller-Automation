package hotelAutomation;

import java.util.ArrayList;

import java.util.Scanner;

public class Controller {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*****WELCOME*****");
		System.out.print("Enter the number of floors:");
		int noOfFloors = sc.nextInt();
		System.out.print("Enter the number of maincorridor Per floor: ");
		int noOfmainCorridor = sc.nextInt();
		System.out.print("Enter the number of subcorridor per Floor:");
		int noOfsubCorridor = sc.nextInt();
		
		ArrayList<mainCorridors>mcorridors = new ArrayList<>();
		ArrayList<subCorridors>scorridors = new ArrayList<>();
		ArrayList<Floors>floor = new ArrayList<>();	
		
		for(int i = 0; i<noOfsubCorridor;i++) {
			Light light = new Light();
			AC ac = new AC();
			
			subCorridors scorridor = new subCorridors(light,ac);
			light.setStatus(0);
			ac.setStatus(1);
			scorridors.add(scorridor);
		}
		for(int j=0; j<noOfmainCorridor;j++) {
				Light light = new Light();
				AC ac = new AC();
				mainCorridors mcorridor = new mainCorridors(light,ac);
				light.setStatus(1);
				
				ac.setStatus(1);
				mcorridors.add(mcorridor);
			}
						
		for(int m = 0; m<noOfFloors; m++) {
				Floors floors = new Floors(mcorridors,scorridors);
				floor.add(floors);
		
			}

		Hotel hotel = new Hotel(floor);
		hotel.display();

		boolean execute = true;
		while(execute) {
		System.out.println("-------MENU------");
		
		System.out.println("1.Movement");
		System.out.println("2.No Movement for a minute");
		System.out.println("3.Exit");
		System.out.print("Enter the Choice:");

		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:{
			
			System.out.print("Enter the Floor:");
			int fNo = sc.nextInt();
			System.out.print("Enter the SubFloor:");
			int sNo = sc.nextInt();
			int floorNo = fNo-1;
			int subCorridorNo = sNo-1;
			
		
		
			floor.get(floorNo).subcorridors.get(subCorridorNo).light.setStatus(1);
			floor.get(floorNo).subcorridors.get(subCorridorNo).ac.setStatus(1);
			
			if(floor.get(floorNo).subcorridors.size()>1) {

			if(floor.get(floorNo).totalPowerConsumed()>floor.get(floorNo).maxCurrent()) {
				
			if(subCorridorNo==0) {
			
			floor.get(floorNo).subcorridors.get(subCorridorNo+1).ac.setStatus(0);
			}
			else  {
			floor.get(floorNo).subcorridors.get(subCorridorNo-1).ac.setStatus(0);
			}
			}
	
			}
			hotel.display();
			
			break;
		}
		case 2:{
			System.out.print("Enter the Floor:");
			int fNo = sc.nextInt();
			System.out.print("Enter the SubFloor:");
			int sNo = sc.nextInt();
			int floorNo = fNo-1;
			int subCorridorNo = sNo-1;
			floor.get(floorNo).subcorridors.get(subCorridorNo).light.setStatus(0);
			floor.get(floorNo).subcorridors.get(subCorridorNo).ac.setStatus(1);
			if(floor.get(floorNo).totalPowerConsumed()<floor.get(floorNo).maxCurrent()) {
		
			if(subCorridorNo==0) {
			
			floor.get(floorNo).subcorridors.get(subCorridorNo+1).ac.setStatus(1);
				}
			
			else {
					floor.get(floorNo).subcorridors.get(subCorridorNo-1).ac.setStatus(1);
			}
					
			}
			
			
		hotel.display();
		break;
		}
		case 3:{
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*****ThankYou*****");
		
		execute = false;
		
		break;
		}
		default:{
			System.out.println("Invalid input");
			
		}
	}
		
	
}
	
}
}

	

	
		

