public class Picture {
	private static void grayscale(Picture pic){
		int width = pic.width();
		int height = pic.height();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color color = pic.get(x, y);
				Color gray = StdColor.toGray(color);
				pic.set(x, y, gray);
			}
		}
	}
}