# Practice
public class Rectangle {
	public static final double DEFAULT_DIMENSION = 1;
	//instance variables
	private double height, width;
	
	public Rectangle (double w, double h) {
		width = w;
		height = h;
	}
	
	public Rectangle() {
		width = DEFAULT_DIMENSION;
		height = DEFAULT_DIMENSION;
	}
	
	public double area() {
		double theArea;
		theArea = height * width;
		return theArea;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth (double width) {
		this.width = width;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	
}
