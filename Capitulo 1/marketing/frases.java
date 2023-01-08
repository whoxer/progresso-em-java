public class frases {
    public static void main(String[] args) {
        int count = 0;
	
        String[] pronomes     = {"Eu", "Você", "Ele", "Nós", "Vós"};
        String[] verbos       = {"quero", "queria", "como", "queria"};
        String[] substantivos = {"Hamburguer", "Notebook novo", "Pizza", "Lasanha"};

        int tamanho1 = pronomes.length;
        int tamanho2 = verbos.length;
        int tamanho3 = substantivos.length;

        int rand1, rand2, rand3;

        for (int limite = 20; count < limite; count++) {
            rand1 = (int) (Math.random() * tamanho1);
            rand2 = (int) (Math.random() * tamanho2);
            rand3 = (int) (Math.random() * tamanho3);


            System.out.println("A frase aleatória é: ");

            String phrase = pronomes[rand1] + " " + verbos[rand2] + " " + substantivos[rand3];
            System.out.println(phrase + "\n");
        }
    }
}
