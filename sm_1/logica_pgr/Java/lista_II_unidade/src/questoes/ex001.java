package questoes;
import java.util.Scanner;
public class ex001 {

	public static void main(String[] args) {
		/* 1) Faça um programa que receba 2 números inteiros e mostre na tela o seguinte menu: 
			1 – Soma 
			2 – Subtração 
			3 – Multiplicação 
			4 – Divisão 
			5 – Trocar valores 
			6 – Sair 
			O usuário deverá escolher a opção desejada e, então deve ser mostrado o resultado da 
			operação desejada. Caso o usuário escolha a opção 5, os valores devem ser recebidos 
			ovamente. 
			Uma vez mostrado o resultado da operação escolhida, o menu deve ser mostrado 
			novamente na tela. Esse ciclo se repetirá até que o usuário solicite a opção Sair. 
			Para cada operação deve ser construída uma função. */
			
		menu();
	}
	
	public static int captar(int msg) {
		Scanner sc = new Scanner(System.in);
		int valor=0;
		if(msg==1) {
			System.out.print("Insira um numero inteiro: ");
			valor = sc.nextInt();	
		} else {
			if(msg==2) {
				System.out.print("Insira a opção: ");
				valor = sc.nextInt();
			} else {
				System.out.println("(ERROR Param) -> Não foi inserido o parâmetro.");
			}
		}
		return valor;
	}

	public static void menu() {
		int n1=0,n2=0,op;
		String menu = "<<--<<-- MENU -->>-->>\n1-Soma 		2-Subtração \n3-Multiplicação 4-Divisão \n5-Troca valores 6-Sair\n";
		n1 = captar(1);
		n2 = captar(1);
		while(true) {
			System.out.print(menu);
			op = captar(2);
			opcoes(op,n1,n2);
			if (op==5) {
				n1 = captar(1);
				n2 = captar(1);
			} else {
				if(op==6) {
					System.out.print("Fim do programa.");
					break;
				}
			}
		}
	}
	
	public static void opcoes(int op, int n1, int n2) {
		switch(op) {
		case 1: limpa();
				System.out.printf("A soma %d + %d = %d%n",n1,n2,(n1+n2));
				break;
		case 2: limpa();
				System.out.printf("A subtração %d - %d = %d%n",n1,n2,(n1-n2));
				break;
		case 3: limpa();
				System.out.printf("A multiplicação %d x %d = %d%n",n1,n2,(n1*n2));
				break;
		case 4: limpa();
				System.out.printf("A divisão %d / %d = %.2f%n",n1,n2,((double)n1/n2));
				break;		
		}
	}
	
	public static void limpa() {
	    for (int i = 0; i < 50; ++i) {
	    	System.out.println();
	    }
	}
	
}
