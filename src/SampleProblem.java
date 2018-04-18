import java.util.Scanner;

/*
 * 
 * Instructions: 
 * 
 * Write a program that adds two numbers and prints their sum to STDOUT. Read input from STDIN. 
 * The first line of your input will contain an integer (N) that tells you how many more lines there are in the input.
 * Each subsequent N lines contains 2 integers. Print the sum of each pair on a separate line of STDOUT.
 * 
 * Sample Input:
 * 
 * 3
 * 1 5
 * 3 10
 * 999 -34343
 * 
 * Corresponding Output:
 * 
 * 6
 * 13
 * -33344
 * 
 * 
 */

public class SampleProblem {
	
	public static double add(double one, double two) {
		return one + two;
	}
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		int numLines = scan.nextInt();
		
		double[] numArray = new double[numLines];
		
		for(int i = 0; i < numLines; i++) {
			Scanner nums = new Scanner(System.in);
			String pair = nums.nextLine();
			String[] paired = pair.split(" ");
			double added = add(Double.parseDouble(paired[0]), Double.parseDouble(paired[1]));
			numArray[i] = added;
		}
		for(double num : numArray) {
			System.out.println(num);
		}
	}

}
