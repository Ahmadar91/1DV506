package aa224fn_assign3;

public class Point {
	
	int x;
	int y;
	public Point() {
		x= 0; y=0;
	}public Point(int x2, int y2 ) {
		x=x2; y=y2;
	}
	public String toString(){
		String str="(";
			str = str+ x+","+y;
		return str+")";
	}
	
	public boolean isEqualTo(Point p2) {
		if(y== p2.y && x == p2.x) 
		
		return true;
		return false;
	}
		
	public double distanceTo(Point p2) {
		double distance = Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
		return distance;	
	}
	
	public int move(int s, int p) {
		x = x+ s;
		y= y+ p;
		
		return x + y;
		
	}
	
	public int moveToXY(int w, int m) {
		x = 0+ w;
		y= 0+ m;
		
		return x + y;
		
	}
	
}
