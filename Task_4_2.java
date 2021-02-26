package Part_4;

public class Task_4_2 {

	public static void main(String[] args) {
		System.out.println("Sum is " + xMethod(3));
	}

	public static int xMethod(int n) {
		return xMethod(n, 1);
	}

	public static int xMethod(int n, int result) {
		if (n == 1)
			return result;
		else
			return xMethod(n - 1, result + n);

	}

}
