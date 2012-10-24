public class Turtle{
private double x, y;
private double angle;
...
public void goForward(double d){
double oldX = x;
double oldY = y;
x = x + d*Math.cos(Math.toRadians(angle));
y = y + d*Math.sin(Math.toRadians(angle));
StdDraw.line(oldX, oldY, x, y);
StdDraw.show(500);
}
}