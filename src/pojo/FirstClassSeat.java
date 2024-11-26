package pojo;

import method.SeatingMedthod;

public class FirstClassSeat extends Seat implements SeatingMedthod {
	public FirstClassSeat() {
		super();
	}

	public FirstClassSeat(int seatNumber, double price, boolean status) {
		super.setSeatNumber(seatNumber);
		super.setPrice(price);
		super.setStatus(status);
	}

	@Override
	public double calculateFinalPrice(double servicePrice) {
		double finalPrice = super.getPrice() + servicePrice;
		return finalPrice;
	}
	
	public void getFinalPrice(double servicePrice) {
		super.setPrice(calculateFinalPrice(servicePrice));
	}
}
