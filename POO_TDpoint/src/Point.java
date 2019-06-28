
public class Point {
	
	///commentaire
	
	// abscisse et ordonnée
	private double X;
	private double Y;
	
	public Point(double x, double y){
		X = x;
		Y = y;
	}

	/*public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}*/

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}
	
	// Calcul de la distance
	public double distance() {
		return Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2)); // retourne le résultat lors d'un appel
	}

	// appel de la fonction distance dans le string
	@Override
	public String toString() {
		return "Point : (" + X + "," + Y + ") " + "\nDistance = " + this.distance();
	}
	
	
}
