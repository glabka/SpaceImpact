package game;

import ships.AbstractShip;

public class Engine implements Observer{

	private Plane plane;
	
	public Engine() {
		plane = new Plane();
	}
	
	public Engine(Plane plane) {
		this.plane = plane;
	}
	
	public void printGame() {
		plane.printPlane();
	}

	@Override
	public void updateShipsPossition(AbstractShip ship, int verShift, int horShift) {
		int ver = plane.getShipsVer(ship);
		int hor = plane.getShipsHor(ship);
		plane.moveShip(ship, ver + verShift, hor + horShift);
		printGame();
	}
	
}
