package com.rbi.designnote;

public class TestNotes {
	public static void main(String[] args){
	Notes n1 = new Notes();
	System.out.println(n1.color+" "+n1.value+" "+n1.length+" "+n1.isLettersPresent+" "+n1.height);
	n1.color = "Blue";
	n1.value = 50;
	n1.length = 14;
	System.out.println(n1);
	System.out.println(n1.color+" "+n1.value+" "+n1.length);
	
	Notes n2 = new Notes();
	n2.color = "Green";
	n2.value = 500;
	n2.length = 15; 
	System.out.println(n2);
	System.out.println(n2.color+" "+n2.value+" "+n2.length);
	
	Notes n3 = new Notes();
	n3.color = "Pink";
	n3.value = 200;
	n3.length = 18;
	System.out.println(n3);
    System.out.println(n3.color+" "+n3.value+" "+n3.length);
	}	
	
}
