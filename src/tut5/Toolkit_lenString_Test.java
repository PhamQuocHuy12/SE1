package tut5;
import org.junit.Test;
/**
 * @overview A test driver to test Toolkit.lenString method. 
 */
public class Toolkit_lenString_Test {
	/**
	   * @modifies System.out
	   * 
	   * @effects 
	   *  for each test case tc = <s, r>
	   *    if Toolkit.lenString(s) != r
	   *      throws AssertionError
	   *    else
	   *      display the result on standard output.
	   *  
	   * @testcases
	   *  RANGES
	   *    R1: s is null
	   *    R2: s is empty
	   *    R3: s is not null and not empty
	   *  TDSes
	   *    TDS1: null
	   *    TDS2: ""
	   *    TDS3: {"sss", "sssssss", "ssssssssss"} 
	   *  Results:
	   *    TDS1: NUllPOinterException
	   *    TDS2: 0
	   *    TDS3: {3,7,10}
	   */
	  @Test
	  public void testAdd() throws AssertionError {
		    String[] tcSs = {"", "sss", "sssssss", "ssssssssss"} ;
		    int[] tcRs = {0,3,7,10};   
		    for (int i = 0; i < tcSs.length; i++) {
		      String x = tcSs[i];
		      int r = tcRs[i];
		      int result = Toolkit.lenString(x);
		      assert (result == r) : "invalid result: ("+x+") -> " + result + " (expected result: " + r+ ")";
		      
		      System.out.printf("Toolkit.lenString(%f)=%f%n", x, result);
		      
		    }
}}
