package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.print("Nome: ");
		estudante.nome = sc.nextLine();
		
		System.out.print("Nota 01: ");
		estudante.nota_01 = sc.nextDouble();
		
		System.out.print("Nota 02: ");
		estudante.nota_02 = sc.nextDouble();
		
		System.out.print("Nota 03: ");
		estudante.nota_03 = sc.nextDouble();
		System.out.println();
		
		System.out.println("Nota final: " + estudante);
		
		sc.close();
	}

}
