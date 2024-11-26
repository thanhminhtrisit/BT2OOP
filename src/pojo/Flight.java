package pojo;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private List<Seat> seats = new ArrayList<Seat>();
	private List<Double> allRevenue = new ArrayList<Double>();

	public Flight() {
		super();
	}

	public Flight(List<Seat> seats) {
		super();
		this.seats = seats;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	public void display() {
		System.out.println("The fight information:");
		for(Seat seat : this.seats) {
			System.out.println("The seat number "+seat.getSeatNumber()+" has price "+seat.getPrice()+" is "+seat.getStatus());
		}
	}

	public void bookSeat(int seatNumber) {
		for(Seat seat : this.seats) {
			if (seat.isStatus()==true && seat.getSeatNumber()==seatNumber) {
				seat.setStatus(false);
//				System.out.println("Booking successfully! Your seat number is "+seatNumber);
//				break;
			} else {
//				System.out.println("The seat number "+seatNumber+" is already book!");
//				break;
			}
		}
	}
	
	public void getAllRevenue() {
		for (Seat seat : this.seats) {
			if(seat.isStatus()==false) {
				this.allRevenue.add(seat.getPrice());
			}
		}
		
	}
	
	public void calculateTotalRevenue() {
		double totalRevenue = 0;
		getAllRevenue();
		for (Double revenue : this.allRevenue) {
			totalRevenue += revenue;
		}
		System.out.println("The total revenue is: "+totalRevenue);
	}
}
