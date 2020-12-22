package prob1;

	public class RecursionExamples {
	
	// Problem 1a
	public static double sumSeries(int n) {
		double sum = 0.0;
		if(n<=0) {return 0;}
		if(n == 1) {
			return 1;
		}
		
		else{
			
			if(n % 2 == 1) {
			sum += 1.0/n + sumSeries(n-1);
			
		}
			else {
			sum += -1.0/n + sumSeries(n-1);
			}
		}
		return sum;
	}

	// Problem 1b
	public static void blob(int n) {
		if (n<0) {
			return ;
			
		}
		else {
			System.out.print(n);
			blob(n-1);
			System.out.print(n-1);
		}
	}
	public static void printReverse2(String s) {
		
		if(s.length()<=1) {
			System.out.print(s);
		}
		else {
			System.out.print(s.charAt(s.length()-1));
			printReverse2(s.substring(0, s.length()-1));
		}
	}
	
	
	// Problem 1d
	public static int countVowels(String s) {
		String c = String.valueOf(s.charAt(s.length()-1));
		String vowels = "aeiou";
		
		if(s.length()-2 < 0) {
			if(vowels.contains(c)) {
				return 1;
			}
			return 0;
		}
		else {
			if(vowels.contains(c)) {
			
				return 1 + countVowels(s.substring(0, s.length()-1));
			}
			else {
				return 0 + countVowels(s.substring(0, s.length()-1));
			}
		}
	}
	
	// Problem 1e, requires a helper
	public static int countLength(String[] strs) {
		int loc = 0;
		int sum = 0;
		int total = countLength(strs, loc, sum);
		return total;
	}
	public static int countLength(String[] strs, int loc, int sum) {
	
		if(loc > strs.length-1) {
			return 0;
		}
		else {
			return sum += strs[loc].length() + countLength(strs, loc+1, sum); 
		}
	
	}
	// Problem 1f, requires a helper
	public static int getMax(int[] vals) {
		int length = vals.length;
		int largest = getMax(vals, length);
		return largest;
	}
	public static int getMax(int[] vals, int length) {
		if(length-1 == 0) {
			return vals[0];
		}
		else {
			return Math.max(vals[length-1], getMax(vals, length-1));
		}
		
	}
	// Problem 1g, requires a helper
	public static int countCode(String msg, String code ) {
		int pos = 0;
		int count = 0;
		count += countCode(msg, code, pos);
		
				return count;
	}
	private static int countCode(String msg, String code, int pos ) {
		
		if(pos >= msg.length()-2) {
			return 0;
		}
		else {
			if(msg.substring(pos, pos + code.length()).equals(code)) {
				return 1 + countCode(msg, code, pos + code.length());
			}
			else {
				return 0 + countCode(msg, code, pos+1);
			}
		}
	}
}
