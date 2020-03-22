package solid.ocp;

public class AreaCalculator {


	protected Object[] shapes;

	public AreaCalculator(Object[] shapes ) {
		this.shapes = shapes;
	}

	

	/**
	 * HINT
	 * If we wanted the sum method to be able to sum the areas of more shapes, 
	 * we would have to add more if/else blocks and that goes against the Open-closed principle.
	 */
	public double sum() {
		double sum = 0;
		for (Object shape : shapes) {
			if(shape instanceof Square){
				sum = sum + Math.pow(((Square) shape).length, 2);
			}else if (shape instanceof Circle){
				sum = sum + Math.PI * Math.pow(((Circle) shape).radius, 2);
			}
		}
		return sum;
	}   

	
	

	class Circle {
	    public double  radius;

	    public Circle (double radius) {
	        this.radius = radius;
	    }
	}

	class Square {
	    public double length;

	    public Square(double length) {
	        this.length = length;
	    }
	}
}
