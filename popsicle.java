import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double tamanhopicole, utero, largura, tamanho;
    String nome;
    Scanner entrada = new Scanner(System.in);
    System.out.printf("Nome da personagem: ");
    nome=entrada.next();
    System.out.printf("Tamanho da personagem: ");
    tamanho=entrada.nextDouble();
    tamanhopicole = tamanho * 100 / 161;
	  utero = tamanho * 7.5 / 161;
	  largura = tamanhopicole * 3 / 100;
	  tamanhopicole = 8 * tamanhopicole / 100 + 6;
    System.out.printf("a " + nome + " aguenta um picole %.2f cm de comprimento e %.2f cm de largura\n", tamanhopicole, largura);
    System.out.printf("Curiosidade: a " + nome + " tem um útero de %.2f cm\n", utero);
  }
}
