
import Controllers.Controller;
import Controllers.StartController;
import Controllers.ContinueController;
import Controllers.EndController;
import Models.Game;
import Views.GameView;

public class Mastermind {
	private Game game;
	private GameView gameView;
	private Controller controller;
	private StartController startController;
	private ContinueController continueController;
	private EndController endController;

	public Mastermind(Game game, GameView gameView) {
		this.controller = new Controller(game, gameView);
		this.startController = new StartController(game, gameView);
		this.continueController = new ContinueController(game, gameView);
		this.endController = new EndController(game, gameView);
		if (this.controller.restart()) {
			new Mastermind(new Game(), new GameView());
		}
}

	public static void main(String[] args) {
		new Mastermind(new Game(), new GameView());
	}

}