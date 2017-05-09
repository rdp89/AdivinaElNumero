package adivinalo;

public class Adivinalo {
	private int numero;
	
	public void generar(){
		numero = (int) Math.round(Math.random()*100);
	}

	public int getNumero() {
		return numero;
	}
}
