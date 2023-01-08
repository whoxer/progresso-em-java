// Desafio Ponta do to lápis livro Use a Cabeça: Java: 
// Tente adivinhar o que cada linha está fazendo

// Atenção: esse código não é compilável, ele é apenas para uso didático
// de um atividade do livro

int size = 27; // Variável de tipo inteiro é declarado e o valor 27 é atribuído
String name = "Fido"; // Variável name do tipo String é declarada 
                      // e recebe valor "Fido"

Dog myDog = new Dog(name, size); // Declara váriavel myDog com o tipo Dog
                                 // usando o 'name' e 'size'
x = size - 5; // Variável x é igual ao valor da variável size(27)
              // Subtraído por 5.

if (x < 15) myDog.bark(8); /* 
                            Se x for menor que 15 então o objeto myDog
                            irá chamar a função bark passando o valor 8
                            para os parâmetros da função bark()
                           */

while (x > 3) {   // Enquanto x for maior que três
    myDog.play(); // O objeto myDog irá chamar a função
}                 // play()

int[] numList = {2, 4, 6, 8}; // Vetor numList do tipo inteiro é iniciado com 
                              // valores 2, 4, 6 e 8.

System.out.print("Hello");  // Essa função imprime na tela a mensagem "Hello"
System.out.print("Dog: " + name); // Essa função imprime na tela a frase
                                  // "Dog: ", concatenando o valor da String
                                  // name, a saída então é a que se segue:
                                  
                                  // $~ ./dog.class
                                  // Hello Fido

String num = "8"; // Número literal de tipo String é declarado com
                  // Valor atribuído igual a "8"

int z = Interger.parseInt(num); // Variável z é declarada e recebe o valores
                                // de num(tipo String) convertida em 
                                // tipo inteiro

try {
    readTheFile("myFile.txt"); // a função tenta ler o arquivo myFile.txt
}

catch(FileNotFoundException ex) {       // Caso o arquivo não seja encontrado
    System.out.print("File not found.");// o programa irá exibir a seguinte
}                                       // mensagem de erro:
                                        // "File not found."(arquivo não
                                        // encontrado).




