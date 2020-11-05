package tut4;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeLinkedList extends LinkedList<Integer> {
	public PrimeLinkedList() {
		super();
	}
	public void primeIterator(LinkedList<Integer> list) {
		Iterator<Integer> g = list.iterator();
		while (g.hasNext()) {
		      Integer x = (Integer) g.next();
		      if (First10Prime.isPrime(x)) {
		    	  System.out.print(x);
		      } else g.remove();     
		}
	}
	public static void main (String[]args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		list.add((int) (Math.random() * (100 - 0 + 1) +  0));
		System.out.println(list);
	}
}

