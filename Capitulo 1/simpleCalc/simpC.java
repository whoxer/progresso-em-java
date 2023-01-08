public class simpC {

	public static void main(String[] args) {
		String opt = " / ";

		float n1 = 20,
		      n2 = 5;

		float calc;


		if (opt == " + ") {
			calc = n1 + n2;
			System.out.print(n1 + opt + n2 + " = " + calc);
			System.out.println("\n");
		} else if (opt == " - ") {
			calc = n1 - n2;
			System.out.println(n1 + opt + n2 + " = " + calc);
		} else if (opt == " * ") {
			calc = n1 * n2;
			System.out.println(n1 + opt + n2 + " = " + calc);
		} else if (opt == " / ")  {
			calc = n1 / n2;
			System.out.println(n1 + opt + n2 + " = " + calc);
		}
	}
}
