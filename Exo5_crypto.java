public class CaesarCode{
	public static String crypter(String message, int cle){

		String res = "";
		char c ; 
		int code ;
		for(int i = 0; i < message.length(); i++){
		      char c = message.charAt(i);
		       int code = c;on recupere le code askii
			if(code >= 97 && code <= 122){
				if(code + cle <= 122){
					code = code + cle;
					res +=Character.toString(code);
				}else{
					code = 96 + (cle - (122 - code));
					res += Character.toString(code);
				}
			}else if(code >= 65 && code <= 90){
				if(code + cle <= 90){
					code = code + cle;
					res += Character.toString(code);
				}else{
					code = 64 + (cle - (90 - code));
					res += Character.toString(code);
				}
			}
		}
		return res;
	}

	public static String decrypter(String message, int cle){

		String res = "";
		char c ; 
		int code ;
		for(int i = 0; i < message.length(); i++){
			c = message.charAt(i);
			code = c;
			if(code >= 97 && code <= 122){
				if(code - cle >= 97){
					code = code - cle;
					res +=Character.toString(code);
				}else{
					code = 123 - (cle - (code - 97));
					res += Character.toString(code);
				}
			}else if(code >= 65 && code <= 90){
				if(code - cle >= 65){
					code = code - cle;
					res += Character.toString(code);
				}else{
					code = 91 - (cle - (code - 65));
					res += Character.toString(code);
				}
			}
		}
		return res;
	}

	public static void main(String args[]){

		String message = "", resultat = "";
		if(args.length == 2){
			String option = args[0];
			if(option.equals("-c") ||  option.equals("-d")){
				message = args[1];
				if(option.equals("-c")){
					resultat = crypter(message, 13);
				}else{
					resultat = decrypter(message, 13);	
				}
			}else{
				System.out.println("Les arguments saisis sont incorrectes.");
			}
			System.out.println("Message crypte : "+resultat);
		}else if(args.length == 4){
			String option = args[0];
			if((option.equals("-c") ||  option.equals("-d")) && args[2].equals("-k")){
				int cle = Integer.parseInt(args[3]);
				message = args[1];
				if(option.equals("-c")){
					resultat = crypter(message, cle);
				}else{
					resultat = decrypter(message, cle);	
				}				
			}else{
				System.out.println("Les arguments saisis sont incorrectes.");	
			}
			System.out.println("Message crypte : "+resultat);
		}else if(args.length == 3 || args.length > 4){
			System.out.println("Les arguments saisis sont incorrectes.");
		}else if(args.length == 1){
			if(args[0].equals("-h") || args[0].equals("--help")){
				System.out.println("Les arguments saisis sont insuffisants. \nIl s'agit d'un cryptage ou decryptage de cesar.\nLes arguments doivent etre renseigner comme suite: java CaesarCode –d messageADecrypter [–k clé].");				
			}
		}else{
			System.out.println("Les arguments saisis sont insuffisants. \nIl s'agit d'un cryptage ou decryptage de cesar.\nLes arguments doivent etre renseigner comme suite: java CaesarCode –d messageADecrypter [–k clé].");
		}
	}

}