package course;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Exerc�cio - 05	
	
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1 ) {
		
			total = quantidade*4.0;
		
		}
		
			else if (codigo == 2) {
			
			total = quantidade*4.50	;
		}
			
			
			else if (codigo == 3) {
				
			total = quantidade*5.00	;
		}
		
			else if (codigo == 4) {
				
			total = quantidade*2.00	;
		}
		
		else  {
				
				total = quantidade*1.50;
		}
		
			System.out.printf("Total R$ %.2f%n", total);
			
			
	
		sc.close();
		
	}	
}
