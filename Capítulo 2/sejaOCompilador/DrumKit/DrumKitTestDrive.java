class DrumKit {
	boolean topHat;
	boolean snare;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}
class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		
		d.snare = true;
		d.topHat = true;

		if (d.snare == true) {
			d.playSnare();
		}
		if (d.topHat == true) {
			d.playTopHat();
		}
	}
}
