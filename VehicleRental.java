//VehicleRental.java
//Ahad Ahmad
//5/18/22
public class VehicleRental {
	int year;
	String make;
	String model;
	double priceRental;
	
	public VehicleRental (int year, String make, String model, double priceRental) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.priceRental = priceRental;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPriceRental() {
		return priceRental;
	}
	public void setPriceRental(double priceRental) {
		this.priceRental = priceRental;
	}
	public void displayRental() {
		System.out.printf("YEAR: %d \nMAKE: %s \nMODEL: %s \nRENTAL PRICE: $%.2f \n", this.getYear(), this.getMake(), this.getModel(), this.getPriceRental());
	}
	
	

}
