package myself.demo;

/**
 * @author 初英杰
 *饿汉式 单例
 */
public class Singleton {
	//类初始化立即加载 没有延迟加载
	private static Singleton intance = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return  intance;
	}
	
}
