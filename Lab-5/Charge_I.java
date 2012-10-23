/*************************************************************************
 *  Compilation:  javac Charge_I.java
 *  Execution:    java Charge_I x y
 *
 *************************************************************************/

public class Charge_I {
    private double rx, ry;   // position
    public double rq;        // Charge_I

    public Charge_I(double q0, double x0, double y0) {
        rx = x0;
        ry = y0;
        rq = q0;
    }

    public double potentialAt(double q, double x, double y) {
        double k = 8.99e09;
        double dq = q - rq;
        double dx = x - rx;
        double dy = y - ry;
        return k * dq / Math.sqrt(dx*dx + dy*dy);
    }
    /*
public double change(double d) {
    	
    }
*/

    public String toString() {
        return rq + " at " + "(" + rx + ", " + ry + ")";
    }

    public static void main(String[] args) {
    	double q = Double.parseDouble(args[0]);
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        Charge_I c1 = new Charge_I(.51, .63, 21.3);
        Charge_I c2 = new Charge_I(.13, .94, 81.9);
        System.out.println(c1);
        System.out.println(c2);
        double v1 = c1.potentialAt(q, x, y);
        double v2 = c2.potentialAt(q, x, y);
        StdOut.println(v1+v2);
    }
}
