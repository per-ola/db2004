import java.awt.Color;
public class PlayingWithColors{
	public static void main(String[] cmdLn){
		Color bookBlue = new Color(9,90,166);
		double radius = 500;
		Color anotherColor = bookBlue;
		for(int i = 0; i<10; i++){
			StdDraw.setPenColor( StdColor.toGray(anotherColor) );
			StdDraw.setPenRadius(radius);
			StdDraw.point(0.5,0.5);
			anotherColor= anotherColor.brighter() ;
			radius = radius-50;
		}
	}
}