package myself.demo;

/**
 * @author 初英杰
 *饿汉式 单例
 */
public class Singleton3 {
	//类初始化立即加载 没有延迟加载
	private static Singleton3 intance = new Singleton3();
	
	private Singleton3() {
		
	}
	public static Singleton3 getInstance() {
		return  intance;
	}
	
}
