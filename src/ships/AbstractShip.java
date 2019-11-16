package ships;

import game.Observer;

public abstract class AbstractShip {
	
	protected Observer obs;
	
    public AbstractShip(Observer obs) {
    	this.obs = obs;
    }
	public abstract int getMaxLives();
	
	public abstract int getCurrentLives();
	
	public abstract char[][] getLook();
	
	public abstract char[][] getExplosion();
	
	public abstract void destroy();
}
