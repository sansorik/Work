
public class Square {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	
	 @Override
	    public String toString() {
	return "A square with sides of: " + side;
	 }
	
	
	public Square(Circle p){
		side = Math.sqrt(p.getArea());
	}
	
	public double getSide() {
		return side;
	}
	public double getArea() {
		return side*side;
	}
	public double getDiagonal() {
		return side*Math.sqrt(2);
	}
	public double getPerimeter() {
		return side*4;
	}
	 public Circle getInscribedCircle(){
	        Circle c = new Circle(side/2);
	        return c;
	    }
	    public Circle getCircumscribedCircle(){
	        Circle c = new Circle(getDiagonal()/2);
	        return c;
	}

}
