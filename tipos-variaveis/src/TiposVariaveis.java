// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos Primitivos
            // Lógicos
                boolean verdadeiroOuFalso = true;
            // Texto
                String Meunome = "Ana Luisa";
            // Inteiros
                byte idade = 21;
                short ano = 2024;
                int cep = 43841970;
                long cpf = 84948306517L;
                float pi = 3.14F;
                double salario = 2800;

            // Manipulação de variáveis do tipo short e int e análise de risco
            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal;
            System.out.println(numeroCurto2);

            // Manipulação de variável do tipo int
            int numero1 = 5;
            numero1 = 10;

            System.out.println(numero1);

            // Declaração de constantes
            final double VALOR_DE_PI = 3.14;
            System.out.println(VALOR_DE_PI);
        }
}