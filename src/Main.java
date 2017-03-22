
public class Main {
	public static void main(String[] args) {
		Droid r2d2 = new Droid();
		r2d2.setModel("R2D2");
		r2d2.setManufacturer("Industrial Automaton");
		r2d2.setType("Astromech droid");
		r2d2.start();
		r2d2.speak();

		Droid.Battery myBattery = new Droid.Battery();
		myBattery.charge();

		Droid c3po = new Droid() {
			public void speak() {
				System.out.println("Droid " + getModel() + " is speaking English" + System.lineSeparator()
						+ "My name is C3PO and I'm fluent in over seven million forms of communication.");
			}
		};

		c3po.setModel("C3PO");
		c3po.setManufacturer("Cybot Galactica");
		c3po.setType("Protocol droid");
		c3po.setCreator("Anakin Skywalker");
		c3po.start();
		c3po.speak();

	}
}
