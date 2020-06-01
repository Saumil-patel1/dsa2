package LinkedList;

import LinkedList.insertion.Node;

public class rotation {
	   Node head;
public rotation() {
	        this.head= null;
	    }
public rotation(Node head) {
	        this.head = head;
	        this.head= null;
	    }
  public void rotateLeft() {
	         if (head != null) { 
	            Node temp = head;
	            if (head.nextNode!= null) { 
	                head = head.nextNode;
	            }

	            Node tail;
	            if (head.nextNode != null) {
	                tail = head.nextNode;
	            } else {
	               tail = head;
	            }
	            while (tail.nextNode != null) {
	                if (tail.nextNode != null) {
	                    tail = tail.nextNode;
	                }
	            }
	            tail.nextNode=temp;
	            temp.nextNode=null;
	        }
	    }
 public void rotateRight() {
	  	        if (head != null) { 
	            Node tail = null;
	            Node current = head;

	            while (current.nextNode != null) {
	                tail = current;
	                current = current.nextNode;
	            }
	            if (tail != null) { 
	                tail.nextNode=null;
	                current.nextNode=head;
	                head = current;
	            }
	        }
	    }

	    public void printList() {
	        Node point = head;
	        while (point != null) {
	            System.out.print(point.data + ", ");
	            point = point.nextNode;
	        }
	        System.out.println();
	    }

	    public void add(int data) {
	        Node temp = new Node(data);

	        if (head == null) {
	            head = temp;
	        } else {
	            Node current = head;

	      while (current.nextNode != null) {
	         current = current.nextNode;
	            }
             current.nextNode=temp;
	        }
	    }
	    public static void main(String[] args) {
	        rotation yes = new rotation();
	        yes.add(1);
	        yes.add(2);
	        yes.add(4);
	        yes.add(9);
	        yes.add(0);
	        yes.add(53);
	        System.out.println("before rotation");
	        yes.printList();
	        System.out.println("after left rotation");
	        yes.rotateLeft();
	        yes.printList();
	        System.out.println("after right rotation");
	       yes.rotateRight();
	        yes.printList();
	    }

	
}