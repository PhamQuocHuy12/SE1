package tut4;
import java.util.Iterator;
import java.util.LinkedList;
public class First10Prime {
	public static boolean isPrime(int num) {
		   if (num <= 1) {
		       return false;
		   }
		   for (int i = 2; i <= Math.sqrt(num); i++) {
		       if (num % i == 0) {
		           return false;
		       }
		   }
		   return true;
	} 
	public static void first10Prime() {
		 LinkedList<Integer> list = new LinkedList<>();
		    for (int i = 0;i>-1; i++) {
		      if (isPrime(i)) list.add(i);
		      if (list.size()>10) break;  
		      }
		    Iterator<Integer> g = list.iterator();
		    
		    
		    while (g.hasNext()) {
		      Integer x = (Integer) g.next();
		      // use x
		      System.out.print(x);
		    }
	 }
	public static void main (String[]args) {
		first10Prime();
	}
}

