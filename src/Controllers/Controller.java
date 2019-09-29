package Controllers;

import Models.Game;
import Views.GameView;

public class Controller {
	private Game game;
	private GameView gameView;

	public Controller(Game game, GameView gameView) {
		this.game = game;
		this.gameView = gameView;
	}

	public boolean restart() {
		if (gameView.playAgain()) {
			return true;
		} else {
			gameView.endGame();
		}
		return false;
	}

}
