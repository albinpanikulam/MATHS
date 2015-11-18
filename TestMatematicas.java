import java.util.Scanner;
public class TestMatematicas{
	public static void main(String[] arg){
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero");
		int i=sc.nextInt();
		System.out.println("El numero: "+i+" es "+Matematicas.esPar(i));
		System.out.println("El numero: "+i+" es "+Matematicas.esDivisiblePorTres(i));
		System.out.println("El numero: "+i+" es "+Matematicas.esDivisiblePorCinco(i));
		// System.out.printf("%s %d %s %b %n", );
		
		}
	}
	
