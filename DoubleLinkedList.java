import java.util.NoSuchElementException;

public class DoubleLinkedList<E>{

	
	
	class Node<E> {
		
		private E data;
		
		private Node<E> next;
		private Node<E> prev;
		
		public Node()
		{
			data = null;
			next = null;
			prev = null;
		}
		
		public Node(E data, Node<E> next) 
		{
			this.data = data;
			this.next = next;
			this.prev = null;
		}

		
		
		
		public String toString()
		{
			if(data == null){
				return null;
			}
			return data.toString();
		}
	}
	
	
	

	private Node<E> front;
	private Node<E> rear;

	private int size;



	public int size() {
		return size;
		
		
	}



	public void addToRear(E data) {
		if (size==0) {
			rear = new Node<E>(null, null);
			front = new Node<E>(data, rear);
			rear.prev = this.front;
			size++;
		}else if(rear.data==null) {
			Node<E> temp = new Node<E>(null, null);
			temp.data=data;
			temp.next = rear;
			temp.prev = rear.prev;
			rear.prev.next = temp;
			rear.prev = temp;
			//System.out.println(rear.prev);
			size++;
			}
	
	}
	
	public void addToFront(E data) {
		if (size==0) {
			this.rear = new Node<E>(null, null);
			this.front = new Node<E>(data, rear);
			this.rear.prev = this.front;
			this.front.prev = null;
			size++;
		}else{
			Node<E> temp = new Node<E>(null, null);
			temp.data = data;
			temp.next = front;
			front.prev = temp;
			temp.prev = null;
			front = temp;
			size++;
		}
	
	}
	
	
	// should throw NoSuchElementException if it can't remove
	public E removeFromRear(){
		E temp = rear.prev.data;
		if(size > 1){
			rear.prev = rear.prev.prev;
			rear.prev.next = rear;
		}else if(size==1){
			rear.prev = null;
			front.data = null;
			front.next = null;
		}else{
			throw new NoSuchElementException("No elements to remove");
		}
		size--;
		return temp;

	}
	
	// should throw NoSuchElementException if it can't remove
	public E removeFromFront(){
		if(size==0){
			throw new NoSuchElementException("No elements to remove");
		}
		E temp = front.data;
		front = front.next;
		front.prev = null;
		size--;
		return temp;
	}
	
	// takes in 0 based position, should throw NoSuchElementException if it can't remove
	public E get(int pos){
		if(pos<0 || pos>=size){
			throw new NoSuchElementException("Position does not exist");
		}
		if(pos<size/2){
			//front
			Node<E> memory = new Node<E>();
			memory = front;
			for(int i = 0; i < pos; i++){
				front = front.next;
			}
			Node<E> temp = front;
			front = memory;
			return temp.data;
		}else{
			//rear
			Node<E> memory = new Node<E>();
			memory = rear;
			for(int i = 0; i < size-pos; i++){
				rear = rear.prev;
			}
			Node<E> temp = rear;
			rear = memory;
			return temp.data;
		}
	}

	

	public String toString(){
		String str = "";
		Node<E> temp = front;
		while(temp.next != null){
			//System.out.println(temp.data);
			str = str + (String)temp.data.toString() + ", ";
			temp = temp.next;
		}
		if (str.length()>0){
			str = str.substring(0, str.length()-2);
		}

		return str;
	}

	public String reverseString()
	{
		String str = "";
		Node<E> temp = rear.prev;
		while(temp != null){
			//System.out.println(temp.data);
			str = str + (String)temp.data.toString() + ", ";
			temp = temp.prev;
		}
		if (str.length()>0){
			str = str.substring(0, str.length()-2);
		}

		return str;
	}



	

}
