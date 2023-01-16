class exibeTodos {
    boolean istrue;

    void exibeValores() {
        declaraVariável var = new declaraVariável();

        var.inteira = 90;
        var.string = "Oi, eu sou uma String";
        var.flutuante = 34.5f;
        var.dupla = 7868.9990;
        var.bool = true;

        var.exibeValorInteiro();
        var.exibeValorString();;
        var.exibeValorFlutuante();;
        var.exibeValorDuplo();
        var.exibeValorBool();
    }
}

class declaraVariável {
    int inteira;
    String string;
    float flutuante;
    double dupla;
    boolean bool;

    void exibeValorInteiro() {
        System.out.println("o valor de int é: " + inteira);
    }
    
    void exibeValorString() {
        System.out.println("o valor de String é: " + string);

    }

    void exibeValorFlutuante() {
        System.out.println("o valor de float é: " + flutuante);

    }

    void exibeValorDuplo() {
        System.out.println("o valor de dupla é: " + dupla);

    }

    void exibeValorBool() {
        System.out.println("o valor de boolean é: " + bool);

    }
}

class Variáveis {
    public static void main(String[] args) {
        exibeTodos mostraValores = new exibeTodos();

        mostraValores.istrue = true;

        if (mostraValores.istrue == true) {
            mostraValores.exibeValores();
        }
    }
}