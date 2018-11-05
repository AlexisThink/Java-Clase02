import java.util.Scanner;

public class EstructuraWhile {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Teclea en que numero quieres empezar: ");
		int inicio=teclado.nextInt();
		
		System.out.print("Teclea en que numero quieres terminar: ");
		int fin=teclado.nextInt();
		
		//Inicia While
		
		int i=inicio; //Inicializacion
		
		while (i<=fin){ //Condicion
		System.out.println(i);
		i++; //Incremento
		}
		

	}

}
