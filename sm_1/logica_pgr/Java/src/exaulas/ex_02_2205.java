package exaulas;
import java.util.Random;
import java.util.Scanner;
public class ex_02_2205 {

	public static void main(String[] args) {
		/* Crie um programa que solicite ao usuario adivinhar um numero entre 1 e 100,
		 * dado dicas se a tentativa é muito alta ou muito baixa, "adicione um limite de tentativas."
		 * user vetor
		 * */

		int num = gerandoNumero();
		System.out.print(num);
		tentativa(num);
		
	}
	
	public static void tentativa(int num) {
		int[] numeros_tentados = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int tentativas = 10;
		System.out.print("\nTente adivinhar o numero!");
		for(int c=0;c<10;c++) {
			System.out.printf("\n%dª Tentativa.\n",c+1);
			System.out.print("Digite sua tentativa: ");
			int tent = new Scanner(System.in).nextInt();
			if(tent==num) {
				System.out.printf("\nVocê acertou o numero! O numero era: %d",num);
				break;
			} else {
				if(tent>num) {
					System.out.print("\nSua tentativa foi mais alta que o numero.\n\n");
					numeros_tentados[c] = tent;
					tentativas --;
				} else {
					System.out.print("\nSua tentativa foi mais baixa que o numero.\n\n");
					numeros_tentados[c] = tent;
					tentativas --;
				}
			}
			System.out.print("Suas tentativas: ");
			for(int v=0;v<numeros_tentados.length;v++) {
				if (numeros_tentados[v]!=-1) {
					System.out.print(numeros_tentados[v]+" ");
				}
			}
		}
		if(tentativas == 0) {
			System.out.print("\n\nVocê chegou ao limite de tentativas. Tente na proxima.");
		}
	}
	
	public static int gerandoNumero() {
		Random gerador = new Random();
		int num = gerador.nextInt(10);
		return num;
	}

}
