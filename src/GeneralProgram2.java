import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;

public class GeneralProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//URLiFy ("Mr John Smith");
		
		
		StringCompress ("aabbe");
		
	}

	
	/**
	 * // Given two strings write a method to decide if one is a permutation of other 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean CheckMermutation (String input1, String input2) {
		
		
		if (input1.length()!=input2.length()) {
			return false;
			
		}		
		
		char[] inputar1= input1.toCharArray();
		char[] inputar2= input1.toCharArray();
				
		return inputar1.equals(inputar2);
		}
	
	
	/**
	 * Write a method to replace all the spaces in a string with %20, you may assume that it has sufficient space at the end to hold the extra char
	 * 
	 * Example : 
	 * input : "Mr John Smith" , 13
	 * output : Mr%20John%20Smith
	 * 
	 * @param sinput
	 */
	public static void URLiFy (String sinput) {
		
		// count the spaces 
		
		char[] inputarray = sinput.toCharArray();
		
		int spacecount = 0;
		for (char s :inputarray) {
			
			if (s==' ') {
					
				spacecount=spacecount+1;
			}
		}		
		
		// replace the spaces with %20		
		int newlength = inputarray.length+spacecount*2;
		
		char [] outPutArray = new char[newlength];
		
		int j= 0;
		
		for (int i = 0 ;i<inputarray.length;i++ ) {
			
			if (inputarray[i]!=' ') {
				
				outPutArray[j]=inputarray[i];
				j=j+1;				
			}			
			else {				
				outPutArray[j]='%';
				outPutArray[j+1]='2';
				outPutArray[j+2]='0';
				j=j+3;
			}
			
		}
		
		
		
		System.out.println(outPutArray.toString());
		
		
	}
	
	
	
	public static boolean PalindromPermutation (String Input) {
		
		//int numberofChars = Input.length();
		
		// Add to the hash table 
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		
		char[] inputarr = Input.toCharArray();
		
		for (char s:inputarr) {
			
			int count;
			if (table.get(s) == null){			
				table.put(s, 1);			
			}
			
			else {
				table.put(s, table.get(s)+1);		
	
			}}
			
			
			// Find out if this a PalindromPermutation or not 
		
		
			
			if (countNoofOdds(table.values())>1) {
				return false;
			}
			
			else {
				return true;
			}
			
			
	

		
	}

	private static int countNoofOdds (Collection<Integer> input) {
		int icount=0;
		for (int ind : input) {
			
			if (ind%2!=0) {
				++icount;
			}
		}		
		return icount;	
	}
	
	
	/**
	 * Compress a string , if aabbbddeee  to a2b3d2e3
	 * @param input
	 */
	public static void StringCompress (String input) {
		
		char[] inputarr = input.toCharArray();
		
		String outPut = "";
		int icount = 1;
		char compare = inputarr[0];
		for (int i =0;i<inputarr.length-1;i++ ) {
			
			
			if (compare==inputarr[i+1] && i<inputarr.length) {
				icount=icount+1;
				
			}
			
			else {
				
				outPut=outPut+compare+""+icount;
				icount=1;
				compare=inputarr[i+1];
				
			}
			
			
			//if 
			
			
			}
			
		 
			System.out.println(outPut);
			
		}
		
		
		
	
	
}



