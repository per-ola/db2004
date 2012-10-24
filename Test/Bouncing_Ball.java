public class Bouncing_Ball {
	public static void main(String[] args) {
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		double cx = 0.5, cy = 0.9;
		double vx = 0.015, vy = 0.023;
		double radius = 0.05;
		while (true) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0, 0, 1.0);
			if (Math.abs(cx + vx) > 1.0 - radius) vx = -vx;
			if (Math.abs(cy + vy) > 1.0 - radius) vy = -vy;
			cx = cx + vx;
			cy = cy + vy;
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(cx, cy, radius);
			StdDraw.show(20);
		}
	}
}