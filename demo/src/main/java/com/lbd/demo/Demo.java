package com.lbd.demo;

public class Demo {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int x = 5;
		int y = 7;
		System.out.println(""+x+"+"+y+" = "+cal.add(x, y));
		
		int p = 5;
		int q = 7;
		System.out.println(""+p+"-"+q+" = "+cal.substract(p, q));
		int a = 5;
		int b = 7;
		System.out.println(""+a+"*"+b+" = "+cal.mult(a, b));		int m = 5;
		int n = 7;
		System.out.println(""+m+"/"+n+" = "+cal.divide(p, q));	}
}
