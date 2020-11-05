package tut5;

import org.junit.Test;

public class Array_Test {
	@Test
	public void Test_CountNegatives() throws AssertionError {
		int[][] TDS = {{1,5,6}, {-1,-5,-6},{-1,0,2}};  // all pos, all neg, pos neg and 0 
		int[] tcRs = {0,3,-1};
		for (int i = 0; i < TDS.length;i++) {
			int[] x = TDS[i];
			int r = tcRs[i];
			int result = Arrays.countNegative(x);
			assert (result == r) : "invalid result: ("+x+") -> " + result + " (expected result: " + r+ ")";
		      
		      System.out.printf("Arrays.countNeg(%f)=%f%n", x, result);
		}
	}
	@Test
	public void Test_min() throws AssertionError {
		int[][] TDS = {{0,1,5}, {5,17,-3},{0,1,2},{2,1,0},{2,0,1}};  // a[min is pos], a[min is neg], a[min is neg], a[min at last index], a[min at middle index]
		int[] tcRs = {0,-3,0,0,0};
		for (int i = 0; i < TDS.length;i++) {
			int[] x = TDS[i];
			int r = tcRs[i];
			int result = Arrays.min(x);
			assert (result == r) : "invalid result: ("+x+") -> " + result + " (expected result: " + r+ ")";
		      
		      System.out.printf("Arrays.countNeg(%f)=%f%n", x, result);
		}
	}
}
