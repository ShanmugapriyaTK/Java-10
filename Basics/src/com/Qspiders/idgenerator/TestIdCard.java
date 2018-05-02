package com.Qspiders.idgenerator;

public class TestIdCard {

	public static void main(String[] args) {
		IdCard i1 = new IdCard();
		System.out.println(i1);
		System.out.println(i1.name + " " + i1.mobileNumber + " " + i1.branch);
		//null 0 null
		i1.name = "alpha";
		i1.mobileNumber = 8073708178L;
		i1.branch = "S.Btm";
		System.out.println(i1.name + " " + i1.mobileNumber + " " + i1.branch);
		//alpha 8073708178 S.Btm
		
		IdCard i2 = new IdCard();
		
	}
}
