package com.mi.unlock;

public class TestMobilePhone {
	public static void main(String[] args) {
		System.out.println("Mobile phone is present");
		MobilePhone m = new MobilePhone();
		System.out.println("Unlock the phone using code");
		m.Unlock(5678);
	}

}
