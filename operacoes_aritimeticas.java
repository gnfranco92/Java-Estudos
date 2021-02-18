public class operacoes_aritimeticas {
    public static void main(String[] args) {

        // Soma

        int valor1 = 15;
        int valor2 = 20;

        int soma = valor1 + valor2;

        System.out.print("Somatorio: ");
        System.out.println(soma);
        System.out.println("------------------------------");
        
        int subtracao = valor1 - valor2;
        System.out.print("Subtração: ");
        System.out.println(subtracao);
        System.out.println("------------------------------");

        int divisao = valor1 / valor2;
        System.out.print("Divisão: ");
        System.out.println(divisao);
        System.out.println("------------------------------");

        // Operadores relacionais
        // == -> Igual
        // < -> Menor
        // > -> Maior
        // <= -> Menor igual
        // >= -> Maior igual
        // != -> Diferente

        //Dica, todos os operadores relacionais dentro do print retornam true or false, com isto economiza um if/else
        System.out.print("Utilizando == com retorno true or false, verificando se v1 = v2: ");
        System.out.println(valor1==valor2);
        System.out.print("Valor 1: ");
        System.out.println(valor1);
        System.out.print("Valor 2: ");
        System.out.println(valor2);
        System.out.println("------------------------------");
        
    }        
}