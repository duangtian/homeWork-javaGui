package hw_4_4;

public class AggressiveAutoPlayer extends Player {

	private PigGame game;

	public AggressiveAutoPlayer(String name) {
		super(name);
		game = new PigGame();
	}

	public void setGame(PigGame game) {
		this.game = game;
	}

	@Override
	public void play() {
		int currentsSum = 0;

		while (true) {

			int dice = getDiceValue();
			Player p = new AggressiveAutoPlayer(getName());

			if (currentsSum == 0) {
				currentsSum += dice;
				p.addScore(currentsSum);

				System.out.printf("- dice: %d.\n", dice);
				if(dice == 1){
					break;
				}

			} else {
				if (dice == 1) {
					p.resetScore();
					System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, 0);
					break;
				} else {
					currentsSum += dice;
					p.addScore(currentsSum);
					System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, currentsSum);
				}

			}
			if (game.getOpponentMaxScore(p) >= 71) {
				currentsSum += dice;
				System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, currentsSum);

				if (getScore() + currentsSum >= 100) {
					addScore(currentsSum);
					System.out.printf("- Score %d. Pass turn!\n", getScore());
					break;

				}
			} else if (currentsSum > 21 + Math.round((game.getOpponentMaxScore(p) - getScore()) / 8.0)) {
				addScore(currentsSum);
				System.out.printf("- Score %d. Pass turn!\n", getScore());
				break;

			}

		}

	}


}
