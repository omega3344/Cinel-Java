import java.util.Scanner;

//public class Main {
	
	public static void main(String[] args) {
		
		int a,b,c;
		int manor,meio,maior;
						
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Introduza o 1º número: ");
		a = scanner.nextInt();

		System.out.println("Introduza o 2º número: ");
		b = scanner.nextInt();

		System.out.println("Introduza o 3º número: ");
		c = scanner.nextInt();


		if(a>b)	{
			if(b>c)  {
				menor = c;
				meio = b;
				maior = a;
			}
			else	{
				if(a<c)  {
					menor = b;
					meio = a;
					maior = c;
				}
				else  {
					menor = b;
					meio = c;
					maior = a;
				}
			}
		}
		else	{
			if(b>c)	{
				if(a>c)	{
					menor = c;
					meio = a;
					maior = b;
				}
				else	{
					menor = a;
					meio = c;
					maior = b;
				}
			}
			else	{
				menor = a;
				meio = b;
				maior = c;
			}
		}


		System.out.println("Números ordenados: "+menor+meio+maior);
	
		scanner.close();
				
	}

}