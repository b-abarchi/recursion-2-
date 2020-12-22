package prob1;

public class RecursionExamplesTest {

	public static void main(String[] args) {
		testSumSeries();
		testPrintReverse2();
		testCountVowels();
		testCountLength();
		testGetMax();
		testCountCode();		
	}
	
	// Problem 1a
	public static void testSumSeries() {
		System.out.println("testSumSeries()");
		RecursionExamples.blob(3);
		//System.out.println(val);
	}

	// Problem 1b
	public static void testPrintReverse2() {
		System.out.println("testPrintReverse2()");
		RecursionExamples.printReverse2("fedcba");
	}
	
	// Problem 1c
	public static void testPrintReverse() {
		System.out.println("testPrintReverse()");
		RecursionExamples.printReverse("1234567", 3);
	}

	// Problem 1d
	public static void testCountVowels() {
		System.out.println("\ntestCountVowels()");
		System.out.println(RecursionExamples.countVowels("aekmitoeub"));
	}
	
	// Problem 1e, requires a helper
	public static void testCountLength() {
		System.out.println("testCountLength()");
		String[] strs = {"abc", "bb", "defg", "z"};
		System.out.println(RecursionExamples.countLength(strs));
	}

	// Problem 1f, requires a helper
	public static void testGetMax() {
		System.out.println("testGetMax()");
		int[] vals = {11,8,2,121,9,1,7};
		int max = RecursionExamples.getMax(vals);
		System.out.println(max);
	}

	// Problem 1g, requires a helper
	public static void testCountCode() {
		System.out.println("testCountCode()");
		System.out.println(RecursionExamples.countCode("xbabcabcdkabmabc", "abc"));
	}

}
