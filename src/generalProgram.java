import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class generalProgram {

	
// String 
	//Write code to check a String is palindrome or not? 
	// Write a method which will remove any given character from a String? 
	// Print all permutation of String both iterative and Recursive way? 
	// How to count occurrence of a given character in a String?
	//How to check if two String are Anagram?
	//How to convert numeric String to int in Java?
	
	
// Programming questions on Array
	
	//In an array 1-100 numbers are stored, one number is missing how do you find it?
	//In an array 1-100 exactly one number is duplicate how do you find it? 
	//In an array 1-100 multiple numbers are duplicates, how do you find it? 
	//Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
	//How do you find second highest number in an integer array?
	//How to find all pairs in array of integers whose sum is equal to given number?
	//How to remove duplicate elements from array in Java? (solution)
	//How to find largest and smallest number in array? (solution)
	//How to find top two maximum number in array? (solution)


	//How to check if two String are Anagram?
	// Another example is "silent" which can be rearranged to "listen".
	
	public static boolean isAnagram (String str1, String str2) {
		
		// convert both the strings to char array 
		
		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		
		char i= (Character) null;		
		
		
		Arrays.asList(charStr1);
		Arrays.asList(charStr2);
		
		
		Scanner sc= new  Scanner(System.in);
		int n = sc.nextInt();
	
		
		// convert them to List of string 
		
		//List<char[]> str1List = Arrays.asList(charStr1);
		//List<char[]> str2List = Arrays.asList(charStr2);
		
		for (char chr: charStr1) {
			
			
			
		}
		
		
		
		return false;
		
	}

	//Write code to check a String is palindrome or not?	
	public static boolean isPalendrom (String str) {		
		// reverse the string 		
		char [] strChar = str.toCharArray();
		char[] reversedarrey = new char[strChar.length];
		String newstring = "";
		
		for (int i =strChar.length-1;i>=0;i--) {
			
			newstring=newstring.concat(String.valueOf(strChar[i]));
			}
		
		System.out.println (newstring);
		
		if (newstring.equals(str))
			return true;
		else {
			return false;
		}		
	}
	
	
	// Write a method which will remove any given character from a String? 
	public static String removeCharFromString (char chartoRemoved, String providedString) {
		
		// convert the string to the char array
		String newString = "";
		char[] providedArrey = providedString.toCharArray();
		
		for (int i=0;i<providedArrey.length;i++) {			
			// build the string back			
			if (providedArrey[i]!=chartoRemoved) {
				newString=newString.concat(String.valueOf(providedArrey[i]));			
			}			
		}
		
		return newString;
		
		
	}
	
	
	//How to count occurrence of a given character in a String?
	public static int findOccurance (String srt, char chr) {
		
		char[] providedStringArray= srt.toCharArray();
		
		int icount =  0;
		for (int i=0;i<providedStringArray.length;i++) {
			
			if (providedStringArray[i]==chr) {
				icount=icount+1;
			}
			
		}
		
		
		
		return icount;
		
		
	}
	
	//AAAABBBC - A4B3C1
	
	public static String convertString (String str) {
		
		// convert to array 
		
		char [] providedStringArr = str.toCharArray();
		String ExceptedString = "";
		
		int icount = 1;
		
		for (int i = 0; i<providedStringArr.length;i++) {			
				
			char compare= providedStringArr[i];
			
			if (i==providedStringArr.length-1) {
				ExceptedString=ExceptedString+providedStringArr[providedStringArr.length-1]+icount;
				break;
			}
			
			if (compare==providedStringArr[i+1]) {
				
				icount=icount+1;
			}
			else {
				ExceptedString=ExceptedString+compare+icount;				
				compare=providedStringArr[i+1];
				icount = 1;
			}
			
		}
				
		
		return ExceptedString;
		
		
	}
	
	// Write a program to find the arm strong number between 0 to 999 
		
	public static List <String> findArmStrongNumber () {
						
		for (int a =0;a<=9;a++ ) {
			for (int b=0;b<=9;b++){
				for (int c=0;c<=9;c++){					
					String sarmstrong = Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
					
					if (a*a*a+b*b*b+c*c*c==Integer.parseInt(sarmstrong)) {		
						System.out.println(Integer.parseInt(sarmstrong));				
						 
					}
					
				}
			}
			
		}
		
		
		
		
		
		
		return null;
		
		
	}
		
	public static char firstNonRepeatingChar(String word) 
	{ 
		Set<Character> repeating = new HashSet<>();
		
		List<Character> nonRepeating = new ArrayList<>(); 
		
		for (int i = 0; i < word.length(); i++) { 
			char letter = word.charAt(i); 
		if (repeating.contains(letter)) 
			
		{ 
			continue; 
		}
		
		if (nonRepeating.contains(letter)) 
		{ 
			nonRepeating.remove((Character) letter); 
		
			repeating.add(letter); 
		} 
		else
		{ 
			nonRepeating.add(letter); 
			} 
		} 
		return nonRepeating.get(0);
		} 
		
	// Create Line
	
	public static String CreateLine (int n, int x) {
		
		String s="";
		String exp ="";
		for (int i=n;i>=1;i--) {
			if (i<=x) {
			s="*";
			}
			else {			
			s=" ";
			
			}
		exp = exp+s;			
		//System.out.println (exp);	
		}
		
		return exp;		
	}
		
	// Print all permutation of String both iterative and Recursive way?
	
	public static ArrayList<String> permutations(String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    if (s.length() == 1) {
	        out.add(s);
	        return out;
	    }
	    char first = s.charAt(0);
	    String rest = s.substring(1);
	    for (String permutation : permutations(rest)) {
	        out.addAll(insertAtAllPositions(first, permutation));
	    }
	    return out;
	}
	
	public static ArrayList<String> insertAtAllPositions(char ch, String s) {
	    ArrayList<String> out = new ArrayList<String>();
	    for (int i = 0; i <= s.length(); ++i) {
	        String inserted = s.substring(0, i) + ch + s.substring(i);
	        out.add(inserted);
	    }
	    return out;
	}
		
	//Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
	public static void findnotpresent (int[]input1, int[]input2) {
		
		for (int i=0;i<input1.length;i++) {
			
			if (!isPresent(input1[i],input2)){
				
				System.out.println(input1[i]);
				
			}
			
		}
		}
	
	public static boolean isPresent(int find, int[]input) { 
	
		boolean bpresent = false; 
		for (int i=0;i<input.length;i++) {
			
			if (find==input[i]) {
				
				return true;
				}
			}
		return bpresent;
	}
		
	
	
	//How do you find second highest number in an integer array?
	public static void find2ndHighest (int[] input) {
		int biggest, ndBiggest2;
		if (input[0]>input[1]) {
			 biggest=input[0];
			 ndBiggest2 =input[1];
		}
		else {
			 biggest=input[1];
			 ndBiggest2 =input[0];
		}

		for (int i=2;i<input.length;i++) {
			
			if (input[i]>biggest) {
				ndBiggest2=biggest;
				biggest=input[i];
				}
			else {
				if (input[i]>ndBiggest2) {
					
					ndBiggest2=input[i];
				}
			}
		}
		
		System.out.println(ndBiggest2);
		
	}
	
	// Find Min difference in an Integer array 
	
	

	
	//*********************************************************************************************************
	//*
	//*Sorting algorithms 
	//*********************************************************************************************************
	
	
	// Bubble sort 
	//execution time O(n`2) 
	
	public static int [] BubbleSort (int [] input) {
		
		int i, j;
		int temp =0;
		
		for (i=0;i<input.length-1;i++) {
			
			for (j=0;j<input.length-1-i;j++) {
				
				if (input[j] > input[j+1]) {
					// swap the j and j+1 positions
					
					temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
					}
				}
			}
		return input;
		}
	
	
	// Ineset Sort 
	// execution time O(n`2)
	
	public static int [] InsertSort (int [] input)  {

		int i,j;
		int K;
		int temp =0;

		for (i=1;i<input.length;i++) {
			j=i;
			K=input[i];

			while (j>0 && K<input[j-1]) {

				// swap 
				temp = input[j];
				input[j]=input[j-1];
				input[j-1]=temp;
				j--;
			}

		}
		return input;
	}
	
	
	
	// merge sort 
	public static int [] MergeSort (int [] input)  {
		
		
		return input;
		
	}
	
	
	// Helper method for Merge two sorted arrays 
	
	public void merge (int[] tobemerged, int leftArrLength, int rightArrLength ) { 
		
		int[] output = null ;
		
		for (int i=0;i<tobemerged.length/2;i++) {
			
			if (tobemerged[i]<tobemerged[tobemerged.length-leftArrLength]){
				output[i]=tobemerged[i];
			}
			else {
				output[i]=tobemerged[tobemerged.length-leftArrLength];
			}
			
		}
		
		
	}
		

	
	
	public static List<String> mainMethodforcombination (String inputstr) {
		
		List<String> outList= new ArrayList<String>();
		
		if (inputstr.length()==1) {
			outList.add(inputstr);
			return outList;
		}
		
		char first=inputstr.charAt(0);
		String rest = inputstr.substring(1);
		
		for (String eachString:mainMethodforcombination(rest))	{
			
			outList.addAll(addtoAllpositions (first,eachString ));
		}	

		return outList;
		
	}
	
	
	// Helper method for adding char to all positions 
	
	public static List<String> addtoAllpositions (char ch, String str) {

		// add to all positions 
		
		
		List<String> AllPositions = new ArrayList<String>();
		for (int i = 0; i<=str.length();i++) {

			String Str1= str.substring(0,i)+ch+str.substring(i);
			//System.out.println (Str1);
			AllPositions.add(Str1);
		}

		return AllPositions;
}
	
	
	public static void main(String[] args) {
		
		

		
		//int[] input3={1,2,3,4,5,6,7,2};
		
		
		
		//findduplicate (input3);
		
		
		//System.out.println (9^8);
		
		int[] input4={9,3,8,9,8};
		
		System.out.println(findnonDuplicateInArray (input4));
		
		

	}

	
	public static int returnbiggestdiff (int[] input) {
		
		int diff = 0;
		
		for (int i= 0 ; i<input.length; i++) {
			
			for (int j=i+1;j<input.length-1;j++) {
				
				if (input[j]>input[i]) {
					int tempdiff = input[j]-input[i];
					
					if (tempdiff > diff) {
						diff = tempdiff;
						
					}
					
				}
				
			}
		}
		
		
		return diff;
		
	}
	
	


public static String reverseString (String sinput) {
	
	if (sinput.toCharArray().length==1) {
		return sinput;
		
	}
	String sreversed = reverseString(sinput.substring(1))+sinput.toCharArray()[0];
	
	

	return sreversed;
	
}

/**
 * Find duplicate item in a int array 
 * @param input
 */
public static void findduplicate (int[] input) {
	
	Set<Integer> hasset= new HashSet<Integer>();
		
	for (int i=0;i<input.length;i++) {
		
		if (!hasset.add(input[i])) {
			System.out.println("duplicate"+ input[i]);
		}
		
	}
	
	
	
}



// A child is running up a ladder with n steps, and can hop either 1 step or 2 steps at a time. Calculate how many possible ways the child can run up the ladder.

public static int countways (int n) {
	if (n==0) {
		return 0;
	}
	
	if (n==1||n==2) {
		return n;
	}
	
	else {
		
		return countways(n-1)+countways (n-2);
	}
	
}


// Sort an almost sorted array where only two elements are swapped
// Example : input = {2, 8, 5, 7, 4, 9}

public static void FixThepartiallySortedArray (int[] input) {
	
	for (int i=input.length-1;i>0;i--) {
		
		if (input[i]<input[i-1]) {
			
			int j=i-1;
			while (j>=0 && input[i]<input[j]) {
				j--;}
				// Swap input[i] and input[j]
				
				System.out.println("swap :"  +input[i] + "and " + input[j+1]);
				
				
				break;
			
			
		}
		
		
	}
	
	
}



//Find a Number that Appears Only once in array of Duplicates

//int[] input4={9, 9, 5, 4,4,8,5, 6, 6};
public static int findnonDuplicateInArray (int[]input) {
	
	int ans = input[0];
	
	for (int i=1;i<input.length;i++) {
		
		ans=ans ^ input[i];
		//stem.out.println(ans);
		
	}
	
	
	return ans;
	
}



// Count Pairs of Numbers with a Given Difference K

/*Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n. Return count of such pairs.

Example k=4 and a[]={7,6,23,19,10,11,9,3,15}
Output should be : 6
Pairs can be:
7,11
7,3
6,10
19,23
15,19
15,11*/


//public static int countpairs();


}
/*	
    Scanner sc = new Scanner (System.in);
    
    int ntest= sc.nextInt()
    String itest = sc.next();
*/
	

