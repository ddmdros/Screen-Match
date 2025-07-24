public class Main {
    public static void main(String[] args) {
        System.out.println("Boas vindas! Este é o Screen Match!");
        System.out.println("Filme: Top Gun Maverich");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " +anoDeLancamento);
        boolean disponivelNoPlano = false;
        double nota = 8.4f;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println("Média: " + media);

        String resumo;
        resumo = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Muito bom!
                Ano de Lançamento:\s""" + anoDeLancamento;
        System.out.println(resumo);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}