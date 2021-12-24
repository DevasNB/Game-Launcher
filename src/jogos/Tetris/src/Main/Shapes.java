package jogos.Tetris.src.Main;

import java.util.Random;

public class Shapes {

	public static int[][] zBlock = {{1, 1, 0},
									{0, 1, 1}};
	
	public static int[][] lBlock = {{0, 0, 0, 2},
			{2, 2, 2, 2}};
	
	public static int[][] oBlock = {{3, 3},
									{3, 3}};
	
	public static int[][] sBlock = {{0, 4, 4},
									{4, 4, 0}};
	
	public static int[][] lineBlock = {{5, 5, 5, 5}};
	
	public static int[][] jBlock = {{6, 0, 0, 0},
								 {6, 6, 6, 6}};
	
	
	public static int[][] tBlock = {{0, 7, 0},
								{7, 7, 7}};
	
	
	public static int[][] testBlock = {{7, 7, 7},
										{7, 7, 7}};

	public static int[][] randomBlock() {
		int random;
		Random r = new Random();
		random = r.nextInt(7);
		if(random == 0) {
			return lineBlock;
		}else if(random == 1) {
			return jBlock;
		}else if(random == 2) {
			return lBlock;
		}else if(random == 3) {
			return oBlock;
		}else if(random == 4) {
			return tBlock;
		}else if(random == 5) {
			return sBlock;
		}else {
		return zBlock;
		}
	}
	public static int getColor(int[][] shape) {
		int section = 0;
		for(int i = 0; i < shape[0].length; i++) {
				if(shape[0][i] > 0) {
					section = shape[0][i];
			}
		}
		return section;
	}
	
}
