package LinkedList;

public class nodefromlast {
	  private class ListNode
  {
		  int value;
	   ListNode next; 
	  ListNode(int value)
			  {
	 	  this.value = value;
	     } 	    }
	 	   ListNode head;
	  ListNode tail;	    
	 public void NthNodeFromLast()
	 {
	 	         }
   private void appendNode(int value)
	     {
       if (head == null)
	 	     {
	 	     head = new ListNode(value);
	 	  tail = head;
	    return;
	    }         ListNode n = new ListNode(value);
	      tail.next = n;
	    		  tail = n;
	 	    }
	 	
	 	    public void createLinkedList()
	 	    {
	 	        for (int i = 1; i <= 7; i++)
	 	        {
	 	            appendNode(i);
	        }	    }
	 	   public void printList()
	 	    	 	    {
	 	        ListNode temp = head;
	 	        
	  	        while (temp != null)
	 	        {
	 	            System.out.print(temp.value + "->" );
	  	            temp = temp.next;
	       }
	  	        System.out.print("null" );
	  	    }
	  	    
	  	    
	  	    
	  	    public int findNthFromEnd(int n)
	  	    {
	  	        ListNode node1 = head, node2 = head;
	  	        
	  	        int count = 1;
	        
	 	         
	  	while (node1 != null)
  	        {         if (count == (n+1))  
  	     {
	     break;
	     }
  	        count += 1;
	 node1 = node1.next;
	        }
	  	          	         
  if (count == (n+1))
	  	        {
	  while (node1 != null)
	  	            {
	        node1 = node1.next;
	  	    node2 = node2.next;           
	  	    }
	  	 return node2.value;
	  	  }
	     else
	  {
	System.out.println("\nError: The length of the list is less than "  + n);
	  	      return -1;
	  	     }
	  	    }
	public static void main(String[] args) {
		nodefromlast sol = new nodefromlast();
		 sol.createLinkedList(); 	        
		  sol.printList();
 System.out.println("n'th node from the last is  "  + sol.findNthFromEnd(2));
 }

}
