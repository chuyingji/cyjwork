package timedemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 初英杰
 *String 算法
 */
public class StringDemo1 {
	
	@Test
	public void testName1() throws Exception {
		
	}
	
	@Test
	public void testName() throws Exception {
		String name="   chu ying ";
		String trim = trim(name);
		System.out.println(trim);
	}
	
	public String trim(String str) {
		int start = 0 ;
		int end = str.length()-1;
		while(str.charAt(start)==' ') {
			start++;
		}
		
		while(str.charAt(end)==' ') {
			end--;
		}
		return str.substring(start, end+1) ;
	}
	public String getReverse(String str,int start, int end) {
		String s =str.substring(0, start);
		for (int i = end; i >=start; i--) {
			s+=str.charAt(i);
		}
		s+=str.substring(end+1);
		
		return s;
	}
	
}
