package Exercicios;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite o primeiro valor inteiro para a soma: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo valor inteiro para a soma: ");
        int n2 = scan.nextInt();

        int soma = n1 + n2;
        System.out.print("Soma: "+ soma);
    }
    
}
