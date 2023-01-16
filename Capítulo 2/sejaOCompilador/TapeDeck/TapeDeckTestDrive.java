class TapeDeck {
	boolean canRecord = false;

	void playTape() {
		System.out.println("tape playing");
	}

	void recordTape() {
		System.out.println("tape recording");
	}
}

class TapeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck tape = new TapeDeck();

		tape.canRecord = false;
		tape.playTape();

		if (tape.canRecord == true) {
			tape.recordTape();
		}
	}
}

