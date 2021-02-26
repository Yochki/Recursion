package Part_2;

import java.util.Scanner;

public class Task_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("The number is even: " + EvenMethod(n));
		System.out.println("The number is odd: " + OddMethod(n));
	}

	public static boolean EvenMethod(int n) {
		boolean isEven = true;
		if (n == 0) {
			isEven = true;
		} else if (n == 1) {
			isEven = false;
		} else {
			return EvenMethod(n - 2);
		}

		return isEven;

	}

	public static boolean OddMethod(int n) {
		boolean isOdd = true;
		if (n == 0) {
			isOdd = false;
		} else if (n == 1) {
			isOdd = true;
		} else {
			return OddMethod(n - 2);
		}

		return isOdd;
	}
}