import java.util.Scanner;
import java.util.Random;

public class AI {
	

	Map map = new Map();

	public AI() {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		System.out.printf("\nComputer is putting ships.\n");
		
		for (int i = 1; i <=5; i++) {
			int x = ran.nextInt(10) + 1;
			int y = ran.nextInt(10) + 1;
			if (!map.map[x][y].equals(" ")) {
				x = ran.nextInt(10) + 1;
				y = ran.nextInt(10) + 1;
			}
			map.map[x][y] = "E";
			System.out.printf("Enemy %d is set.\n", i);
		}
		
	}
	
}
