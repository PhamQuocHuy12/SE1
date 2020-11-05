package tut1_2;
import java.util.Collections;
import java.util.ArrayList;

/**
 * @overview a arraylist that return min and max elements of itself
 * @attribute 
 * 		min integer
 * 		max interger 
 * @author Huy
 *
 */
public class ex7_1_MinMaxIntListB extends ArrayList<Integer> {
	/**
	 * @effects sort the array then return the last element as max value
	 */
	public Integer getMin() {
		ArrayList arr = (ArrayList) super.clone();
		Collections.sort(arr);
		return (Integer) arr.get(arr.size()-1); 
	}
	/**
	 * @effects sort the array then return the first element as min value
	 */
	public Integer getMax() {
		ArrayList arr = (ArrayList) super.clone();
		Collections.sort(arr);
		return (Integer) arr.get(0);
	}
}
