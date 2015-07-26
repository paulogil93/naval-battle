/*
 * Naval Battle
 *
 * @author      Paulo Gil
 * @email       paulogil93@gmail.com
 * @version     1.0
 */

import java.util.Scanner;
import java.io.*;

public class navalBattle {
	
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Board board = new Board();
		boolean game = true;
		String[] moves = new String[2];
		String[] playerShips;
		String[] enemyShips;

		board.setEnemyShips();
		board.setPlayerShips();

		while (game) {
			board.printBoard();
			moves = board.newMove();
			board.updateBoard(moves);

			if (board.playerCount() == 6 || board.enemyCount() == 6) {
				game = false;
			}
		}

		if (board.playerCount() > board.enemyCount()) {
			board.printBoard();
			System.out.print("\nYou won!\n");
		} else {
			board.printBoard();
			System.out.print("\nYou lost!\n");
		}
		
	}

}