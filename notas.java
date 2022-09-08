package listaSwichCase;
import java.util.Scanner;
public class notas {
	public static void main (String[]args) {
		Scanner in= new Scanner(System.in);
		int na,mb, b, r, i, nmb,nb,nr,ni;
		System.out.println("Insira o número total de alunos");
		na = in.nextInt();
		System.out.println(" Mb");
		mb = in.nextInt();
		System.out.println("Insira o número total de notas B");
		b = in.nextInt();
		System.out.println ("Insira o número total de notas R");
		r = in.nextInt();
		System.out.println ("Insira o número total de notas I");
		i = in.nextInt();
		nmb=(mb*100)/na;
		nb=(b*100)/na;
		nr=(r*100)/na;
		ni=(i*100)/na;
		System.out.println(" A porcentagem de notas é mb:"+nmb);
		System.out.println("b:"+nb);
		System.out.println("R:"+nr);
		System.out.println("I:" +ni);
	}
}
	
