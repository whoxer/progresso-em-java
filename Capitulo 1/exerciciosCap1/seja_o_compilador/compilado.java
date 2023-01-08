public class compilado {
	public static void main(String[] args) {
		int x = 1;

		while (x < 15) {
			if (x < 10) {
				System.out.println("x é maior que 3: " + x);
			} else if (x >= 10) {
				System.out.println("x é maior que 10: " + x);
			}

			x++;
		}
	}
}
