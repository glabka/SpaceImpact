package game;

import exceptions.ShipNotFoundException;
import ships.AbstractEnemyShip;
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
				if (shipsLook[i][j] != ' ' && verCurr >= 0 && verCurr < verMax && horCurr >= 0 && horCurr < horMax) {
					if(plane[verCurr][horCurr] == null) {
						plane[verCurr][horCurr] = ship;
					} else {
						plane[verCurr][horCurr].destroy();
					}
				}
			}
		}
		if(ship instanceof AbstractEnemyShip) {
			AbstractEnemyShip enemyShip = (AbstractEnemyShip) ship;
			if (!enemyShip.isShipRunning()) {
				new Thread(enemyShip).start();
			}
		}

	}

	public void moveShip(AbstractShip ship, int ver, int hor) {
		for (int i = 0; i < verMax; i++) {
			for (int j = 0; j < horMax; j++) {
				if (plane[i][j] == ship) {
					plane[i][j] = null;
				}
			}
		}

		addShip(ship, ver, hor);

		// checking if ship is on plane - if not -> terminating the ship
		if (!isShipOnPlane(ship)) {
			if(ship instanceof AbstractEnemyShip) {
				AbstractEnemyShip enemyShip = (AbstractEnemyShip) ship;
				enemyShip.terminate();
			}
		}
	}

	private boolean isShipOnPlane(AbstractShip ship) {
		for (int i = 0; i < verMax; i++) {
			for (int j = 0; j < horMax; j++) {
				if (plane[i][j] == ship) {
					return true;
				}
			}
		}
		return false;
	}

	public int getShipsVer(AbstractShip ship) {
		boolean shipFound = false;
		int mostLeftIndex = verMax;
		for (int i = 0; i < verMax; i++) {
			for (int j = 0; j < horMax; j++) {
				if (plane[i][j] == ship) {
					shipFound = true;
					if (mostLeftIndex > i) {
						mostLeftIndex = i;
					}
				}
			}
		}
		if (!shipFound) {
			throw new ShipNotFoundException("ship " + ship + " was not found.");
		}
		return mostLeftIndex;
	}

	public int getShipsHor(AbstractShip ship) {
		boolean shipFound = false;
		int mostTopIndex = horMax;
		for (int i = 0; i < verMax; i++) {
			for (int j = 0; j < horMax; j++) {
				if (plane[i][j] == ship) {
					shipFound = true;
					if (mostTopIndex > j) {
						mostTopIndex = j;
					}
				}
			}
		}
		if (!shipFound) {
			throw new ShipNotFoundException("ship " + ship + "was not found.");
		}
		return mostTopIndex;
	}

	public synchronized void printPlane() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for (int i = 0; i < plane.length; i++) {
			for (int j = 0; j < plane[i].length; j++) {
				if (plane[i][j] != null && plane[i][j].getCurrentLives() > 0) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("....................................................................");
	}

}
