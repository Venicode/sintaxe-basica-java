//Classe Main
public class Main {
    //Método Principal
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao Screen Match");
        String filme = "Interestellar";
        System.out.println("Filme: " +filme);

        short anoDeLancamento = 2014;
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        boolean estaNoPlano = true;
        System.out.println("Incluso no plano atual: "+estaNoPlano);
        double avaliacaoDoFilme = 8.7;
        System.out.println("Avaliação: " +avaliacaoDoFilme);

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.printf("A média da avaliação é %.2f%n",media);
        String sinopse;

        //Text Block
        sinopse = """
            Sinopse geral:
            Filme de ficção cientifica emocionante
                  """;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println("Estrelas: " + classificacao);

    }
}
