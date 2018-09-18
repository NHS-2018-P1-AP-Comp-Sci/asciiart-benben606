public class ASCIIArt {

	public static void printHead () {
		System.out.println("     --.        --.");
		System.out.println("   _'   \"      \" ' _");
		System.out.println("   \\  >   -   -' <  /");
		System.out.println("     '-.          .-'");
		System.out.println("       / 'e___e' \\");
		System.out.println("      (   (o o)   )");
		System.out.println("       \\_  '='  _/");
		printBody();
		printFeet();
	}
	
	public static void printBody () {
		System.out.println("     / /|`-._.-'|\\ \\");
		System.out.println("    / /||_______||\\ \\");
		System.out.println("   / /_||=======||_\\ \\");
		System.out.println(" / _/==||       ||==\\_ \\");
		System.out.println("   (   ^^       ^^   )");
		System.out.println("    \\               /");
		System.out.println("     \\______|______/");
	}
	
	public static void printFeet () {
		System.out.println("     |______|______|");
		System.out.println("       )__|   |__(");
		System.out.println("      /   ]   [   \\");
		System.out.println("      '--'     '--'");
	}
	
	public static void Space () {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void Grass () {
		System.out.println("/////////////////////////");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHead();
		Grass();
		Space();
		printHead();
		Grass();
		Space();
		printHead();
		Grass();
		
	}
	
	
}
	