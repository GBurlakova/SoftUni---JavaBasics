public class Triangle {
	private Point A;
	private Point B;
	private Point C;
	
	
	public Triangle(Point[] points) {
		super();
		A = points[0];
		B = points[2];
		C = points[1];
	}


	public Point getA() {
		return A;
	}


	public void setA(Point a) {
		A = a;
	}


	public Point getB() {
		return B;
	}


	public void setB(Point b) {
		B = b;
	}


	public Point getC() {
		return C;
	}


	public void setC(Point c) {
		C = c;
	}
	
	
	
}
