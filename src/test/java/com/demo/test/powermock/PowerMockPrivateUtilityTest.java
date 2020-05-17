package com.demo.test.powermock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.demo.util.PrivateUtility;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PrivateUtility.class)
public class PowerMockPrivateUtilityTest {
	@Test
	public void TestPrivateMethod_WithPowerMock() throws Exception {

		String message = " PowerMock with Mockito and JUnit ";
		String expectedmessage = " Using with EasyMock ";

		PrivateUtility mock = PowerMockito.spy(new PrivateUtility());
		PowerMockito.doReturn(expectedmessage).when(mock, "privateMethod", message);

		String actualmessage = mock.callPrivateMethod(message);
		assertEquals(expectedmessage, actualmessage);

		System.out.println(PowerMockito.verifyPrivate(getClass()));
	}
}
