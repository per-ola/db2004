/*************************************************************************
 *  Compilation:  javac Charge_IIII.java
 *  Execution:    java Charge_IIII x y
 *
 *************************************************************************/

public class Charge_IIIII {
    private double rx, ry;   // position
    private double q;        // Charge_IIII

    public Charge_IIII(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
         q = q0;
    }
        public double potentialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx*dx + dy*dy);
    }
    public String toString() {
        return q + " at " + "(" + rx + ", " + ry + ")";
    }
    public static void main(String[] args) {
    	System.out.println("\n" + "Ange punkt i planet samt laddningsförändring" + "\n");
    	double x = StdIn.readDouble();
    	double y = StdIn.readDouble();
    	//double q = StdIn.readDouble();
        Charge_IIII c1 = new Charge_IIII(.51, .63, 21.3);
        Charge_IIII c2 = new Charge_IIII(.13, .94, 81.9);
        System.out.println(c1);
        System.out.println(c2);
        
        double v1 = c1.potentialAt(x, y);
        double v2 = c2.potentialAt(x, y);
        StdOut.println(v1+v2);
        public double change(double d) {
        	double dq = d + q;
        	return dq;
        }
    }
}
