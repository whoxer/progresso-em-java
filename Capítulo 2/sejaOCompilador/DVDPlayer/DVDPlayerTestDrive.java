class DVDPlayer {
	boolean canRecord = false;

	void recordDVD() {
		System.out.println("DVD Recording");
	}
}

class DVDPlayerTestDrive {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();

		dvd.canRecord = true;

		if (dvd.canRecord == true) {
			dvd.recordDVD();
		}
		else {
			System.out.println("couldn't record dvd.");
		}
	}
}
