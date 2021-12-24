package jogos.Tetris.src.Main;

public class Player {

	private int score;
	private int level;
	private int linesCleared;
	
	public Player(int score, int level) {
		this.score = score;
		this.level = level;
	}
	
	public int getScore() {
		return score;
	}
	public int getLevel() {
		return level;
	}
	public void clearedLine() {
		linesCleared++;
		if(linesCleared % 10 == 0) {
			if(level < 9) {
				level++;
			}
		}
	}
	public void addScore(int rowCompleted) {
		switch(rowCompleted) {
			case 1:
				score += 40*(level+1);
				break;
			case 2:
				score += 100*(level+1);
				break;
			case 3:
				score += 300*(level+1);
				break;
			case 4:
				score += 1200*(level+1);
				break;
			default:
					break;
		}
	}
	public void addScore() {
		score += 1;
	}
	
}
