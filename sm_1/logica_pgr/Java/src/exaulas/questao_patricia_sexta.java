package exaulas;
import java.util.*;
public class questao_patricia_sexta {

	public static void main(String[] args) {
		/* Faça um programa que preencha um vetor de 5 posições com os nomes dos alunos  de uma turma
		 * e uma matriz 5x4 com as quatro notas de cada aluno. Ao final do programa deve mostrar na tela
		 * uma listagem dos alunos com suas respectivas médias.
*/
		String alunos[] = new String[5];
		Double notas[][] = new Double[5][5];
		preencherAlunos(alunos);
		mostrarAlunos(alunos);
		
	}
	
	public static void preencherNotas(Double[][] matriz) {
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				System.out.print("");
			}
		}
	}

	public static void mostrarAlunos(String[] vetor) {
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+" ");
		}
	}
	
	public static void preencherAlunos(String[] vetor) {
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Digite o nome do aluno: ");
			String nome = new Scanner(System.in).next();
			vetor[i] = nome;
		}
		
		
	} 
	
}
