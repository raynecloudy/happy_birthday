public class happy_birthday {
	static String message = "happy birthday!!!!";
	static int red = 255;
	static int green = 0;
	static int blue = 0;

	public static void main(String[] args) {
		cls();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			try {
				Thread.sleep(50);
			} catch (InterruptedException _) {
				Thread.currentThread().interrupt();
			}
		}
		while (true) {
			calcColours();
			cls();
			System.out.println("\033[38;2;" + red + ";" + green + ";" + blue + "m" + message);
			System.out.flush();
		}
	}

	static void cls() {  
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	static void calcColours() {
		if (red == 255 && blue == 0) {
			green++;
		}
		if (green == 255 && blue == 0) {
			red--;
		}
		if (green == 255 && red == 0) {
			blue++;
		}
		if (blue == 255 && red == 0) {
			green--;
		}
		if (blue == 255 && green == 0) {
			red++;
		}
		if (red == 255 && green == 0) {
			blue--;
		}
	}
}