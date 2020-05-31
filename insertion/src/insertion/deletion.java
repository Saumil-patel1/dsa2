package insertion;

import insertion.insertion.Node;

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
  
   
    void deletingaspecificNode(int vari) 
    { 
               Node temp = head;
               Node prev = null; 
  
             if (temp != null && temp.data == vari) 
        { 
            head = temp.next;
            return; 
        } 
  
        while (temp != null && temp.data != vari) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
   if (temp == null)
	   return; 
   prev.next = temp.next; 
    } 
   public void elements(int new_data) 
    { 
        Node new_node = new Node(new_data); 
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
		 deletion list = new deletion(); 
		  
	        list.elements(7); 
	        list.elements(1); 
	        list.elements(3); 
	        list.elements(2); 
	        list.elements(10); 
	        list.elements(2); 
	        list.elements(5); 
	        System.out.println("before"); 
	        list.print(); 
	        list.deletingaspecificNode(1); 
	        list.deletingaspecificNode(10); 
	        list.deletingaspecificNode(5); 
	        System.out.println("\nafter"); 
	        list.print(); 
	    } 
}