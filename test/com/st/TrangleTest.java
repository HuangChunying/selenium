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
		assertEquals("��ͨ������", triangle.judge());	
	}
	@Test
	public void testdengbian() {
		triangle.setA(4);
		triangle.setB(4);
		triangle.setC(4);
		assertEquals("�ȱ�������", triangle.judge());	
	}
	public void testdengyao() {
		triangle.setA(3);
		triangle.setB(4);
		triangle.setC(4);
		assertEquals("����������", triangle.judge());	
	}
	public void testfeifa() {
		triangle.setA(3);
		triangle.setB(4);
		triangle.setC(8);
		assertEquals("��������", triangle.judge());	
	}
	
	
}
