
public class Map {
	
	public static String[][] map = new String[12][12];
	public int row1 = 0;
	public int row2 = 0;
	public int column1 = 0;
	public int column2 = 0;
	
	
	
	public void makeMap() {
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
	}
	
	public void drawMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}
}
