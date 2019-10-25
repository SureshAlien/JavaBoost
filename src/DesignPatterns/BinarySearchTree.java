package DesignPatterns;

class Node
{
	int data ;
	Node left ;
	Node right ;	
}

class BST
{
	public Node insert(Node node,int val)
	{
		if(node == null) {
			return createNewNode(val);
		}
		
		return node;
		
	}

	private Node createNewNode(int val) {
		Node  node = new Node ();
		node.data = val ;
		node.left = null;
		node.right = null;
		return node;
	}
	
}

public class BinarySearchTree {
	
	public static void main(String[] args) {
		BST a = new BST();
		Node root =null ;
		
		a.insert(root,8);
		
		
	}

}

//https://www.youtube.com/watch?v=81PpYQ0AN_w
