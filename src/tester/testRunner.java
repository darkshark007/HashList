package tester;

import hashList.HashList;

public class testRunner {

	public static void main(String[] args) {
		HashList<dataItem> h = new HashList<dataItem>(5);
		
		dataItem n0 = new dataItem(0);
		dataItem n1 = new dataItem(1);
		dataItem n2 = new dataItem(2);
		dataItem n3 = new dataItem(3);
		dataItem n4 = new dataItem(4);
		
		/* */
		h.insertEnd(2,n0);
		h.insertEnd(0,n1);
		h.insertEnd(2,n2);
		h.insertEnd(4,n3);
		h.insertEnd(2,n4);
		/* */

		/* */
		h.insertEnd(0, new dataItem(5));
		h.insertEnd(1, new dataItem(6));
		h.insertEnd(2, new dataItem(7));
		h.insertEnd(3, new dataItem(8));
		h.insertEnd(4, new dataItem(9));
		/* */
		
		/* */
		h.insertEnd(4, new dataItem(10));
		h.insertEnd(3, new dataItem(11));
		h.insertEnd(2, new dataItem(12));
		h.insertEnd(1, new dataItem(13));
		h.insertEnd(0, new dataItem(14));
		/* */


		
		h.printTree();

		
		/* */
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		System.out.println("Popped> "+h.popFirstItem());
		//System.out.println("Popped> "+h.popFirstItem());
		//System.out.println("Popped> "+h.popFirstItem());
		//System.out.println("Popped> "+h.popFirstItem());
		//System.out.println("Popped> "+h.popFirstItem());
		//System.out.println("Popped> "+h.popFirstItem());
		/* */

		h.insertEnd(0, new dataItem(15));

	
		//h.printList();
		h.printTree();
	}
}
