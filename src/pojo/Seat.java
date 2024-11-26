package pojo;

public class Seat {
	private int seatNumber;
	private double price;
	private boolean status;

	public Seat() {
		super();
	}

	public Seat(int seatNumber, double price, boolean status) {
		super();
		this.seatNumber = seatNumber;
		this.price = price;
		this.status = status;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.isStatus()?"Avaiable":"Booked";
	}
	
}
