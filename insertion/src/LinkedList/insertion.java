package LinkedList;

public class insertion {
	 static class Node { 
	        public int data; 
	        Node nextNode; 
	  	         Node(int data) { 
	            this.data = data;    } 
    }	  
	    	    static Node GetNode(int data) { 
	        return new Node(data); 
	    } 
	  
	    static Node InsertPos(Node headNode, int position, int data) { 
	        Node head = headNode; 
	        if (position < 1) 
	            System.out.print("plz provide valid one!"); 
	  	           if (position == 1) { 
	            Node newNode = new Node(data); 
	            newNode.nextNode = headNode; 
	            head = newNode; 
	        } else { 
	            while (position-- != 0) { 
	                if (position == 1) { 
	                  Node newNode = GetNode(data); 
	                newNode.nextNode = headNode.nextNode; 
	                 headNode.nextNode = newNode; 
	                    break; 
	                } 
	                headNode = headNode.nextNode; 
	            } 
	            if (position != 1) 
	                System.out.print("Position out of range"); 
	        } 
	        return head; 
	    } 
	  
	    static void PrintList(Node node) { 
	        while (node != null) { 
	            System.out.print(node.data); 
	            node = node.nextNode; 
	            if (node != null) 
	                System.out.print(","); 
	        } 
	        System.out.println(); 
	    } 
	 public static void main(String[] args) {
		  Node head = GetNode(3); 
	        head.nextNode = GetNode(4); 
	        head.nextNode.nextNode = GetNode(7); 
	        head.nextNode.nextNode.nextNode = GetNode(12); 
	        System.out.print("before "); 
	        PrintList(head); 
	        head = InsertPos(head, 3, 12); 
	        System.out.println("after "); 
	        PrintList(head); 
	        head = InsertPos(head, 4, 10); 
	        System.out.println("after "); 
	        PrintList(head); 



	}

}
