package exam116;

public class Car {
	private String brand;
	private String model;
	private double length;
	private double weight;
	 
public Car (String brand, String model, double length, double weight) {
	this.brand = brand;
	this.model = model;
	this.length = length;
	this.weight = weight;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
public String toString() {
	String toString = brand + " " + model;
	return toString;
}
public void gpm() {
	double a = (double)weight * weight; 
	double b = (double)length /2;
	double c = (double) b + a;
	double d = (double) c/1000;
	System.out.println("The gallons per mile of the car is " +d);
}
	public static void main(String[] args) {
		Car k = new Car("Toyota", "Camry", 45.0, 70.0);
		k.toString();
		k.gpm();
		System.out.print(k);
	}
	

}
