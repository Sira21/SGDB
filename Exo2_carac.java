import java.util.Scanner;

public class Exo2_carac {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String carac;
		System.out.print("Saisissez une chaine de caractére : ");
		carac = sc.next();
		int taille = carac.length();
		for (int i = 0; i < taille; i = i + 2) {
			System.out.print(carac.charAt(i) + "  ");
		}
		System.out.println();
		System.out.println("Ceci est faux");
		// ajout de la ligne de code
		System.out.println("Test venant d'un collaborateur git");

		System.out.println(carac.charAt(0) + "  " + carac.charAt(taille - 1));
	}
}