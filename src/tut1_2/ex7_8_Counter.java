package tut1_2;

import utils.DomainConstraint;


/**
 * @overview a counter that count from 0 and increase by 1 each time its called
 * @attribute count int Integer
 * @abtract_properties
 * 		mutable(coutner) = false /\ optional(counter) = false
 * @author Huy
 *
 */
public class ex7_8_Counter {
	@DomainConstraint(type = "Integer", mutable = false, optional = false)
	public int count;
	
	/**
	 * @effects initailize this a new counter
	 */
	public ex7_8_Counter() {
		count = 0;
	}
	/**
	 * @effects return the counted value
	 */
	public int get() {
		return count;
	}
	/**
	 * @effects increase count by 1
	 */
	public void incr() {
		count += 1;
	}
}
