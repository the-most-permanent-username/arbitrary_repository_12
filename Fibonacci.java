package arbitrary;

public class Fibonacci {

	private long[] fib_array = new long[100];
	public long getFibTerm(int n) {
		if (n < 0) {
			throw new IllegalArgumentException(n + " is negative");
		}
		else if (n == 0) {
			return 0;
		}
			else if (n == 1) {
			return 1;
		} else {
			if(n < 100) {
				if(fib_array[n] != 0) {
					return fib_array[n];
				}
				else {
					fib_array[n] = getFibTerm(n - 1) + getFibTerm(n - 2);
					return fib_array[n];
				}
			}
			return getFibTerm(n - 1) + getFibTerm(n - 2);
		}
	}

	public static void main(String[] args){
		System.out.println("implement later");
	}
	
}
