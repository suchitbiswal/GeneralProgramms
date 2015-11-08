package binaryTree;

public class Node {
	
	// Key is the value that decide where the Node will be placed, we are using name just for reference. 
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node (int key, String name){
		this.key=key;
		this.name=name;
		
		// when ever a node is created the left and right child are always null for the new node 
		this.leftChild=null;
		this.rightChild=null;
		
	}
	
	
	public String toString () {
		return name +"has a key :" + key;
	}
	
	
	
	
	
	
	
}
