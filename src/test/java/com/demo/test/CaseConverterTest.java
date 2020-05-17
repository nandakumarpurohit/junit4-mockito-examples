package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.CaseConverter;

public class CaseConverterTest {
	
	CaseConverter converter = new CaseConverter();

	@Test
	public void testConvertCase() {
		assertEquals(converter.convertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase2() {
		assertEquals(converter.convertCase("heLlo"), "hello");
	}
	
	@Test
	public void testConvertCase3() {
		assertEquals(converter.convertCase(null), "");
	}

}
