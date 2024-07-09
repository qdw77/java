package java_05.car;

public class LightCar extends Car{

	private double discountOffer;

	public LightCar() {

	}
	public LightCar(String model, int wheel, int seat, String fuel, double discountOffer) {
		super(model, wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}



	public String carInfo() {
		String result = "";
		//사용 불가 super(model,wheel,seat,fuel );

		result +="[차종] : "+ model + "\n";
		result +="[바퀴 수] : "+ wheel + "\n";
		result +="[차종] : "+ seat + "\n";
		result +="[차종] : "+ fuel + "\n";
		result +="[차종] : "+ discountOffer + "\n";

		return result;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}


}
