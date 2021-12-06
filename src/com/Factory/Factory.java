package com.Factory;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingFactory a=new OperatingFactory();
		OS s=a.getInstance("clo");
		s.spec();

	}

}
