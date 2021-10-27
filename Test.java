import java.util.NoSuchElementException;

public class Test {

	public static void main(String[] args) {
		
		
		DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
		
		dll.addToRear(10);

		dll.addToRear(20);

		dll.addToRear(30);

		dll.addToRear(50);

		dll.addToFront(10);

		dll.addToFront(20);
		
		dll.addToFront(30);

		System.out.println(dll);

		while(dll.size() > 0){
			System.out.println("removing from front " + dll.removeFromFront());
			System.out.println(dll);
		}
		
	
		
		try{
			dll.removeFromFront();
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("error removing from front" + ex.getMessage());
		}
		
		dll.addToRear(10);

		dll.addToRear(20);

		dll.addToRear(30);

		dll.addToRear(50);

		dll.addToFront(10);

		dll.addToFront(20);
		
		dll.addToFront(30);

		System.out.println(dll);
		
		while(dll.size() > 0){
			System.out.println("removing from rear " + dll.removeFromRear());
			System.out.println(dll);
		}


		dll.addToRear(10);

		dll.addToRear(20);

		dll.addToRear(30);

		dll.addToRear(50);

		dll.addToFront(10);

		dll.addToFront(20);
		
		dll.addToFront(30);

		System.out.println(dll);
		
		System.out.println("Reverse is :");
		System.out.println(dll.reverseString());

		
		dll.removeFromRear();
		
		System.out.println(dll);
		
		System.out.println("Getting item at pos 1: " + dll.get(1));
		System.out.println("Getting item at pos 3: " + dll.get(3));
		
		dll.removeFromRear();
		dll.removeFromRear();


		try{
			System.out.println("Getting item at pos 4: " + dll.get(4));
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("error " + ex.getMessage());
		}
		
			
	
		
	}

}
