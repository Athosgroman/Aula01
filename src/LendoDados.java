import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		//A linha abaixo cria uma variável (espaço na RAM) que guarda teto
		String nome; 
		// A linha abaixo exibe uma mensagem
		System.out.println("Por favor, digite o seu nome: ");
		// Alinha abaixo cria uma Scanner que permite ler dados do teclado
		Scanner leitor = new Scanner(System.in); 
		// A linha abaixo lê um texto fornecido pelo usuário e guarda na variável nome
		nome = leitor.next();
		// A linha abaixo exibe uma mensagem com o conteúdo variável nome 
		System.out.println("Boa noite para você, " + nome);
		// Como abrimos um recurso externo (a leitura de dados do teclado) precisamos fechar para evitar erros em outros sistemas
		leitor.close();
	}

}
