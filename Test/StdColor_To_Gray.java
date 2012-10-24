import java.awt.Color;
public class StdColor_To_Gray{
	public static Color toGray(Color c) {
		int y = (int) Math.round(lum(c));
		Color gray = new Color(y, y, y);
		return gray;
	}
}