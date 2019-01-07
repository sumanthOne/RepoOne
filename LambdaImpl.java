package com.app.lambda;

public class LambdaImpl {
	public static void main(String[] args) {
		Lambda length = (String a) -> {
			return a.length();
		};
		System.out.println(length.lengthOfString("ball"));
	}
}
