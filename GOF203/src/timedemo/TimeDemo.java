package timedemo;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * @author 初英杰
 *时间类
 *时间的标准 UTC
 */
public class TimeDemo {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
	
	
	@Test
	public void testName() throws Exception {
		//Date类  如何实例化 常用方法 tostring gettime
		Date date = new Date();
		System.out.println(date.toString());//格林威制Sat Apr 27 12:25:42 CST 2019
		System.out.println(date.getTime());//1556339142231毫秒数 当前时间减去19701.1.时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String string = sdf.format(date);
		System.out.println(string);
		Date parse = sdf.parse(string);
		System.out.println(parse);
		System.out.println("22222222222222222222222222222222222222222");
		//如何制定时间的string 转化sqldate
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
		Date parse2 = time.parse("2014-1-2");
		java.sql.Date date1 = new java.sql.Date(parse2.getTime());
		System.out.println(date1);
		
		//calendar一个抽象的基类
		Calendar c = new GregorianCalendar();
		Calendar c1 = Calendar.getInstance();
		int i = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		c1.set(Calendar.DAY_OF_MONTH, 12);
		i = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		Date time2 = c1.getTime();
		System.out.println(time2);
		
		
	}
	
}
