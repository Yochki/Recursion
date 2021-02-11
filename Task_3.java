package Part_1;

public class Task_3 {
	public static void main(String[] args) {

		System.out.print(Recursive2pow(4));
		System.out.println();
		System.out.print(Iterative2pow(2, 4));
	}

	public static int Recursive2pow(int n) {
		if (n == 0) {
			return 1;
		}
		return 2 * Recursive2pow(n - 1);

	}

	public static int Iterative2pow(int chislo, int stepen) {
		int rezultat = 1;
		while (stepen > 0) {
			rezultat *= chislo;
			stepen--;
		}
		return rezultat;
	}

}