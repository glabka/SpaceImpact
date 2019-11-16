package game;

import ships.AbstractShip;

public class Plane {

	private int verMax = 27;
	private int horMax = 130;
	private AbstractShip[][] plane;
	
	
	public Plane() {
		plane = new AbstractShip[verMax][horMax];
	}
	
	public void addShip(AbstractShip ship, int ver, int hor) {
		char[][] shipsLook = ship.getLook();
		int verCurr;
		int horCurr;
		for (int i = 0; i < shipsLook.length; i++) {
			for (int j = 0; j < shipsLook[i].length; j++) {
				verCurr = ver + i;
				horCurr = hor + j;
				if(shipsLook[i][j] != ' ' && verCurr >= 0 &&verCurr < verMax && horCurr >= 0 && horCurr < horMax) {
					plane[verCurr][horCurr] = ship;
				}
			}
		}
	}
	
	public void moveShip(AbstractShip ship, int ver, int hor) {
		for (int i = 0; i < verMax; i++) {
			for (int j = 0; j < horMax; j++) {
				if(plane[i][j] == ship) {
					plane[i][j] = null;
				}
			}
		}
		addShip(ship, ver, hor);
	}
	
	public void printPlane() {
		for (int i = 0; i < plane.length; i++) {
			for (int j = 0; j < plane[i].length; j++) {
				if(plane[i][j] != null && plane[i][j].getCurrentLives() > 0) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
}
