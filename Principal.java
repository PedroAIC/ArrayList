import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner tecladoNum = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		
		//Aluno[] vAlunos = new Aluno[40];
		ArrayList<Aluno> vAlunos = new ArrayList<Aluno>();
		int nAlunos;
		
		System.out.print("Quantos alunos na sala: ");
		nAlunos = tecladoNum.nextInt();
		
		for(int i=0; i<nAlunos; i++) {
			System.out.print("Nome: ");
			Aluno aluno = new Aluno(teclado.nextLine());
			System.out.print("P1: ");
			aluno.setNotaP1(tecladoNum.nextDouble());
			System.out.print("P2: ");
			aluno.setNotaP2(tecladoNum.nextDouble());
			//vAluno.add(aluno);
			vAlunos.add(aluno);
		}
	
		for(Aluno c : vAlunos) {
			System.out.println(c);
		}
	}
}
