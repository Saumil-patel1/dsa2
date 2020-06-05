package LinkedList;

public class removeloop {
	private Node head;
	 void SinglyLinkedList(){
	  head = null;
	 }
	 static class Node{
	  int i;
	  Node next;
	  Node(int i){
	   this.i = i;
	   this.next = null;
	  }
	  public void displayData(){
	   System.out.println("i= " + i);
	  }
	 }
	 public void insertLast(Node newNode){
	  if(isEmpty()){
	   head = newNode;
	  }else{
	   Node current = head;
	   while(current.next != null){
	    current = current.next;
	   }
	   current.next = newNode;
	  }
	 }
	 public boolean isEmpty(){
	  return head == null;
	 }
	 
	 public Node findStartOfLoop(){
	  Node fast, slow;
	  fast = slow = head;
	  boolean loopFlag = false;
	  while(slow != null && fast != null && fast.next != null){
	   fast = fast.next.next;
	   slow = slow.next;
	   if(fast == slow){
	    loopFlag = true;
	    break;
	   }
	  }
	  if(loopFlag){
	   System.out.println("Loop detected in liked list");
	   slow = head;
	   while(slow != fast){
	    slow = slow.next;
	    fast = fast.next;
	   }
	  }else{
	   System.out.println("No Loop detected in the linkedlist");
	   fast = null;
	  }
	  return fast;
	 }
	  public void removeLoop(Node startNode){
	  Node fast, slow;
	  fast = slow = startNode;
	  
	  while(fast.next != slow){
	   fast = fast.next;
	  }
	  fast.next = null;
	 }
	 public void displayList(){
	  Node current = head;
	  while(current != null){
	   current.displayData();
	   current = current.next;
	  }
	 }
	public static void main(String[] args) {
 removeloop list = new removeloop();
		  Node node = new Node(30);
		  list.insertLast(new Node(10));
		  list.insertLast(new Node(20));
		  list.insertLast(node);
		  list.insertLast(new Node(40));
		  list.insertLast(new Node(50));
		  Node loopStartNode = list.findStartOfLoop();
		  System.out.println("Starting node" + loopStartNode.i);
		  list.removeLoop(loopStartNode);
		  list.displayList();
		  }

}
