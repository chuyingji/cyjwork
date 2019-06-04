package myself.demo;

public class Singleton1 {
	
	private Singleton1() {}
	//懒汉式
	private static Singleton1 instance ;
	//这了避免多线程 加上了锁  并发效率低
	public static synchronized Singleton1 getInstance() {
		if(instance==null) {
			instance = new Singleton1();
		}
		return instance ;
	}
	
}
