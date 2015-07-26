/*
 * Naval Battle
 * 
 * @author      Paulo Gil
 * @email       paulogil93@gmail.com
 * @version     1.0
 */
import java.util.Scanner;

public class Board {
	static Scanner kb = new Scanner(System.in);

	/*
	Declares all positions:
		p_* -> player positions
		o_* -> opponent positions
	*/
	private char p_a1, p_a2, p_a3, p_a4, p_a5, o_a1, o_a2, o_a3, o_a4, o_a5;
	private char p_b1, p_b2, p_b3, p_b4, p_b5, o_b1, o_b2, o_b3, o_b4, o_b5;
	private char p_c1, p_c2, p_c3, p_c4, p_c5, o_c1, o_c2, o_c3, o_c4, o_c5;
	private char p_d1, p_d2, p_d3, p_d4, p_d5, o_d1, o_d2, o_d3, o_d4, o_d5;
	private char p_e1, p_e2, p_e3, p_e4, p_e5, o_e1, o_e2, o_e3, o_e4, o_e5;
	
	private String[] playerShips = new String[6];
	private String[] enemyShips = new String[6];

	private String[] playerAttempts = new String[25];
	private String[] enemyAttempts = new String[25];

	private String lastEnemyMove;
	
	private int playerCount;
	private int enemyCount;
	
	private int x;
	
	public Board() {
		this.playerCount = playerCount;
		this.enemyCount = enemyCount;
		this.playerShips = playerShips;
		this.enemyShips = enemyShips;
		this.playerAttempts = playerAttempts;
		this.enemyAttempts = enemyAttempts;
		this.lastEnemyMove = lastEnemyMove;

		this.p_a1 = p_a1;
		this.p_a2 = p_a2;
		this.p_a3 = p_a3;
		this.p_a4 = p_a4;
		this.p_a5 = p_a5;
		this.o_a1 = o_a1;
		this.o_a2 = o_a1;
		this.o_a3 = o_a3;
		this.o_a4 = o_a4;
		this.o_a5 = o_a5;

		this.p_b1 = p_b1;
		this.p_b2 = p_b2;
		this.p_b3 = p_b3;
		this.p_b4 = p_b4;
		this.p_b5 = p_b5;
		this.o_b1 = o_b1;
		this.o_b2 = o_b2;
		this.o_b3 = o_b3;
		this.o_b4 = o_b4;
		this.o_b5 = o_b5;

		this.p_c1 = p_c1;
		this.p_c2 = p_c2;
		this.p_c3 = p_c3;
		this.p_c4 = p_c4;
		this.p_c5 = p_c5;
		this.o_c1 = o_c1;
		this.o_c2 = o_c2;
		this.o_c3 = o_c3;
		this.o_c4 = o_c4;
		this.o_c5 = o_c5;

		this.p_d1 = p_d1;
		this.p_d2 = p_d2;
		this.p_d3 = p_d3;
		this.p_d4 = p_d4;
		this.p_d5 = p_d5;
		this.o_d1 = o_d1;
		this.o_d2 = o_d2;
		this.o_d3 = o_d3;
		this.o_d4 = o_d4;
		this.o_d5 = o_d5;

		this.p_e1 = p_e1;
		this.p_e2 = p_e2;
		this.p_e3 = p_e3;
		this.p_e4 = p_e4;
		this.p_e5 = p_e5;
		this.o_e1 = o_e1;
		this.o_e2 = o_e2;
		this.o_e3 = o_e3;
		this.o_e4 = o_e4;
		this.o_e5 = o_e5;

		this.lastEnemyMove = null;
		this.playerCount = 0;
		this.enemyCount = 0;
		this.x = 0;

		

		//Sets all positions with a white space
		this.p_a1 = this.p_a2 = this.p_a3 = this.p_a4 = this.p_a5 = ' ';
		this.o_a1 = this.o_a2 = this.o_a3 = this.o_a4 = this.o_a5 = ' ';
		this.p_b1 = this.p_b2 = this.p_b3 = this.p_b4 = this.p_b5 = ' ';
		this.o_b1 = this.o_b2 = this.o_b3 = this.o_b4 = this.o_b5 = ' ';
		this.p_c1 = this.p_c2 = this.p_c3 = this.p_c4 = this.p_c5 = ' ';
		this.o_c1 = this.o_c2 = this.o_c3 = this.o_c4 = this.o_c5 = ' ';
		this.p_d1 = this.p_d2 = this.p_d3 = this.p_d4 = this.p_d5 = ' ';
		this.o_d1 = this.o_d2 = this.o_d3 = this.o_d4 = this.o_d5 = ' ';
		this.p_e1 = this.p_e2 = this.p_e3 = this.p_e4 = this.p_e5 = ' ';
		this.o_e1 = this.o_e2 = this.o_e3 = this.o_e4 = this.o_e5 = ' ';
	}

