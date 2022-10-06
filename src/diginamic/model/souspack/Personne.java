package diginamic.model.souspack;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coucou");
	
		String maChaine = "Bonjour"; //correspond à un tableau de char
		char monChar = '!'; //stock un caractère
		
		String exempleChaineString = null; // = "" 
		int c = 0; // null ne marche pas
		
		// Hiérarchie des varibles à nombre
		// double > float > long > int > short > byte
		float f = 8f;  // Par défau
		System.out.println(f);
		Double hDouble = 8.0;
		System.out.println(hDouble);
		int a = 053;
		System.out.println(a);
		char d ='\u00a9'; //
		System.out.println(d);
		String s ="\u00a9\u00a9"; // ©©
		System.out.println(s);
	}

}
