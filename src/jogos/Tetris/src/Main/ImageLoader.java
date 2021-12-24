package jogos.Tetris.src.Main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageLoader {
	
	private BufferedImage img;
	public static String squarePath = "/jogos/Tetris/images/Squares.png";
	public static String logoPath = "/jogos/Tetris/images/Logo.png";
	public static String tetrisPath = "/jogos/Tetris/images/TetrisLogo.png";
	
	public ImageLoader(String path) {
		try {
			img = ImageIO.read(ImageLoader.class.getResourceAsStream(path));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public BufferedImage getImage() {
		return img;
	}
	public BufferedImage getSubImage(int section) {
		return img.getSubimage(section*50, 0, 50, 50);
	}
	
	
	
	
	
	
	
	
	
//	private Image img;		
//		public ImageLoader() throws IOException {
//			img = Toolkit.getDefaultToolkit().getImage("images/Square.png");
//		}
//		public Image getImage() {
//			return img;
//		}
//		public BufferedImage getImage(int section) {
//			return ((BufferedImage) img).getSubimage(0, (section * 50), 50, 50);
//		}
		
}

