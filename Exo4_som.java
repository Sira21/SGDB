public class Exo4_som {
    public static void main(String args[]){
        if (args.length == 2){
            String nbr1 = args[0];
            String nbr2 = args[1];
           try
           {
               int nbr1_entier = Integer.parseInt(args[0]);
               int nbr2_entier = Integer.parseInt(args[1]);
            if(nbr1_entier>0 && nbr2_entier>0)
            {
                int somme = nbr1_entier + nbr2_entier;
                System.out.println(nbr1+" + "+nbr2+" = "+somme);
            }
            else
            {
                System.out.println("Au moins l'un des arguments a un signe.");
            }
           }
           catch(Exception ex)
             {
                System.out.println("Au moins l'un des arguments a un signe.");
             }
            }
        }
    }
