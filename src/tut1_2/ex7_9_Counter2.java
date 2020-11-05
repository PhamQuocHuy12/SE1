package tut1_2;

public class ex7_9_Counter2  extends ex7_8_Counter{
	/**
	 * @effects initalize this as Counter2
	 */
	public ex7_9_Counter2 () {
		super();
	}
	/**
	 *@modifies this
	 *@effects make this contain twice its current value
	 */
	@Override
	public void incr() {
		count *= 2;
	}
}
