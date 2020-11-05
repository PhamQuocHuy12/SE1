package tut1_2;

public class ex7_10_Counter3  extends ex7_8_Counter{
	/**
	 * @effects initalize this as Counter3 count from n
	 */
	public ex7_10_Counter3 (int n) {
		count = n;
	}
	@Override
	/**
	 *@modifies this
	 *@effects if n > 0, count increase by n
	 */
	
	public void incr(int n) {
		count += n;
	}
}
// not legit