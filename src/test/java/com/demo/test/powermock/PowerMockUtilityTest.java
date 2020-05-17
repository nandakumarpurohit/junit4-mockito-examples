package com.demo.test.powermock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.demo.util.Utility;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
public class PowerMockUtilityTest {

	@Test
	public void TestStaticMethod_WithPowerMockito() {

		String call = " Hi there, I'm using PowerMock with Mockito ";
		String callexpectation = " Call Expectation for you. ";

		PowerMockito.mockStatic(Utility.class);
		PowerMockito.when(Utility.staticMethod(call)).thenReturn(callexpectation);

		String actualcall = Utility.staticMethod(call);
		assertEquals(callexpectation, actualcall);
	}
}