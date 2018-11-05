import java.util.Scanner;

public class EjercicioTabladeMultiplicar {

	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner(System.in);
		
		
		
		
		/*System.out.println("Que tabla de multiplicar desea mostrar: ");
		int tablaSeleccionada = teclado.nextInt();
		
		for(int i=1; i<=10;i++){
			System.out.println(tablaSeleccionada + "x" + i + "= " + i*tablaSeleccionada);
		}*/
		
		for(int i=1; i<=10;i++){
			System.out.println("Tabala de multiplicar de " +i);
			for(int j=1; j<=10;j++){
				System.out.println(i+"x"+j+"= "+ (i*j));
			}
		}
		
		
			
	}

}
