import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String[] opcoes = {"Pedra", "Papel", "Tesoura"};

    System.out.println("Início do Jogo Pedra, Papel e Tesoura!");

    while (true) {
        System.out.print("Escolha sua jogada (0 - Pedra, 1 - Papel, 2 - Tesoura, 3 - Sair): ");
        int escolhaDoJogador = scanner.nextInt();

        if (escolhaDoJogador < 0 || escolhaDoJogador > 3) {
            System.out.println("Erro: Escolha inválida. Tente novamente.");
            continue;
        }

        if (escolhaDoJogador == 3) {
            System.out.println("Obrigado por jogar!");
            break;
        }

        int escolhaDaIA = random.nextInt(3);

        System.out.println("Você escolheu: " + opcoes[escolhaDoJogador]);
        System.out.println("IA escolheu: " + opcoes[escolhaDaIA]);

        if (escolhaDoJogador == escolhaDaIA) {
            System.out.println("Empate!");
        } else if ((escolhaDoJogador == 0 && escolhaDaIA == 2) ||
                   (escolhaDoJogador == 1 && escolhaDaIA == 0) ||
                   (escolhaDoJogador == 2 && escolhaDaIA == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("IA venceu!");
        }
    }

    scanner.close();
  }
}
