package tut5;
import org.junit.Test;

/**
 * @overview A test driver to test ToolKit.add method. 
 */
public class ToolKitAddTest {
	 /**
	   * @modifies System.out
	   * 
	   * @effects 
	   *  for each test case tc = <x,y,r>
	   *    if ToolKit.add(x,y) != r
	   *      throws AssertionError
	   *    else
	   *      display the result on standard output.
	   *  
	   * @testcases
	   *  RANGES
	   *    x: (-INF,+INF)
	   *    y: (-INF,+INF)
	   *    
	   *  TDSes
	   *    x: {-1000000000,-105, -2.6, 0, 2.5 , 2.6, 100, 1000000001.5}
	   *    y: {-1000000000, 2.5,    0, 0, 2.6 , 100, -2.6, 100}
	   *    
	   *  Results:
	   *    {-2000000000, -102.5, -2.6, 0, 5.1, 102.6, 97.4, 1000000101.5}
	   */
	  @Test
	  public void testAdd() throws AssertionError {
		    int[] tcXs = {-1000000000,-105, -2, 0, 2 , 2, 100, 1000000001};
		    int[] tcYs = {-1000000000, 2,    0, 0, 2 , 100, -2, 100};
		    int[] tcRs = {-2000000000, -102, -2, 0, 4, 102, 98, 1000000101};
		    
		    for (int i = 0; i< tcXs.length;i++) {
		    	int x = tcXs[i];
		        int y = tcYs[i];
		        int r = tcRs[i];
		        int result = Toolkit.add(x, y);
		        assert (result == r) : "invalid result: ("+x+","+y+") -> " + result + " (expected result: " + r+ ")";
		        
		        System.out.printf("Tollkit.add(%f,%f)=%f%n", x, y, result);

		    }
		  	}
		  }
