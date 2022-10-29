import static org.junit.Assert.*;

import org.junit.Test;

import OOP_Week3_4.MyTriangle;
import junit.framework.Assert;

public class test {

	
	@SuppressWarnings("deprecation")
	@Test
	public void testcase1() throws Exception {
		MyTriangle tag = new MyTriangle(4,4,7,4,1,20);
		double expected = 5;
		String actual = tag.getType();
		Assert.assertEquals(expected, actual);
	}

}	