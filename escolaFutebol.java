package listaSwichCase;
import java.util.Scanner;
public class escolaFutebol {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int IdadeAluno;
		System.out.println("Informe a idade do aluno");
		IdadeAluno =in.nextInt();
		switch(IdadeAluno) {
		case 6:
			System.out.println("O aluno é dente de leite");
			break ;
		case 7:
			System.out.println("O aluno é júnior");
			break ;
		case 8:
			System.out.println("O aluno é júnior max");
			break ;
		case 9:
			System.out.println("O aluno é júnior master");
			break ;
		case 10:
			System.out.println("O aluno é Master");
			break ;
		default:
			System.out.println("O aluno não tem possui a idade adequada para ingressar na escola");
			
		}
	}
}
