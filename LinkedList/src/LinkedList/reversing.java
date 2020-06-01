package LinkedList;

public class reversing {
	private Node head;
	 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 }
	}
 public void add(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
		System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 public static Node reverseList(Node currentNode)
	{
				Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			currentNode.next=previousNode;
		previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}
	public static void main(String[] args) {
		reversing list = new reversing();
		Node head=new Node(5);
		list.add(head);
		list.add(new Node(6));
		list.add(new Node(7));
		list.add(new Node(1));
		list.add(new Node(2));
 
		list.printList(head);
		Node reversing=reverseList(head);
		System.out.println("After reversing");
		list.printList(reversing);
 
	}

	}


