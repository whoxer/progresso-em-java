class MovieClass {
	String título;
	String gênero;
	int nota;

	void rodeoFilme() {
		System.out.println(título + " está sendo iniciado");
	}

	void exibeInfo() {
		System.out.println("--------------------------------");
		System.out.println("Título do Filme: " + título);
		System.out.println("Gênero: " + gênero);
		System.out.println("Nota: " + nota);
		System.out.println("--------------------------------\n");
	}
}

public class Movie {
	public static void main(String[] args) {
		MovieClass jogadorNumUm = new MovieClass();

		jogadorNumUm.título = "Jogador Número Um";
		jogadorNumUm.gênero = "Ficção Científica";
		jogadorNumUm.nota = 10;

		jogadorNumUm.exibeInfo();
		jogadorNumUm.rodeoFilme();
	}
}
