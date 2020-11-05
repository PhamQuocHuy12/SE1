package a1_1801040104;
import java.util.Iterator;

import a2_1801040104.SortedSet;
public class test {
	public static void main (String[] args) {
		Comparable c1 = new Customer(1,"LE Tuan Minh","113","HoanKIem");
		Comparable c2 = new Customer(2,"Pham Quoc Huy","115", "BA dinh");
		Comparable c3 = new Customer(3,"Hoang Trung HIeu", "116","Dong da");
		SortedSet s = new SortedSet();
		s.insert(c1);
		s.insert(c2);
		s.insert(c3);
		System.out.println(s.toString());
		Iterator h = s.iterator();
		System.out.println(h.next());
		System.out.println(h.next());
		System.out.println(h.next());
	}
}
