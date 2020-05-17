package com.demo.test.powermock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.demo.util.FinalUtility;

@RunWith(PowerMockRunner.class)  
@PrepareForTest(FinalUtility.class)  
public class PowerMockFinalTestUtility {
	@Test  
    public void TestFinalMethod_WithPowerMock() throws Exception {  
          
        String message = " PowerMock with Mockito and JUnit ";  
        FinalUtility uti = PowerMockito.mock(FinalUtility.class);  
        PowerMockito.whenNew(FinalUtility.class).withNoArguments().thenReturn(uti);  
          
        FinalUtility uti2 =  new FinalUtility();  
        PowerMockito.verifyNew(FinalUtility.class).withNoArguments();  
          
        PowerMockito.when(uti2.finalMethod(message)).thenReturn(message);  
          
        String message2 = uti2.finalMethod(message);  
        Mockito.verify(uti2).finalMethod(message);  
        assertEquals(message, message2);  
    }  
}
