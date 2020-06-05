package LinkedList;

public class yshape {
	static Node head1, head2; 
	  static class Node { 
	         int data; 
	        Node next; 
	  Node(int s) 
	        { 
	            data = s; 
	            next = null; 
	        } 
	    } 
	    int getNode() 
	    { 
	        int x =numberof(head1); 
	        int y = numberof(head2); 
	        int d; 
	  
	        if (x > y) { 
	            d = x - y; 
	            return intersection(d, head1, head2); 
	        } 
	        else { 
	            d = y - x; 
	            return intersection(d, head2, head1); 
	        } 
	    } 
	 	    int intersection(int d, Node node1, Node node2) 
	    { 
	        int i; 
	        Node currentx = node1; 
	        Node currenty = node2; 
	        for (i = 0; i < d; i++) { 
	            if (currentx == null) { 
	                return -1; 
	            } 
	            currentx = currentx.next; 
	        } 
	        while (currentx != null && currenty != null) { 
	            if (currentx.data == currenty.data) { 
	                return currentx.data; 
	            } 
	            currentx = currentx.next; 
	            currenty = currenty.next; 
	        } 
	     return -1; 
	    }
	    int numberof(Node node) 
	    { 
	        Node current = node; 
	        int count = 0; 
	  
	        while (current != null) { 
	            count++; 
	            current = current.next; 
	        } 
	    return count; 
	    }
	  
	public static void main(String[] args) {
	yshape yes= new yshape();
	yes.head1=new Node(5);
	   yes.head1.next = new Node(4); 
       yes.head1.next.next = new Node(2); 
       yes.head1.next.next.next = new Node(0); 
       yes.head1.next.next.next.next = new Node(12);
		  
       yes.head2 = new Node(4); 
       yes.head2.next = new Node(9); 
       yes.head2.next.next = new Node(8); 
       System.out.println("y shape " + yes.getNode());
		  	}

}
