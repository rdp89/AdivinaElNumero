package adivinalo;

public class TestAdivinalo {

	public static void main(String[] args) {
		int numero_usuario;
		int numero_secreto = Adivinalo.dameNumero();

		int intentos = 1;

		do {
			numero_usuario = MiTeclado.pedirEntero("Adivina el entero del 0 al 100 �Cu�l ser�?: ");
			if (numero_usuario == numero_secreto){
				System.out.println("Has adivinado el n�mero! N�mero: " + numero_secreto + " N�mero de intentos: " + intentos);
				break;
			}
			else if (numero_usuario < numero_secreto)
				System.out.println("N�mero incorrecto, es mayor. Intentos: " + intentos++);
			else
				System.out.println("N�mero incorrecto, es menor. Intentos: " + intentos++);

		} while (MiTeclado.deseaContinuar() == true);
		
		System.out.println("El n�mero secreto era: "+Adivinalo.dameNumero());
	}

}
