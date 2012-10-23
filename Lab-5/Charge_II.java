/*************************************************************************
 *  Compilation:  javac Charge_II.java
 *  Execution:    java Charge_II x y
 *
 *************************************************************************/

public class Charge_II {
	private double rx, ry;   // position
	private double q;        // Charge_II

	public Charge_II(double x0, double y0, double q0) {
		rx = x0;
		ry = y0;
		q = q0;
	}

	public double change(double d) {
		double dq = d + q; 
	}


	public double potentialAt(double q, double x, double y) {
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		//double dq = q * rq;
		return k * dq / Math.sqrt(dx*dx + dy*dy);
	}

	public String toString() {
		return rq + " at " + "(" + rx + ", " + ry + ")";
	}

	public static void main(String[] args) {
		System.out.print("Ange punkt i planet samt laddning");
		//while (!StdIn.isEmpty);
		double m = StdIn.readDouble();
		double n = StdIn.readDouble();
		double o = StdIn.readDouble();
		/*
		 * double q = Double.parseDouble(args[0]);
         double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
		 */
		Charge_II c1 = new Charge_II(.51, .63, 21.3);
		Charge_II c2 = new Charge_II(.13, .94, 81.9);
		System.out.println(c1);
		System.out.println(c2);

		double v1 = c1.potentialAt(q, x, y);
		double v2 = c2.potentialAt(q, x, y);
		StdOut.println(v1+v2);
	}
}
