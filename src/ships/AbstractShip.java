package ships;

public abstract class AbstractShip {

	public abstract int getMaxLives();
	
	public abstract int getCurrentLives();
	
	public abstract double getSpeed();
	
	public abstract char[][] getLook();
	
	public abstract char[][] getExplosion();
	
}
