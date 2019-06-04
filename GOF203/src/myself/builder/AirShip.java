package myself.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 初英杰
 *飞船
 *
 */
@Setter@Getter
public class AirShip {
	
	private OrbitalModel orbitalModel ;//轨道舱
	
	private Engine engine ; //发动机
	
	private ExcepeTsower excepeTsower ; //逃逸塔
	
	
	
}
class ExcepeTsower{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name ;
	
	public ExcepeTsower(String name) {
		this.name = name ;
	}
	
	
}
class Engine{
	private String name ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine(String name) {
		this.name = name ;
	}
	
	
}



class OrbitalModel{
	
	private String name ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OrbitalModel(String name) {
		this.name=name;
	}
}