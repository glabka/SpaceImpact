package ships;

import game.Observer;

public class BigShip extends AbstractShip {

	public BigShip(Observer obs) {
		super(obs);
	}

	private int maxLives = 3;
	private int currLives = 3;
//	private double speed = 1;
	private char[][] look = {
							{' ', ' ', '/','-', '-'},
							{' ', '/', '#','#', '#'},
							{'<', '#', '#','#', '#'},
							{' ', '\\', '#','#', '#'},
							{' ', ' ', '\\','-', '-'},
	};
	
	
	@Override
	public int getMaxLives() {
		return maxLives;
	}

	@Override
	public int getCurrentLives() {
		return currLives;
	}

//	@Override
//	public double getSpeed() {
//		return speed;
//	}

	@Override
	public char[][] getLook() {
		return look;
	}

	@Override
	public char[][] getExplosion() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public void run() {
    	running = true;
        while (running) {
            try {
                Thread.sleep((long) 500);
                obs.updateShipsPossition(this, 0, -1);                
            } catch (InterruptedException e) {
            	e.printStackTrace();
                running = false;
            }
        }
    }
	
}
