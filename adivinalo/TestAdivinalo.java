package adivinalo;

public class TestAdivinalo {

	public static void main(String[] args) {
		int numero_usuario;
		int numero_secreto = Adivinalo.dameNumero();

		int intentos = 1;

		do {
			numero_usuario = MiTeclado.pedirEntero("Adivina el entero del 0 al 100 ¿Cuál será?: ");
			if (numero_usuario == numero_secreto){
				System.out.println("Has adivinado el número! Número: " + numero_secreto + " Número de intentos: " + intentos);
				break;
			}
			else if (numero_usuario < numero_secreto)
				System.out.println("Número incorrecto, es mayor. Intentos: " + intentos++);
			else
				System.out.println("Número incorrecto, es menor. Intentos: " + intentos++);

		} while (MiTeclado.deseaContinuar() == true);
		
		System.out.println("El número secreto era: "+Adivinalo.dameNumero());
	}

}
