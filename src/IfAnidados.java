
public class IfAnidados {

	public static void main(String[] args) 
	{
		boolean isCondicion=true;
		boolean isCondicionDos=false;
		boolean isCondicionTres=true;
		
		if(isCondicion){
			System.out.println("Dentro del primer if");
			if(isCondicionDos){
				System.out.println("Dentro del segundo if");
				if(isCondicionTres){
					System.out.println("Dentro del tercer if");
					
				}
				else{
					System.out.println("Fuera del tercer if");
				}
			}
			else{
				System.out.println("Fuera del segundo if");
				if(5<10){
					System.out.println("5 mayor que 10");
				}
				else{
					System.out.println("5 menor que 10");
				}
			}
		}
		else{
			System.out.println("Fuera del primer if");
		}
		
	}

}
