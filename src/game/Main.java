package game;

import ships.AbstractShip;
import ships.BigShip;

public class Main {

	public static void main(String args[]) {
//		int rowMax = 27;
//		int columnMax = 130;
//		for (int i = 0; i < rowMax; i++) {
//			for (int j = 0; j < columnMax; j++) {
//				if(j == columnMax - 1) {
//					System.out.println(".");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			if(i == rowMax -1) {
//				System.out.print("....................................");
//			} 
//		}
		
//		Engine eng = new Engine();
//		Plane plane = new Plane();
//		AbstractShip ship1 = new BigShip(eng);
//		plane.addShip(ship1, 0, 0);
//		AbstractShip ship2 = new BigShip(eng);
//		plane.addShip(ship2, 20, 125);
//		plane.printPlane();
//		plane.moveShip(ship2, 20, 124);
//		plane.printPlane();
		
		
		Plane plane = new Plane();
		Engine eng = new Engine(plane);
		AbstractShip ship1 = new BigShip(eng);
		plane.addShip(ship1, 0, 120);
		AbstractShip ship2 = new BigShip(eng);
		plane.addShip(ship2, 20, 125);
		
	}
	
}
