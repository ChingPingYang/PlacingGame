
public class Main {

	public static void main(String[] args) {
		
		String[][] map = new String[12][12];
		int row1 = 0;
		int row2 = 0;
		int column1 = 0;
		int column2 = 0;
		
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if ((i == 0 && j == 0) || (i == 0 && j == map[i].length - 1) || (i == map.length - 1 && j == 0)
					|| (i == map.length - 1 && j == map[i].length - 1)) {
					map[i][j] = "x";
				} else if (i == 0 && (j > 0 && j < map[i].length - 1) || (i == map.length - 1 && (j > 0 && j < map[i].length - 1))){
					if (i == 0) {
					String rowS = Integer.toString(row1);
					map[i][j] = rowS;
					row1 ++;
					} else {
						String rowS = Integer.toString(row2);
						map[i][j] = rowS;
						row2 ++;
					}
				} else if (((i > 0 && i < map.length - 1) && j == 0) || ((i > 0 && i < map.length -1) && j == map[j].length - 1)) {
					if (j == 0) {
					String columnS = Integer.toString(column1);
					map[i][j] = columnS;
					column1++;
					} else {
						String columnS = Integer.toString(column2);
						map[i][j] = columnS;
						column2++;
					}
				} else {
					map[i][j] = " ";
				}
			}
		}
		
		map[1][1] = "G";
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
		
		
		
		
	}

}
