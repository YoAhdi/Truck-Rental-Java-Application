//TruckRental.java
//Ahad Ahmad
//5/18/22
public class TruckRental extends VehicleRental {
	private int capacity;
	private char discount;
	private final static double DISCOUNTAMOUNT = 25;
	
	public TruckRental(int year, String make, String model, double priceRental, int capacity, char discount) {
		super(year, make, model, priceRental);
		if (discount == 'Y') {
			this.setPriceRental(this.getPriceRental() - DISCOUNTAMOUNT);
			this.capacity = capacity;
			this.discount = discount;
		}
		if (discount == 'N') {
			this.priceRental = priceRental;
			this.capacity = capacity;
		}
	}
	
	@Override
	public void displayRental() {
		if (this.discount == 'Y') {
			System.out.printf("YEAR: %d \nMAKE: %s \nMODEL: %s \nDISCOUNT applied \nRENTAL PRICE: $%.2f \nCAPACITY: %,d pounds \n\n", this.getYear(), this.getMake(), this.getModel(), this.getPriceRental(),capacity);
		}
		else {
			super.displayRental();
			System.out.printf("CAPACITY: %,d pounds\n" ,capacity);
			System.out.println("");
		}
	}
}
