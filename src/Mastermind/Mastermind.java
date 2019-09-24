package Mastermind;

public class Mastermind {

	private Game game;
	private GameView gameView;

	public Mastermind(Game game, GameView gameView) {
		this.game = game;
		this.gameView = gameView;
	}
	
	public static void main(String[] args) {
		new Mastermind(new Game(), new GameView());
	}
	
	public void play() {
		this.game.start();
	}
}