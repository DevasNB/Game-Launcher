package jogos.Tetris.src.Main;

import jogos.Tetris.src.Main.Game;

public class Piece {

	private int x;
	private int y;
	private int[][] shape;	
	public Piece(int x, int y, int[][] shape) {
		this.x = x;
		this.y = y;
		this.shape = shape;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int width() {
		return this.shape.length;
	}
	public int height() {
		return this.shape[0].length;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void updateY() {
		this.y = this.y+1;
	}
	public int[][] getShape() {
		return shape;
	}
	
	public void rotateSelf(int[][] gamePos) {
		final int H = shape.length;
	    final int W = shape[0].length;
	    int[][] temp = new int[W][H];
	    for (int r = 0; r < H; r++) {
	        for (int c = 0; c < W; c++) {
	            temp[c][H-1-r] = shape[r][c];
	        }
	    }
	    boolean canRotate = true;
	    if(this.x + temp.length <= Game.gridWidth && this.y + temp[0].length <= Game.gridHeight) {
	    	for(int i = 0; i < temp.length; i++) {
	    		for(int j = 0; j < temp[0].length; j++) {
	    			if(gamePos[this.x+i][this.y+j] > 0) {
	    				canRotate = false;
	    	    	}
	    		}
	    	}
	    }else {
	    	canRotate = false;
	    }
	    if(canRotate) {
	    	this.shape = temp;
	    }else {
//	    	System.out.println("cant rotate..");
	    }
	}
	
}
