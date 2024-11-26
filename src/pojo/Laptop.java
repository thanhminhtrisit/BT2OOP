package pojo;

public class Laptop extends Product {
	private String processor;
	private int ram;

	public Laptop() {
		super();
	}

	public Laptop(String processor, int ram) {
		super();
		this.processor = processor;
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public double calculateDiscountPrice() {
		// TODO Auto-generated method stub
		return super.calculateDiscountPrice();
	}

	@Override
	public String toString() {
		return super.toString() + "Laptop [processor=" + processor + ", ram=" + ram + "]";
	}

}
