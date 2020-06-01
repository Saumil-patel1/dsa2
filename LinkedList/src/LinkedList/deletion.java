package LinkedList;



public class deletion {
	Node head; 	  
     class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
     void deletingaspecificNode(int variable) {
               Node temp = head;
               Node prev = null; 
  
             if (temp != null && temp.data == variable) 
        { 
            head = temp.next;
            return; 
        } 
      while (temp != null && temp.data != variable) 
               { 
            prev = temp; 
            temp = temp.next; 
        }     
   if (temp == null)
	   return; 
   prev.next = temp.next; 
    } 
   public void elements(int currentdata) 
    { 
        Node new_node = new Node(currentdata); 
        new_node.next = head; 
        head = new_node; 
    } 
          public void print() 
    { 
        Node node = head; 
        while (node != null) 
        { 
            System.out.print(node.data+" "); 
            node = node.next; 
        } 
    } 
  

	 public static void main(String[] args) {
		 deletion linkedlist = new deletion(); 
		  
	        linkedlist.elements(7); 
	        linkedlist.elements(1); 
	        linkedlist.elements(3); 
	        linkedlist.elements(2); 
	        linkedlist.elements(10); 
	        linkedlist.elements(2); 
	        linkedlist.elements(5); 
	        System.out.println("before"); 
	        linkedlist.print(); 
	        linkedlist.deletingaspecificNode(1); 
	        linkedlist.deletingaspecificNode(10); 
	        linkedlist.deletingaspecificNode(5); 
	        System.out.println("\nafter"); 
	        linkedlist.print(); 
	    } 
}