package com.demo.test.mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class MultipleReturnValuesTestList {
	
	@Test
	public void testList_Returns_MultipleValues() {

		List mocklist = mock(List.class);
		when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);

		assertEquals(1, mocklist.size());
		assertEquals(2, mocklist.size());
		assertEquals(3, mocklist.size());

		System.out.println(mocklist.size());
		System.out.println(mocklist);

	}
}
