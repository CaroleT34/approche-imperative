package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4L;
		float e = 5F;
		double f = 6.4D;
		char monChar = '!';
		boolean myBool = true;
		String monString = "Voici le résultat: \n1+5=6!";

		System.out.println(monString);
		
		int nb = 7; //7/2 = 3 et il reste 1
		System.out.println(nb%2); // modulo % affiche le reste (si reste = chiffre impaire)
		
		int nb2 = 8; 
		nb2++;
		System.out.println("On a bien le résultat "+ nb2);
		
		String resultString = "indice " + c ;
		System.out.println(resultString);
	}

}
