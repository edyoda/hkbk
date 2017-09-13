package recursionexamples;

public class ReverseLinkedList {

	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    static /* Function to reverse the linked list */
    Node recursiveReverse(Node node) {
    	if(node == null || node.next == null)
    		return node;
    	Node remaining = recursiveReverse(node.next);
    	node.next.next = node;
    	node.next = null;
    	
		return remaining;
    }
    
    static Node reverse(Node node)
    {
    	Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    static // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        ReverseLinkedList.head = new Node(85);
        ReverseLinkedList.head.next = new Node(15);
        ReverseLinkedList.head.next.next = new Node(4);
        ReverseLinkedList.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        printList(head);
        //head = recursiveReverse(head);
        head = reverse(head);
        System.out.println(" Reversed linked list ");
        printList(head);
    }
}
