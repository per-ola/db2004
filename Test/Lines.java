public class Lines{
	public static void main(String[] cmdLn){
		int n = Integer.parseInt(cmdLn[0]);
		StdDraw.setXscale(0,n);
		StdDraw.setYscale(0,n);
		for(int i = 1; i<=n; i++){
			StdDraw.line(i,0,0,n-i);
		}
	}
}