package dataEhora;


import java.time.LocalDateTime;
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
		String dateTime=entryDate+":"+entryTime;
		DateTimeFormatter form=DateTimeFormatter.ofPattern("dd/MM/yyyy:kk:mm");
		
		LocalDateTime entry=LocalDateTime.parse(dateTime,form);
		
		System.out.println("Digite hora de saida(HH:MM):");
		String exitTime=sc.nextLine();
		System.out.println("Digite data de entrada(DD/MM/AAAA):");
		String exitDate=sc.nextLine();
		dateTime=exitDate+":"+exitTime;
		LocalDateTime exit=LocalDateTime.parse(dateTime,form);
		
		System.out.println(entry);
		System.out.println(exit);
		
	}

}
