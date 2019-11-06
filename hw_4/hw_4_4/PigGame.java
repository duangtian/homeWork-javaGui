package hw_4_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PigGame {

	private ArrayList<Player> playerList;
	public static final int REPORT_ROUND = 100;
	private int turn;

	public PigGame(Player... players) {

		playerList = new ArrayList<Player>();
		if (players.length == 1) {
			throw new RuntimeException();
		} else {

			for (int i = 0 ; i < players.length ; i++) {
				playerList.add(players[i]);
			}
			this.turn = 0;
			reset();
		}
	}

	public int getOpponentMaxScore(Player me) {
		int maxScore = 0;
		for (Player p : playerList) {
			if (!p.getName().equals(me.getName()))
				if (maxScore < p.getScore()) {
					maxScore = p.getScore();
				}

		}

		return maxScore;
	}

	public void reset() {
		Random rand = new Random();
		for (int i = 0; i < playerList.size(); i++)
			playerList.get(i).resetScore();
		Collections.shuffle(playerList);
	}

	public void play() {
		
		System.out.println(playerList.get(turn).getName() + " start.");

		while (true) {

			System.out.println(playerList.get(turn).getName() + " score: " + playerList.get(turn).getScore());

			playerList.get(turn).play();

			if (playerList.get(turn).getScore() > REPORT_ROUND) {
				System.out.println(playerList.get(turn).getName() + " wins!");
				break;
			} else {
				turn++;
				if (turn > playerList.size() - 1) {
					turn = 0;
				}
			}

		}

	}

}
