public class Point {
	public float x,y;
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public Point(){
		
	}
	
	public void changeCoords(float x, float y) {
		this.x =x;
		this.y =y;
	}
	
	public void afisarePunct() {
		System.out.println("Punctul are coordonatele x="+x+", y="+y);
	}
	
	

}
