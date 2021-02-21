package Exercicios;

import java.util.Scanner;

public class estudando_scan {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // scan.next(); - primeiro conjunto
        // scan.nextLine(); - Toda a linha
        // scan.nextInt();
        // scan.nextDouble();

        

        //----Lendo toda linha----

        System.out.println("Digite o nome completo: ");
        String nomecompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+ nomecompleto);

        //-----Lendo o Primeiro argumento-----

        System.out.println("Digite seu primeiro nome: ");
        String firstname = scan.next();
        System.out.println("Seu primeiro nome é: "+firstname);

        //-----Lendo inteiro-----

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+ idade);

        //-----Lendo double-----

        System.out.println("Digite sua altura (utilizar virugla no VS?): ");
        Double altura = scan.nextDouble();
        System.out.println("Sua altura é: "+ altura);

        //-----Lendo vários argumentos de uma vez-----

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem pet?(true ou false");
        String primeironome = scan.next();
        int idd = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float alt = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Primeiro nome: " + primeironome);
        System.out.println("Idade: " + idd);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + alt);
        System.out.println("Tem pet? "+temPet); 
    }
    
}
