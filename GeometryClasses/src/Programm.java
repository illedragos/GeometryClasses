//Task2
public class Programm {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		p1.afisarePunct();
		
		float[] intArray = new float[]{1,2,3,4,5,6,7,8,9,10,11,12}; 
		
		Polygon poly1 = new Polygon(3);
		poly1.puncte[0] = new Point(10,20);
		poly1.puncte[1] = new Point(30,40);
		poly1.puncte[2] = new Point(50,60);
		
		for(Point p:poly1.puncte) {
			System.out.println(p.x);
			System.out.println(p.y);
		}
		
		Polygon poly2 = new Polygon(intArray);
		
		for(int i=0;i<poly2.puncte.length;i++) {
			poly2.puncte[i].afisarePunct();
		}
		System.out.println("OK");
		
		
	}

}
