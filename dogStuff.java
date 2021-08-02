package dogTest;

public class dogStuff {
	public static void main(String args[]) {
	dog pup1 = new dog("bark");
	dog pup2 = new dog("woof");
	System.out.println(pup1.getBark());
	System.out.println(pup1.getPrance());
	System.out.println(pup2.getBark());
	System.out.println(pup2.getPrance());
	}
}
