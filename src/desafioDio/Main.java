package desafioDio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String dadosCurso;
		int dadosCursoInt;
		Curso curso1 = new Curso();
		System.out.println("Digite o nome do curso: ");
		dadosCurso = scan.nextLine();
		curso1.setTitulo(dadosCurso);
		System.out.println("Digite a descrição do curso: ");
		dadosCurso = scan.nextLine();
		curso1.setDescricao(dadosCurso);
		System.out.println("Digite a carga horaria do curso: ");
		dadosCursoInt = scan.nextInt();
		curso1.setCargaHoraria(dadosCursoInt);
		
		String dadosMentoria;
		Mentoria mentoria1 = new Mentoria();
		System.out.println("Digite o nome do mentoria: ");
		dadosMentoria = scan.nextLine();
		dadosMentoria = scan.nextLine();
		mentoria1.setTitulo(dadosMentoria);
		System.out.println("Digite a descrição do mentoria: ");
		dadosMentoria = scan.nextLine();
		mentoria1.setDescricao(dadosMentoria);
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp1 = new Bootcamp();
		String dadosBootcamp;
		System.out.println("Digite o titulo do bootcamp: ");
		dadosBootcamp = scan.nextLine();
		bootcamp1.setNome(dadosBootcamp);
		System.out.println("Digite a descrição do bootcamp: ");
		dadosBootcamp = scan.nextLine();
		bootcamp1.setDescricao(dadosBootcamp);
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria1);
		
		
		Dev dev1 = new Dev();
		String dadosDev;
		System.out.println("Digite o nome do Dev");
		dadosDev = scan.nextLine();
		dev1.setNome(dadosDev);
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println("Conteudos Incritos: "+dev1.getConteudosInscritos());
		System.out.println("Deseja progredir no conteudo?(Y/N)");
		char choice = scan.next().toUpperCase().charAt(0);
		if (choice == 'Y') {
			dev1.progredir();
		}
		System.out.println("Conteudos Concluidos: "+dev1.getConteudosConcluidos());
		System.out.println("XP: "+dev1.calcularTotalXp());
		System.out.println("Conteudos Incritos: "+dev1.getConteudosInscritos());



		
	}

}
