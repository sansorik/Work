
public class Circle {
	 private double radius;
	 public Circle(double radius){
	        this.radius = radius;
	}
	 public Circle(Square s) {
		 radius = Math.sqrt((s.getArea()))/Math.PI;
	 }
	 
	 
	 
	 public double getRadius(){
	        return radius;
	    }
	    public double getArea(){
	        return (Math.PI*Math.pow(radius,2));
	    }
	    public double getPerimiter(){
	        return 2*Math.PI*radius;
	}
	    @Override
	    public String toString() {
	        return "A cirlce of radius: " + radius;
	}
	    public Square getInscribedSquare(){
	        double diam = getRadius()*2;
	        double side = (Math.pow(diam,2)/2);
	        Square c = new Square(Math.sqrt(side));
	        return c;
	    }
	    public Square getCircumscribedSquare(){
	        Square c = new Square(getRadius()*2);
	        return c;
	}
	    public static Square [] getSquares(Circle[] arr){
	    	Square [] arrf = new Square [arr.length];
	    	for(int a = 0; a < arr.length; a++) {
	    		arrf[a] = new Square(arr[a]);
	    		
	    	
	    	}
	    	return arrf;
	    }
}
