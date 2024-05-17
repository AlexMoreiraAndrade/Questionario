package trabalhodejava;
import javax.swing.JOptionPane;



public class Questionario {
	/* Questionario */

	private static double Alternativa(double questao, double alternativa) {
		return questao / 1 * alternativa;
	}

	public static void main(String[] args) {
		Cabecario.escrevaCabecario();
		String lista;
		double questao;
		String alternativa;
		String text;
		int soma = 0;

		questao = Double.parseDouble(JOptionPane.showInputDialog(" 14 questoes valedo 65 pontos, Uma questão 90 pontos. Boa Sorte  : Precione 1 para começa "));

		 lista = "1- Qual é a função do operador instanceof em Java? :\n"
		 
				+ "\t(A) Compara duas variáveis de referência\n"
				+ "\t(B) Verifica se um objeto é uma instância de uma determinada classe\n"
				+ "\t(C) Retorna o valor absoluto de um número\n"
				+ "\t(D) Converte um tipo de dado para outro\n"
				+ "\t(E) Incrementa o valor de uma variável\n";
				//* */
		
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "2- Qual palavra-chave é usada para definir uma classe em Java? :\n"

				+ "\t(A) class \n"
				+ "\t(B) void \n"
				+ "\t(C) new \n"
				+ "\t(D) extends \n"
				+ "\t(E) public \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 90);
				soma = soma + 90;
				break;
			case "B":
				text += Alternativa(questao, 0);
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "3 - O que é um wrapper class em Java? :\n"

				+ "\t(A) Uma classe que fornece funcionalidades adicionais para classes abstratas \n"
				+ "\t(B) Uma classe que envolve um objeto primitivo e fornece métodos para acessá-lo \n"
				+ "\t(C) Uma classe que permite a criação de objetos sem a necessidade de uma classe pai \n"
				+ "\t(D) Uma classe que é usada para criar subclasses em Java \n"
				+ "\t(E) Uma classe que fornece métodos de serialização para objetos \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "4 - O que o método compareTo() da interface Comparable faz em Java? :\n"

				+ "\t(A) Compara duas Strings lexicograficamente \n"
				+ "\t(B) Compara duas variáveis de referência \n"
				+ "\t(C) Converte um tipo de dado para outro \n"
				+ "\t(D) Retorna o valor absoluto de um número \n"
				+ "\t(E) Incrementa o valor de uma variável \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "5- Em Java, qual é a principal diferença entre uma interface e uma classe abstrata? :\n"

				+ "\t(A) Uma interface pode conter implementações de métodos, enquanto uma classe abstrata não pode \n"
				+ "\t(B) Uma classe abstrata pode ter construtores, enquanto uma interface não pode \n"
				+ "\t(C) Uma interface pode estender múltiplas classes, enquanto uma classe abstrata não pode \n"
				+ "\t(D) Uma classe abstrata pode ter métodos com implementações, enquanto uma interface não pode \n"
				+ "\t(E) Uma interface pode ter campos de instância, enquanto uma classe abstrata não pode \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "6 - O que o operador && faz em Java? :\n"

				+ "\t(A) Operador de adição \n"
				+ "\t(B) Operador de negação \n"
				+ "\t(C) Operador de ou lógico \n"
				+ "\t(D) Operador de e lógico \n"
				+ "\t(E) Operador de ou exclusivo \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "7 - Qual é a função do operador new em Java? :\n"

				+ "\t(A) Define uma nova variável \n"
				+ "\t(B) Inicia um novo ciclo de repetição \n"
				+ "\t(C) Cria uma nova instância de uma classe \n"
				+ "\t(D) Converte um tipo de dado para outro \n"
				+ "\t(E) Incrementa o valor de uma variável \n";
			
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "8 - O que é polimorfismo em Java? :\n"

				+ "\t(A) A capacidade de uma classe herdar de múltiplas classes \n"
				+ "\t(B) A capacidade de uma classe ser herdada por várias outras classes \n"
				+ "\t(C) A capacidade de uma classe acessar métodos privados de outra classe \n"
				+ "\t(D) A capacidade de uma classe ter vários construtores \n"
				+ "\t(E) A capacidade de uma classe se comportar de maneira diferente dependendo do contexto \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "9 - Qual é o modificador de acesso padrão em Java?:\n"

				+ "\t(A) Public \n"
				+ "\t(B) Private \n"
				+ "\t(C) Protected \n"
				+ "\t(D) Default \n"
				+ "\t(E) Final \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "10 - O que é uma exceção em Java? :\n"

				+ "\t(A) Um tipo de dado primitivo \n"
				+ "\t(B) Uma classe que não pode ser instanciada \n"
				+ "\t(C) Um evento que interrompe o fluxo normal de um programa \n"
				+ "\t(D) Um tipo de dado utilizado para definir intervalos \n"
				+ "\t(E) Um método que não tem retorno \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "11 - O que faz o operador de atribuição += em Java? :\n"

				+ "\t(A) Subtrai o valor de uma variável de outro \n"
				+ "\t(B) Multiplica o valor de uma variável por outro \n"
				+ "\t(C) Divide o valor de uma variável por outro \n"
				+ "\t(D) Adiciona o valor de uma variável a outra \n"
				+ "\t(E) Concatena o valor de uma variável com outro \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);				
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "12 -O que faz o método substring() na classe String em Java? :\n"

				+ "\t(A) Converte a String para minúsculas \n"
				+ "\t(B) Retorna uma subcadeia da String original \n"
				+ "\t(C) Concatena duas Strings \n"
				+ "\t(D) Retorna o comprimento da String \n"
				+ "\t(E) Substitui parte da String por outra sequência de caracteres \n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "13- Qual das opções a seguir é verdadeira sobre o ciclo de vida de um objeto em Java?:\n"

				+ "\t(A) Um objeto é destruído automaticamente assim que sai do escopo.\n"
				+ "\t(B) O coletor de lixo (Garbage Collector) é responsável pela destruição de objetos que não são mais acessíveis.\n"
				+ "\t(C) Um objeto deve ser explicitamente destruído pelo programador para liberar memória.\n"
				+ "\t(D) Objetos em Java nunca são destruídos; eles permanecem na memória indefinidamente.\n"
				+ "\t(E) O método finalize() deve ser chamado manualmente para iniciar a coleta de lixo.\n";
		
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "14 - Qual das seguintes opções descreve corretamente o conceito de encapsulamento em Java?:\n"

				+ "\t(A) Encapsulamento significa que os métodos de uma classe são mantidos privados para que não possam ser acessados fora da classe.\n"
				+ "\t(B) Encapsulamento é o processo de esconder os dados de uma classe, tornando-os acessíveis apenas através de métodos públicos.\n"
				+ "\t(C) Encapsulamento é uma técnica para proteger o código de ser lido por outros programadores.\n"
				+ "\t(D) Encapsulamento é a prática de usar apenas variáveis globais dentro de uma classe.\n"
				+ "\t(E) Encapsulamento é uma forma de garantir que uma classe não possa ser herdada.\n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 0);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		// ===========================================================

		lista = "15 - Qual das alternativas abaixo não é uma palavra-chave reservada em Java?:\n"

				+ "\t(A) synchronized.\n"
				+ "\t(B) transient.\n"
				+ "\t(C) volatile.\n"
				+ "\t(D) instanceof.\n"
				+ "\t(E) unsigned.\n";
				
		alternativa = JOptionPane.showInputDialog(lista + "Alternativa (letra): ").toUpperCase();

		text = "Voce Ganhou : ";
		switch (alternativa) {
			case "A":
				text += Alternativa(questao, 0);
				break;
			case "B":
				text += Alternativa(questao, 0);
				break;
			case "C":
				text += Alternativa(questao, 0);
				break;
			case "D":
				text += Alternativa(questao, 0);
				break;
			case "E":
				text += Alternativa(questao, 65);
				soma = soma + 65;
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);

		//-------------------------------

		JOptionPane.showMessageDialog(null, "Voce acertou "+ soma );

	} 
   
}

