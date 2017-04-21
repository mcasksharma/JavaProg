package com.phone;

public class mainClass {

	public static void main(String[] args) {
		osFactory myOs = new osFactory();
		os ss=myOs.getInstance("IOS");
		ss.show();
	}

}
