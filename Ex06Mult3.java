package JavaExercicios.Modulo10LacosRepeticao;

import java.util.Scanner;

public class Ex06Mult3 {

	public static void main(String[] args) {
		int num = 0, tot = 0, contador = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num %3 == 0 && num != 0){
				
				tot += num;
				contador ++;	
			}
			
		} while (num != 0);
		
		media = (float)tot / contador;
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		leia.close();
		
	}

}
