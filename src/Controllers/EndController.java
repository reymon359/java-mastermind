package Controllers;

import Models.Game;
import Views.GameView;

public class EndController extends Controller {

	public EndController(Game game, GameView gameView) {
		super(game, gameView);
		game.endGame();
		gameView.displaySolution(game.getSecretCombination().getSecretCode());
		
	}

}
