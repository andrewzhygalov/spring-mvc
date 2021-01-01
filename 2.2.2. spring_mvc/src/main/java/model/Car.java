package model;
public class Car {
	private Long id;
	private String country;
	private String color;
	public Car(Long id, String color, String country) {
		this.id = id;
		this.color = color;
		this.country = country;
	}
	@Override 
	public String toString() {
		return country + ", " + color;
	}
}