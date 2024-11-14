// Intanciando objetos numa Array

class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];

        for (int i = 0; i < myBooks.length; i++) {
            myBooks[i] = new Books();
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\tBIBLIOTECA");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Livros: ");

        int iterator = 0;

        myBooks[0].title = "A Metamorfose";
        myBooks[0].author = "Franz, KAFKA";

        myBooks[1].title = "O Estado e a Revolução";
        myBooks[1].author = "Vladmir, LENIN";

        myBooks[2].title = "O Corvo";
        myBooks[2].author = "Edgar Allan Poe";

        while (iterator < 3) {
            System.out.println(myBooks[iterator].title + " by " + myBooks[iterator].author);

            iterator += 1;
        }
    }
}