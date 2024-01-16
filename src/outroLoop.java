import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double avaliacao = 0;
        int qtdNotas = 0;

        while (avaliacao != -1) {
            System.out.println("Diga a sua avaliação do filme ou -1 para encerrar: ");
            avaliacao = leitura.nextDouble();
            if(avaliacao != -1){
                mediaAvaliacao += avaliacao;
                qtdNotas ++;
            }

        }
        System.out.println("Média de avaliações: "+mediaAvaliacao/qtdNotas);
    }
}
