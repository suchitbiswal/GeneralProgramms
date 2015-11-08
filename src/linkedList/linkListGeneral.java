package linkedList;

import java.util.LinkedList;

public class linkListGeneral {

	// Programming questions 
	
	//Reverse a Linked List using Recursion
	
	
	public void reverseLinkedlist (){
	LinkedList <Integer> listinput = new LinkedList<Integer>();
	
	//listinput.
	
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkList thelinklist = new LinkList ();
		
		thelinklist.insertNewlink("don", 10);
		thelinklist.insertNewlink("tim", 5);
		thelinklist.insertNewlink("ron", 15);
		thelinklist.insertNewlink("cook", 25);
		//thelinklist.insertNewlink("such", 35);
		
		
		
		//thelinklist.display();
		
		//thelinklist.removeFirst();
		
		//thelinklist.removeLink("don");
		thelinklist.display();
		
		
		System.out.println(thelinklist.findMiddle().toString());
		
		
	}

}
