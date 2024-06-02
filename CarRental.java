//CarRental.java
//Ahad Ahmad
//5/18/22
public class CarRental extends VehicleRental{
	private int passengers;
	private char suv;
	private final static double PREMIUMAMOUNT = 50;
	
	public CarRental(int year, String make, String model, double priceRental, int passengers, char suv) {
		super(year, make, model, priceRental);
		if (suv == 'Y') {
			this.setPriceRental(this.getPriceRental() + PREMIUMAMOUNT);
			this.passengers = passengers;
			this.suv = suv;
		}
		if (suv == 'N') {
			this.priceRental = priceRental;
			this.passengers = passengers;
		}
	}
	
	@Override
	public void displayRental() {
		if (suv == 'Y') {
			System.out.printf("YEAR: %d \nMAKE: %s \nMODEL: %s \nSUV upgrade \nRENTAL PRICE: $%.2f \nPASSENGERS: %d \n\n", this.getYear(), this.getMake(), this.getModel(), this.getPriceRental(),passengers);
		}
		else {
			super.displayRental();
			System.out.println("PASSENGERS: " + passengers);
			System.out.println("");
		}
	}

}
