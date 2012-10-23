/*************************************************************************
 *  Compilation:  javac Charge_VIVI.java
 *  Execution:    java Charge_VIVI x y
 *
 *************************************************************************/

public class Charge_VI {
	private double rx, ry;   // position
	private double rq;       // Charge_VI

	public Charge_VI(double x0, double y0, double q0) {
		rx = x0;
		ry = y0;
		rq = q0;
	}
	/*
	public double change(double q0) {
		double dq = q + q0;
		return dq;
	}
	 */
	public double potentialAt(double x, double y) {
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		return k * rq / Math.sqrt(dx*dx + dy*dy);
	}
	public double change(double q1, double x, double y) {
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		double q2 = q1 + rq;
		return k * q2 / Math.sqrt(dx*dx + dy*dy);
	}
	public String toString() {
		return rq + " at " + "(" + rx + ", " + ry + ")";
	}
	public static void main(String[] args) {
		System.out.println("\n" + "Ange punkt i planet samt ev. laddningsaddition:" +
				" ('0.0' för att behålla standardvärden):" + "\n");
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		//while (!StdIn.isEmpty());
		double q1 = StdIn.readDouble();
		Charge_VI c1 = new Charge_VI(.51, .63, 21.3);
		Charge_VI c2 = new Charge_VI(.13, .94, 81.9);
		System.out.println(c1);
		System.out.println(c2);

		double v1 = c1.potentialAt(x, y);
		double v2 = c2.potentialAt(x, y);
		StdOut.println(v1+v2);
		double v3 = c1.change(q1, x, y);
		double v4 = c2.change(q1, x, y);
		StdOut.println(v3+v4);
		
		//StdOut.println(v3 + "at" + (21.3 + q1) + "and" + v4 + "at" + (81.9 + q1));
	}
}
