package JavaExercicios.Modulo10LacosRepeticao;

import java.util.Scanner;

public class Ex02ParouImpar {

	public static void main(String[] args) {
		
		int x, num, contpar = 0, contimpar = 0;
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++) {
			
			System.out.println("Digite o "+x +"º número: ");
			num = leia.nextInt();
			
			if(num %2 == 0) {
				contpar ++;
			}
			
			else {
				
				contimpar ++;
			}
			
		} 
		
		System.out.println("Total de números pares: "+ contpar);
		System.out.println("Total de números ímpares:"+ contimpar);
		
		leia.close();
	}

}