	public void printBoard() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("-----------------------------------------------------");
		System.out.println("              NAVAL BATTLE by Paulo Gil              ");
		System.out.println("-----------------------------------------------------");
		System.out.println("       Your board                    Enemy board");
		System.out.println("  ---------------------         ---------------------");
		System.out.printf("5 | %c | %c | %c | %c | %c |       5 | %c | %c | %c | %c | %c |\n",
			this.p_a5, this.p_b5, this.p_c5, this.p_d5, this.p_e5,
			this.o_a5, this.o_b5, this.o_c5, this.o_d5, this.o_e5);
		System.out.println("  ---------------------         ---------------------");
		System.out.printf("4 | %c | %c | %c | %c | %c |       4 | %c | %c | %c | %c | %c |\n",
			this.p_a4, this.p_b4, this.p_c4, this.p_d4, this.p_e4,
			this.o_a4, this.o_b4, this.o_c4, this.o_d4, this.o_e4);
		System.out.println("  ---------------------         ---------------------");
		System.out.printf("3 | %c | %c | %c | %c | %c |       3 | %c | %c | %c | %c | %c |\n",
			this.p_a3, this.p_b3, this.p_c3, this.p_d3, this.p_e3,
			this.o_a3, this.o_b3, this.o_c3, this.o_d3, this.o_e3);
		System.out.println("  ---------------------         ---------------------");
		System.out.printf("2 | %c | %c | %c | %c | %c |       2 | %c | %c | %c | %c | %c |\n",
			this.p_a2, this.p_b2, this.p_c2, this.p_d2, this.p_e2,
			this.o_a2, this.o_b2, this.o_c2, this.o_d2, this.o_e2);
		System.out.println("  ---------------------         ---------------------");
		System.out.printf("1 | %c | %c | %c | %c | %c |       1 | %c | %c | %c | %c | %c |\n",
			this.p_a1, this.p_b1, this.p_c1, this.p_d1, this.p_e1,
			this.o_a1, this.o_b1, this.o_c1, this.o_d1, this.o_e1);
		System.out.println("  ---------------------         ---------------------");
		System.out.println("    A   B   C   D   E             A   B   C   D   E  ");

	}

	public void setPlayerShips() {
		boolean validShip;
		boolean intersect;
		boolean isEqual;

		System.out.print("\033[2J\033[1;1H");
		
		//First ship with size 3 [XXX]
		System.out.print("(1/3): Place ship [XXX]");
		//Sets the first coordinate
		do {
			System.out.print("\nShip's 1st coordinate: ");
			this.playerShips[0] = kb.next();
			if(!validCoord(this.playerShips[0])) System.out.println("Invalid coordinate!");
		} while(!validCoord(this.playerShips[0]));

		/*
		Sets the second coordinate of the 1st ship and checks if it's valid
		The second coordinate is valid if it's placed near the first coordinate,
		horizontally or vertically
		*/
		do {
			validShip = false;
			System.out.print("Ship's 2nd coordinate: ");
			this.playerShips[1] = kb.next();

			if(!validCoord(this.playerShips[1])) {
				System.out.println("Invalid coordinate!");
			} else {

				int firstCoord_x = (int) this.playerShips[0].charAt(0);
				int firstCoord_y = (int) this.playerShips[0].charAt(1);
				int secondCoord_x = (int) this.playerShips[1].charAt(0);
				int secondCoord_y = (int) this.playerShips[1].charAt(1);

				if(firstCoord_x == secondCoord_x) {
					if(secondCoord_y == (firstCoord_y + 1) || secondCoord_y == (firstCoord_y - 1)) {
						validShip = true;
					} else System.out.println("Invalid coordinate!");
				} else if(firstCoord_y == secondCoord_y) {
					if(secondCoord_x == (firstCoord_x + 1) || secondCoord_x == (firstCoord_x - 1)) {
						validShip = true;
					}
				} else System.out.println("Invalid coordinate!");
			}

		} while(!validCoord(this.playerShips[1]) || !validShip);

		/*
		Sets the third coordinate of the 1st ship and checks if it's valid
		The third coordinate is valid if it's placed near the 1st or the 2nd coordinate
		*/
		do {
			isEqual = false;
			validShip = false;
			System.out.print("Ship 3rd coordinate: ");
			this.playerShips[2] = kb.next();

			if(!validCoord(this.playerShips[2])) {
				System.out.println("Invalid coordinate!");
			} else {
				int firstCoord_x = (int) this.playerShips[0].charAt(0);
				int firstCoord_y = (int) this.playerShips[0].charAt(1);
				int secondCoord_x = (int) this.playerShips[1].charAt(0);
				int secondCoord_y = (int) this.playerShips[1].charAt(1);
				int thirdCoord_x = (int) this.playerShips[2].charAt(0);
				int thirdCoord_y = (int) this.playerShips[2].charAt(1);

				if(thirdCoord_x == secondCoord_x && thirdCoord_x == firstCoord_x) {
					if(thirdCoord_y == (secondCoord_y + 1) || thirdCoord_y == (secondCoord_y - 1) || thirdCoord_y == (firstCoord_y + 1) || thirdCoord_y == (firstCoord_y - 1)) {
						validShip = true;
					} else System.out.println("Invalid coordinate!");
				} else if(thirdCoord_y == secondCoord_y && thirdCoord_y == firstCoord_y) {
					if(thirdCoord_x == (secondCoord_x + 1) || thirdCoord_x == (secondCoord_x - 1) || thirdCoord_x == (firstCoord_x +1) || thirdCoord_x == (firstCoord_x - 1)) {
						validShip = true;
					} 
				} else System.out.println("Invalid coordinate!");

				for(int i = 0; i < 2; i++) {
					if(this.playerShips[i] != null) {
						if(this.playerShips[i].equals(this.playerShips[2])) {
							isEqual = true;
						}
					}
				}
			}
		} while(!validCoord(this.playerShips[2]) || !validShip || isEqual);

		//Second ship with size 2 [XX]
		System.out.print("\n(2/3): Place ship [XX]");
		/*
		Sets the first coordinate of the 2nd ship
		The coordinates of this ship must not intersect with the other ships
		*/
		do {
			intersect = false;
			System.out.print("\nShip's 1st coordinate: ");
			this.playerShips[3] = kb.next();
			
			if(!validCoord(this.playerShips[3])) {
				System.out.println("Invalid coordinate!");
			} else {
				//Checks for intersection
				for(int i = 0; i < 3; i++) {
					if(this.playerShips[i] != null) {
						if(this.playerShips[i].equals(this.playerShips[3])) {
							intersect = true;
						}
					}
				}
			}
		} while(!validCoord(this.playerShips[3]) || intersect);

		/*
		Sets the second coordinate of the 2nd ship and checks if it's valid
		The coordinate is valid if it's placed near the first coordinate,
		horizontally or vertically
		Besides, this coordinate must not intersect with the previous ship
		*/
		do {
			validShip = false;
			System.out.print("Ship's 2nd coordinate: ");
			this.playerShips[4] = kb.next();

			if(!validCoord(this.playerShips[4])) {
				System.out.println("Invalid coordinate!");
			} else {

				int firstCoord_x = (int) this.playerShips[3].charAt(0);
				int firstCoord_y = (int) this.playerShips[3].charAt(1);
				int secondCoord_x = (int) this.playerShips[4].charAt(0);
				int secondCoord_y = (int) this.playerShips[4].charAt(1);

				if(firstCoord_x == secondCoord_x) {
					if(secondCoord_y == (firstCoord_y + 1) || secondCoord_y == (firstCoord_y - 1)) {
						validShip = true;
					} else System.out.println("Invalid coordinate!");
				} else if(firstCoord_y == secondCoord_y) {
					if(secondCoord_x == (firstCoord_x + 1) || secondCoord_x == (firstCoord_x - 1)) {
						validShip = true;
					}
				} else System.out.println("Invalid coordinate!");

				//Checks for intersection
				for(int i = 0; i < 4; i++) {
					if(this.playerShips[i] != null) {
						if(this.playerShips[i].equals(this.playerShips[4])) {
							intersect = true;
						}
					}
				}
			}

		} while(!validCoord(this.playerShips[4]) || !validShip || intersect);

		
		//Third ship with size 1 [X]
		System.out.print("\n(3/3): Place ship [X]");
		/*
		Sets the first coordinate of the 5th ship
		The coordinates of this ship must not intersect with the other ships
		*/
		do {
			intersect = false;
			System.out.print("\nShip's coordinate: ");
			this.playerShips[5] = kb.next();
			
			if(!validCoord(this.playerShips[5])) {
				System.out.println("Invalid coordinate!");
			} else {
				
				//Checks for intersection
				for(int i = 0; i < 5; i++) {
					if(this.playerShips[i] != null) {
						if(this.playerShips[i].equals(this.playerShips[5])) {
							intersect = true;
						}
					}
				}
			}

		} while(!validCoord(this.playerShips[5]) || intersect);
	}

	public void setEnemyShips() {
		String[] letters = {"a", "b", "c", "d", "e"};
		String[] numbers = {"1", "2", "3", "4", "5"};
		String coord;
		boolean validShip = false;
		boolean intersect = false;
		boolean isEqual = false;
		int rand_1;
		int rand_2;

		//First ship with size 3 [XXX]

		//Sets the first coordinate
		coord = "";

		rand_1 = (int)(Math.random()*4);
		rand_2 = (int)(Math.random()*4);
		coord += letters[rand_1];
		coord += numbers[rand_2];

		this.enemyShips[0] = coord;
		System.out.print(this.enemyShips[0]);

		/*
		Sets the second coordinate of the 1st ship and checks if it's valid
		The second coordinate is valid if it's placed near the first coordinate,
		horizontally or vertically
		*/
		do {
			validShip = false;
			coord = "";

			rand_1 = (int)(Math.random()*4);
			rand_2 = (int)(Math.random()*4);
			coord += letters[rand_1];
			coord += numbers[rand_2];

			this.enemyShips[1] = coord;

			int firstCoord_x = (int) this.enemyShips[0].charAt(0);
			int firstCoord_y = (int) this.enemyShips[0].charAt(1);
			int secondCoord_x = (int) this.enemyShips[1].charAt(0);
			int secondCoord_y = (int) this.enemyShips[1].charAt(1);

			if(firstCoord_x == secondCoord_x) {
				if(secondCoord_y == (firstCoord_y + 1) || secondCoord_y == (firstCoord_y - 1)) {
					validShip = true;
				}
			} else if(firstCoord_y == secondCoord_y) {
				if(secondCoord_x == (firstCoord_x + 1) || secondCoord_x == (firstCoord_x - 1)) {
					validShip = true;
				}
			}

		} while(!validShip);

		/*
		Sets the third coordinate of the 1st ship and checks if it's valid
		The third coordinate is valid if it's placed near the 1st or the 2nd coordinate
		*/
		do {
			isEqual = false;
			validShip = false;
			coord = "";

			rand_1 = (int)(Math.random()*4);
			rand_2 = (int)(Math.random()*4);
			coord += letters[rand_1];
			coord += numbers[rand_2];

			this.enemyShips[2] = coord;

			int firstCoord_x = (int) this.enemyShips[0].charAt(0);
			int firstCoord_y = (int) this.enemyShips[0].charAt(1);
			int secondCoord_x = (int) this.enemyShips[1].charAt(0);
			int secondCoord_y = (int) this.enemyShips[1].charAt(1);
			int thirdCoord_x = (int) this.enemyShips[2].charAt(0);
			int thirdCoord_y = (int) this.enemyShips[2].charAt(1);

			if(thirdCoord_x == secondCoord_x && thirdCoord_x == firstCoord_x) {
				if(thirdCoord_y == (secondCoord_y + 1) || thirdCoord_y == (secondCoord_y - 1) || thirdCoord_y == (firstCoord_y + 1) || thirdCoord_y == (firstCoord_y - 1)) {
					validShip = true;
				}
			} else if(thirdCoord_y == secondCoord_y && thirdCoord_y == firstCoord_y) {
				if(thirdCoord_x == (secondCoord_x + 1) || thirdCoord_x == (secondCoord_x - 1) || thirdCoord_x == (firstCoord_x +1) || thirdCoord_x == (firstCoord_x - 1)) {
					validShip = true;
				} 
			}
			
			for(int i = 0; i < 2; i++) {
				if(this.enemyShips[i] != null) {
					if(this.enemyShips[i].equals(this.enemyShips[2])) {
						isEqual = true;
					}
				}
			}

		} while(!validShip || isEqual);

		//Second ship with size 2 [XX]

		/*
		Sets the first coordinate of the 2nd ship
		The coordinates of this ship must not intersect with the other ships
		*/
		do {
			intersect = false;
			validShip = false;
			coord = "";

			rand_1 = (int)(Math.random()*4);
			rand_2 = (int)(Math.random()*4);
			coord += letters[rand_1];
			coord += numbers[rand_2];

			this.enemyShips[3] = coord;
			
			//Checks for intersection
			for(int i = 0; i < 3; i++) {
				if(this.enemyShips[i] != null) {
					if(this.enemyShips[i].equals(this.enemyShips[3])) {
						intersect = true;
					}
				}
			}
			
		} while(intersect);

		/*
		Sets the second coordinate of the 2nd ship and checks if it's valid
		The coordinate is valid if it's placed near the first coordinate,
		horizontally or vertically
		Besides, this coordinate must not intersect with the previous ship
		*/
		do {
			intersect = false;
			validShip = false;
			coord = "";

			rand_1 = (int)(Math.random()*4);
			rand_2 = (int)(Math.random()*4);
			coord += letters[rand_1];
			coord += numbers[rand_2];

			this.enemyShips[4] = coord;

			int firstCoord_x = (int) this.enemyShips[3].charAt(0);
			int firstCoord_y = (int) this.enemyShips[3].charAt(1);
			int secondCoord_x = (int) this.enemyShips[4].charAt(0);
			int secondCoord_y = (int) this.enemyShips[4].charAt(1);

			if(firstCoord_x == secondCoord_x) {
				if(secondCoord_y == (firstCoord_y + 1) || secondCoord_y == (firstCoord_y - 1)) {
					validShip = true;
				}
			} else if(firstCoord_y == secondCoord_y) {
				if(secondCoord_x == (firstCoord_x + 1) || secondCoord_x == (firstCoord_x - 1)) {
					validShip = true;
				}
			}

			//Checks for intersection
			for(int i = 0; i < 4; i++) {
				if(this.enemyShips[i] != null) {
					if(this.enemyShips[i].equals(this.enemyShips[4])) {
						intersect = true;
					}
				}
			}

		} while(!validShip || intersect);

		//Third ship with size 1 [X]
		
		/*
		Sets the coordinate of the 4th ship
		The coordinate of this ship must not intersect with the other ships
		*/
		do {
			intersect = false;
			validShip = false;
			coord = "";

			rand_1 = (int)(Math.random()*4);
			rand_2 = (int)(Math.random()*4);
			coord += letters[rand_1];
			coord += numbers[rand_2];

			this.enemyShips[5] = coord;

			//Checks for intersection
			for(int i = 0; i < 5; i++) {
				if(this.enemyShips[i] != null) {
					if(this.enemyShips[i].equals(this.enemyShips[5])) {
						intersect = true;
					}
				}
			}
			
		} while(intersect);

	}

	public String[] newMove() {
		String[] letters = {"a", "b", "c", "d", "e"};
		String[] numbers = {"1", "2", "3", "4", "5"};
		String[] moves = new String[2];
		String playerMove;
		String enemyMove;
		boolean withdrawn;

		if(this.lastEnemyMove != null) System.out.println("Enemy move: " + this.lastEnemyMove);
		//Players move
		do {
			withdrawn = false;

			do {
				System.out.print("Your move: ");
				playerMove = kb.next();
				if(!validCoord(playerMove)) System.out.println("Invalid coordinate!");
			} while(!validCoord(playerMove));

			for (int i = 0; i < this.playerAttempts.length; i++) {
				if(this.playerAttempts[i] != null) {
					if (playerAttempts[i].equals(playerMove)) {
						withdrawn = true;
					}
				}
			}

			if(withdrawn) System.out.print("Coordinate already played!");

		} while (withdrawn);

		moves[0] = playerMove;
		this.playerAttempts[this.x] = playerMove;

		//Enemy's move
		do {
			withdrawn = false;
			enemyMove = "";
			int rand_1 = (int)(Math.random()*5);
			int rand_2 = (int)(Math.random()*5);

			enemyMove += letters[rand_1];
			enemyMove += numbers[rand_2];
			
			for (int i = 0; i < this.enemyAttempts.length; i++) {
				if(this.enemyAttempts[i] != null) {
					if (this.enemyAttempts[i].equals(enemyMove)) {
						withdrawn = true;
					}
				}
			}

		} while (withdrawn);

		moves[1] = enemyMove;
		this.enemyAttempts[this.x] = enemyMove;
		this.lastEnemyMove = enemyMove;

		this.x++;

		return moves;
	}

	public void updateBoard(String[] moves) {
		String playerMove = moves[0];
		String enemyMove = moves[1];
		boolean playerHit = false;
		boolean enemyHit = false;
		int i;
		
		//Updates the player move
		if(playerMove.equals("a1")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_a1 = 'X';
			else this.o_a1 = '*';

		} else if(playerMove.equals("a2")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_a2 = 'X';
			else this.o_a2 = '*';

		} else if(playerMove.equals("a3")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_a3 = 'X';
			else this.o_a3 = '*';

		} else if(playerMove.equals("a4")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_a4 = 'X';
			else this.o_a4 = '*';

		} else if(playerMove.equals("a5")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_a5 = 'X';
			else this.o_a5 = '*';

		} else if(playerMove.equals("b1")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_b1 = 'X';
			else this.o_b1 = '*';

		} else if(playerMove.equals("b2")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_b2 = 'X';
			else this.o_b2 = '*';

		} else if(playerMove.equals("b3")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_b3 = 'X';
			else this.o_b3 = '*';

		} else if(playerMove.equals("b4")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_b4 = 'X';
			else this.o_b4 = '*';

		} else if(playerMove.equals("b5")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_b5 = 'X';
			else this.o_b5 = '*';

		} else if(playerMove.equals("c1")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_c1 = 'X';
			else this.o_c1 = '*';

		} else if(playerMove.equals("c2")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_c2 = 'X';
			else this.o_c2 = '*';

		} else if(playerMove.equals("c3")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_c3 = 'X';
			else this.o_c3 = '*';

		} else if(playerMove.equals("c4")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_c4 = 'X';
			else this.o_c4 = '*';

		} else if(playerMove.equals("c5")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_c5 = 'X';
			else this.o_c5 = '*';

		} else if(playerMove.equals("d1")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_d1 = 'X';
			else this.o_d1 = '*';

		} else if(playerMove.equals("d2")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_d2 = 'X';
			else this.o_d2 = '*';

		} else if(playerMove.equals("d3")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_d3 = 'X';
			else this.o_d3 = '*';

		} else if(playerMove.equals("d4")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_d4 = 'X';
			else this.o_d4 = '*';

		} else if(playerMove.equals("d5")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_d5 = 'X';
			else this.o_d5 = '*';

		} else if(playerMove.equals("e1")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_e1 = 'X';
			else this.o_e1 = '*';

		} else if(playerMove.equals("e2")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_e2 = 'X';
			else this.o_e2 = '*';

		} else if(playerMove.equals("e3")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_e3 = 'X';
			else this.o_e3 = '*';

		} else if(playerMove.equals("e4")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_e4 = 'X';
			else this.o_e4 = '*';

		} else if(playerMove.equals("e5")) {
			i = 0;
			do {
				if(this.enemyShips[i].equals(playerMove)) playerHit = true;
				i++;
			} while(i < this.enemyShips.length);

			if(playerHit) this.o_e5 = 'X';
			else this.o_e5 = '*';
		}

		if(playerHit) this.playerCount++;

		//Updates the opponent move
		if(enemyMove.equals("a1")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_a1 = 'X';
			else this.p_a1 = '*';

		} else if(enemyMove.equals("a2")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_a2 = 'X';
			else this.p_a2 = '*';

		} else if(enemyMove.equals("a3")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_a3 = 'X';
			else this.p_a3 = '*';

		} else if(enemyMove.equals("a4")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_a4 = 'X';
			else this.p_a4 = '*';

		} else if(enemyMove.equals("a5")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_a5 = 'X';
			else this.p_a5 = '*';

		} else if(enemyMove.equals("b1")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_b1 = 'X';
			else this.p_b1 = '*';

		} else if(enemyMove.equals("b2")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_b2 = 'X';
			else this.p_b2 = '*';

		} else if(enemyMove.equals("b3")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_b3 = 'X';
			else this.p_b3 = '*';

		} else if(enemyMove.equals("b4")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_b4 = 'X';
			else this.p_b4 = '*';

		} else if(enemyMove.equals("b5")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_b5 = 'X';
			else this.p_b5 = '*';

		} else if(enemyMove.equals("c1")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_c1 = 'X';
			else this.p_c1 = '*';

		} else if(enemyMove.equals("c2")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_c2 = 'X';
			else this.p_c2 = '*';

		} else if(enemyMove.equals("c3")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_c3 = 'X';
			else this.p_c3 = '*';

		} else if(enemyMove.equals("c4")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_c4 = 'X';
			else this.p_c4 = '*';

		} else if(enemyMove.equals("c5")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_c5 = 'X';
			else this.p_c5 = '*';

		} else if(enemyMove.equals("d1")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_d1 = 'X';
			else this.p_d1 = '*';

		} else if(enemyMove.equals("d2")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_d2 = 'X';
			else this.p_d2 = '*';

		} else if(enemyMove.equals("d3")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_d3 = 'X';
			else this.p_d3 = '*';

		} else if(enemyMove.equals("d4")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_d4 = 'X';
			else this.p_d4 = '*';

		} else if(enemyMove.equals("d5")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_d5 = 'X';
			else this.p_d5 = '*';

		} else if(enemyMove.equals("e1")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_e1 = 'X';
			else this.p_e1 = '*';

		} else if(enemyMove.equals("e2")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_e2 = 'X';
			else this.p_e2 = '*';

		} else if(enemyMove.equals("e3")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_e3 = 'X';
			else this.p_e3 = '*';

		} else if(enemyMove.equals("e4")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_e4 = 'X';
			else this.p_e4 = '*';

		} else if(enemyMove.equals("e5")) {
			i = 0;
			do {
				if(this.playerShips[i].equals(enemyMove)) enemyHit = true;
				i++;
			} while(i < this.playerShips.length);

			if(enemyHit) this.p_e5 = 'X';
			else this.p_e5 = '*';
		}

		if(enemyHit) this.enemyCount++;
	}

	public int playerCount() {
		return this.playerCount;
	}

	public int enemyCount() {
		return this.enemyCount;
	}

	public String[] getPlayerShips() {
		return this.playerShips;
	}

	public String[] getEnemyShips() {
		return this.enemyShips;
	}

	//Checks if the input coordinate is valid
	private boolean validCoord(String coordinate) {
		boolean isValid = false;

		if(coordinate.charAt(0) == 'a' || coordinate.charAt(0) == 'b' || coordinate.charAt(0) == 'c'
			|| coordinate.charAt(0) == 'd' || coordinate.charAt(0) == 'e') {
			if(coordinate.charAt(1) == '1' || coordinate.charAt(1) == '2' || coordinate.charAt(1) == '3'
				|| coordinate.charAt(1) == '4' || coordinate.charAt(1) == '5') {
				isValid = true;
			}
		}

		return isValid;
	}

	//The next methods are for testing purposes
	public void printSmallBoard(String[] ships) {
		char a1, a2, a3, a4, a5;
		char b1, b2, b3, b4, b5;
		char c1, c2, c3, c4, c5;
		char d1, d2, d3, d4, d5;
		char e1, e2, e3, e4, e5;

		a1 = a2 = a3 = a4 = a5 = ' ';
		b1 = b2 = b3 = b4 = b5 = ' ';
		c1 = c2 = c3 = c4 = c5 = ' ';
		d1 = d2 = d3 = d4 = d5 = ' ';
		e1 = e2 = e3 = e4 = e5 = ' ';

		//Sets the small board with values from the array
		for(String coordinate : ships) {

			if(coordinate.equals("a1")) {
				a1 = 'X';
			} else if(coordinate.equals("a2")) {
				a2 = 'X';
			} else if(coordinate.equals("a3")) {
				a3 = 'X';
			} else if(coordinate.equals("a4")) {
				a4 = 'X';
			} else if(coordinate.equals("a5")) {
				a5 = 'X';
			} else if(coordinate.equals("b1")) {
				b1 = 'X';
			} else if(coordinate.equals("b2")) {
				b2 = 'X';
			} else if(coordinate.equals("b3")) {
				b3 = 'X';
			} else if(coordinate.equals("b4")) {
				b4 = 'X';
			} else if(coordinate.equals("b5")) {
				b5 = 'X';
			} else if(coordinate.equals("c1")) {
				c1 = 'X';
			} else if(coordinate.equals("c2")) {
				c2 = 'X';
			} else if(coordinate.equals("c3")) {
				c3 = 'X';
			} else if(coordinate.equals("c4")) {
				c4 = 'X';
			} else if(coordinate.equals("c5")) {
				c5 = 'X';
			} else if(coordinate.equals("d1")) {
				d1 = 'X';
			} else if(coordinate.equals("d2")) {
				d2 = 'X';
			} else if(coordinate.equals("d3")) {
				d3 = 'X';
			} else if(coordinate.equals("d4")) {
				d4 = 'X';
			} else if(coordinate.equals("d5")) {
				d5 = 'X';
			} else if(coordinate.equals("e1")) {
				e1 = 'X';
			} else if(coordinate.equals("e2")) {
				e2 = 'X';
			} else if(coordinate.equals("e3")) {
				e3 = 'X';
			} else if(coordinate.equals("e4")) {
				e4 = 'X';
			} else if(coordinate.equals("e5")) {
				e5 = 'X';
			}
		}

		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("-----------------------------------------------------");
		System.out.println("              NAVAL BATTLE by Paulo Gil              ");
		System.out.println("-----------------------------------------------------");
		System.out.println("          Board        ");
		System.out.println("  ---------------------");
		System.out.printf("5 | %c | %c | %c | %c | %c |\n", a5, b5, c5, d5, e5);
		System.out.println("  ---------------------");
		System.out.printf("4 | %c | %c | %c | %c | %c |\n", a4, b4, c4, d4, e4);
		System.out.println("  ---------------------");
		System.out.printf("3 | %c | %c | %c | %c | %c |\n", a3, b3, c3, d3, e3);
		System.out.println("  ---------------------");
		System.out.printf("2 | %c | %c | %c | %c | %c |\n", a2, b2, c2, d2, e2);
		System.out.println("  ---------------------");
		System.out.printf("1 | %c | %c | %c | %c | %c |\n", a1, b1, c1, d1, e1);
		System.out.println("  ---------------------");
		System.out.println("    A   B   C   D   E  ");
	}

	public String[] getPlayerAttempts() {
		return this.playerAttempts;
	}

	public String[] getEnemyAttempts() {
		return this.enemyAttempts;
	}

	public int getX() {
		return this.x;
	}
}