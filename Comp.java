package Nov16;

public class Comp {
	
	
	
	private String brand;
	private String model;
	private long SN;
	private double price;
	
	public Comp(String br, String m, double p) {
		brand = br;
		model = m;
		price = p;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getSN() {
		return SN;
	}

	public void setSN(long sN) {
		SN = sN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Comp [brand=" + brand + ", model=" + model + ", SN=" + SN + ", price=" + price + "]";
	}
	
	
}
