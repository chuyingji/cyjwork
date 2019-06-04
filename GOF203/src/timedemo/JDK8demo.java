package timedemo;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import org.junit.Test;

public class JDK8demo {
	
	@Test
	public void testName4() throws Exception {
		//DateTimeFormatter格式化与解析 预定义格式
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime localDateTime = LocalDateTime.now();
		String format = dateTimeFormatter.format(localDateTime);
		System.out.println(format);
		DateTimeFormatter localizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String format2 = localizedDate.format(localDateTime);
		System.out.println(format2);
		
	}
	
	
	
	/**
	 * @throws Exception
	 * time包 LocalDate LocalTime LocalDateTime
	 */
	@Test
	public void testName() throws Exception {
		//实例化
		LocalDate localdate = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime now = LocalDateTime.now();
		System.out.println(localdate);
		System.out.println(time);
		System.out.println(now);
		//of实例化
		System.out.println(now.getDayOfMonth());
		LocalDateTime withDayOfMonth = now.withDayOfMonth(20);
		System.out.println(withDayOfMonth);
		
		//plus()
		LocalDateTime localtime = LocalDateTime.now();
		LocalDateTime plusDays = localtime.plusDays(3);
		
		
		
	}
	@Test
	public void testName1() throws Exception {
		//Instant时间点
		Instant instance = Instant.now();
		System.out.println(instance);
		OffsetDateTime atOffset = instance.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
		long epochMilli = instance.toEpochMilli();
		System.out.println(epochMilli);//时间戳
		//ZonedDateTime带时区处理
		ZonedDateTime time = ZonedDateTime.now();
		System.out.println(time);
		
		
	}
	@Test
	public void testName2() throws Exception {
		//Duration计算两个时间的间隔 插值
		LocalTime localtime = LocalTime.now();
		LocalTime localTime2 = LocalTime.of(15, 23,32);
		Duration duration = Duration.between(localtime, localTime2);
		System.out.println(duration.getSeconds());
		System.out.println(duration.getUnits());
		
	}
	@Test
	public void testName3() throws Exception {
		//获取当前日期的下一个周日
		TemporalAdjuster adjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
		LocalDateTime localDateTime = LocalDateTime.now().with(adjuster);
		System.out.println(localDateTime);
		//获取下一个工作日
		LocalDateTime.now().with(new TemporalAdjuster() {
			
			@Override
			public Temporal adjustInto(Temporal temporal) {
				LocalDate date = (LocalDate) temporal;
				return date;
			}
		});
		
	}
	
}
