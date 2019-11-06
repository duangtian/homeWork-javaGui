package hw_4_4;

public class PigGameTest {

	public static void main(String[] args) {
		AggressiveAutoPlayer player = new AggressiveAutoPlayer("A-Comp");
		PigGame game = new PigGame(player, new BasicAutoPlayer("B-Comp"));
		player.setGame(game);
		game.play();
	}

}

