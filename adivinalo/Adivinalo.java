package adivinalo;

public class Adivinalo {
	private static int numero;
		
	public static int dameNumero() {
		numero = (int) Math.round(Math.random()*100);
		return numero;
	}
}
