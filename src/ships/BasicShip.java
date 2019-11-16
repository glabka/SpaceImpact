package ships;

public class BasicShip extends AbstractShip {

	private int maxLives = 1;
	private int currLives = 1;
	private double speed = 1;
	private char[][] look = {{'<', '='}};
	
	
	@Override
	public int getMaxLives() {
		return maxLives;
	}

	@Override
	public int getCurrentLives() {
		return currLives;
	}

	@Override
	public double getSpeed() {
		return speed;
	}

	@Override
	public char[][] getLook() {
		return look;
	}

	@Override
	public char[][] getExplosion() {
		// TODO Auto-generated method stub
		return null;
	}

}
