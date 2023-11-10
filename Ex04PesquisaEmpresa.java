package JavaExercicios.Modulo10LacosRepeticao;

import java.util.Scanner;

public class Ex04PesquisaEmpresa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade = 0, idadec = 0, genero = 0, cargo = 0, mfront = 0, hmob = 0, contador = 0, back = 0, nbfull = 0; 
		double media = 0;
		String resp = "S";
		
		while (resp.equalsIgnoreCase("s")) {
			
			System.out.println("\n\tIdade: ");
			idade = leia.nextInt();
			idadec += idade; 
			
			//genero
			System.out.println("\n\tSelecione o seu gênero: ");
			System.out.println("\n1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não binário");
			System.out.println("4 - Mulher trans");
			System.out.println("5 - Homem trans");
			System.out.println("6 - Outros");
			genero = leia.nextInt();
			
			
			System.out.println("\n\tVocê é pessoa desenvolvedora: ");
			System.out.println("\n1- Backend");
			System.out.println("\n2 - FrontEnd");
			System.out.println("\n3 - Mobile");
			System.out.println("\n4 - FullStack");
			cargo = leia.nextInt();
			
			// backend
			if (cargo == 1) {
				back += 1;
			}
			// mulhers front
			if ((genero == 1 || genero == 4) && cargo == 1) {
				mfront +=1;
			}
			// homens mobile +40
			if ((genero == 2 || genero == 5) && cargo == 3 && idade > 40) {
				hmob +=1;
			}
			// não binários fullstack - 30
			if ((genero == 3 && cargo == 4) && idade < 30) {
				nbfull += 1;
			}
			// responderam pesquisa
			contador += 1;
			
			System.out.println("\nDeseja continuar (S/N): ");
			resp = leia.next();
			
		}	
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+back); 
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: "+mfront);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+hmob);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+nbfull);
		
		System.out.println("\nO número total de pessoas que responderam à pesquisa: "+contador);
		media = (float)idadec / contador;
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f",media);
		
		leia.close();
	}

}
