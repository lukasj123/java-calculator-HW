package com.tts.calculator;
import java.math.*;

public class MagicCalculator extends Calculator {

	public double squareRoot(double a) {
		return Math.sqrt(a);
	}
	
	public double sine(double a) {
		return Math.sin(a);
	}
	
	public double cosine(double a) {
		return Math.cos(a);
	}
	
	public double tangent(double a) {
		return Math.tan(a);
	}
	
	public int factorial(int a) {
		int i = a;
		int n = a;
		
		while (i > 1) {
			n = n*(i-1);
			i--;		
		}
		
		return n;
	}
}
