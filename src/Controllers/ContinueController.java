package Controllers;

import Models.Game;
import Views.GameView;

public class ContinueController extends Controller {

	public ContinueController(Game game, GameView gameView) {
		super(game, gameView);
		game.play();
	}

}
