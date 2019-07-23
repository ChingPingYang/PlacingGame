import java.util.Scanner;
import java.util.Random;

public class GamePlay {
	
	
	public static Map mapOb = new Map();
	public static AI ai;
	public static int myShip = 5;
	public static int enemyShip = 5;
	
	public static void main(String[] args) {
		mapOb.makeMap();
		mapOb.drawMap();
		
		//user putting ship
		System.out.println("Place 5 of your ship with X, Y coordinate: ");
		for (int i = 1; i <= 5 ; i++) {
			Scanner input = new Scanner(System.in);
			System.out.printf("\nNo%d_X: \n", i);
			int row = input.nextInt();
			System.out.printf("No%d_Y: \n", i);
			int column = input.nextInt();
			mapOb.map[row + 1][column + 1] = "g";
			
		}
		
		
		System.out.printf("\nNow is Computer's turn.\n");
		//making enemy
		ai = new AI();
		System.out.println();
		mapOb.drawMap();
		
		//Game Start
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.printf("\nGame Start. \n");
		System.out.printf("Kill the enemy with X, Y coordinate(you have 5 chances).\n\n");
		for(int i = 1; i <= 5; i++) {
			System.out.printf("The %d of X: ", i);
			int x = input.nextInt();
			System.out.printf("The %d of Y: ", i);
			int y = input.nextInt();
			if (mapOb.map[x + 1][y + 1].equals("E")) {
				enemyShip --;
				mapOb.map[x + 1][y + 1] = "!";
				System.out.printf("\nYou've killed one enemy!\n");
			} else {
				System.out.println("You missed.");
			}
			
			System.out.printf("\nEnemy's turn. \n");
			
			int eX = ran.nextInt(10) + 1;
			int eY = ran.nextInt(10) + 1;
			if (mapOb.map[eX + 1][eY + 1].equals("g")) {
				myShip --;
				mapOb.map[eX + 1][eY + 1] = "!";
			} else {
				System.out.println("Enemy missed.");
			}
			System.out.println();
			
			mapOb.drawMap();
			System.out.printf("Your ships: %d  || Enemy's ships: %d\n\n", myShip, enemyShip);
		}
		
		//result
		if (myShip > enemyShip) {
			System.out.println("Game Over. You win!");
		} else if (myShip < enemyShip) {
			System.out.println("Game Over. Enemy wins!");
		} else {
			System.out.println("Game Over. No one wins.");
		}
	}

}
