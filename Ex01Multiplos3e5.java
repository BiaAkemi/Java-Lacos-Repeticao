package JavaExercicios.Modulo10LacosRepeticao;

import java.util.Scanner;

public class Ex01Multiplos3e5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n1, n2, x;
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if (n1>n2){
			
			System.out.println("\nIntervalo inválido");
			
		} else {
			for(x=n1;x<=n2;x++) {
				
				if (x % 3 == 0 && x % 5 == 0){
					
					System.out.println("\n" + x + " é múltiplo de 3 e 5");
					
				}
				
			}
		} leia.close(); 

	} 

}
