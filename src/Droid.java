public class Droid {

	private String type;
	private String model;
	private String manufacturer;
	private String creator;

	public void start() {
		System.out.println("Starting droid " + getModel());
		Brain brain = new Brain();
		brain.think();
	}
	
	public void speak(){
		System.out.println("Droid " + getModel() + " is speaking electronic language");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Type: " + getType() + System.lineSeparator() + "Model: " + getModel() + System.lineSeparator()
				+ "Manufacture: " + getManufacturer() + System.lineSeparator() + "Creator: " + getCreator();

	}

	class Brain {
		public void think() {
			System.out.println("Droid " + getModel() + " is thinking...");

		}

	}

	public static class Battery {
		public void charge() {
			System.out.println("Charging... ... ...");
		}
	}
}