package com.phone;

public class osFactory {

	public os getInstance(String str){
		if (str.equals("IOS")) {
			return new IOS();
		}else if(str.equals("Windows")){
			return new Windows();
		}else{
			return new Android();
		}
	}
}
