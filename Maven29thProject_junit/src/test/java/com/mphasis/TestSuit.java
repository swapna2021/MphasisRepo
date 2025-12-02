package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({NumsUtili.class,StringUtil.class})
public class TestSuit {
	
	@Test
	public void isEvenTest() {
		assertTrue(new NumsUtili().isEven(4));
	}
	
	@Test
	public void checkString() {
		assertNull(new StringUtil().checkString());
	}
	
	

}
