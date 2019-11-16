package ships;

import game.Observer;

public abstract class AbstractEnemyShip extends AbstractShip implements Runnable{

	
    public AbstractEnemyShip(Observer obs) {
		super(obs);
	}

	protected volatile boolean running = false;

    public void terminate() {
        running = false;
    }
    
    public boolean isShipRunning() {
    	return running;
    }
	

	
}
