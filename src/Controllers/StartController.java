package Controllers;

import Models.Game;
import Views.GameView;

public class StartController extends Controller {

	public StartController(Game game, GameView gameView) {
		super(game, gameView);
		gameView.introduction();
	}

}
