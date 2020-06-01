package LinkedList;

public class middleone {
	static class Node  
	{  
	    int data;  
	    Node next;  
	}
	static Node newNode(int data)  
	{  
	    Node temp = new Node();  
	    temp.data = data;  
	    temp.next = null;  
	    return temp;  
	}  
	  
	static Node middle;  
	static int f; 
		static void middleelement(Node head )  
	{    
	    if (head == null)  
	    {  
	        f = (f) / 2;  
	        return;  
	    }  
	      f = f + 1;  
	    middleelement(head.next);  
	    f = f - 1;  
	    if (f == 0)  
	    {  
	    	middle = head;  
	    }  
	}  
	  
	static Node midpoint(Node head)  
	{  
	    middle = null;  
	    f= 1;  
	    middleelement(head);  
	    return middle;  
	}  
public static void main(String[] args) {
		 
		    Node head = newNode(1);  
		    head.next = newNode(5);  
		    head.next.next = newNode(2);  
		    head.next.next.next = newNode(9);  
		    head.next.next.next.next = newNode(0);  
		    head.next.next.next.next.next = newNode(07);  

		    Node result  = midpoint(head);  
		    System.out.println("middle element is...");
		    System.out.print( result.data );  
		} 
		}  

	
