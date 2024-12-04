package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listeners.DwsListeners.class)
public class TestCase1 {

	@Test
	public void main1()
	{
		String expected_result = "java";
		String actual_result = "bava";
		assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void main2()
	{
		String expected_result = "java";
		String actual_result = "java";
		assertEquals(actual_result, expected_result);
	}
	
}
