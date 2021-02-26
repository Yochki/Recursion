package Part_2;

import java.util.Scanner;

public class Task_2_3 {
	static int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of disks:");
		int n = sc.nextInt();
		moveDisks(n, 'A', 'C', 'B');

		System.out.println("Moves: " + num);
	}

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {

		if (n == 1) {
			moveDisk(n, fromTower, toTower);
		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			moveDisk(n, fromTower, toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}

	public static void moveDisk(int n, char fromTower, char toTower) {

		System.out.println("Move disk " + n + " from tower " + fromTower + " to tower " + toTower);
		num++;

	}

}