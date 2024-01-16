public class Condicional {
    public static void main(String[] args) {
        short anoDeLancamento = 2014;
        boolean estaNoPlano = true;
        double avaliacaoDoFilme = 8.7;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2023) {
            System.out.println("Lançamentos desse ano");
        } else{
            System.out.println("Filmes populares");
        }
        if (estaNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else{
            System.out.println("Faça um upgrade no seu plano atual para assistir esse filme");
        }
    }
}
