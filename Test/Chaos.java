public class Chaos {
	public static void main(String[] cmdLn) {
		int T = Integer.parseInt(cmdLn[0]);
		double[] cx ={0.000, 1.000, 0.50000} ;
		double[] cy = {0.000, 0.000, 0.866} ;
		double x = 0.0, y = 0.0;
		int r;
		for (int t = 0; t < T; t++) {
			r = (int) (Math.random() * 3);
			x = (x + cx[r]) / 2.0;
			y = (y + cy[r]) / 2.0;
			StdDraw.point(x, y);
		}
	}
}