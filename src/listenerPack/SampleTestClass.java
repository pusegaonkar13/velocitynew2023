package listenerPack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listenerPack.Listener.class)
public class SampleTestClass
{
	@Test
	public void testA()
	{
		System.out.println("Test -A");
		Assert.assertTrue(true);
		
	}
	@Test
	public void testB()
	{
		System.out.println("Test-B");
		Assert.assertTrue(false);
	}

}
