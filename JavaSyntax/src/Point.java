public class Point implements Comparable<Point>{
		
		private double x;
		private double y;
		
		
		public Point(double[] coordinates) {
			super();
			if (coordinates.length == 0) {
				throw new IllegalArgumentException ("The number of coordinates must be exactly two.");
			}
			this.x = coordinates[0];
			this.y = coordinates[1];
		}
		
		@Override
		public int compareTo(Point o) {
			return (int)(this.x - o.x);
		}
		
		public double getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
}
