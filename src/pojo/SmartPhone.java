package pojo;

public class SmartPhone extends Product {
	private String cameraQuantity;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String cameraQuantity) {
		super();
		this.cameraQuantity = cameraQuantity;
	}

	public String getCameraQuantity() {
		return cameraQuantity;
	}

	public void setCameraQuantity(String cameraQuantity) {
		this.cameraQuantity = cameraQuantity;
	}

	@Override
	public double calculateDiscountPrice() {
		// TODO Auto-generated method stub
		return super.calculateDiscountPrice();
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone [cameraQuantity=" + cameraQuantity + "]";
	}
}
