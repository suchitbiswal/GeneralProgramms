
public class singleton {

	// Instance of the class 
	private static singleton instance = new singleton();
	
	// make the constructor private so that it is not exposed out side 
	private singleton() {
	}
	
	// public method to expose the instance of the class 
	
	public static singleton getInstance () {
		
		return instance;
	} 
	
	
	
}
