package com.w3epic.wiprotraining.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class StringmanipTest {
	private	String datum;
	private	String expected;
	
	public StringmanipTest(String datum, String expected) {
		this.datum = datum;
		this.expected =	expected;
	}
	
	
	@Parameters
	public static Collection<Object[]> generateData() {
		Object[][] data	= new Object[][] {
			{"Smita", "SMITA"},
			{"smita", "SMITA"},
			{"SMitA", "SMITA"},
			{"SmitA", "SMITA"}
		};
		
		return Arrays.asList(data);
	}
	
	@Test
	public void testUpperCase() {
		Stringmanip s = new Stringmanip(this.datum);
		String actualResult = s.upperCase();
		assertEquals(actualResult, this.expected);
	}

}

