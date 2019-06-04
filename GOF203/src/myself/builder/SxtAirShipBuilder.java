package myself.builder;

public class SxtAirShipBuilder implements AirShipBuild {

	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	public OrbitalModel builderOrbitalModel() {
		System.out.println("构建轨道舱");
		return new OrbitalModel("轨道舱");
	}

	public ExcepeTsower builderExcepeTsower() {
		System.out.println("构建逃逸塔");
		return new ExcepeTsower("逃逸塔");
	}

}
