package Links;

public class SLList<E> {
	
	public static class Node<F> {
		// data fields
		private F data;
		private Node<F> next;
		
		// Constructor

		public Node(F data, Node<F> next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		public Node(F data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		// Methods
		
	}
	
	// date fields
	private Node<E> head;
	private int size;
	
	// Constructor
	SLList() {
		head=null;
		size=0;
	}
	
	// Methods
	
	public E addFirst(E item) {
		head = new Node<E>(item,head);
		size++;
		return item;
	}
	
	
	public E add(int index, E item) {
		if (index<0 || index>size) {
			throw new IllegalArgumentException();
		}
		
		Node<E> current = head;
		
		for(int i=0; i<index-1;i++) {
			current = current.next;
		}
		

		current.next = new Node<E>(item, current.next);
		size++;
		return item;
		
		
	
		
		
		
	}
	
	public E addLast(E item) {
		if (head==null) {
			return this.addFirst(item);
		}
		Node<E> current = head;
		while (current.next!=null) {
			current = current.next;
		}
		
		current.next = new Node<E>(item);
		size++;
		return item;
		
	}
	
	public E removeFirst() {
		
		if(head==null) {
			throw new IllegalStateException("Empty");
		}
		
		E temp = head.data;
		head = head.next;
		size--;
		return temp;
		

	}
	
	
	public E remove(int index) {
		return null;

	}
	
	public E removeLast() {
		return null;

	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		Node<E> current = head;
		s.append("[");
		while (current!=null) {
			s.append(current.data.toString()+",");
			current = current.next;
		}
		s.append("]");
		return s.toString();
		
	}
	
	public static void main(String[] args) {
		SLList<Integer> l = new SLList<>();
		
		l.addFirst(12);
		l.addFirst(7);
		l.addFirst(4);
		l.addLast(14);
		
		System.out.println(l);
	}
	
}
