package tester;

import hashList.HashList;

public class testRunner2 {

	public static void main(String[] args) {
		HashList<Integer> Test = new HashList<Integer>(5);
		
		Test.insertEnd(2,new Integer(0));
		Test.insertEnd(4,new Integer(1));
		Test.insertEnd(1,new Integer(2));
		Test.insertEnd(2,new Integer(3));
		Test.insertEnd(0,new Integer(4));

		// The correct output expected for this input is 4, 2, 0, 3, 1 
		System.out.println("Popped> "+Test.popFirstItem());
		System.out.println("Popped> "+Test.popFirstItem());
		System.out.println("Popped> "+Test.popFirstItem());
		System.out.println("Popped> "+Test.popFirstItem());
		System.out.println("Popped> "+Test.popFirstItem());
	}	
}
