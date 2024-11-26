package pojo;

public class HotelRoom {
	private int roomNumber;
	private int capacity;
	private double pricePerNight;
	private boolean status;

	public HotelRoom() {
		super();
	}

	public HotelRoom(int roomNumber, int capacity, double pricePerNight, boolean status) {
		super();
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
		this.status = status;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStatus() {
		return this.isStatus() ? "Avaiable" : "Used";
	}

	public void display() {
		System.out.println("Hotel id: " + this.roomNumber + " capacity: " + this.capacity + " price per night: "
				+ this.pricePerNight + " status: " + this.getStatus());
	}
}
