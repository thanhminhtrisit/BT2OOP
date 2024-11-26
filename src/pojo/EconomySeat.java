package pojo;

import method.SeatingMedthod;

public class EconomySeat extends Seat implements SeatingMedthod {

	public EconomySeat() {
		super();
	}

	public EconomySeat(int seatNumber, double price, boolean status) {
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
