import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) 
	{
	Scanner teclado=new Scanner(System.in);
	
	System.out.print("Teclea en que numero quieres empezar: ");
	int inicio=teclado.nextInt();
	
	System.out.print("Teclea en que numero quieres terminar: ");
	int fin=teclado.nextInt();
	
	//for(; inicio<=fin; inicio++){
	for(int i=inicio; i<=fin; i++){
		System.out.println(i);
	
	}
	
	
	
	
	
	
	

	}

}
