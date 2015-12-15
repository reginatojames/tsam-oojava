public class Esercizio {

	public static int sumPos(int[] arr) {
		int sum = 0;

		for (int x : arr) {
			if (x > 0) {
				sum += x;
			} else {
				break;
			}
		}

		return sum;
	}

	public static int sumOdd(int index) {
		int sum = 0;
		int i = 0;
		int j = 0;

		while (i != index) {
			if (j % 2 != 0) {
				sum += j;
				i++;
			}
			j++;
		}

		return sum;
	}

	public static double average(double[] arr) {
		double media = 0;
		double somma = 0;

		for (double x : arr) {
			somma += x;
		}

		media = somma / arr.length;
		return media;
	}

	public static int sumRange(int a, int b) {
		int sum = 0;

		if (b < a) {
			int appoggio = b;
			b = a;
			a = appoggio;
		}

		for (int i = a; i <= b; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumRange(5, 2));

	}
}
