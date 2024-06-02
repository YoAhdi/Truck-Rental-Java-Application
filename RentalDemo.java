//RentalDemo.java
//Ahad Ahmad
//5/18/22
public class RentalDemo {

	public static void main(String[] args) {
		
		
		CarRental carRentalFirst = new CarRental(2022, "Chevrolet", "Malibu", 39.99, 5,'N');
		CarRental carRentalSecond = new CarRental(2022, "Chevrolet", "Tahoe", 79.99, 7,'Y');
		TruckRental truckRentalFirst = new TruckRental(2020, "Ford", "E450", 135.99, 8900,'Y');
		TruckRental truckRentalSecond = new TruckRental(2006, "GMC", "C6500", 92.99, 25000,'N');
		carRentalFirst.displayRental();
		carRentalSecond.displayRental();
		truckRentalFirst.displayRental();
		truckRentalSecond.displayRental();
		

	}

}
