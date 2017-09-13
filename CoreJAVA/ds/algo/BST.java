package ds.algo;

public class BST
{
    private BSTNode root;

    /* Constructor */
    public BST()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public BSTNode getRoot()
    {
    	return root;
    }
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private BSTNode insert(BSTNode node, int data)
    {
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

class BSTNode
	 {
	     BSTNode left, right;
	     int data;
	 
	     /* Constructor */
	     public BSTNode()
	     {
	         left = null;
	         right = null;
	         data = 0;
	     }
	     /* Constructor */
	     public BSTNode(int n)
	     {
	         left = null;
	         right = null;
	         data = n;
	     }
	     /* Function to set left node */
	     public void setLeft(BSTNode n)
	     {
	         left = n;
	     }
	     /* Function to set right node */ 
	     public void setRight(BSTNode n)
	     {
	         right = n;
	     }
	     /* Function to get left node */
	     public BSTNode getLeft()
	     {
	         return left;
	     }
	     /* Function to get right node */
	     public BSTNode getRight()
	     {
	         return right;
	     }
	     /* Function to set data to node */
	     public void setData(int d)
	     {
	         data = d;
	     }
	     /* Function to get data from node */
	     public int getData()
	     {
	         return data;
	     }     
	 }
}