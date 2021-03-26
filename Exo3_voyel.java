import java.util.Scanner;
public class Exo3_voyel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0, e = 0, i = 0, u = 0, o = 0, y = 0;
        String carac, c;
        System.out.println("Veuillez saisir un mot : ");
        carac = sc.next();
        int taille = carac.length(); 
        for (int J = 0; J < taille; J++){
            c = Character.toString(carac.charAt(J));
            if(c.equals("a") || c.equals("A")){
                a++;
            }
            else if(c.equals("e") || c.equals("E")){
                e++;
            }
            else if(c.equals("i") || c.equals("I")){
                i++;
            }
            else if(c.equals("u") || c.equals("U")){
                e++;
            }
            else if(c.equals("o") || c.equals("O")){
                o++;
            }
            else if(c.equals("y") || c.equals("Y")){
                y++;
            }
        }
        System.out.println(a+" fois la lettre a");
		System.out.println(e+" fois la lettre e");
		System.out.println(i+" fois la lettre i");
		System.out.println(o+" fois la lettre o");
		System.out.println(u+" fois la lettre u");
		System.out.println(y+" fois la lettre y");
    }
}
