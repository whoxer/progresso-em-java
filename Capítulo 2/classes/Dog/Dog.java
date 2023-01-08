class Dog {
	int tamanho;
	String raça;
	String nome;

	void latir() {
		System.out.println(nome + " está latindo: " + "Au! Au!");
	}
	void exibirInfo() {
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Raça: " + raça);
		System.out.println("Nome: " + nome);
		System.out.println("\n");
	}
}
class DogTestDrive {
    public static void main(String[] args) {
        Dog billy = new Dog();
		    Dog maze  = new Dog();

		    billy.raça = "misto de Peagle e vira-lata";
		    billy.nome = "Billy";
        billy.tamanho = 35;

		    maze.raça = "vira-lata";
		    maze.nome = "Maze";
		    maze.tamanho = 20;

        System.out.println("Cachorros do meu amigo Lucas: \n");
		    billy.exibirInfo();
		    maze.exibirInfo();

		    maze.latir();
		    billy.latir();
    }
}

