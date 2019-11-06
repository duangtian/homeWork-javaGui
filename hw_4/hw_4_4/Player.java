package hw_4_4;

import java.util.Random;
import java.util.Scanner;

public class Player {
	private String name;
	private int score;
	private Random dice;

	public Player(String name) {
		this.name = name;
		dice = new Random();
		score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void resetScore() {
		this.score = 0;
	}

	public void addScore(int score) {
		this.score += score;
	}

	public int getDiceValue() {
		int Dice;
		return Dice = dice.nextInt(6) + 1;
	}

	public void play() {

		int currentsSum = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			int dice = getDiceValue();

			if (currentsSum == 0) {
				currentsSum = dice;

				System.out.printf("- dice: %d.", dice);

				if (dice == 1)
					break;
				else {
					currentsSum += dice;
					System.out.printf("Current sum=%d.\n", dice);
				}
			} else {
				System.out.printf(" -Row dice (1) or Pass Turn (2)?");
				int passTurn = scan.nextInt();
				if (passTurn == 2) {
					addScore(currentsSum);
					System.out.printf("- Score %d. Pass turn!\n", score);
					break;
				} else {
					if (dice == 1) {
						System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, 0);
						break;
					} else {
						currentsSum += dice;
						System.out.printf("Continue to row and get %d. Current sum=%d.\n", dice, currentsSum);
					}
				}
			}
		}
	}
}
