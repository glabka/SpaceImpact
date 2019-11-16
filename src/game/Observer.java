package game;

import ships.AbstractShip;

public interface Observer {
	void updateShipsPossition(AbstractShip ship, int verShift, int horShift);
}
