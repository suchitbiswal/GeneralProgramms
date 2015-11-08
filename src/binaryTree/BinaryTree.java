package binaryTree;

public class BinaryTree {

	Node root;
	
	public void addNode (int key, String name) {
		
		Node newnode = new Node (key,  name) ;
	
		
		// Check if the root is null , if yes then added Node has to be the root Node 
		if (root == null) {
			root = newnode;
		} else {
			
			Node focusNode = root;			
			Node parent;
			
			while (true) {
				parent = focusNode;
				if (key <focusNode.key) {
					focusNode= focusNode.leftChild;
					
				}
			}
			
			
			
		}
		
		
		
	}
	
}
