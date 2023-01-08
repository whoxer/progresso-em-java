public class bottles {
	
	public static void main(String[] args) {
		int numBottles = 99;
		String word = "bottles";

		while (numBottles > 0) {

			System.out.println(numBottles + " " + word + " of beer on the wall");
            System.out.println(numBottles + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            
            numBottles--;

            if (numBottles == 1) {
                word = "bottle";
            } else if (numBottles < 1){
                System.out.println("no more bottles on the wall");
            }
		}
	
	}
}
