import static org.junit.Assert.*;

import org.junit.Test;

import OOP_Week3_4.Customer;
import OOP_Week3_4.MyTriangle;
import junit.framework.Assert;

public class CustomerTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testCustomer() {
		Customer tag = new Customer(321, "thitbo", 30);
		int expected = 321;
		int actual = tag.getID();
		Assert.assertEquals(expected, actual);
	}
}
	