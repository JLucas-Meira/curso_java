import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35748;
		String nome = "Roberta";
		int idade = 27;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f por mes %n", nome, idade, renda);
		
		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado " + x + " Metros");
		
	}

}
