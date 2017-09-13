package ds.algo;

import java.util.LinkedList;
import java.util.Queue;

import ds.algo.BST.BSTNode;

public class TreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		tree.insert(25);
		tree.insert(15);
		tree.insert(50);
		tree.insert(10);
		tree.insert(22);
		tree.insert(35);
		tree.insert(70);
		System.out.println("root is: " + tree.getRoot().data );
		levelOrder(tree.getRoot());		

	}
	
	static void levelOrder(BSTNode bstNode) {
	       
	       Queue<BSTNode> queue = new LinkedList<>();
	       queue.add(bstNode);
	       while(!queue.isEmpty())
	       {
	    	   BSTNode n = queue.poll();
	    	   System.out.print(n.data + " ");
	    	   if(n.left!=null)
	    		   queue.add(n.left);
	    	   if(n.right!=null)
	    		   queue.add(n.right);
	       }
	      
	      
	    }

}


class Node {
	int data;
    Node left;
    Node right;

}

