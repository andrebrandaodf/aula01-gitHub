package course;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
				System.out.println("Digite a equação de 2º Grau: ");
				System.out.println("Valor de A: ");
				double a = sc.nextDouble();
				
				System.out.println("Valor de B:");
				double b = sc.nextDouble();
				
				System.out.println("Valor de C:");
				double c = sc.nextDouble();
				
				double delta = ((b*b)- 4*a*c);
				//x1
				double bhaskara = (-b + Math.sqrt(delta))/(2*a); 
				double x1 = bhaskara;
				
				//x2
				double bhaskara2 = (-b - Math.sqrt(delta))/(2*a); 
				double x2 = bhaskara2;
				
				double xv = -b/(2*a);
				double yv = - delta/(4*a); 
				
				System.out.println("------------------------------------------------------------------------");
				
				System.out.println("Delta = " +delta);	
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2);
				System.out.println("Xv = " +xv);
				System.out.println("Yv = " +yv);
				
				
				if (a>0) {
					System.out.println("Concavidade para cima (Positivo)");} 
					
				
				else {
					System.out.println("Concavidade para baixo (Negativa");}	
				
				
				if (delta > 0) {
					System.out.println("Temos 2 raízes");}
				
				else {
					System.out.println("Raíz Real");}	
			
					
			System.out.println("-----------------------------------------");	
			
		sc.close();
		

				
				}
				
		
		
	}
	
