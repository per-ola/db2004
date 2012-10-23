/*************************************************************************
 *  Compilation:  javac Charge_III.java
 *  Execution:    java Charge_III x y
 *
 *************************************************************************/

public class Charge_III {
	private double rx, ry;   // position
	private double q;        // Charge_III

	public Charge_III(double x0, double y0, double q0) {
		rx = x0;
		ry = y0;
		q = q0;
	}

	public double change(double d) {
		double dq = d + q;
		return dq;
	}
	public double potentialAt(double q, double x, double y) {
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		return k * change(q) / Math.sqrt(dx*dx + dy*dy);
	}
	public String toString() {
		return q + " at " + "(" + rx + ", " + ry + ")";
	}
	public static void main(String[] args) {
		System.out.println("\n" + "Ange punkt i planet samt laddningsaddition:" +
				" ('0' för att behålla standardvärden):" + "\n");
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		//while (!StdIn.isEmpty());
		double q = StdIn.readDouble();
		Charge_III c1 = new Charge_III(.51, .63, 21.3);
		Charge_III c2 = new Charge_III(.13, .94, 81.9);
		System.out.println(c1);
		System.out.println(c2);

		double v1 = c1.potentialAt(q, x, y);
		double v2 = c2.potentialAt(q, x, y);
		StdOut.println(v1+v2);
	}
}
