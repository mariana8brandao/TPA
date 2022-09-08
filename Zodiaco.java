package listaSwichCase;
import java.util.Scanner;
public class Zodiaco {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int d,m;
		System.out.println("Informe o mês em que nasceu");
		m =in.nextInt();
		System.out.println("Informe o dia em que nasceu");
		d =in.nextInt();
		switch(m) {
		case 1:
			if (d<=20) {
				System.out.println("Capricórnio");
		    }else {
		    	System.out.println("Aquario");
		    	break;}
		 case 2:
			if (d<=19) {
				System.out.println("Aquario");
			}else {
			    System.out.println("Peixes");
			    break;}
		 case 3:
			if (d<=20) {
				System.out.println("Peixes");
			}else {
				 System.out.println("áries");
				 break;}
		 case 4:
			if (d<=20) {
				System.out.println("áries");
			}else {
				System.out.println("Touro");
				  break;}
		 case 5:
				if (d<=20) {
					System.out.println("Touro");
			    }else {
			    	System.out.println("Gêmeos");
			    	break;}
		 case 6:
			if (d<=20) {
				System.out.println("Gêmeos");
			}else {
			   System.out.println("Câncer");
				 break;}
		 case 7:
			if (d<=22) {
				System.out.println("Câncer");
			}else {
				 System.out.println("Leão");
				 break;}
		 case 8:
			if (d<=22) {
				System.out.println("Leão");
			}else {
				System.out.println("Virgem");
			  break;}
		case 9:
			if (d<=22) {
				System.out.println("Virgem");
			}else {
				System.out.println("Libra");
				  break;}
		 case 10:
			if (d<=22) {
				System.out.println("Libra");
			 }else {
				System.out.println("Escorpião");
			 	break;}
		 case 11:
			if (d<=21) {
				System.out.println("Escorpião");
			}else {
				System.out.println("Sagitário");
				  break;}
		 case 12:
			if (d<=20) {
				System.out.println("Sagitário");
			}else {
				 System.out.println("Capricórnio");
				 break;}
		default:
			System.out.println ("Data digitada errada");
		
				
		    }
		}
	
}
