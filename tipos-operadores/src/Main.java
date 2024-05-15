import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Operadores de atribuição
        String nome = "Ana Luisa";
        int idade = 22;
        double peso = 60.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Operadores Aritméticos
        double soma = 5 + 2;
        int subtracao = 250 - 100;
        int multiplicacao = 30 * 100;
        int divisao = 100 / 2;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //Concatenação em diferentes cenários
        String nomeDaLinguagem = "Linguagem" + " " + "Java";
        System.out.println(nomeDaLinguagem);

        String concatenacao = "";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
    }
}