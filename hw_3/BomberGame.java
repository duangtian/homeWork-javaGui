package hw_3;

import java.util.Random;
import java.util.Scanner;

public class BomberGame {
	private int playerLife = 3;
	private int comLife = 3;
	private GridData[][] board;

	public BomberGame(int boardSize, int bombNo) {
		if (boardSize < 3) {
			boardSize = 3;
		}
		if (bombNo < 5) {
			bombNo = 5;
		}
		board = new GridData[boardSize + 2][boardSize + 2];
		for (int i = 0; i <= boardSize + 1; i++) {
			for (int j = 0; j <= boardSize + 1; j++)
				board[i][j] = new GridData();
		}
		Random rn;
		while (bombNo > 0) {
			rn = new Random();
			int i = rn.nextInt(boardSize);
			int j = rn.nextInt(boardSize);

			if (!board[i][j].isHasBomb()) {
				board[i][j].setHasBomb(true);
				bombNo--;
			}
		}

		//printAllBomb();

	}

	public void printAllBomb() {
		for (int i = 0; i <= Math.sqrt(board.length) + 1; i++) {
			for (int j = 0; j <= Math.sqrt(board.length) + 1; j++) {
				if (board[i][j].isHasBomb()) {
					System.out.print("b");
				} else
					System.out.print("-");
			}
			System.out.print("\n");
		}
	}

	public void printBoard() {
		for (int i = 0; i <= Math.sqrt(board.length) + 1; i++) {
			for (int j = 0; j <= Math.sqrt(board.length) + 1; j++) {
				if (board[i][j].isOpen() && board[i][j].isHasBomb()) {
					System.out.print("b");
				} else if (board[i][j].isOpen() && !board[i][j].isHasBomb()) {
					System.out.print("-");
				} else
					System.out.print("X");

			}
			System.out.print("\n");
		}
	}

	public void play() {
		Scanner scan = new Scanner(System.in);
		int i = -1, j = -1;
		int countTurn = 0;
		while (playerLife > 0 && comLife > 0) {
			if (countTurn % 2 == 0) {

				while (true) {
					System.out.println("------- Player Turn --------");
					System.out.println("Input row");
					i = scan.nextInt();
					System.out.println("Input col");
					j = scan.nextInt();
					if (!board[i][j].isOpen()) {
						break;
					}
					if (i > Math.sqrt(board.length) + 1 || j > Math.sqrt(board.length) + 1) {
						System.out.println("Invalid row or column. Choose again");
						continue;
					}
					System.out.printf("Grid %d,%d is already opened. Choose again\n", i, j);
				}
				System.out.println("Openning Grid " + i + " , " + j);
				board[i][j].setOpen(true);
				printBoard();
				if (board[i][j].isHasBomb() == true) {
					playerLife--;
				}
				System.out.println("Player Life: " + playerLife);
				System.out.println("Computer Life: " + comLife);
			} else {

				while (true) {
					System.out.println("------- Computer Turn --------");
					i = (int) (Math.random() * Math.sqrt(board.length));
					j = (int) (Math.random() * Math.sqrt(board.length));
					if (!board[i][j].isOpen()) {
						break;
					}
					if (i > Math.sqrt(board.length) + 1 || j > Math.sqrt(board.length) + 1) {
						System.out.println("Invalid row or column. Choose again");
						continue;
					}
					System.out.printf("Grid %d,%d is already opened. Choose again\n", i, j);
				}
				System.out.println("Openning Grid " + i + " , " + j);
				board[i][j].setOpen(true);
				printBoard();
				if (board[i][j].isHasBomb() == true) {
					comLife--;
				}
				System.out.println("Player Life: " + playerLife);
				System.out.println("Computer Life: " + comLife);

			}
			countTurn++;
		}
		System.out.println("------------- Game Ended. All Bombs' Location are -----------");
		printBoard();
	}
}
