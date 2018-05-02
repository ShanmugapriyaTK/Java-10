package com.qspider.sample;

public class Sample {
	void show(){
	disp();
	System.out.println("Method1 is displayed");
	}
	
	void disp(){
		show();
		System.out.println("Method2 is displayed");
	}

}
