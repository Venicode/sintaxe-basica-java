import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoDesafio {
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhação!");
        System.out.println("Adivinhe um número de 0 a 100");
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número:");
            int numeroUsuario = leitura.nextInt();
            if (numeroUsuario > numeroGerado){
                System.out.println("O número que você digitou é maior que o número secreto");
                tentativas ++;
            }
            else if (numeroUsuario < numeroGerado){
                System.out.println("O número que você digitou é menor que o número secreto.");
                tentativas ++;
            }
            else{
                System.out.println("Você ACERTOU! Parabéns!");
                break;
            }
        }
        if (tentativas ==5){
            System.out.println("Você não conseguiu adivinhar o número, boa sorte na próxima vez");
        }
    }
}
