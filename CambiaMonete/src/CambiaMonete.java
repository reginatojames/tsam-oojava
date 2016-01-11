
public class CambiaMonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toChange = 1150;

		while (toChange != 0) {
			if (toChange - 500 >= 0) {
				toChange -= 500;
				System.out.println("cambio con 500");
			} else if (toChange - 200 >= 0) {
				toChange -= 200;
				System.out.println("cambio con 200");
			} else if (toChange - 100 >= 0) {
				toChange -= 100;
				System.out.println("cambio con 100");
			} else if (toChange - 50 >= 0) {
				toChange -= 50;
				System.out.println("cambio con 50");
			} else if (toChange - 20 >= 0) {
				toChange -= 20;
				System.out.println("cambio con 20");
			} else if (toChange - 10 >= 0) {
				toChange -= 10;
				System.out.println("cambio con 10");
			} else if (toChange - 5 >= 0) {
				toChange -= 5;
				System.out.println("cambio con 5");
			} else if (toChange - 2 >= 0) {
				toChange -= 2;
				System.out.println("cambio con 2");
			} else if (toChange - 1 >= 0) {
				toChange -= 1;
				System.out.println("cambio con 1");
			}
		}
	}

}
