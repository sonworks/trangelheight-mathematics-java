package com.example.testmathematics;

public class Main {

	public static void main(String[] args) {

//		sqrt(2.0);
//		sqrt(5.0);
//		pow(4, 2);
//		pow(3, 2);
		
		calcTrangelHeight();
	}
	
	
	
	/**
	 * 제곱근, 루트 근사값 구하기 예제
	 * @param sqrt
	 */
	private static double sqrt(double squareRoot) {
		double d = Math.sqrt(squareRoot);
		System.out.println("sqrt=" +d);
		return d;
	}
	
	/**
	 * <pre>
	 * 제곱 구하기
	 * 예>Math.pow(밑, 지수)
	 * 4의제곱(4^2)의 경우 ⇒ Math.pow(4, 2) = 16
	 * </pre>
	 */
	private static double pow(double base, double exponent) {
		double d = Math.pow(base, exponent);
		System.out.println("pow=" + Math.pow(base, exponent));
		return d;
	}
	
	/**
	 * <pre>
	 * 두변의 길이가 각각 3, 4인 직사각형 ABCD의 꼭지점 A에서 
	 * 대각선 BD에 내린 수선의 발을 H라 할때 AH의 길이는?
	 * ※Reference/20150210_gomsame_lecture.jpg의 Q1문제를 참고
	 * <pre>
	 */
	private static void calcTrangelHeight() {
		final double ab = 3.0;
		final double ad = 9.0;
		
		double bdPow = pow(ab, 2) + pow(ad, 2);
		double bd = sqrt(bdPow);
		System.out.println("BD is " + bd);
		
		double ah = (ab*ad)/bd;
		System.out.println("AH is " +ah);
	}
}
