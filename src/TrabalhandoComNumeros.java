import java.util.Scanner;

public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;		
		int soma;
		int multiplicacao;
		int subtracao;
		double divisao;
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Por favor, informe o primeiro valor:");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, informe o segundo valor:");
		valor2 = leitor.nextInt();		
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		divisao = (double)valor1 / (double)valor2;
		multiplicacao = valor1 * valor2;
		
		System.out.println("O resultado � da soma �" + soma);
		System.out.println("O resultado � da subtra��o �" + subtracao);
		System.out.println("O resultado � da divis�o �" + divisao);
		System.out.println("O resultado � da multiplica��o �" + multiplicacao);
	leitor.close();
	}

}
