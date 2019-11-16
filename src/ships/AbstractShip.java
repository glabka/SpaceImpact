package ships;

import game.Observer;

public abstract class AbstractShip implements Runnable{

	
	protected Observer obs;
    protected volatile boolean running = false;
    
    public AbstractShip(Observer obs) {
    	this.obs = obs;
    }

    public void terminate() {
        running = false;
    }
    
    public boolean isShipRunning() {
    	return running;
    }
	
	public abstract int getMaxLives();
	
	public abstract int getCurrentLives();
	
//	public abstract double getSpeed();
	
	public abstract char[][] getLook();
	
	public abstract char[][] getExplosion();
	
}
