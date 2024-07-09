package java_05.ride;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride = new Ride();
		
		ride.move();
		ride.moveRide(new Air());
		ride.moveRide(new Ship());
		ride.moveRide(new Cycle());
		ride.moveRide(new Bike());
		ride.moveRide(new Bus());
		
	}

}
