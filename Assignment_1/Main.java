package cen4802.Assignment_1;

/**
 * The Main class contains methods to calculate and display Fibonacci numbers.
 */

public class Main {
	
	/**
     * Calculates the nth term in the Fibonacci sequence.
     *
     * @param n The position of the term to calculate.
     * @return The nth term in the Fibonacci sequence.
     */
	
	public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
        int result = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
	}
}
