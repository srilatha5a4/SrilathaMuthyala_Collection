package epamht6.collections;

import java.util.Arrays;

public class MyCollection<E> {
	private static final int INITIAL_CAPACITY = 10;
	private Object numbers[];
	private int capacity = 0;
	public MyCollection() {
		 numbers = new Object[INITIAL_CAPACITY];
	}

	public void addElement(E e) {
		if (capacity == numbers.length) {
			ensure();
		}
		numbers[capacity++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) numbers[i];
	}
	
	@SuppressWarnings("unchecked")
	public E remove(int i) {
		if (i < 0 || i >= capacity) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		Object it = numbers[i];
		int numElements = numbers.length - ( i + 1 ) ;
		System.arraycopy(numbers, i + 1, numbers, i, numElements ) ;
		capacity--;
		return (E) it;
	}
	
	public int size() {
		return capacity;
	}
	
	 public void printList()
	    {
	    	for(Object o : numbers)
	    		if(o == null)
	    			break;
	    		else
	    		System.out.print(o+" ");
	    	System.out.println();
	    }
	
	@Override
	public String toString()  {
		 StringBuilder stringbuilder = new StringBuilder();
		 stringbuilder.append('[');
		 for(int i = 0; i < capacity ; i++) {
			 stringbuilder.append(numbers[i].toString());
			 if(i < capacity - 1){
				 stringbuilder.append(",");
			 }
		 }
		 stringbuilder.append(']');
		 return stringbuilder.toString();
	}
	
	
	private void ensure() {
		int newSize = numbers.length * 2;
		numbers = Arrays.copyOf(numbers, newSize);
	}
}


