package JavaExercicios.Modulo10LacosRepeticao;

import java.util.Scanner;

public class Ex03Idades {

	public static void main(String[] args) {
		
		int idade=0, menor=0, maior=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite uma idade:");
		idade = leia.nextInt();
		
		while (idade>=0) {	
			if (idade < 21){ 
				
				menor ++;	
			} 
			
			if (idade > 50) {
				
				maior ++;	
			}
			
			System.out.println("\n Digite uma idade:");
			idade = leia.nextInt();
					
		} 
		
		System.out.println("Total de pessoas menores de 21 anos: "+menor);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior);
	}

}
