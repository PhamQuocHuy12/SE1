package tut4;
import java.util.Iterator;
import java.util.LinkedList;

public class RandomNums {
	public static void random() {
		 LinkedList<Integer> list = new LinkedList<>();  
		 for( int i = 0; i< 10;i++) {
		    	int a = (int) (Math.random() * (100 - 0 + 1) +  0);
		    	list.add(a);
		    }
		    Iterator<Integer> g = list.iterator();
		    while (g.hasNext()) {
		      Integer x = (Integer) g.next();
		      // use x
		      System.out.print(x+ "  ");
		    }
	 }
	public static void main (String[]args) {
		random();
	}
}

