package tut4;
import java.util.Iterator;
import java.util.ArrayList;
public class OddAlphabetList {
	public static boolean isOdd(char c) {
		int code = (int) c;
		if (code % 2 != 0 ) {
			return true;
		} else return false;
	} 
	public static void oddAlphabetList() {
		 ArrayList<Character> list = new ArrayList<>();
		    for (int i = 65; i < 91; i++ ) {
		    	char c = (char)i;
		    	list.add(c);
		    }
		    Iterator<Character> g = list.iterator();
		    while (g.hasNext()) {
			      char x = (char) g.next();
			      int code = (int)x;
			      if (code % 2!= 0) {
				      System.out.print(x + "  ");
			      } else g.remove();
		    }
	 }
	public static void main (String[]args) {
		oddAlphabetList();
	}
}

