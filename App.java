package dataEhora;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("Sistema de Ponto");
		System.out.println("Digite hora de entrada(HH:MM):");
		String entryTime=sc.nextLine();
		System.out.println("Digite data de entrada(DD/MM/AAAA):");
		String entryDate=sc.nextLine();
		
		System.out.println("Digite hora de saida(HH:MM):");
		String exitTime=sc.nextLine();
		System.out.println("Digite data de entrada(DD/MM/AAAA):");
		String exitDate=sc.nextLine();
		
		
		System.out.println(entryTime);
		System.out.println(entryDate);
		System.out.println(exitTime);
		System.out.println(exitDate);
		
	}

}
