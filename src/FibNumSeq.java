
public class FibNumSeq {

	public static void main(String[] args) {

		int limit = 20;		
		int previousNum = 0;
		int nextNum = 1;
		
		long startTime  = System.nanoTime(); 
		System.out.print("Fibonacci Sequence of " + limit + " numbers: ");
		for (int i = 0; i < limit; i++) {
			System.out.print(fibonacciRecursion(i) + " ");
			}
		long endTime  = System.nanoTime(); 
		long time = endTime - startTime;
		System.out.println();
		
		System.out.println("It took " +time+ " nanoseconds using recursion");

		
		//iterative		


		System.out.println();
		
		long startTime2  = System.nanoTime(); 
		System.out.print("Fibonacci Sequence of " + limit + " numbers: ");

		for (int i = 1; i <= limit; ++i) {
			System.out.print(previousNum + " ");

			int sum = previousNum + nextNum;
			previousNum = nextNum;
			nextNum = sum;
		}
		long endTime2  = System.nanoTime(); 
		long time2 = endTime2 - startTime2;
		
		System.out.println();
		
		System.out.println("It took " +time2+ " nanoseconds using iteration");


	}

	public static int fibonacciRecursion(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1 || num == 2) {
			return 1;
		}
		return fibonacciRecursion(num - 2) + fibonacciRecursion(num - 1);
	}
}