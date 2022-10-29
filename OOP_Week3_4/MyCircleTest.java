import static org.junit.Assert.*;

import org.junit.Test;

import OOP_Week3_4.MyCircle;
import OOP_Week3_4.MyTriangle;
import junit.framework.Assert;

public class MyCircleTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testMyCircle() {
		MyCircle tag = new MyCircle(4,4,20);
		double expected = 5;
		double actual = tag.getArea();
		Assert.assertEquals(expected, actual);
	}

	
}
