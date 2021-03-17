public class Polygon {
	public Point[] puncte;
	public Polygon(int n) {
		puncte = new Point[n];
	}
	
	public Polygon(float []arr) {
		this(arr.length/2);
		puncte = new Point[arr.length/2];
		int poz=0;
		
		for(int i=0;i<arr.length/2;i++) {
			puncte[i] = new Point();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				puncte[poz].x=arr[i];
			}
			else {
				puncte[poz].y=arr[i];
				poz++;
			}

		}
		
	}

}
