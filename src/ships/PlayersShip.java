package ships;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Observer;

public class PlayersShip extends AbstractShip implements KeyListener {

	public PlayersShip(Observer obs) {
		super(obs);
	}

	private int maxLives = 5;
	private int currLives = 5;
	private char[][] look = { { '#', ' ', ' ', ' ' }, { '#', '#', ' ', ' ' }, { '#', '#', '#', '#' },
			{ '#', '#', ' ', ' ' }, { '#', ' ', ' ', ' ' } };

	private char[][] explosion = { { 'O', ' ', ' ', ' ' }, { 'O', 'O', ' ', ' ' }, { 'O', 'O', 'O', 'O' },
			{ 'O', 'O', ' ', ' ' }, { 'O', ' ', ' ', ' ' } };

	@Override
	public int getMaxLives() {
		return maxLives;
	}

	@Override
	public int getCurrentLives() {
		return currLives;
	}

	@Override
	public char[][] getLook() {
		return look;
	}

	@Override
	public char[][] getExplosion() {
		return explosion;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			obs.updateShipsPossition(this, -1, 0);
			break;
		case KeyEvent.VK_DOWN:
			obs.updateShipsPossition(this, 1, 0);
			break;
		case KeyEvent.VK_LEFT:
			obs.updateShipsPossition(this, 0, -1);
			break;
		case KeyEvent.VK_RIGHT:
			obs.updateShipsPossition(this, 0, 1);
			break;
		}
	}

}
