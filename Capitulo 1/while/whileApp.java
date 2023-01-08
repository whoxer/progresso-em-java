public class whileApp {

	public static void main(String[] args) {
		int limite = 100;
		int n = 0;

		while (n < limite) {
			n = n + 10;

			System.out.println("n" + "(" + n + ")" + " ainda não é maior que o limite" + "(" + limite + ")");
		}

		System.out.println("\n{valor de n agora é igual a limite!!}");
	}
}
