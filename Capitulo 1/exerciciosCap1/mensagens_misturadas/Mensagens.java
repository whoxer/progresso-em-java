class Mensagem {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		while ( x < 5) {
			y = y + x;

			y = y + 2;
			if (y > 4) {
				y--;			
			}

			if (y < 5) {
				x++;
				if (y < 3) {
					x--;
				}
			}
			y = y + 2;

			System.out.println(x + " " + y + " ");
			x++;
		}
	}
}
