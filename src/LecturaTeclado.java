import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
// Estructura para Instanciar, instnacias para ocupar el codigo de otra clase
	//NombreClase nombreVariableInstancia=new NombreClase();
		

		
		Scanner teclado=new Scanner(System.in);
		//System.out.println("Introduzca su nombre: ");
		
		//String nombre= teclado.next();
		
		//System.out.println("Su nombre es: "+nombre);
		
		
		//******
		
		String numeroUno;
		int numeroDos;
		
		
		
		//Solicitu numero uno
		System.out.print("Introduzca un numero: ");
		numeroUno=teclado.next();
				
		//Solicitud numero dos
		System.out.print("Introduzca un segundo numero:");		
		numeroDos=Integer.parseInt(teclado.next()) ;
		
		int suma=Integer.parseInt(numeroUno)+numeroDos;
		
		//Suma
		System.out.println("El resultado de la suma de los numeros introducidos es: "+ suma);
	}

}
