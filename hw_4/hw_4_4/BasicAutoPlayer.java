package hw_4_4;

public class BasicAutoPlayer extends Player {

	public BasicAutoPlayer(String name) {
		super(name);
	}

	@Override
	public void play() {
		int currentsSum = 0;

		for (int i = 0; i < 5; i++) {
			int dice = getDiceValue();

			if (i == 0) {
				currentsSum += dice;
				System.out.printf("- dice: %d.\n", dice);
				if (dice == 1) {
					break;
				} 
			} else {
				if (dice == 1) {
					System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, 0);
					break;
				} else {
					currentsSum += dice;
					System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, currentsSum);
				}
			}

			if (currentsSum > 20 || i == 4) {
				addScore(currentsSum);
				System.out.printf("- Score %d. Pass turn!\n", getScore());
				break;
			}

		}
	}

}
