package pojo;

public class Tablet extends Product {
	private String monitor;

	public Tablet() {
		super();
	}

	public Tablet(String monitor) {
		super();
		this.monitor = monitor;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	@Override
	public double calculateDiscountPrice() {
		// TODO Auto-generated method stub
		return super.calculateDiscountPrice();
	}

	@Override
	public String toString() {
		return super.toString() + "Tablet [monitor=" + monitor + "]";
	}

}
