package jogos.Tetris.src.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scoring {

	private static String filePath = getDefaultDirectory() + "/Tetris/";
	public static String HIGHSCOREPATH = getDefaultDirectory() + "/Tetris/Highscores.txt";

	public static void init() {
		createDir(filePath);
		createFile(HIGHSCOREPATH);
	}

	public static int[] readFile(String filePath) {
		int[] scores = { 0, 0, 0, 0, 0};
		File file = new File(filePath);
		if (file.exists()) {
                    Scanner scanner = null;
			try {
                            scanner = new Scanner(file);
			} catch (FileNotFoundException e) {
                            e.printStackTrace();
			}
			int line = 0;
			while (scanner.hasNextInt()) {
                            scores[line] = scanner.nextInt();
                            line++;
			}
			scanner.close();
			return scores;
		} 
                else {
                    createFile(filePath);
                    return scores;
		}
	}

	public static void SaveScores(int[] scores) {
		deleteFile(filePath + "HighScores.txt");
		createFile(filePath + "HighScores.txt");
		writeFile(new File(filePath + "HighScores.txt"), scores);
	}

	public static void createFile(String filePath) {
		File path = new File(filePath);
		if (!path.exists()) {
			try {
				path.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			int[] scores = {0, 0, 0, 0, 0};
			writeFile(path, scores);
		}	
	}

	public static void createDir(String filePath) {
		File path = new File(filePath);
		if (!path.exists()) {
			path.mkdir();
		}
	}

	public static void writeFile(File file, int[] scores) {
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			for (int i = 0; i < scores.length; i++) {
				writer.write(scores[i] + "\n");
			}
			System.out.println();
			writer.close();
		} catch (IOException e) {
		}
	}

	public static void deleteFile(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
		}
	}

	public static String getDefaultDirectory() {
		// Salva em ambos os sistemas (Windows e Mac)
		String OS = System.getProperty("os.name").toUpperCase();
		if (OS.contains("WIN")) {
			return System.getenv("APPDATA");
		}
		if (OS.contains("MAC")) {
			return System.getProperty("user.home") + "/Library/Application Support";
		}
		return System.getProperty("user.home");
	}
}
