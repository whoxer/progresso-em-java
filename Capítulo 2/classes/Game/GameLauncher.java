class Player {
    String name;
    int guess;
    boolean isRight;
    
    public void guess() {
        guess = (int) (Math.random() * 10);
        System.out.println("<@" + name + "> " + "digitou: " + guess + "\n");
    }
}
class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame() {
        System.out.println("\t<guess1ngGam3.java>" + "\n");
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
      
        p1.name = "wh0xer";
        p2.name = "tesse";
        p3.name = "metadat4";

        p1.guess = 0;
        p2.guess = 0;
        p3.guess = 0;
        
        p1.isRight = false;
        p2.isRight = false;
        p3.isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        
        while(true) {    
            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.guess == targetNumber) {
                p1.isRight = true;
            }
            if (p2.guess == targetNumber) {
                p2.isRight = true;
            }
            if (p3.guess == targetNumber) {
                p3.isRight = true;
            }
            if (p1.isRight == true) {
                System.out.println("<@" + p1.name + "> " + "VENCEU.");
                break;
            } else if (p2.isRight == true) {
                System.out.println("<@" + p2.name + "> " + "VENCEU.");
                break;
            } else if (p3.isRight == true) {
                System.out.println("<@" + p3.name + "> " + "VENCEU.");
                break;
            }
        }        
    }
}
class GameLauncher  {
    public static void main(String[] args){
        GuessGame game = new GuessGame();

        game.startGame();
    }
}
