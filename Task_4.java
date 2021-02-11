package Part_1;

import java.util.Scanner;

public class Task_4 {

	public static int powRecursive(int x, int y) {
		if (y > 0) {
			return (x * powRecursive(x, y - 1));
		} else {
			return 1;
		}
	}
 
	public static int powItterative(int x, int y) {
		int rezultat = 1;
		while (y > 0) {
			rezultat *= x;
			y--;
		}
		return rezultat;
	}

	public static void main(String[] args) {

		System.out.println("Enter base and power: ");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int y = reader.nextInt();
		System.out.print("Itterative: " + powItterative(x, y));
		System.out.print("Recursive: " + powRecursive(x, y));
	}

}