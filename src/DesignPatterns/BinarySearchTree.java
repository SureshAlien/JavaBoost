package DesignPatterns;

class Node
{
	int data ;
	Node left ;
	Node right ;
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}	
}

class BST
{
	public Node insert(Node node,int val)
	{
		if(node == null) {
			System.out.println("came  inside node null");

			return createNewNode(val);
		}
		if(val < node.data) {
			System.out.println("came  inside node left");
			node.left = insert(node.left ,val);
		}
		if(val > node.data) {
			System.out.println("came  inside node right");
			node.right = insert(node.right ,val);
		}
		
		return node;
	}
	private Node createNewNode(int val) {
		Node  node = new Node ();
		node.data = val ;
		node.left = null;
		node.right = null;
		//System.out.println(node);

		return node;
	}	
}

public class BinarySearchTree {	
	public static void main(String[] args) {
		BST a = new BST();
		Node root =null ;		
		root = a.insert(root,8);
		System.out.println(root);
		root = a.insert(root,3);	
		System.out.println(root);
		root = a.insert(root,10);	
		System.out.println(root);
		root = a.insert(root,20);	
		System.out.println(root);




	}

}

//https://www.youtube.com/watch?v=81PpYQ0AN_w
