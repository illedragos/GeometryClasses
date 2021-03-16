//Task2
public class Programm {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		p1.afisarePunct();
		
		float[] intArray = new float[]{1,2,3,4}; 
		
		Polygon poly1 = new Polygon(3);
		poly1.puncte[0].x=2;
		poly1.puncte[0].y=3;
		
		poly1.puncte[0].afisarePunct();
		
		
		Polygon poly = new Polygon(intArray);
		for(int i=0;i<poly.puncte.length;i++) {
			poly.puncte[i].afisarePunct();
		}
		
		
	}

}
