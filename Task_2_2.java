package Part_2;

import java.util.Scanner;

public class Task_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(dec2Bin(5));
	}

	public static String dec2Bin(int value) {
		if (value == 1) {
			return "1"; 
						
		} else { 
			return dec2Bin(value / 2) + value % 2; 
		}
	}
}