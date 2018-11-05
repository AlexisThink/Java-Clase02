
public class EstructuraIf {

	public static void main(String[] args) {
		/*
		 * Si la condicion de la sentencia If es verdadera ¿, se va a ejecutar
		 * todo lo que esta entre las llaves
		 * 
		 * Estructura If
		 * 
		 * if (condicion) { Si se cumple la condicion hace lo que este entre las
		 * llaves }
		 * 
		 */

		if (5 > 10) {
			System.out.println("Se cumplio la condicion");
		}
		System.out.println("Fin del programa");

		System.out.println("*****");

		/*
		 * Si la condicion de la sentencia If/else es verdadera, se va a
		 * ejecutar todo lo que esta entre las primeras llaves;
		 * 
		 * Sino cumple la condicion, siempre se va a ejecutar lo que esta entre
		 * las llaves del Else
		 * 
		 * Estructura If
		 * 
		 * if (condicion) { Si se cumple la condicion hace lo que este entre las
		 * llaves } else { Sino se cumple la condicion hace lo que este entre
		 * las llaves del else }
		 * 
		 */

		if (5 > 10) {
			System.out.println("Se cumplio la condicion");

		} else {
			System.out.println("No se cumplio la condicion");

		}
		System.out.println("Fin del programa");

		// Comienza ejercicio

		if (5 == 5 & 2 == 2) {
			System.out.println("Se cumple la condicion");
		} else {
			System.out.println("No se cumplio :(");
		}
		
		
		if (5==10 | 3==3){
			System.out.println("Se cumple esta condicion");
		}else {
				System.out.println("No se cumplio :((((");
			}
		

		if((5==10 | 3==3) && (5 == 5 & 2 == 2))
		{
			System.out.println("Se cumplio la condicion");
		}
		else{
			System.out.println("No se cumple la condicion");
		}
		
	}

}
