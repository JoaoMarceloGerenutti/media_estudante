package entities;

public class Student {

	public String nome;
	public double nota_01;
	public double nota_02;
	public double nota_03;
	
	public double media() {
		return nota_01 + nota_02 + nota_03;
	}
	
	public String status() {
		if (media() >= 60.0 ) {
			return "PASSOU!";
		} else {
			double notaFalta = 60.0 - media();
			return "FALHOU \n"
					+ "FALTOU!"
					+ String.format(" %.2f ", notaFalta)
					+ "PONTOS";
		}
	}
	
	public String toString() {
		return String.format("%.2f%n", media())
				+ status();
	}
}
