package exaulas;
import java.util.Scanner;
public class questao_aula_07_06 {

	public static void main(String[] args) {
		/*Faça um programa que receba um nome e 
		 * a) Alterne as letras em maiuscula e minuscula. o usuario deve informar se quer iniciar c/ maiuscula e minuscula
		 * b) Mostre o indice da ultima letra e a ultima letra.
		 * c) Substitua todas as vogais por "X"
*/
		System.out.print("Digite um nome: ");
		String nome = new Scanner(System.in).next();
		System.out.print("Começar com\n1.Maiscula 2.Minuscula: ");
		int resp = new Scanner(System.in).nextInt();
		alternarNome(nome,resp);
		ultimaLetra(nome);
		substituindoX(nome);
	}
	
	public static void ultimaLetra(String nome) {
		System.out.print("\nO indice da ultima letra: " + (nome.length()-1));
		System.out.print("\nA ultima letra é: "+(nome.toUpperCase().charAt(nome.length()-1)));
	}
	
	public static void substituindoX(String nome) {
		System.out.print("\nO nome alterando as vogais: "+nome.toLowerCase().replace('a', 'x').replace('e', 'x').replace('i', 'x').replace('o', 'x').replace('u', 'x'));
	}

	public static void alternarNome(String nome, int resp) {
		char letra = ' ';
		for(int i=0;i<nome.length();i++) {
			if(resp==1) {
				if(i%2==0) {
					letra = nome.toUpperCase().charAt(i);
				} else {
					letra = nome.toLowerCase().charAt(i);
				}
				System.out.print(letra);
			}
			if(resp==2) {
				if(i%2==0) {
					letra = nome.toLowerCase().charAt(i);
				} else {
					letra = nome.toUpperCase().charAt(i);
				}
				System.out.print(letra);
			}
			
		}
	}

	private static String funcaoDeRetorno() {
		String nome = "José";
		int numero = 0;
		return nome;
	}
	
	public static int numero = 0 ;
}
