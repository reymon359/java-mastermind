package Mastermind;

public class Mastermind {

	private Game game;
	private GameView gameView;

	public Mastermind(Game game, GameView gameView) {
		this.game = game;
		this.gameView = gameView;
	}

	public static void main(String[] args) {
		new Mastermind(new Game(), new GameView()).start();

	}

	public void start() {
		this.gameView.introduction();
		this.game.play();
		this.end();
	}

	public void end() {
		this.game.endGame();
		this.gameView.displaySolution(this.game.getSecretCombination().getSecretCode());
		this.gameView.playAgain();
		System.exit(0);
	}

}