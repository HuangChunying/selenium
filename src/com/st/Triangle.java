package com.st;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int aa, int bb, int cc) {
		// TODO Auto-generated constructor stub
		a = aa;
		b = bb;
		c = cc;
	}

	public String judge() {
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("��������");
			return "��������";
		} else {
			if (a == c || a == b || b == c) {
				if (a == c && a == b) {
					System.out.println("�ȱ�������");
					return "�ȱ�������";
				} else {
					System.out.println("����������");
					return "����������";
				}
			}
			System.out.println("��ͨ������");
			return "��ͨ������";
		}

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
/*
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(3, 4, 5);
		triangle1.judge();
	}*/

}
