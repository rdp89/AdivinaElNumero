package adivinalo;

import java.util.Scanner;
import java.util.InputMismatchException;
public class MiTeclado {
	private static Scanner numero = new Scanner(System.in);
	
	public static int pedirEntero(String pregunta) throws InputMismatchException {
		int number=0;
		System.out.println(pregunta);
		try{
		number = numero.nextInt();
		}catch(InputMismatchException e){
			System.err.println("Eso no es un entero! Tu número será un 8 elegido por el programador");
			number = 8;
		}
		return number;
	}
	
	public static boolean deseaContinuar(){
		char answer = 0;
		try {
		answer = numero.nextLine().charAt(0);
		}catch(InputMismatchException e){
			System.err.println("Eso no es una respuesta válida!");
		}
		if(answer!='s' && answer!='n'){
			System.out.println("Respuesta no válida");
			return false;
		}else if(answer=='n')
			return true;
		else
			return false;
	}
}
