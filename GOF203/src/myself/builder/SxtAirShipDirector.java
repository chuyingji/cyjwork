package myself.builder;

public class SxtAirShipDirector implements AirShipDirector{
	
	private AirShipBuild builder ;
	
	public SxtAirShipDirector(AirShipBuild builder) {
		this.builder = builder;
	}

	public AirShip creatAirShip() {
		Engine e = builder.builderEngine();
		ExcepeTsower ex = builder.builderExcepeTsower();
		OrbitalModel o = builder.builderOrbitalModel();
		AirShip as = new AirShip() ;
		as.setEngine(e);
		as.setExcepeTsower(ex);
		as.setOrbitalModel(o);
		return as;
	}

}
