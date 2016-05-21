package com.st;


import org.junit.Test;

import junit.framework.TestCase;

public class TrangleTest extends TestCase{
	private static Triangle triangle = new Triangle();
	@Test
	public void testputong() {
		triangle.setA(3);
		triangle.setB(4);
		triangle.setC(5);
		assertEquals("普通三角形", triangle.judge());	
	}
	@Test
	public void testdengbian() {
		triangle.setA(4);
		triangle.setB(4);
		triangle.setC(4);
		assertEquals("等边三角形", triangle.judge());	
	}
	public void testdengyao() {
		triangle.setA(3);
		triangle.setB(4);
		triangle.setC(4);
		assertEquals("等腰三角形", triangle.judge());	
	}
	public void testfeifa() {
		triangle.setA(3);
		triangle.setB(4);
		triangle.setC(8);
		assertEquals("非三角形", triangle.judge());	
	}
	
	
}
