package linkedList;

public class LinkList {

	public link firstlink;
	
	// Constructor to initialize the linklist, that will make the 1st Link as null.
	public LinkList (){
		
		firstlink=null;
		
	}
	
	
	public boolean isEmpty () {
		
		if (firstlink== null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertNewlink (String bookName,int millionsSold) {
				
		//here are the three steps that need to be done 
		
		//1st : create a brand new link by calling the constructor 
		link newLink = new link (bookName,millionsSold);
		
		//2nd :  First Mark the next link as Null ( for the above link we created), that is the current 1st link, so that we can have an end, because we are 
		//adding our 1st link and the next link is null
		
		newLink.next=firstlink;
		
		// make the 1st link as the link that we have just created 
		firstlink=newLink;
		
	}
	
	public link removeFirst () {
		
		link referenceLink= firstlink;
		
		if (!isEmpty()) {
			firstlink=firstlink.next;
		}
		else {
			System.out.println("Link is empty");
		}
		
		return referenceLink;
	}
	
	/**
	 * Traverse through the linklist
	 */
	public void display () {
		
		link thelink = firstlink;
		
		while (thelink!=null) {
			
			thelink.display();
			
			System.out.println("the next link "+ thelink.next);
			thelink=thelink.next;
			System.out.println ();
			
		}
		
		
	}
	
	public link FindLink (String bookname) {
		
		link thelink= firstlink;
		
		if (!isEmpty()) {
			
		
			while (thelink.bookName!=bookname) {
				
				if (thelink.next==null) {
					return null;
				}
				else {
					thelink=thelink.next;
				}
			}
			
		}
		
		else {
			System.out.println("Linklist is empty");
		}
		return thelink;
		
		
	}
	
	public link removeLink (String bookname) {

		link currentlink = firstlink;
		link previouslink= firstlink;

		while (currentlink.bookName!=bookname) {

			if (currentlink.next==null) {
				return null;
			} else {
				previouslink=currentlink;
				currentlink=currentlink.next;
			}}

			if (currentlink==firstlink) {

				firstlink=firstlink.next;

			} else {

				previouslink.next = currentlink.next;



			}
		
		return 	currentlink;

	}

	
	public link findMiddle () {
		link Slow= firstlink;
		link Fast = firstlink;
		
		while (Fast.next!=null) {
			
			Slow=Slow.next;
			Fast=Slow.next.next;
			
		}
		
		return Slow;
	}
	
}
