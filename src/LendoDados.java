import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		//A linha abaixo cria uma vari�vel (espa�o na RAM) que guarda teto
		String nome; 
		// A linha abaixo exibe uma mensagem
		System.out.println("Por favor, digite o seu nome: ");
		// Alinha abaixo cria uma Scanner que permite ler dados do teclado
		Scanner leitor = new Scanner(System.in); 
		// A linha abaixo l� um texto fornecido pelo usu�rio e guarda na vari�vel nome
		nome = leitor.next();
		// A linha abaixo exibe uma mensagem com o conte�do vari�vel nome 
		System.out.println("Boa noite para voc�, " + nome);
		// Como abrimos um recurso externo (a leitura de dados do teclado) precisamos fechar para evitar erros em outros sistemas
		leitor.close();
	}

}
