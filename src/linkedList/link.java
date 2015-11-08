package linkedList;

public class link {

	
	public String bookName;
	public int millionsSold;	
	public link next;
	
	public link (String bookName,int millionsSold ) {
		this.bookName=bookName;
		this.millionsSold=millionsSold;		
	}
	
	public void display() {
		System.out.println(bookName + "Millions of booksold" + millionsSold +"00,0000");
	}
	
	public String toString (){
		return bookName;
	}
	
	public static void main (String[] str) {
		
	}
	
	
}
