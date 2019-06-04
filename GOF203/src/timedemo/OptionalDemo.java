package timedemo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

/**
 * @author 初英杰
 *空指针异常的解决的 optional其实是一个容器
 *可以为null的容器对象
 */
public class OptionalDemo {
	@Test
	public void testName() throws Exception {
		//返回一个没有任何封装的Optional的对象
		Optional<String> of = Optional.of("beijie");
		System.out.println(of);
		Optional<String> ofNullable = Optional.ofNullable("sada");
		of.
		Optional<Object> op = Optional.empty();
		System.out.println(op);
		op.isPresent();//判断内部数据是否存在
	}
}
