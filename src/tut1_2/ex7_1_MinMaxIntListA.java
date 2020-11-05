package tut1_2;
import java.util.ArrayList;
/**
 * @overview a arraylist that return min and max elements of itself
 * @attribute 
 * 		min integer
 * 		max interger 
 * @author Huy
 *
 */
public class ex7_1_MinMaxIntListA extends ArrayList<Integer> {
	private Integer min;
	private Integer max;
/**
 * @effects
 * 		if max = null or e > max
 * 			max = e
 * 		if min = null or e < min 
 * 			min = e	
 * 		super add e
 */
	@Override
	public boolean add(Integer e) {
		if (max == null || e > max) {
			max = e;
		}
		if ( min == null || e<  min) {
			min = e;
		}
		super.add(e);
		return true;
	}
	/**
	 * @effects return min element
	 */
	public Integer getMin() {
		return min;
	}
	/**
	 * @effects return max element
	 */
	public Integer getMax() {
		return max;
	}
}
