package java_05.car;

public class Truck extends Car{

	private double weight;
	public Truck(String model, int wheel, int seat, String fuel, double weight ) {
		super(model, wheel, seat, fuel);
		this.weight = weight;
	}
	public Truck() {

	}



	public String carInfo() {
		String result = "";
		//사용불가	super(model,wheel,seat,fuel );

		result +="[차종] : "+ model + "\n";
		result +="[바퀴 수] : "+ wheel + "\n";
		result +="[차종] : "+ seat + "\n";
		result +="[차종] : "+ fuel + "\n";
		result +="[차종] : "+ weight + "\n";

		return result;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


}
