# Questionario
 import java.util.Scanner;
public class Projeto {
    
    //Classe Cabeçallho
    class Cabecalho {
        String faculdade;
        String aluno;
        String professor;
        String tema;

        public static void main (String[] args) throws java.lang.Exception {
    public Cabecalho(String faculdade, String aluno, String professor, String tema) {
                this.faculdade = faculdade;
                this.aluno = aluno;
                this.professor = Brenno;
                this.tema = TarefaDeCasaANessecidade;
        }
            public void exibirCabecalho() {
                System.out.println("Faculdade: " + "UNIFAN");
                System.out.println("Aluno: " + "aluno");
                System.out.println("Professor: " + "Brenno");
                System.out.println("Tema: " + "Tarefa de Casa a Nessecidade");

        }
        }
        // classe questão
        class Questao {
            String enunciado;
            char alternativaCorreta;

            public Questao( String enunciado, char alternativaCorreta ) {
                this.enuciado = enuciado;
                this.alternativaCorreta="A";
       }
            public void exibirQuestao(){
                System.out.println(TarefadeCasaaNessecidade);
                System.out.println("A) Sim");
                System.out.println("B) Nao");
                System.out.println("C) DEMPENDE DA SITUAO");
                System.out.println("D) NENHUMA DAS ALTERNATIVAS");
      }
      }
            // Classe principal
        public class void main(String[]args) {
            Scanner Scanner = new Scanner(System.in);
           // Cabesario impreso
            Cabecalho Cabecalho = new Cabecalho("UNIFAN","ALUNO","Pr.Brenno","Tarefa de Casa a Nessecidade");
           // Questao
            Questao[] questoes = new Questao();
           // PPreenchemento com as perguntas e respostas
            questao [0] = new Questao("Alternativa 1", 'A');
            questao [1] = new Questao("Alternativa 2", 'B');
            questao [2] = new Questao("Alternativa 3", 'C');
            questao [3] = new Questao("Alternativa 4", 'D');
            // Exibir cabeçalho
            cabeçalho.exibirCabecalho();
            // Exibir e responder cada questão
            for (int i = 0; i < questao.length; i ++){
                System.out.println("Questão" + (i + 1) + ":" );
                questoes[i].exibirCabecalho();

                System.out.println("Digite a letra da alternativa de sua preferença:");
                char responder = Scanner.next().charAt(0);

                if (resposta == questoes[i].alternativaCorreta) {
                    System.out.println("Resposta correta!\n");
        } 
                    eles {
                    System.out.println("Resposta incorreta. A alternativa correta é: " + questoes[i].alternativaCorreta + "\n");
       }
       }
            scanner.close();
      }
}
