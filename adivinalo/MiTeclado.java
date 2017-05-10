package adivinalo;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MiTeclado {
	private static Scanner numero = new Scanner(System.in);
	private static Scanner respuesta = new Scanner(System.in);
	
	
	public static int pedirEntero(String pregunta) throws InputMismatchException {
		//BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
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
		System.out.println("¿Seguir intentándolo? (s/n)");
		char answer = leerRespuesta();
		if(answer!='s' && answer!='n' && answer!='S' && answer!='N'){
			System.out.println("Respuesta no válida");
			return true;
		}else if(answer=='s' || answer=='S')
			return true;
		else
			return false;
	}

	private static char leerRespuesta() {
		char answer = 0;
		try {
		answer = respuesta.nextLine().charAt(0);
		}catch(InputMismatchException e){
			System.err.println("Eso no es una respuesta válida!");
			e.getStackTrace();
		}
		return answer;
	}
}
