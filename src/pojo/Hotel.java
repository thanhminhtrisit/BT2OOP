package pojo;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
	private List<Double> allRevenue = new ArrayList<Double>();

	public Hotel() {
		super();
	}

	public Hotel(List<HotelRoom> hotelRooms) {
		super();
		this.hotelRooms = hotelRooms;
	}

	public List<HotelRoom> getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(List<HotelRoom> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	public void display() {
		System.out.println("All room in hotel:");
		for (HotelRoom hotelRoom : this.hotelRooms) {
			hotelRoom.display();
		}
	}

	public void searchRoom(int capacity) {
		for (HotelRoom hotelRoom : this.hotelRooms) {
			if (capacity == hotelRoom.getCapacity()) {
				hotelRoom.display();
			}
		}
	}

	public String bookRoom(int roomID) {
		String mes = "Fail to book room!";
		for (HotelRoom hotelRoom : this.hotelRooms) {
			if (hotelRoom.getRoomNumber() == roomID && hotelRoom.isStatus() == true) {
				hotelRoom.setStatus(false);
				mes = "Success to book room!";
			}
		}
		return mes;
	}

	public String checkout(int roomID) {
		String mes = "Fail to checkout!";
		for (HotelRoom hotelRoom : this.hotelRooms) {
			if (hotelRoom.getRoomNumber() == roomID && hotelRoom.isStatus() == false) {
				hotelRoom.setStatus(true);
				mes = "Success to checkout!";
				this.allRevenue.add(hotelRoom.getPricePerNight());
			}
		}
		return mes;
	}

	public void calculateRevenue() {
		double totalRevenue = 0;
		for (Double revenue : this.allRevenue) {
			totalRevenue += revenue;
		}
		System.out.println("Total revenue of the hotel: " + totalRevenue);
	}
}
