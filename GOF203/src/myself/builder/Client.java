package myself.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector asd = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip creatAirShip = asd.creatAirShip();
		System.out.println(creatAirShip.getEngine().getName());
	}
	
}
