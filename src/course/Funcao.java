package course;

import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com tr�s n�meros : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();		
	
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > y) {
			aux = x;
			}
			else if (y > z) { 
			aux	= y;
			}
			
		else {
			aux = z;
		} 
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	
	
	
}
