package bonusUppgift_15;

/** A linked list
 * 
 * @author Anton Johansson D0010E
 *
 * @param <E> General Class
 */

public class FastDictionary<E> {
	
	private Node<E> start;
	
	/**
	 * Creates a Linked list
	 */
	public FastDictionary() {
		start=new Node<E>();
	}
	
	/**
	 * Inserts item first in the list
	 * @param item Element to be inserted
	 */
	public void insert(E item) {
		Node<E> newnode=new Node<E>();
		newnode.item=item;
		if(this.start.next!=null) this.start.next.prev=newnode;
		newnode.next=this.start.next;
		newnode.prev=this.start;
		this.start.next=newnode;
	}
	
	/**
	 * Looks up if the specified element exists in the list
	 * @param item element to be looked up
	 * @return true if element exist(done with .equals(item)
	 */
	public boolean lookup(E item) {
		Node<E> node=start.next;
		while(node!=null) {
			if(node.item.equals(item)) {
				node.prev.next=node.next;
				node.next=start.next;
				node.prev=start;
				start.next=node;
				return true;
			}
			node=node.next;	
		}
		return false;
	}
	
	/**
	 * overwritten toString
	 */
	public String toString() {
		String output="";
		Node<E> node=start.next;
		while(node!=null) {
			output+="("+node.toString()+"),";
			node=node.next;
		}
		
		
		return output;
	}
	
	private class Node<E>{
		E item;
		Node<E> next;
		Node<E> prev;
		
		public String toString() {
			return item.toString();
		}
	}

	public static void main(String[] args) {
		FastDictionary<Integer> hej=new FastDictionary();
		hej.insert(5);
		hej.insert(2);
		hej.insert(3);
		System.out.println(hej);
		System.out.println(hej.lookup(5));
		System.out.println(hej);
		System.out.println(hej.lookup(2));
		System.out.println(hej);
	}

}
